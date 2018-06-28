package miscgui;

import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.io.File;
import javax.swing.ImageIcon;
import static miscgui.OptionsPics.jLabel1;

/**
 * Works to populate GUI items with images.
 * @author William Pruitt
 */
public class Pictures {

    private int pos = 0;
    private File[] imagesList;

    public File[] getImages() {
        File file = new File("images");
        imagesList = file.listFiles();
        for (File string : imagesList) {
            if (string.isDirectory()) {
                string.getName();
            } else {
                string.getName();
            }
        }
        return imagesList;

    }
    /**
     * Sets images as showable.
     * @param index The index that pictures are placed at.
     */
    public void showImage(int index) {
        imagesList = getImages();
        File imageName = imagesList[index];
        ImageIcon icon = new ImageIcon("" + imageName);
        Image img = icon.getImage();
        Image newimage = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimage);
        jLabel1.setIcon(image);
    }
}
