package quizzes;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;
import users.Student;

/**
 * Methods used for building quizzes on Students.
 * @author Kyle Campton
 */
public class FifthGradeQuiz extends Quiz {

    /**
     * Answer for multiplication quiz.
     */
    public static double multAnswer;

    /**
     * Answer for subtraction quiz.
     */
    public double subAnswer;
    
    /**
     * Guess taken for subtraction quiz.
     */
    public double subGuess;
    
    /**
     * Answer for addition quiz.
     */
    public double addAnswer;
    
    /**
     * Guess for addition quiz.
     */
    public double addGuess;
    
    /**
     * Question String for displaying quiz question.
     */
    public static String question = "";

    /**
     * The string for formatting the answer.
     */
    public static String format;

    /**
     * The current student question.
     */
    public static Student studentTested;
    
    /**
     * The grade collected for the quiz.
     */
    public double quizGrade;

    /**
     * The formatting for storing and showing decimals
     */
    private static DecimalFormat df2 = new DecimalFormat(".#");

    /**
     * Constructor for instantiating a fifth grade quiz.
     * @param thisStudent 
     */
    public FifthGradeQuiz(Student thisStudent) {
        studentTested = thisStudent;
    }

    /**
     * Makes multiplication quiz question.
     */
    public void generateMultQuestion() {

        boolean questionLoop = true;    //Loops the question until an answer is entered.

        double multFirstNumber = ThreadLocalRandom.current().nextDouble(1.1, 10.9);    //Generates a random number which signifies a place in the array.

        double multSecondNumber = ThreadLocalRandom.current().nextDouble(1.1, 10.9);    //Generates a random number which signifies a place in the array.

        multFirstNumber = (double) Math.round(multFirstNumber * 10d) / 10d;

        multSecondNumber = (double) Math.round(multSecondNumber * 10d) / 10d;

        format = df2.format(multFirstNumber * multSecondNumber);     //Records correct answer.
        doubleAnswer = Double.valueOf(format);
        question = multFirstNumber + " X " + multSecondNumber + " = ?"; //Displays the question.

    }

    /**
     * Makes subtraction quiz question.
     */
    public void generateSubQuestion() {
        boolean questionLoop = true;    //Loops the question until an answer is entered.

        double subFirstNumber = ThreadLocalRandom.current().nextDouble(1.1, 10.9);    //Generates a random number which signifies a place in the array.

        double subSecondNumber = ThreadLocalRandom.current().nextDouble(1.1, 10.9);    //Generates a random number which signifies a place in the array.

        subFirstNumber = (double) Math.round(subFirstNumber * 10d) / 10d;

        subSecondNumber = (double) Math.round(subSecondNumber * 10d) / 10d;

        //subAnswer = (double) Math.round((subFirstNumber - subSecondNumber) * 10d) / 10d;   //Records correct answer.
        if (subFirstNumber > subSecondNumber) {
            format = df2.format(subFirstNumber - subSecondNumber);     //Records correct answer.
            doubleAnswer = Double.valueOf(format);
            question = subFirstNumber + " - " + subSecondNumber + " = ?";
        } else {
            format = df2.format(subSecondNumber - subFirstNumber);
            doubleAnswer = Double.valueOf(format);
            question = subSecondNumber + " - " + subFirstNumber + " = ?";
        }

    }

    /**
     * Makes addition quiz question.
     */
    public void generateAddQuestion() {

        boolean questionLoop = true;    //Loops the question until an answer is entered.

        double addFirstNumber = ThreadLocalRandom.current().nextDouble(1.1, 10.9);    //Generates a random number which signifies a place in the array.

        double addSecondNumber = ThreadLocalRandom.current().nextDouble(1.1, 10.9);    //Generates a random number which signifies a place in the array.

        addFirstNumber = (double) Math.round(addFirstNumber * 10d) / 10d;

        addSecondNumber = (double) Math.round(addSecondNumber * 10d) / 10d;

        doubleAnswer = (double) Math.round((addFirstNumber + addSecondNumber) * 10d) / 10d;   //Records correct answer.

        question = addFirstNumber + " + " + addSecondNumber + " = ?"; //Displays the question.

    }

}
