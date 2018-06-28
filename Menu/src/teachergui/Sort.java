package teachergui;

import authorization.Auth;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import miscgui.Results;
import users.Teacher;

/**
 * Class used for sorting students by certain characterisitics.
 * @author William Pruitt
 */
public class Sort implements Comparator<Sort> {

    /**
     * Implemetation of the Comparator interface for students.
     * @param t Student 1 to sort
     * @param t1 Student 2 to sort
     * @return integer representing whether it should go after or before.
     */
    @Override
    public int compare(Sort t, Sort t1) {
        String name1 = t.getClass().getName();
        String name2 = t1.getClass().getName();
        return name1.compareToIgnoreCase(name2);
    }

    /**
     * Method called upon to actually find the files to sort names from.
     * @param path Path to the file.
     * @param type Type of sorting to use.
     * @throws FileNotFoundException 
     */
    public void nameSort(String path, int type) throws FileNotFoundException {

        if (type == 1) {
            try {
                Teacher currentTeacher = (Teacher) Auth.hello;
                PrintWriter output = new PrintWriter(path);
                for (int i = 0; i < currentTeacher.students.size(); i++) {

                    output.print(currentTeacher.students.get(i).getFirst() + ":");
                    output.print(currentTeacher.students.get(i).getLast() + ":");
                    output.print(currentTeacher.students.get(i).getAverageGrade());

                    if (!currentTeacher.students.get(i).getGradeList().isEmpty()) {
                        for (Double sgrade : currentTeacher.students.get(i).getGradeList()) {
                            output.print(":");
                            output.print(sgrade);

                        }

                    }
                    output.println("");
                }

                output.close();
            } catch (IOException ex) {
                System.out.println("There was an error saving the student information after a grade was added");
            }
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] list = br.lines().toArray();
            String[] list1 = list.toString().split(":");
            java.util.Arrays.sort(list);
            Results res = new Results();
            res.setVisible(true);
            res.setLocationRelativeTo(null);
            Object[] row;
            DefaultTableModel model = (DefaultTableModel) res.jTable1.getModel();

            for (int i = 0; i <= list.length - 1; i++) {
                row = list[i].toString().split(":");
                model.addRow(row);
            }
        }

        if (type == 2) {

            try {
                Teacher currentTeacher = (Teacher) Auth.hello;
                PrintWriter output = new PrintWriter(path);
                for (int i = 0; i < currentTeacher.students.size(); i++) {

                    output.print(currentTeacher.students.get(i).getLast() + ":");
                    output.print(currentTeacher.students.get(i).getFirst() + ":");
                    output.print(currentTeacher.students.get(i).getAverageGrade());

                    if (!currentTeacher.students.get(i).getGradeList().isEmpty()) {
                        for (Double sgrade : currentTeacher.students.get(i).getGradeList()) {
                            output.print(":");
                            output.print(sgrade);

                        }

                    }
                    output.println("");
                }

                output.close();
            } catch (IOException ex) {
                System.out.println("There was an error saving the student information after a grade was added");
            }

            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] list = br.lines().toArray();
            String[] list1 = list.toString().split(":");
            java.util.Arrays.sort(list);
            Results res = new Results();
            res.setVisible(true);
            res.setLocationRelativeTo(null);

            res.jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Last Name", "First Name", "Grade Avarage"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            Object[] row;
            DefaultTableModel model = (DefaultTableModel) res.jTable1.getModel();

            for (int i = 0; i <= list.length - 1; i++) {
                row = list[i].toString().split(":");
                model.addRow(row);
            }
        }

        if (type == 3) {

            try {
                Teacher currentTeacher = (Teacher) Auth.hello;
                PrintWriter output = new PrintWriter(path);
                for (int i = 0; i < currentTeacher.students.size(); i++) {

                    output.print(currentTeacher.students.get(i).getAverageGrade() + ":");
                    output.print(currentTeacher.students.get(i).getFirst() + ":");
                    output.print(currentTeacher.students.get(i).getLast());

                    if (!currentTeacher.students.get(i).getGradeList().isEmpty()) {
                        for (Double sgrade : currentTeacher.students.get(i).getGradeList()) {
                            output.print(":");
                            output.print(sgrade);

                        }

                    }
                    output.println("");
                }

                output.close();
            } catch (IOException ex) {
                System.out.println("There was an error saving the student information after a grade was added");
            }

            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] list = br.lines().toArray();
            String[] list1 = list.toString().split(":");
            java.util.Arrays.sort(list);
            Results res = new Results();
            res.setVisible(true);
            res.setLocationRelativeTo(null);

            res.jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Grade Avarage", "First Name", "Last Name"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            Object[] row;
            DefaultTableModel model = (DefaultTableModel) res.jTable1.getModel();

            for (int i = 0; i <= list.length - 1; i++) {
                row = list[i].toString().split(":");
                model.addRow(row);
            }
        }
    }

}
