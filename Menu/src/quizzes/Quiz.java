package quizzes;

/**
 * Abstract class that all quiz classes use.
 * @author rynth
 */
public abstract class Quiz {

    /**
     * The first number used in calculations.
     */
    public int firstNumber;
    /**
     * The second number used in calculations.
     */
    public int secondNumber;
    /**
     * The actual calculated answer used in calculations.
     */
    public static int answer;        //Actual calculated answer
    /**
     * The actual calculated answer used in calculations in a Double.
     */
    public static double doubleAnswer;
    /**
     * The actual calculated answer used in calculations.
     */
    public int guess;         //Guess that the user types in

    /**
     * For generating addition questions.
     */
    public abstract void generateAddQuestion();

    /**
     * For generating subtraction questions.
     */
    public abstract void generateSubQuestion();

}
