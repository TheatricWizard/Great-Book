package users;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dt
 */
public class Student extends Person {

    /**
     * student's teacher
     */
    private Teacher teacher = null;
    /**
     * student's parent
     */
    private Parent parent = null;
    /**
     * arraylist of student's grades
     */
    private ArrayList<Double> grades = new ArrayList<Double>();
    /**
     * student's grade level
     */
    private int gradeLevel;

    /**
     * current student of the class.
     */
    public static Student currentStudent;

    /**The constructors for a student**/
    public Student() {
    }

    /**
     * Constructor of student with names and credentials
     * @param fName first name
     * @param lName last name
     * @param userName user name
     * @param password pass word
     * @param gradelevel grade level
     */
    public Student(String fName, String lName, String userName, String password, int gradelevel) {
        super(fName, lName, userName, password);
        this.gradeLevel = gradelevel;
        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the new student object");
        }
        this.setOccupation("student");
    }
/**
 * Same as othe student constructor but with added Grades arraylist
 * @param fName first name
 * @param lName last name
 * @param userName user name
 * @param password pass word
 * @param grades grade ArrayList.
 */
    public Student(String fName, String lName, String userName, String password, ArrayList<Double> grades) {
        super(fName, lName, userName, password);
        this.grades = grades;
        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the new student object");
        }
        this.setOccupation("student");
    }
/**
 * Student constructor with parents and teachers
 * @param fName first name
 * @param lName last name
 * @param userName user name
 * @param password pass word
 * @param teacher student teacher
 * @param parent student parent
 */
    public Student(String fName, String lName, String userName, String password, Teacher teacher, Parent parent) {
        super(fName, lName, userName, password);
        this.teacher = teacher;
        this.parent = parent;
        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the new student object");
        }
        this.setOccupation("student");
    }

    /**
     * Construct student from given file.
     * @param filename student's file
     * @throws IOException 
     */
    public Student(File filename) throws IOException {
        ReadFile(filename);
        this.setOccupation("student");
    }

    /**
     * sets student teacher
     * @param teacher teacher for student
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
/**
 * sets student parent
 * @param parent parent for student
 */
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    /**
     * gets teacher of student
     * @return student's teacher
     */
    public Teacher getTeacher() {
        return teacher;
    }
/**
 * gets parent of student
 * @return student's parent
 */
    public Parent getParent() {
        return parent;
    }
/**
 * sets the current student
 * @param student current student
 */
    public static void setCurrentStudent(Student student) {
        Student.currentStudent = student;
    }

    /**This returns the average of the grades*/
    public double getAverageGrade() {
        double total = 0;
        //Checks to make sure the list of grades is not empty first, otherwise the program attempt to divide by zero and crash
        if (!grades.isEmpty()) {
            //Keeps a running total of the grades
            for (Double grade : grades) {
                total += grade;
            }
            //Calculates the average of the grades and returns it
            return (total / grades.size());
        } else {
            return 0.0;
        }
    }

    /**
     * Gets the list of grades a student has.
     * @return Student's ArrayList of grades.
     */
    public ArrayList<Double> getGradeList() {
        return this.grades;
    }

    /**Add a grade for a student*/
    public void addGrade(double grade) {
        this.grades.add(grade);
        try {
            SaveFile();
        } catch (IOException ex) {
            System.out.println("There was an error saving the student information after a grade was added");
        }

    }

    /** Gets a student's grade level
     * 
     * @return student grade level
     */
    public int getGradeLevel() {
        return gradeLevel;
    }
    /**
     * sets grade level of student
     * @param grade grade to be set
     */
    public void setGradeLevel(int grade) {
        this.gradeLevel = grade;
    }
/**
 * gets userType of student
 * @return "Student"
 */
    @Override
    public String userType() {
        return "Student";
    }
/**
     * Prints to file for an updated parent file.
     * @param output 
     */
    @Override
    public void UserOutput(PrintWriter output) {
        output.print(getGradeLevel());
        if (!grades.isEmpty()) {
            for (Double grade : grades) {
                output.print(" ");
                output.print(grade);
            }
        }

        output.close();
    }
/**
     * Used for inputting specific Parent information from files.
     * @param input Scanner to input into files from
     */
    @Override
    public void UserInput(Scanner input) {
        if (input.hasNextInt()) {
            this.gradeLevel = (input.nextInt());
        }
        while (input.hasNextDouble()) {
            grades.add(input.nextDouble());
        }
    }
/**
     * Overrides toString for students
     * @return String of everything about a parent.
     */
    @Override
    public String toString() {
        if (!grades.isEmpty()) {
            //Because loops can't be directly used in the return statement, StringBuilder must be used to make the string to be returned with all the infromation
            StringBuilder string = new StringBuilder();
            if (!(parent == null)) {
                string.append("\nParent: " + parent.getFirst());
            }
            if (!(teacher == null)) {
                string.append("\nTeacher: " + teacher.getFirst());
            }
            string.append(super.toString() + "\nScores: \t");
            for (double score : grades) {
                string.append(" " + score);
            }

            string.append("\nAverage: \t" + String.format("%3.2f", getAverageGrade()));
            return string.toString();
        } else {
            return super.toString();
        }
    }

}
