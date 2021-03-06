package miscgui;

import java.awt.Image;
import javax.swing.ImageIcon;
import parentsgui.*;
import studentgui.*;
import teachergui.*;

/**
 * This is the main GUI shown at program start which displays the teacher, student, and parent login buttons, as well as the UML 
 * diagram and error handling imagery selection.
 * @author William Pruitt
 */
public class MainGUI extends javax.swing.JFrame {

    String[] set = {"1"};

    /**
     * Creates new form NewJFrame
     */
    public MainGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        teacherMeanuButton = new javax.swing.JButton();
        studentMenuButton = new javax.swing.JButton();
        parentMenuButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(3, 0), new java.awt.Dimension(3, 0), new java.awt.Dimension(3, 32767));
        jMenuBar1 = new javax.swing.JMenuBar();
        exitFileMenu = new javax.swing.JMenu();
        teacherMenuItem = new javax.swing.JMenuItem();
        studentMenuItem = new javax.swing.JMenuItem();
        parentMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        umlPic = new javax.swing.JMenu();
        optionError = new javax.swing.JMenuItem();
        optionUML = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math is Fun");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Please Select From The Following Options");

        teacherMeanuButton.setBackground(new java.awt.Color(0, 0, 255));
        teacherMeanuButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        teacherMeanuButton.setForeground(new java.awt.Color(255, 255, 255));
        teacherMeanuButton.setText("Teacher Menu");
        teacherMeanuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherMeanuButtonActionPerformed(evt);
            }
        });

        studentMenuButton.setBackground(new java.awt.Color(0, 0, 255));
        studentMenuButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        studentMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        studentMenuButton.setText("Student Menu");
        studentMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentMenuButtonActionPerformed(evt);
            }
        });

        parentMenuButton.setBackground(new java.awt.Color(0, 0, 255));
        parentMenuButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        parentMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        parentMenuButton.setText("Parent Menu");
        parentMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentMenuButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(153, 0, 0));
        exitButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(parentMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherMeanuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(teacherMeanuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(parentMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        exitFileMenu.setText("File");
        exitFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFileMenuActionPerformed(evt);
            }
        });

        teacherMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        teacherMenuItem.setText("Teacher Menu");
        teacherMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherMenuItemActionPerformed(evt);
            }
        });
        exitFileMenu.add(teacherMenuItem);

        studentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        studentMenuItem.setText("Student Menu");
        studentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentMenuItemActionPerformed(evt);
            }
        });
        exitFileMenu.add(studentMenuItem);

        parentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        parentMenuItem.setText("Parent Menu");
        parentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentMenuItemActionPerformed(evt);
            }
        });
        exitFileMenu.add(parentMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        exitFileMenu.add(exitMenuItem);

        jMenuBar1.add(exitFileMenu);

        umlPic.setText("Options");

        optionError.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        optionError.setText("Error Handling ");
        optionError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionErrorActionPerformed(evt);
            }
        });
        umlPic.add(optionError);

        optionUML.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        optionUML.setText("UML for Project");
        optionUML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionUMLActionPerformed(evt);
            }
        });
        umlPic.add(optionUML);

        jMenuBar1.add(umlPic);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teacherMeanuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherMeanuButtonActionPerformed
        dispose();
        TeacherLogin tlGUI = new TeacherLogin();
        tlGUI.setVisible(true);
        tlGUI.setLocationRelativeTo(null);

    }//GEN-LAST:event_teacherMeanuButtonActionPerformed

    /**
     * Exits the program proper.
     * @param evt 
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * Enters the student menu GUI.
     * @param evt 
     */
    private void studentMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentMenuButtonActionPerformed
        dispose();
        StudentLogin.main(set);
    }//GEN-LAST:event_studentMenuButtonActionPerformed

    /**
     * Enters the parent menu GUI.
     * @param evt 
     */
    private void parentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentMenuItemActionPerformed
        dispose();
        ParentsLogin.main(set);
    }//GEN-LAST:event_parentMenuItemActionPerformed

    /**
     * Enters the teacher menu GUI.
     * @param evt 
     */
    private void teacherMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherMenuItemActionPerformed
        dispose();
        TeacherLogin.main(set);
    }//GEN-LAST:event_teacherMenuItemActionPerformed

    /**
     * Enters the parent menu GUI.
     * @param evt 
     */
    private void parentMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentMenuButtonActionPerformed
        dispose();
        ParentsLogin.main(set);
    }//GEN-LAST:event_parentMenuButtonActionPerformed

    /**
     * Exits the program from the dropdown menu.
     * @param evt 
     */
    private void exitFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitFileMenuActionPerformed
    /**
     * Enters the student menu GUI.
     * @param evt 
     */
    private void studentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentMenuItemActionPerformed
        dispose();
        StudentLogin.main(set);
    }//GEN-LAST:event_studentMenuItemActionPerformed

    /**
     * Exits the program proper.
     * @param evt 
     */
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /**
     * Shows the UML documentation.
     * @param evt 
     */
    private void optionUMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionUMLActionPerformed
        dispose();
        UMLPic uml = new UMLPic();
        uml.setVisible(true);
        uml.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("FinalProjectUML.PNG");
        Image img = icon.getImage();
        Image newimage = img.getScaledInstance(
                uml.jLabel1.getWidth(), uml.jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimage);
        uml.jLabel1.setIcon(image);
        validate();

    }//GEN-LAST:event_optionUMLActionPerformed
    /**
     * Shows the Error Handling Documentation.
     * @param evt 
     */
    private void optionErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionErrorActionPerformed
        Pictures pic = new Pictures();
        dispose();
        OptionsPics op = new OptionsPics();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        pic.showImage(0);
    }//GEN-LAST:event_optionErrorActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainGUI mGUI = new MainGUI();
                mGUI.setVisible(true);
                mGUI.setLocationRelativeTo(null);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JMenu exitFileMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem optionError;
    private javax.swing.JMenuItem optionUML;
    private javax.swing.JButton parentMenuButton;
    private javax.swing.JMenuItem parentMenuItem;
    private javax.swing.JButton studentMenuButton;
    private javax.swing.JMenuItem studentMenuItem;
    private javax.swing.JButton teacherMeanuButton;
    private javax.swing.JMenuItem teacherMenuItem;
    private javax.swing.JMenu umlPic;
    // End of variables declaration//GEN-END:variables
}
