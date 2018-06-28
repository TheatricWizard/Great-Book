package quizzes;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import users.Student;

public class FirstGradeQuiz extends Quiz {
/**
     * The current student question.
     */
    public static Student studentTested;

    /**
     * Question String for displaying quiz question.
     */
    public static String question = "";

    /**
     * Constructor for instantiating a first grade quiz.
     * @param thisStudent 
     */
    public FirstGradeQuiz(Student thisStudent) {
        studentTested = thisStudent;
    }

    public FirstGradeQuiz() {

    }

    /**
     * Makes a greater-than comparison question.
     */
    public void generateGreaterThanQuestion() {

        question = "";

        Random ran = new Random();
        firstNumber = ran.nextInt(12);

        Random ran2 = new Random();
        secondNumber = ran2.nextInt(12);

        if (firstNumber == secondNumber) {
            Random ran3 = new Random();
            secondNumber = ran3.nextInt(12);
        } //If the numbers are the same it generates a new number for secondNumber.

        if (firstNumber > secondNumber) {
            answer = firstNumber;
        } else {
            answer = secondNumber;
        }

        question = firstNumber + " or " + secondNumber + "?"; //Records the question.

    }

    /**
     * Makes a less-than comparison question.
     */
    public void generateLessThanQuestion() {

        Random ran = new Random();
        firstNumber = ran.nextInt(12);

        Random ran2 = new Random();
        secondNumber = ran2.nextInt(12);
        if (firstNumber == secondNumber) {
            Random ran3 = new Random();
            secondNumber = ran3.nextInt(12);
        } //If the numbers are the same it generates a new number for secondNumber.

        if (firstNumber < secondNumber) {
            answer = firstNumber;  //Records correct answer.
        } else {
            answer = secondNumber;
        }

        question = firstNumber + " or " + secondNumber + "?"; //Records the question.

    }

    /**
     * Makes addition quiz question.
     */
    public void generateAddQuestion() {

        question = "";
        int dotCount = ThreadLocalRandom.current().nextInt(1, 10); //Generates a random number between 1 and 10.

        for (int i = 0; i < dotCount; i++) {
            question = question + ". "; //Draws dots on the screen according to the random number "dotCount".
        }

        answer = dotCount;   //Records correct answer.

    }

    /**
     * Gets the answer.
     * @return Returns the answer.
     */
    public static int getAnswer() {
        return answer;
    }

    /**
     * Does nothing.
     */
    @Override
    public void generateSubQuestion() {
    }

}
