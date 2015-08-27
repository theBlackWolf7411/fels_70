package framgiavn.project01.web.dao.impl;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import framgiavn.project01.web.dao.FileDAO;
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
}