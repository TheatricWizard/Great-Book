package authorization;

import java.io.*;
import users.*;

/**
 *
 * @author Alexander Clifford
 */
public class Auth {

    /**
     * The variable hello is used throughout the code as a de-facto way to determine who is the user currently logged in.
     */
    public static Person hello = new Student(null, null, null, null, 1);

    /**
     * The main method for the Auth file is where the code verifies and passes the pass-or-fail information.
     * @param args Accepts an array of {passable username, passable password, login type}
     * @return Returns true if the method was able to verify the credentials as correct, and false if could not
     * verify or the credentials were incorrect.
     */
    public static boolean main(String[] args) {
        try {
            ReadDatabase.ScanDatabase();
        } catch (IOException ex) {
            System.out.println("There was an error scanning the DATABASE");
        }

        for (Person user : ReadDatabase.users) {

            if (args[0].toLowerCase().equals(user.getUserName().toLowerCase()) && args[1].equals(user.getPassword())
                    && args[2].equals(user.getOccupation())) {
                hello = user;
                return true;
            }
        }
        return false;
    }

    /**
     * @deprecated
     * This method is the old main method for the Authorization package and Auth class. It works using the files of "TeacherLogin.txt", 
     * "StudentLogin.txt", and "ParentLogin.txt". After the switch to a file-by-name-database system, this was deprecated and is only
     * kept here for legacy purposes. 
     * @param args Accepts an array of {passable username, passable password, login type}
     * @return Returns true if the method was able to verify the credentials as correct, and false if could not
     * verify or the credentials were incorrect. 
     */
    public static boolean oldMain(String[] args) {
        File file = new File("TeacherLogin.txt");
        switch (args[2]) {
            case "student":
                file = new File("StudentLogin.txt");
                break;
            case "teacher":
                file = new File("TeacherLogin.txt");
                break;
            case "parent":
                file = new File("ParentLogin.txt");
                break;
        }

        String usrname = args[0];
        String passwd = args[1];
        boolean found = false;
        String tempusername = "";
        String temppassword = "";

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready() && !found) {
                tempusername = br.readLine();
                temppassword = br.readLine();
                if (tempusername.trim().equals(usrname.trim())
                        && temppassword.trim().equals(passwd.trim())) {
                    found = true;
                    return true;

                }
            }
            if (!found) {
                return false;
            }
            br.close();
        } catch (Exception e) {
            System.out.println("didn't work");
        }
        return false;
    }
}
