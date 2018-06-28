package quizzes;

import java.util.concurrent.ThreadLocalRandom;
import users.Student;

public class ThirdGradeQuiz extends Quiz {

   /**
     * The current student question.
     */
    public static Student studentTested;

    /**
     * The grade collected for the quiz.
     */
    public double quizGrade;

    /**
     * Question String for displaying quiz question.
     */
    public static String question = "";
/**
     * Constructor for instantiating a third grade quiz.
     * @param thisStudent 
     */
    public ThirdGradeQuiz(Student thisStudent) {
        studentTested = thisStudent;
    }

    /**
     * Makes addition quiz question.
     */
    public void generateAddQuestion() {
        boolean questionLoop = true;    //Loops the question until an answer is entered.

        firstNumber = ThreadLocalRandom.current().nextInt(20, 101); //Generates a random number between 20 and 101. 

        secondNumber = ThreadLocalRandom.current().nextInt(20, 101); //Generates a random number between 20 and 101. 

        answer = (firstNumber + secondNumber);   //Records correct answer.

        question = firstNumber + " + " + secondNumber + " = ?"; //Displays the question.

    }

    /**
     * Makes subtraction quiz question.
     */
    public void generateSubQuestion() {
        boolean questionLoop = true;     //Loops the question until an answer is entered.

        firstNumber = ThreadLocalRandom.current().nextInt(20, 101); //Generates a random number between 20 and 101. 

        secondNumber = ThreadLocalRandom.current().nextInt(20, 101);  //Generates a random number between 20 and 101. 
        if (firstNumber == secondNumber) {
            secondNumber = ThreadLocalRandom.current().nextInt(20, 101);
        }   //If the numbers are the same it generates a new number for secondNumer.

        if (firstNumber > secondNumber) {
            answer = (firstNumber - secondNumber);     //Records correct answer.
            question = firstNumber + " - " + secondNumber + " = ";
        } else {
            answer = (secondNumber - firstNumber);
            question = secondNumber + " - " + firstNumber + " = ";
        }

    }

    public void generateMultQuestion() {

    }

    public void generateMultQuiz() {

    }

}
