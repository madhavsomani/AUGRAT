/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augrat;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author Madhav
 */
public class AUGRAT extends javax.swing.JFrame {

    /**
     * Creates new form AUGRAT
     */
    
    DefaultListModel bugBlockList = new DefaultListModel();
    public AUGRAT() {
        initComponents();
        jTextArea2.setText("Bug description : Thrown when a stack overflow occurs because an application recurses \ntoo deeply.");
        try {
            readbodyfile();
        } catch (IOException ex) {
            Logger.getLogger(AUGRAT.class.getName()).log(Level.SEVERE, null, ex);
        }
        totalnooflines.setText("Total Number of Lines : " + AUGRAT.javaconsole.getLineCount());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        javaconsole = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        displaybugaddedlist = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        packagename = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        junkcodeinput = new javax.swing.JTextField();
        addjunkcodebutton = new javax.swing.JButton();
        bugblockselectcombobox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        totalnooflines = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        threadCheckbox = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javaconsole.setColumns(20);
        javaconsole.setRows(5);
        jScrollPane1.setViewportView(javaconsole);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText(".Java Output Console");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Added Bug Block List");

        displaybugaddedlist.setModel(bugBlockList);
        jScrollPane3.setViewportView(displaybugaddedlist);

        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Package Name* :");

        packagename.setToolTipText("com.example.myfirstapp");
        packagename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packagenameActionPerformed(evt);
            }
        });

        jButton1.setText("GENERATE .Java");
        jButton1.setToolTipText("");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Number of Junk Lines :");

        junkcodeinput.setToolTipText("com.example.myfirstapp");

        addjunkcodebutton.setText("Add");
        addjunkcodebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjunkcodebuttonActionPerformed(evt);
            }
        });

        bugblockselectcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "StackOverflowError", "NullPointerException", "DivideByZeroException", "ClassNotFoundException", "ArrayIndexOutOfBoundsException" }));
        bugblockselectcombobox.setToolTipText("Select the bug you wana add.");
        bugblockselectcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bugblockselectcomboboxActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Select Bug Block* :");

        totalnooflines.setText("Total Number of Lines : 0");

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        threadCheckbox.setText("Android Thread");
        threadCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threadCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalnooflines)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(packagename, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(junkcodeinput, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addjunkcodebutton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextArea2)
                                .addGap(65, 65, 65))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(bugblockselectcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(threadCheckbox)
                        .addGap(56, 56, 56))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalnooflines)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bugblockselectcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton2)
                    .addComponent(threadCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(packagename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(junkcodeinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addjunkcodebutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("AUGRAT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void threadCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threadCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_threadCheckboxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        JComboBox cb = bugblockselectcombobox;
        JsonBugBlockModels model = null;
        String msg = (String) cb.getSelectedItem();

        switch (msg) {
            case "StackOverflowError":
            model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/StackOverflowError.json");
            break;
            case "NullPointerException":
            model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/NullPointerException.json");
            break;
            case "DivideByZeroException":
            model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/DivideByZeroException.json");
            break;
            case "ClassNotFoundException":
            model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/ClassNotFoundException.json");
            break;
            case "ArrayIndexOutOfBoundsException":
            model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/ArrayIndexOutOfBoundsException.json");
            break;
            case "InterruptedException":
            model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/InterruptedException.json");
            break;
            case "FileNotFoundException":
            model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/FileNotFoundException.json");
            break;
            case "StringIndexOutOfBoundsException":
            model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/StringIndexOutOfBoundsException.json");
            break;
            case "IllegalArgumentException":
            model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/IllegalArgumentException.json");
            break;
            case "NumberFormatException":
            model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/NumberFormatException.json");
            break;
            case "ClassCastException":
            model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/ClassCastException.json");
            break;
        }

        if (model != null) {
            try {
                if(threadCheckbox.isSelected())
                {
                  if(bugBlockList.isEmpty())
                  FuseEngine.bugFusion("libs/bodyFormatThread.augrat","libs/importFormat.augrat", model,false);
                  else
                  {
                        if(!bugBlockList.contains(msg))
                      FuseEngine.bugFusion("libs/body.augrat","libs/import.augrat", model,true);
                      else
                      JOptionPane.showMessageDialog(null, msg+" BugBlock Already Added to Mainframe!", "AUGRAT", JOptionPane.ERROR_MESSAGE);
                  }     
                }else
                {
                  if(bugBlockList.isEmpty())
                     FuseEngine.bugFusion("libs/bodyFormat.augrat","libs/importFormat.augrat", model,false);
                  else
                  {
                       if(!bugBlockList.contains(msg))
                           FuseEngine.bugFusion("libs/body.augrat","libs/import.augrat", model,true);
                           else
                           JOptionPane.showMessageDialog(null, "BugBlock "+ msg+" Already Added to Mainframe!", "AUGRAT", JOptionPane.ERROR_MESSAGE);
                  }
                }
                if(!bugBlockList.contains(msg))
                bugBlockList.addElement(msg); 
            } catch (IOException ex) {
                Logger.getLogger(AUGRAT.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error in Adding BugBlock!", "AUGRAT", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bugblockselectcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bugblockselectcomboboxActionPerformed
        // TODO add your handling code here:

        JComboBox cb = (JComboBox) evt.getSource();
        String msg = (String) cb.getSelectedItem();

        switch (msg) {
            case "StackOverflowError":
            jTextArea2.setText("Bug description : Thrown when a stack overflow occurs because an application recurses \ntoo deeply.");
            break;
            case "NullPointerException":
            jTextArea2.setText("Bug description : Thrown when an application attempts to use null in a case where\nan object is required.");
            break;
            case "DivideByZeroException":
            jTextArea2.setText("Bug description : Thrown when an exceptional arithmetic condition has occurred.\nFor example, an integer \\\"divide by zero\\\" throws an instance of this class. ");
            break;
            case "ClassNotFoundException":
            jTextArea2.setText("Bug description : Thrown when an application tries to load in a class through its string name\nbut no definition for the class with the specified name could be found.");
            break;
            case "ArrayIndexOutOfBoundsException":
            jTextArea2.setText("Bug description : Thrown to indicate that an array has been accessed with an illegal index.\nThe index is either negative or greater than or equal to the size of the array.");
            break;
             case "InterruptedException":
            jTextArea2.setText("Bug description : InterruptedException that an array has been accessed with an illegal index.\nThe index is either negative or greater than or equal to the size of the array.");
            break;
            case "FileNotFoundException":
            jTextArea2.setText("Bug description : FileNotFoundException Thrown to indicate that an array has been accessed with an illegal index.\nThe index is either negative or greater than or equal to the size of the array.");
            break;
            case "StringIndexOutOfBoundsException":
             jTextArea2.setText("Bug description : StringIndexOutOfBoundsException Thrown to indicate that an array has been accessed with an illegal index.\nThe index is either negative or greater than or equal to the size of the array.");
            break;
            case "IllegalArgumentException":
             jTextArea2.setText("Bug description : IllegalArgumentException Thrown to indicate that an array has been accessed with an illegal index.\nThe index is either negative or greater than or equal to the size of the array.");
            break;
            case "NumberFormatException":
            jTextArea2.setText("Bug description : NumberFormatException Thrown to indicate that an array has been accessed with an illegal index.\nThe index is either negative or greater than or equal to the size of the array.");
            break;
            case "ClassCastException":
            jTextArea2.setText("Bug description : ClassCastException Thrown to indicate that an array has been accessed with an illegal index.\nThe index is either negative or greater than or equal to the size of the array.");
            break;
        }
    }//GEN-LAST:event_bugblockselectcomboboxActionPerformed

    private void addjunkcodebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjunkcodebuttonActionPerformed
        // TODO add your handling code here:
           int loopcounter =  Integer.parseInt(junkcodeinput.getText());
           JsonBugBlockModels model = null;
           model = JsonHelper.bugBlockJsonRead("libs/BugBlocks/JunkLines.json");
          for(int i = 0; i < loopcounter/model.numberOfLines ; i++)
          {
          
          }
          
    }//GEN-LAST:event_addjunkcodebuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (!packagename.getText().isEmpty()) {
                JavaGenerator.merger("libs/import.augrat", "libs/body.augrat", packagename.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Enter Valid Package name before generating .java File!.", "AUGRAT", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException ex) {
            Logger.getLogger(AUGRAT.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error in generating .java File!.", "AUGRAT", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void packagenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packagenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packagenameActionPerformed

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
            java.util.logging.Logger.getLogger(AUGRAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AUGRAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AUGRAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AUGRAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AUGRAT().setVisible(true);
            }
        });

    }
    
    public static void readbodyfile() throws IOException
   {
  
        // Reading  Augrat java file 
         javaconsole.setText("");
         List<String> lines = Files.readAllLines(new File("libs/body.augrat").toPath());
         for(int i=0;i<lines.size();i++)
         {
            javaconsole.append(lines.get(i));
             javaconsole.append("\n");
         }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjunkcodebutton;
    public static javax.swing.JComboBox<String> bugblockselectcombobox;
    public static javax.swing.JList<String> displaybugaddedlist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private static javax.swing.JTextArea jTextArea2;
    public static javax.swing.JTextArea javaconsole;
    private javax.swing.JTextField junkcodeinput;
    private javax.swing.JTextField packagename;
    private static javax.swing.JCheckBox threadCheckbox;
    public static javax.swing.JLabel totalnooflines;
    // End of variables declaration//GEN-END:variables
}
