package teachergui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import miscgui.Results;

/**
 * Class the handles student searching.
 * @author William Pruitt
 */
public class Search {

    /**
     * Opens gui for searching.
     */
    SearchGUI sg = new SearchGUI();

    /**
     * Searches file for string as name of student.
     * @param input Student name to find.
     * @throws FileNotFoundException 
     */
    public void search(String input) throws FileNotFoundException {
        Results res = new Results();
        try {
            Scanner file = new Scanner(new File("Results.txt"));
            file.useDelimiter(" ");
            boolean found = false;
            String first = "";
            String last = "";
            String level = "";
            while (file.hasNext() && !found) {
                first = file.next();
                last = file.next();
                level = file.next();

                if (first.toLowerCase().equals(input)
                        || last.toLowerCase().equals(input)
                        || level.toLowerCase().equals(input)) {
                    found = true;
                    res.setVisible(true);
                    res.setLocationRelativeTo(null);
                    res.jTable1.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][]{
                                {first + " " + last, level, null,}
                            },
                            new String[]{
                                "Student Name", "Grade Level", "Grade Avarage"
                            }
                    ) {
                        boolean[] canEdit = new boolean[]{
                            false, false, false, false, true
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit[columnIndex];
                        }
                    });

                }

            }
        } catch (Exception e) {
            System.out.println("Sorry The Record Was Not Found");
        }
    }

}
