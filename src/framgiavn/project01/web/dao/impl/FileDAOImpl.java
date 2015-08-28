package framgiavn.project01.web.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import framgiavn.project01.web.dao.FileDAO;
import framgiavn.project01.web.model.Answer;
import framgiavn.project01.web.model.Category;
import framgiavn.project01.web.model.Word;
import framgiavn.project01.web.ulti.Logit2;

public class FileDAOImpl extends HibernateDaoSupport implements FileDAO {
	private static final Logit2 log = Logit2.getInstance(FileDAOImpl.class);
	private static final String IMAGESPATH = System.getProperty("imagesPath");

	@Override
	public File saveFile() throws Exception {
		return null;
	}

	@Override
	public void saveImage(File image, String fileName) throws Exception {
		try {
			File tempFile = new File(IMAGESPATH, fileName);
			FileUtils.copyFile(image, tempFile);
		} catch (RuntimeException re) {
			log.error("save image get failed", re);
		}
	}

	@Override
	public void deleteImage(String fileName) throws Exception {
		try {
			File tempFile = new File(IMAGESPATH, fileName);
			if (tempFile.delete()) {
				System.out.println("delete sucess");
			} else {
				System.out.println("delete fails");
			}
		} catch (RuntimeException re) {
			log.error("delete image get failed", re);
		}
	}

	@Override
	public void exportDBToExcelFile(String filePath) throws Exception {
		// TODO Auto-generated method stub
		try {
			HSSFWorkbook hwb = new HSSFWorkbook();
			HSSFSheet sheet = hwb.createSheet("words");

			HSSFRow rowhead = sheet.createRow(0);
			rowhead.createCell(0).setCellValue("ID");
			rowhead.createCell(1).setCellValue("Word");
			rowhead.createCell(2).setCellValue("Right Answer");
			rowhead.createCell(3).setCellValue("Category");

			List<Word> words = getSession().getNamedQuery("Word.SelectAllWord")
					.list();

			for (int i = 1; i <= words.size(); i++) {
				HSSFRow row = sheet.createRow(i);
				Word temp_word = words.get(i - 1);
				row.createCell(0).setCellValue(
						Integer.toString(temp_word.getWordId()));
				row.createCell(1).setCellValue(temp_word.getWordContent());
				row.createCell(2).setCellValue(temp_word.getAnswerContent());
				row.createCell(3).setCellValue(
						temp_word.getCategory().getCategoryName());
			}

			FileOutputStream fos = new FileOutputStream(filePath);
			hwb.write(fos);
			fos.close();
			System.out.println("Your excel file has been generated!");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void importDBFromExcelFile(String filePath) {
		try {

			Word temp_word;
			Answer temp_answer;
			Category temp_category;
			List<Answer> temp_answers;

			FileInputStream fis = new FileInputStream(filePath);
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheet = wb.getSheet("words");

			int i = 1;
			System.out.println("=======Number of row in this sheet = "
					+ sheet.getLastRowNum());
			while (i <= sheet.getLastRowNum()) {

				temp_word = new Word();
				temp_answer = new Answer();
				temp_category = new Category();
				temp_answers = new ArrayList<Answer>();

				HSSFRow row = sheet.getRow(i);
				temp_word.setWordContent(row.getCell(0).getStringCellValue());
				System.out.println("Word " + i + " = "
						+ temp_word.getWordContent());
				temp_answer.setAnswerContent(row.getCell(1)
						.getStringCellValue());
				System.out.println("Correct answer of word " + i + " = "
						+ temp_answer.getAnswerContent());
				temp_answer.setIsCorrect(true);
				temp_answers.add(temp_answer);

				for (int j = 2; j < 5; j++) {
					temp_answer = new Answer();
					temp_answer.setAnswerContent(row.getCell(j)
							.getStringCellValue());
					System.out.println("Answer " + j + " of word " + i + " = "
							+ temp_answer.getAnswerContent());
					temp_answers.add(temp_answer);
				}
				System.out.println("temp_answers.size() = "
						+ temp_answers.size());
				temp_word.setAnswers(temp_answers);

				Double t = row.getCell(5).getNumericCellValue();
				temp_category.setCategoryId(t.intValue());
				System.out.println("Category of word " + i + " = "
						+ temp_category.getCategoryId());
				temp_word.setCategory(temp_category);

				for (Answer answer : temp_word.getAnswers()) {
					answer.setWord(temp_word);
				}

				getHibernateTemplate().save(temp_word);
				i++;
			}
			System.out.println("Import data to DB successfully!");
			System.out.println("Number of row is inserted = " + i);

		} catch (FileNotFoundException fnp_ex) {
			fnp_ex.printStackTrace();
		} catch (IOException io_ex) {
			io_ex.printStackTrace();
		}
	}
}
