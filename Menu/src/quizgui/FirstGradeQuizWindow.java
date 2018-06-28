package quizgui;

import quizzes.FirstGradeQuiz;
import users.Student;

/**
 * First grade quiz for a grade.
 * @author William Pruitt
 */
public class FirstGradeQuizWindow extends javax.swing.JFrame {

    /**
     * Creates new form PracticeTest
     */
    public FirstGradeQuizWindow() {
        initComponents();
    }

    public static boolean comparableQuiz = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nextQuestion = new java.awt.Button();
        checkAnswer = new java.awt.Button();
        back = new java.awt.Button();
        label2 = new java.awt.Label();
        answerField = new java.awt.TextField();
        correctIncorrect = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Grade Quiz");
        setLocation(new java.awt.Point(0, 0));
        setName("practiceTest"); // NOI18N

        jLabel1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel1InputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        nextQuestion.setActionCommand("Next Question");
        nextQuestion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nextQuestion.setLabel("Next Question");
        nextQuestion.setName("Next Question"); // NOI18N
        nextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionActionPerformed(evt);
            }
        });

        checkAnswer.setLabel("Check Answer");
        checkAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnswerActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        back.setLabel("Back to Menu");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label2.setText("Please Enter Answer:");

        answerField.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });

        correctIncorrect.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        correctIncorrect.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(correctIncorrect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(checkAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(119, 119, 119))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkAnswer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answerField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(correctIncorrect, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nextQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean answerChecked = false;

    public static int correctAnswers = 0;

    public static String[] questions = new String[10];

    public static int[] answers = new int[10];

    public static int index = 0;

    public boolean nextButtonEnabled;

    public boolean validAnswer = false;

    private void nextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionActionPerformed

        if (answerChecked && nextButtonEnabled && index <= 9) {
            FirstGradePracticeQuiz pt = new FirstGradePracticeQuiz();

            jLabel1.setText("");
            jLabel1.setText(questions[index]);

            answerChecked = false;

            answerField.setText("");
            if (comparableQuiz) {

                if (index % 2 == 0) {
                    label2.setText("Which number is bigger?");
                    answerField.setText("");
                } else {
                    label2.setText("Which number is smaller?");
                    answerField.setText("");
                }
            }
            validAnswer = false;
        }

    }//GEN-LAST:event_nextQuestionActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        FirstGradeTestSelector sGUI = new FirstGradeTestSelector();
        sGUI.setVisible(true);
        sGUI.setLocationRelativeTo(null);
    }//GEN-LAST:event_backActionPerformed

    private void jLabel1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1InputMethodTextChanged

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerFieldActionPerformed

    private void checkAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAnswerActionPerformed

        Integer check = 0;

        if (!answerField.getText().isEmpty()) {

            try {
                check = Integer.valueOf(answerField.getText());

                validAnswer = true;

            } catch (NumberFormatException ex) {

            }

            if (!answerChecked && validAnswer) {

                if (check == answers[index] && index <= 9 || check == null);
                {
                    correctAnswers++;
                    correctIncorrect.setText("Correct");
                    answerChecked = true;

                }
                if (check != answers[index] && index <= 9) {
                    correctIncorrect.setText("Incorrect");
                    answerChecked = true;
                    correctAnswers--;

                }

                if (index == 9) {

                    switch (correctAnswers) {
                        case 0:
                            correctIncorrect.setText("Your score is: 0%");
                             {

                                Student.currentStudent.addGrade(0.0);

                            }
                            break;

                        case 1:
                            correctIncorrect.setText("Your score is: 10%");
                             {

                                Student.currentStudent.addGrade(10.0);

                            }
                            break;
                        case 2:
                            correctIncorrect.setText("Your score is: 20%");
                             {

                                Student.currentStudent.addGrade(20.0);

                            }
                            break;
                        case 3:
                            correctIncorrect.setText("Your score is: 30%");
                             {

                                Student.currentStudent.addGrade(30.0);

                            }
                            break;
                        case 4:
                            correctIncorrect.setText("Your score is: 40%");
                             {

                                Student.currentStudent.addGrade(40.0);

                            }
                            break;
                        case 5:
                            correctIncorrect.setText("Your score is: 50%");
                             {

                                Student.currentStudent.addGrade(50.0);

                            }
                            break;
                        case 6:
                            correctIncorrect.setText("Your score is: 60%");
                             {

                                Student.currentStudent.addGrade(60.0);

                            }
                            break;
                        case 7:
                            correctIncorrect.setText("Your score is: 70%");
                             {

                                Student.currentStudent.addGrade(70.0);

                            }
                            break;
                        case 8:
                            correctIncorrect.setText("Your score is: 80%");
                             {

                                Student.currentStudent.addGrade(80.0);

                            }
                            break;
                        case 9:
                            correctIncorrect.setText("Your score is: 90%");
                             {

                                Student.currentStudent.addGrade(90.0);

                            }
                            break;
                        case 10:
                            correctIncorrect.setText("Your score is: 100%");
                             {

                                Student.currentStudent.addGrade(100.0);

                            }
                            break;

                    }

                    nextButtonEnabled = false;

                }

                index++;

            }

        }
    }//GEN-LAST:event_checkAnswerActionPerformed
/**
     * Creates a comparison based first-grade quiz.
     * @param student The student currently logged in.
     */
    public void comparableQuiz(Student student) {
        index = 0;
        correctAnswers = 0;
        FirstGradeQuiz newQuiz = new FirstGradeQuiz(student);

        newQuiz.generateGreaterThanQuestion();
        questions[0] = FirstGradeQuiz.question;
        answers[0] = FirstGradeQuiz.answer;

        newQuiz.generateGreaterThanQuestion();
        questions[2] = FirstGradeQuiz.question;
        answers[2] = FirstGradeQuiz.answer;

        newQuiz.generateGreaterThanQuestion();
        questions[4] = FirstGradeQuiz.question;
        answers[4] = FirstGradeQuiz.answer;

        newQuiz.generateGreaterThanQuestion();
        questions[6] = FirstGradeQuiz.question;
        answers[6] = FirstGradeQuiz.answer;

        newQuiz.generateGreaterThanQuestion();
        questions[8] = FirstGradeQuiz.question;
        answers[8] = FirstGradeQuiz.answer;

        newQuiz.generateLessThanQuestion();
        questions[1] = FirstGradeQuiz.question;
        answers[1] = FirstGradeQuiz.answer;

        newQuiz.generateLessThanQuestion();
        questions[3] = FirstGradeQuiz.question;
        answers[3] = FirstGradeQuiz.answer;

        newQuiz.generateLessThanQuestion();
        questions[5] = FirstGradeQuiz.question;
        answers[5] = FirstGradeQuiz.answer;

        newQuiz.generateLessThanQuestion();
        questions[7] = FirstGradeQuiz.question;
        answers[7] = FirstGradeQuiz.answer;

        newQuiz.generateLessThanQuestion();
        questions[9] = FirstGradeQuiz.question;
        answers[9] = FirstGradeQuiz.answer;

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24));
        jLabel1.setText(questions[index]); //Sets the question text to match the first question.
        label2.setText("Which number is bigger?");
        nextButtonEnabled = true;

        comparableQuiz = true;

    }
/**
     * Creates a addition based first-grade quiz.
     * @param student The student currently logged in.
     */
    public void addQuiz(Student student) {

        index = 0;
        correctAnswers = 0;
        FirstGradeQuiz newQuiz = new FirstGradeQuiz(student);

        for (int i = 0; i < 10; i++) {
            newQuiz.generateAddQuestion();
            questions[i] = FirstGradeQuiz.question;
            answers[i] = FirstGradeQuiz.answer;
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 144));
        jLabel1.setText(questions[index]); //Sets the question text to match the first question.
        label2.setText("How many dots are on the screen?");
        nextButtonEnabled = true;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FirstGradePracticeQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstGradePracticeQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstGradePracticeQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstGradePracticeQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                FirstGradePracticeQuiz pt = new FirstGradePracticeQuiz();
                pt.setVisible(true);
                pt.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField answerField;
    private java.awt.Button back;
    private java.awt.Button checkAnswer;
    private java.awt.Label correctIncorrect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label2;
    private java.awt.Button nextQuestion;
    // End of variables declaration//GEN-END:variables

}
