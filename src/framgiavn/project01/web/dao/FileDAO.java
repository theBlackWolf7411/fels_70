package framgiavn.project01.web.dao;

import java.io.File;

public interface FileDAO {
    public File saveFile() throws Exception;

    public void saveImage(File image, String fileName) throws Exception;
    
    public void deleteImage(String fileName) throws Exception;
}
