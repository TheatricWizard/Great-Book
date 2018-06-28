package users;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Parent class for parent objects.
 * @author Derald Rogers
 */
public class Parent extends Person {

    /**
     * The parents children
      **/
    private ArrayList<Student> children = new ArrayList<Student>() {
    };

    /**
     * Parent constructor.
     */
    public Parent() {
        this.setOccupation("parent");
    }

    /**
     * Full-er parent constructor.
     * @param fName First name of parent
     * @param lName Last name of parent
     * @param userName Username of parent
     * @param password password of parent
     */
    public Parent(String fName, String lName, String userName, String password) {
        super(fName, lName, userName, password);
        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the new parents object");
        }
        this.setOccupation("parent");
    }

    /**
     * Parent constructor with fix-ins and child parameter.
     * @param fName First name of parent
     * @param lName Last name of parent
     * @param userName Username of parent
     * @param password password of parent
     * @param children ArrayList of children the parent has.
     */
    public Parent(String fName, String lName, String userName, String password, ArrayList<Student> children) {
        super(fName, lName, userName, password);
        //This enhanced loop iterates through the list of students parameter and adds each individual one to the student list
        //(I wasn't sure if doing "this.students = students" would function properly)
        for (Student student : children) {
            this.children.add(student);
        }
        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the new parent object");
            this.setOccupation("parent");
        }
    }

    /**
     * Parent constructor when building from file.
     * @param filename file to build from.
     * @throws IOException 
     */
    public Parent(File filename) throws IOException {
        ReadFile(filename);
        this.setOccupation("parent");
    }

    /**
     * Adds child to Parent object children ArrayList called on.
     * @param child Student object to add
     */
    public void addChild(Student child) {
        this.children.add(child);
        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the new parents object");
        }
    }

    /**
     * gets the children list from a parent object.
     * @return ArrayList of children.
     */
    public ArrayList<Student> getChildList() {
        return this.children;
    }

    /**
     * Used for inputting specific Parent information from files.
     * @param input Scanner to input into files from
     */
    @Override
    public void UserInput(Scanner input) {
        while (input.hasNext()) {
            File studentfile = new File(input.next());
            try {
                children.add(new Student(studentfile));
            } catch (IOException ex) {
                System.out.println("There was an error reading the student file for the parent");
            }

        }
        input.close();

    }

    /**
     * Prints to files.
     * @param output PrintWriter object to output from.
     */
    public void UserData(PrintWriter output) {
        if (!children.isEmpty()) {
            for (Student student : children) {
                output.print(student.getFileName() + " ");
            }
        }

    }

    /**
     * Overrides toString for Parents
     * @return String of everything about a parent.
     */
    @Override
    public String toString() {
        if (!children.isEmpty()) {
            //Because loops can't be directly used in the return statement, StringBuilder must be used to make the string to be returned with all the infromation
            StringBuilder string = new StringBuilder();
            string.append(super.toString() + "\nChildren: \t");
            for (Student child : children) {
                string.append("\n\tChild Name: ").append("\t" + child.getFirst()).append("\tAverage: " + String.format("%3.2f", child.getAverageGrade()));
            };
            return string.toString();
        } else {
            return super.toString();
        }
    }
/**
 * Gets type of user.
 * @return user type.
 */
    public String userType() {
        return "Parent";
    }

    /**
     * Prints to file for an updated parent file.
     * @param output 
     */
    @Override
    public void UserOutput(PrintWriter output) {
        if (!children.isEmpty()) {
            for (Student student : children) {
                output.print(student.getFileName() + " ");
            }
        }
    }
}
