package users;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Person abstract class that all classes descend from.
 * @author Dt
 */
abstract public class Person {

    /**
     * First name.
     */
    private String fName;
    /**
     * Last name.
     */
    private String lName;
    /**
     * User name.
     */
    private String userName;
    /**
     * User password.
     */
    private String password;
    /**
     * occupational variable.
     */
    private String occ;

    /**
     * empty person constructor.
     */
    public Person() {
    }

    /**
     * Person constructor with names and login credentials
     * @param fName First name
     * @param lName Last name
     * @param userName Username
     * @param password Password
     */
    public Person(String fName, String lName, String userName, String password) {
        this.fName = fName;
        this.lName = lName;
        this.userName = userName;
        this.password = password;
    }

/**
 * Sets first name
 * @param nameset new Name of user to be set
 */
    public void setFirst(String nameset) {
        this.fName = nameset;
    }
/**
 * New Last name of user to be set.
 * @param nameset new last Name of user to be set
 */
    public void setLast(String nameset) {
        this.lName = nameset;
    }
/**
 * Sets new user name
 * @param nameset new user name to be set.
 */
    public void setUserName(String nameset) {
        this.userName = nameset;
    }
/**
 * Sets new password
 * @param nameset new password to be set.
 */
    public void setPassword(String nameset) {
        this.password = nameset;
    }
/**
 * sets new occupation
 * @param nameset new occupation to be set.
 */
    public void setOccupation(String nameset) {
        this.occ = nameset;
    }

    /**
     * gets first name
     * @return first name
     */
    public String getFirst() {
        return fName;
    }
/**
 * gets last name
 * @return last name
 */
    public String getLast() {
        return lName;
    }
/**
 * gets user name
 * @return user name
 */
    public String getUserName() {
        return userName;
    }
/**
 * gets password
 * @return password
 */
    public String getPassword() {
        return password;
    }
/**
 * gets occupation
 * @return occupation
 */
    public String getOccupation() {
        return occ;
    }

    /**
     * The toString of user, returns basic information.
     * @return 
     */
    public String toString() {
        return "\nFirst Name: \t" + fName + "\nLast Name: \t" + lName + "\nUsername: \t" + userName + "\nPassword: \t" + password;
    }

    /**
     * This saves the object information to its file and adds the filename to the database.
     **/
    public void SaveFile() throws IOException {
        File account = new File(getFileName());
        try {
            if (!account.exists()) {
                account.createNewFile();
            }
        } catch (IOException ex) {
            System.out.println("The new file could not be created");
        }

        PrintWriter output = new PrintWriter(account);

        output.print(userType() + " ");
        output.print(getFirst() + " ");
        output.print(getLast() + " ");
        output.print(getUserName() + " ");
        output.print(getPassword() + " ");
        //Depending on the subtype, it will save different things to the end of the user file
        UserOutput(output);

        AddToDatabase();
        output.close();
    }

    /**
     * This reads a file to provide the necessary information to an object.
     **/
    public void ReadFile(File filename) throws IOException {
        if (!filename.exists()) {
            filename.createNewFile();
        }
        Scanner input = new Scanner(filename);
        if (input.hasNext()) {
            String usertype = input.next(); // this is just there to skip the type of user the file is for
            this.setFirst(input.next());
            this.setLast(input.next());
            this.setUserName(input.next());
            this.setPassword(input.next());
        } else {
            this.setFirst("Error");
            this.setLast("Error");
            this.setUserName("Error");
            this.setPassword("Error");
        }
        //Depending on the subtype of object, it will read different things to fill the information for the object
        UserInput(input);

        input.close();
    }

    /**
     * Returns a file name from the parameters.
     **/
    public static String getFileName(String user, String pass) {
        StringBuilder fileName = new StringBuilder();
        fileName.append(user);
        fileName.append(pass);
        fileName.append(".txt");
        String workingname = fileName.toString();
        return workingname;
    }

    /**
     * Returns a filename when invoked from the object itself
     **/
    public String getFileName() {
        StringBuilder fileName = new StringBuilder();
        fileName.append(getFirst());
        fileName.append(getLast());
        fileName.append(".txt");
        String workingname = fileName.toString();
        return workingname;
    }

    /**
     * Appends a different file with the string parameter
     **/
    public void AppendFile(String s, File appendfile) throws IOException {

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String data = s;
            if (!appendfile.exists()) {
                appendfile.createNewFile();
            }
            fw = new FileWriter(appendfile, true);
            bw = new BufferedWriter(fw);

            bw.write(" " + data);
        } catch (IOException ex) {
            System.out.println("There was an error");
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

    }

    /**
     * Appends the objects own file with the parameter
     **/
    public void AppendFile(String s) throws IOException {
        File appendfile = new File(getFileName());
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String data = s;
            if (!appendfile.exists()) {
                appendfile.createNewFile();
            }
            fw = new FileWriter(appendfile, true);
            bw = new BufferedWriter(fw);

            bw.write(" " + data);
        } catch (IOException ex) {
            System.out.println("There was an error");
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

    }

    /**
     * Adds the object to the database file
     * **/
    public void AddToDatabase() throws IOException {
        File database = new File("database.txt");
        Scanner datascanner = new Scanner(database);
        boolean filenamefound = false;
        while (datascanner.hasNext() && !filenamefound) {
            String filename = datascanner.next();
            if (filename.equals(getFileName())) {
                filenamefound = true;
            }
        }
        if (!filenamefound) {
            AppendFile(getFileName(), database);
        }
    }

    /**
     * These tell the supertype what special information it needs to read/write from the subtype of object
     **/
    public abstract void UserOutput(PrintWriter toWrite);
    /**
     * These tell the supertype what special information it needs to read/write from the subtype of object
     **/
    public abstract void UserInput(Scanner input);

    /**This returns the subtype of Person the object is**/
    public abstract String userType();

}
