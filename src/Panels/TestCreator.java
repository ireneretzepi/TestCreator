/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Questions.Test;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Dimitra
 */
public class TestCreator extends javax.swing.JFrame {
    private Test test; 
    /**
     * Creates new form TestCreator
     */
    public TestCreator() {
        initComponents();
        //test = new Test(); 
        this.setTitle("Create Test");
        this.jButton1.setEnabled(false);
        this.jButton2.setEnabled(false);
        this.jButton3.setEnabled(false);
        this.jButton4.setEnabled(false);
        this.jButton6.setEnabled(false);
        this.jButton7.setEnabled(false);
        this.jMenuItem1.setEnabled(false); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Test Name:");

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField1MouseExited(evt);
            }
        });

        jButton1.setText("Add True False Question");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Question With Missing Statement");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add Question With Multiple Answers");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Add Question With Single Answers");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Create Test");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("View Questions");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setText("Time: ");

        jButton7.setText("Delete Question");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Save Test");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Open Test");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem3.setText("Help");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton6))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MakeMCQMAQuestion(this.test) ;// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseExited
        if(this.test!=null){
            this.test.setTestName(this.jTextField1.getText());
        }
        //System.out.println("The test name is set to: "+this.test.getTestName());
    }//GEN-LAST:event_jTextField1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MakeTFQQuestion(this.test); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.jTextField1.setBackground(Color.white);
        this.jTextField2.setBackground(Color.white);
        if(this.jTextField1.getText().length()==0){ 
            this.jTextField1.setBackground(Color.pink); 
            if(this.jTextField2.getText().length()==0){
                this.jTextField2.setBackground(Color.pink); 
            }
            return; }
        int t = 0; 
        
        this.test = new Test(); 
        this.test.setTestName(this.jTextField1.getText());
        this.jButton1.setEnabled(true);
        this.jButton2.setEnabled(true);
        this.jButton3.setEnabled(true);
        this.jButton4.setEnabled(true);
        this.jButton5.setEnabled(false);
        this.jButton7.setEnabled(true);
        this.jMenuItem1.setEnabled(true); 
        
        try{
           t = Integer.parseInt( this.jTextField2.getText() ) ;
            this.test.setTotalTime(t);
            this.jTextField2.setBackground(Color.white); 
            this.jButton6.setEnabled(true);
        }catch(Exception e){
            this.jTextField2.setBackground(Color.pink); 
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new MakeQWMSQuestion(test);         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new MakeMCQWSAQuestion(test); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(this.test==null){
           javax.swing.JOptionPane.showMessageDialog(this, "No test has been created","Error", javax.swing.JOptionPane.ERROR_MESSAGE);
           return;
       }
       if(this.test.getNumberOfQuestions()==0){
           javax.swing.JOptionPane.showMessageDialog(this, "The test does not contain questions","Error", javax.swing.JOptionPane.ERROR_MESSAGE);
           return; 
       }
        if(this.test!=null){
          int t = 0;   
           try{
           t = Integer.parseInt( this.jTextField2.getText() ) ;
            this.test.setTotalTime(t);
            this.jTextField2.setBackground(Color.white); 
           }catch(Exception e){
            this.jTextField2.setBackground(Color.red); 
            javax.swing.JOptionPane.showMessageDialog(this, "Please Insert a resonable time for the test","Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return ; 
           }
           JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
           int returnValue = chooser.showSaveDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = chooser.getSelectedFile();
                System.out.println(selectedFile.getAbsolutePath());
                saveTest(selectedFile); 
            }
       }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(this,this.test,"Test Info",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.out.println("The test lasts "+this.test.getTotalTime());
        System.out.println("The test contains"+this.test.getQuestions().size());
        System.exit(0); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       JFrame helpJFrame = new JFrame("Help");
       JLabel helpLabel = new JLabel(this.helpText);
       helpJFrame.add(helpLabel);
       helpJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       helpJFrame.setSize(1000,800);
       helpJFrame.setLocation(0,0);
       helpJFrame.setVisible(true); 
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
           int returnValue = chooser.showSaveDialog(null);
           try{
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = chooser.getSelectedFile();
                this.loadTest(selectedFile.getAbsolutePath());
                this.jTextField1.setText(this.test.getTestName());
                this.jTextField2.setText(Integer.toString(this.test.getTotalTime()));
                this.jButton1.setEnabled(true);
                this.jButton2.setEnabled(true);
                this.jButton3.setEnabled(true);
                this.jButton4.setEnabled(true);
                this.jButton5.setEnabled(false);
                this.jButton6.setEnabled(true);
                this.jButton7.setEnabled(true);
                this.jMenuItem1.setEnabled(true); 
            }
           }catch(Exception e){
               e.printStackTrace();
           }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

         
         String[] string_questions = new String[this.test.getNumberOfQuestions()];
         for(int i=0;i<string_questions.length;i++){
             string_questions[i] = (i+1)+": "+this.test.getQuestions().get(i).getStatement();
         }
         String input = (String) JOptionPane.showInputDialog(null, "Choose the question to delete.",
        "Edit Question", JOptionPane.QUESTION_MESSAGE, null,
        string_questions, // Array of choices
        string_questions[1]); // Initial choice
         
        int questionNumber = Integer.parseInt(input.split(":")[0])-1;
        System.out.println(questionNumber);
        this.test.getQuestions().remove(questionNumber); 
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed
    private void saveTest(File selectedFile){
          ObjectOutputStream o = null;
          FileOutputStream f = null; 
          try{
              f = new FileOutputStream(selectedFile); 
              o = new ObjectOutputStream(f );
              System.out.println("before save");
              o.writeObject(this.test);
              System.out.println("write operation completed! ");
              f.close();
              o.close(); 
          }catch(Exception e){
              e.printStackTrace();
          }
    }
    
    private void loadTest(String selectedFile){
        ObjectInputStream o = null;
        FileInputStream f = null; 
        try{
            f = new FileInputStream(new File(selectedFile));
            o = new ObjectInputStream(f);
            this.test = (Test)o.readObject(); 
            f.close();
            o.close(); 
        }catch(Exception e){
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(TestCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestCreator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    // help text
    String helpText ="<HTML><h1 align=\"center\">\n" +
"    Help\n" +
"</h1>\n" +
"<h2>\n" +
"    How to start creating a test?\n" +
"</h2>\n" +
"<p>\n" +
"    Using this application you are able to create a test. By entering a valid\n" +
"    Test Name and the time of the completion of the test in minutes and after\n" +
"    pressing the button “Create Test”, you should be able to create the test.\n" +
"    After pressing it, the question creation buttons are enabled. If the time\n" +
"    isn’t in numbers, the time space will become red in order for you to input\n" +
"    a correct time.\n" +
"</p>\n" +
"<h2>\n" +
"    How to create True False questions?\n" +
"</h2>\n" +
"<p>\n" +
"    By pressing any of the four buttons enabled you are able to create a\n" +
"    question of the type that is written on the button. By pressing the button\n" +
"    “Add True False question” a panel appears on screen. You have to input the\n" +
"    question in the blank statement box and choose whether it is true or false.\n" +
"    By clicking the button OK, the question is added to the test. If\n" +
"    accidentally the button OK is pressed twice, the question is only added\n" +
"    once. When the button “Clear” is pressed, all the boxes become blank and\n" +
"    what was inputted disappears. By pressing the button “cancel”, the panel\n" +
"    for creating the test disappears.\n" +
"</p>\n" +
"<h2>\n" +
"    How to create Question with Missing Statement?\n" +
"</h2>\n" +
"<p>\n" +
"    The button “Add Question with Missing Statement” creates a question where\n" +
"    one word of the sentence, the one inputted in the box next to “Missing\n" +
"    Word” label, will be missing when the student will take the test. If the\n" +
"    inputted “Missing Word” does not exist, an error message will appear\n" +
"    stating it and the question won’t be added.\n" +
"</p>\n" +
"<h2>\n" +
"    How to create Multiple Choice Questions with Multiple Answers?\n" +
"</h2>\n" +
"<p>\n" +
"    The button “Add Question will Multiple Answers” would create a multiple\n" +
"    choice question where multiple answers would be considered correct. The\n" +
"    question is inputted beneath the label “Question” in the white box. Beneath\n" +
"    the label Answers, after pressing the button “Add Answer” an input panel\n" +
"    appears with the message “Enter an answer”. After inputting the answer in\n" +
"    the white box beneath the message, the answer is added in the answer box.\n" +
"    If a mistake has been made and you wish to edit the answer, press the\n" +
"    answer you want to edit and then the “Edit Answer” button to edit or if you\n" +
"    want to remove it the “Remove Answer” button.\n" +
"</p>\n" +
"<h2>\n" +
"    How to select correct answers in the previous type of question?\n" +
"</h2>\n" +
"<p>\n" +
"    After inputted all the answers, a correct one should be chosen by selecting\n" +
"    it from the answer box. When an answer has been selected, next to the\n" +
"    answer box some digits appear with 0’s and 1’s. The 1’s correspond to the\n" +
"    selected correct indices and their position the question to which they\n" +
"    correspond. If you wish to unselect an answer then just press on it again\n" +
"    and it will become a 0. For example, the statement “What is the correct\n" +
"    answer?” and the answers are a, b, c, d and e and the correct answers are a\n" +
"    and d what would appear next to the text box is 10010.\n" +
"</p>\n" +
"<h2>\n" +
"    How to create Question with Single Answer?\n" +
"</h2>\n" +
"<p>\n" +
"    When pressing the button “Question with Single Answer”, the properties are\n" +
"    the same with the multiple answer questions other than the selected correct\n" +
"    answers. In this occasion, only one answer is correct. The index of the\n" +
"    correct question appears next to the answer box.\n" +
"</p>\n" +
"<h2>\n" +
"    How to you review what questions have you inputted?\n" +
"</h2>\n" +
"<p>\n" +
"    By pressing the “#Questions” button, information about the test is provided\n" +
"    (Test name, # of questions and questions added). Finally, by pressing file\n" +
"    in the upper left corner and then “Save Test” the test is saved in the\n" +
"    chosen location.\n" +
"</p></HTML>";

}
