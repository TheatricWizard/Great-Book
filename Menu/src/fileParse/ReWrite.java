package fileParse;

import java.io.*;
import java.util.*;

/**
 * @author Alexander Clifford
 * Class used in users.teacher for rewriting files.
 */
public class ReWrite {

    /**
     * This lone method is used in the teacher class for rewriting their own files to include an updated
     * student class count one the "Update" button is hit on the teacher GUI.
     * @param file The teacher file to be re-written.
     * @param newSize The new size of the class for the corresponding teacher file.
     * @throws FileNotFoundException
     */
    public static void classSizeRewrite(File file, int newSize) throws FileNotFoundException {
        ArrayList<String> previous = new ArrayList();
        Scanner sc = new Scanner(file);
        int size = 1;
        while (sc.hasNext()) {
            sc.next();
            size++;
        }
        sc = new Scanner(file);
        for (int i = 1; i < size; i++) {
            previous.add(sc.next());
        }

        previous.set(5, Integer.toString(newSize));

        PrintWriter pw = new PrintWriter(new FileOutputStream(file.getName(), false));
        for (String previou : previous) {
            pw.print(previou + " ");
        }
        pw.close();

    }
}
