package quizzes;

import java.util.concurrent.ThreadLocalRandom;
import users.Student;

public class SecondGradeQuiz extends Quiz {

    /**
     * The current student question.
     */
    public static Student studentTested;

    /**
     * Question String for displaying quiz question.
     */
    public static String question = "";
/**
     * Constructor for instantiating a second grade quiz.
     * @param thisStudent 
     */
    public SecondGradeQuiz(Student thisStudent) {
        studentTested = thisStudent;
    }

    /**
     * Makes addition quiz question.
     */
    public void generateAddQuestion() {

        firstNumber = ThreadLocalRandom.current().nextInt(1, 30); //Generates a random number between 1 and 30. 

        secondNumber = ThreadLocalRandom.current().nextInt(1, 30); //Generates a random number between 1 and 30. 
        if (firstNumber == secondNumber) {
            secondNumber = ThreadLocalRandom.current().nextInt(1, 30);
        }   //If the numbers are the same it generates a new number for secondNumer.

        answer = (firstNumber + secondNumber);   //Records correct answer.

        question = firstNumber + " + " + secondNumber + " = ";

    }

    /**
     * Makes subtraction quiz question.
     */
    public void generateSubQuestion() {

        firstNumber = ThreadLocalRandom.current().nextInt(1, 30); //Generates a random number between 1 and 30. 

        secondNumber = ThreadLocalRandom.current().nextInt(1, 30);  //Generates a random number between 1 and 30. 
        if (firstNumber == secondNumber) {
            secondNumber = ThreadLocalRandom.current().nextInt(1, 30);
        }   //If the numbers are the same it generates a new number for secondNumer.

        if (firstNumber > secondNumber) {
            answer = (firstNumber - secondNumber);     //Records correct answer.

            question = firstNumber + " - " + secondNumber + " = ";

        } else {
            answer = (secondNumber - firstNumber);

            question = secondNumber + " - " + firstNumber + " = ";

        }

    }

    public void generateMultQuiz() {
    }

    public void generateMultQuestion() {
    }

}
