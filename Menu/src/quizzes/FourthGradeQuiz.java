package quizzes;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import users.Student;

public class FourthGradeQuiz extends Quiz {

    /**
     * The current student question.
     */
    public static Student studentTested;

    /**
     * Question String for displaying quiz question.
     */
    public static String question = "";

    /**
     * The grade collected for the quiz.
     */
    public double quizGrade;

/**
     * Constructor for instantiating a fourth grade quiz.
     * @param thisStudent 
     */
    public FourthGradeQuiz(Student thisStudent) {
        studentTested = thisStudent;
    }

    /**
     * Makes multiplication quiz question.
     */
    public void generateMultQuestion() {

        boolean questionLoop = true;    //Loops the question until an answer is entered.

        Random ran = new Random();
        firstNumber = ran.nextInt(12);

        Random ran2 = new Random();
        secondNumber = ran2.nextInt(12);

        answer = (firstNumber * secondNumber);   //Records correct answer.

        question = firstNumber + " X " + secondNumber + " = ?"; //Records the question.

    }

    /**
     * Makes a division comparison question.
     */
    public void generateDivQuestion() {

        int[] divNumbers = {2, 4, 6, 8, 9, 10, 12, 15, 20, 21, 22, 25, 27, 30, 33, 36, 40, 45, 50, 55, 60, 62, 65, 70, 75, 80, 82, 85, 90, 92, 94, 98, 100, 110, 144, 150};

        int[] dividedBy = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 20, 25, 30, 31, 35,};

        boolean questionLoop = true;   //Loops the question until an answer is entered.

        int ran = ThreadLocalRandom.current().nextInt(0, divNumbers.length + 1);    //Generates a random number which signifies a place in the array.

        firstNumber = divNumbers[ran];

        for (int i = 0; i < dividedBy.length; i++) {

            if (divNumbers[ran] % dividedBy[i] == 0) {
                secondNumber = dividedBy[i];
            }    //When it finds a number that will divide evenly it will use that for secondNumber.

        }

        answer = (firstNumber / secondNumber);    //Records correct answer.

        question = firstNumber + " / " + secondNumber + " = "; //Displays the question.

    }

    /**
     * Makes addition quiz question.
     */
    public void generateAddQuestion() {

        boolean questionLoop = true;    //Loops the question until an answer is entered.

        firstNumber = ThreadLocalRandom.current().nextInt(100, 1001); //Generates a random number between 100 and 10001. 

        secondNumber = ThreadLocalRandom.current().nextInt(100, 1001); //Generates a random number between 100 and 10001. 

        answer = (firstNumber + secondNumber);   //Records correct answer.

        question = firstNumber + " + " + secondNumber + " = "; //Displays the question.

    }

    /**
     * Makes subtraction quiz question.
     */
    public void generateSubQuestion() {
        boolean questionLoop = true;     //Loops the question until an answer is entered.

        firstNumber = ThreadLocalRandom.current().nextInt(100, 1001); //Generates a random number between 100 and 10001. 

        secondNumber = ThreadLocalRandom.current().nextInt(100, 1001);  //Generates a random number between 100 and 10001. 

        if (firstNumber > secondNumber) //Makes sure the answer isn't negative.
        {
            answer = (firstNumber - secondNumber);     //Records correct answer.
            question = firstNumber + " - " + secondNumber + " = ";

        } else {
            answer = (secondNumber - firstNumber);
            question = secondNumber + " - " + firstNumber + " = ";
        }

    }

}
