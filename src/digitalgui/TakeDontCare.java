/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalgui;

import java.awt.event.KeyEvent;

/**
 *
 * @author arabtech
 */
public class TakeDontCare extends javax.swing.JFrame {

    int counter = 0;
    Minimize mini = new Minimize();

    /**
     * Creates new form TakeDontCare
     */
    public TakeDontCare() {
        this.setTitle("Tabular Minimization");
        initComponents();
        Steps.setVisible(false);
        stepsS.setVisible(false);
        Ans.setVisible(false);
        AnsS.setVisible(false);
        jLabel3.setVisible(false);
        jLabel2.setVisible(false);
        this.setSize(555, 485);
        stepsS.setHorizontalScrollBar(null);
        AnsS.setHorizontalScrollBar(null);
        jLabel4.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        elements = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        stepsS = new javax.swing.JScrollPane();
        Steps = new javax.swing.JTextArea();
        AnsS = new javax.swing.JScrollPane();
        Ans = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Dont Enter Number > (Bits^2)-1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 200, 20));

        elements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementsActionPerformed(evt);
            }
        });
        elements.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                elementsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementsKeyTyped(evt);
            }
        });
        getContentPane().add(elements, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 166, 57));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 126, 59));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 80, 50));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Enter Dont Care");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 181, 41));

        stepsS.setAutoscrolls(true);

        Steps.setEditable(false);
        Steps.setColumns(20);
        Steps.setRows(5);
        Steps.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        stepsS.setViewportView(Steps);

        getContentPane().add(stepsS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 240, 370));

        Ans.setEditable(false);
        Ans.setColumns(20);
        Ans.setRows(5);
        Ans.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AnsS.setViewportView(Ans);

        getContentPane().add(AnsS, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 200, 370));

        jLabel2.setText("Solution:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel3.setText("Steps:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 150, 70));

        jButton3.setForeground(new java.awt.Color(0, 51, 204));
        jButton3.setText("Again!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 150, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elementsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (counter < mini.nD) {
            jLabel5.setText(String.valueOf(mini.nV-counter-1));
            if (!elements.getText().equals("") && !elements.getText().equals(null) && Integer.parseInt(elements.getText()) < (Math.pow(2, mini.nG - 1))) {
                int num = Integer.parseInt(elements.getText());
                jLabel4.setVisible(false);
                counter++;
                int bits = Integer.bitCount(num);
                mini.groups.get(bits).add(mini.toBinary(num));
                mini.check.get(bits).add(false);
                elements.setText(null);
                if (counter == mini.nD) {
                    mini.minimizeIt(Ans, Steps);
                    elements.setVisible(false);
                    jLabel5.setVisible(false);
                    jButton1.setVisible(false);
                    jLabel1.setVisible(false);
                    Steps.setVisible(true);
                    stepsS.setVisible(true);
                    Ans.setVisible(true);
                    AnsS.setVisible(true);
                }
            } else {
                jLabel4.setVisible(true);
                jLabel4.setText("Dont Enter Number > " + String.valueOf((int) Math.pow(2, mini.nG - 1) - 1));
            }
        } else {
            mini.minimizeIt(Ans, Steps);
            elements.setVisible(false);
            jButton1.setVisible(false);
            jLabel5.setVisible(false);
            jLabel1.setVisible(false);
            Steps.setVisible(true);
            stepsS.setVisible(true);
            Ans.setVisible(true);
            AnsS.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void elementsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementsKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !elements.getText().equals("") && !elements.getText().equals(null)) {
            if (counter < mini.nD) {
                jLabel5.setText(String.valueOf(mini.nV-counter-1));
                int num = Integer.parseInt(elements.getText());
                if (num < (Math.pow(2, mini.nG - 1))) {
                    jLabel4.setVisible(false);
                    counter++;
                    int bits = Integer.bitCount(num);
                    mini.groups.get(bits).add(mini.toBinary(num));
                    mini.check.get(bits).add(false);
                    elements.setText(null);
                    if (counter == mini.nD) {
                        mini.minimizeIt(Ans, Steps);
                        elements.setVisible(false);
                        jButton1.setVisible(false);
                        jLabel1.setVisible(false);
                        jLabel5.setVisible(false);
                        Steps.setVisible(true);
                        stepsS.setVisible(true);
                        Ans.setVisible(true);
                        AnsS.setVisible(true);
                        jLabel3.setVisible(true);
                        jLabel2.setVisible(true);
                        jButton2.setVisible(true);
                        jButton3.setVisible(true);
                        this.setSize(600, 600);
                    }
                } else {
                    jLabel4.setVisible(true);
                    jLabel4.setText("Dont Enter Number > " + String.valueOf((int) Math.pow(2, mini.nG - 1) - 1));
                }
            } else {
                mini.minimizeIt(Ans, Steps);
                elements.setVisible(false);
                jButton1.setVisible(false);
                jLabel1.setVisible(false);
                Steps.setVisible(true);
                stepsS.setVisible(true);
                Ans.setVisible(true);
                jLabel5.setVisible(false);
                AnsS.setVisible(true);
                jLabel3.setVisible(true);
                jLabel2.setVisible(true);
                jButton2.setVisible(true);
                jButton3.setVisible(true);
                this.setSize(600, 600);
            }
        }
    }//GEN-LAST:event_elementsKeyPressed

    private void elementsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementsKeyTyped
        char txt = evt.getKeyChar();
        if (!Character.isDigit(txt)) {
            evt.consume();
        }
    }//GEN-LAST:event_elementsKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mini.reset();
        Ans.setText(null);
        Steps.setText(null);
        this.setVisible(false);
        TakeNums tn = new TakeNums();
        tn.setVisible(true);
        tn.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TakeDontCare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeDontCare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeDontCare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeDontCare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeDontCare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Ans;
    private javax.swing.JScrollPane AnsS;
    private javax.swing.JTextArea Steps;
    private javax.swing.JTextField elements;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane stepsS;
    // End of variables declaration//GEN-END:variables
}