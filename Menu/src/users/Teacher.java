package users;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Teacher class for tracher objects
 * @author Dt
 */
public class Teacher extends Person {

    /**Initializes an array list so the teachers students may be added to the list.*/
    public ArrayList<Student> students = new ArrayList<Student>();
    /**
     * Holds class size.
     */
    public int classSize;

    /**Blank constructor for Teacher*/
    public Teacher() {
        this.setOccupation("teacher");
    }
/**
 * Basic constructor for making a parent
 * @param fName first name for parent
 * @param lName last name for parent
 * @param userName user name for parent
 * @param password password for parent
 */
    public Teacher(String fName, String lName, String userName, String password) {
        super(fName, lName, userName, password);
        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the new teacher object");
        }
        this.setOccupation("teacher");
    }

    
    /**
     * Constructor for adding students directly on creation
     * @param fName first name for parent
     * @param lName last name for parent
     * @param userName username for parent
     * @param password password for parent
     * @param students ArrayList of students being taught for parent
     */
    public Teacher(String fName, String lName, String userName, String password, ArrayList<Student> students) {
        super(fName, lName, userName, password);
        //This enhanced loop iterates through the list of students parameter and adds each individual one to the student list
        //(I wasn't sure if doing "this.students = students" would function properly)
        //Going to need to test if changing the grade of the student will also reflect on the teacher toString.
        for (Student student : students) {
            this.students.add(student);
        }

        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the new teacher object");
        }
        this.setOccupation("teacher");
    }

    /**
     * Makes a teacher based on a file.
     * @param filename file to be read from
     * @throws IOException 
     */
    public Teacher(File filename) throws IOException {
        ReadFile(filename);
        this.setOccupation("teacher");
    }
/**
 * Gets the size of a teachers class list.
 * @return the size of the class as int.
 */
    public int getClassSize() {
        return this.classSize;
    }

    /**
     * Add a student to the list then saves this information to the teachers file
     * @param student student to be added to the teacher's class.
     */
    public void addStudent(Student student) {
        students.add(student);
        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the teacher file after adding a new student");
        }
    }

    /**
     * Remove a specific student number from the list
     * @param location The location of a student in the arraylist
     */
    public void removeStudent(int location) {
        //ensures that the location is a valid location so it does not crash the program
        if (!students.isEmpty() && (location < students.size()) && (location >= 0)) {
            students.remove(location);
        } else {
            System.out.println("There was an error with the removal attempt");
        }
        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the teacher file after removing the student");
        }
    }

    /**
     * Removes a student from their name and username
     * @param firstname first name of student
     * @param lastname last name of student
     * @param username username of student
     */
    public void removeStudent(String firstname, String lastname, String username) {
        boolean matchfound = false;
        int matchlocation = 0;
        for (Student student : students) {
            if (student.getFirst().equalsIgnoreCase(firstname) && student.getLast().equalsIgnoreCase(lastname) && student.getUserName().equals(username)) {
                matchlocation = students.indexOf(student);
                matchfound = true;
            }
        }
        if (matchfound == true) {
            students.remove(matchlocation);
        } else {
            System.out.println("No student matches that criteria");
        }

        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the teacher file after removing a student");
        }
    }

    /**
     * Override the toString for Teachers
     * @return string of information
     */
    @Override
    public String toString() {
        if (!students.isEmpty()) {
            //Because loops can't be directly used in the return statement, StringBuilder must be used to make the string to be returned with all the infromation
            StringBuilder string = new StringBuilder();
            string.append(super.toString() + "\nStudents: ");
            for (Student child : students) {
                string.append("\n\tStudent Name: ").append("\t" + child.getFirst()).append("\t\tStudent Average: \t" + String.format("%3.2f", child.getAverageGrade()));
            };
            return string.toString();
        } else {
            return super.toString();
        }
    }

    /**
     * Gets user type
     * @return "Teacher"
     */
    @Override
    public String userType() {
        return "Teacher";
    }

    /**
     * Writes students to file
     * @param output writer to write to.
     */
    @Override
    public void UserOutput(PrintWriter output) {
        output.print(getClassSize());
        if (!students.isEmpty()) {
            for (Student student : students) {
                output.print(student.getFileName() + " ");
            }
        }
    }
/**
 * Reads from a file to add to your object
 * @param input scanner that reads from proper file.
 */
    @Override
    public void UserInput(Scanner input) {
        if (input.hasNextInt()) {
            classSize = input.nextInt();
            while (input.hasNext()) {
                File studentfile = new File(input.next());
                try {
                    students.add(new Student(studentfile));
                } catch (IOException ex) {
                    System.out.println("There was an error reading the student file for the teacher");
                }

            }
            input.close();
        }
    }
}
