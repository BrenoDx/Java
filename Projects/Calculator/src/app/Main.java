/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import entities.Calculator;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
public class Main extends javax.swing.JFrame {
    String aux = "";
    String numeroPosi;
    Calculator calculator = new Calculator();

    /**
     * Creates new form Main
     */
    public Main() {
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

        OutPanel = new javax.swing.JPanel();
        LbSum = new javax.swing.JLabel();
        LbSum2 = new javax.swing.JLabel();
        LbOperator = new javax.swing.JLabel();
        LbResult = new javax.swing.JLabel();
        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonNegative = new javax.swing.JButton();
        jButtonComma = new javax.swing.JButton();
        jButtonResult = new javax.swing.JButton();
        jButtonAddition = new javax.swing.JButton();
        jButtonSubtraction = new javax.swing.JButton();
        jButtonMultiplication = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButtonPercentage = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OutPanel.setBackground(new java.awt.Color(255, 255, 255));
        OutPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LbSum2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        javax.swing.GroupLayout OutPanelLayout = new javax.swing.GroupLayout(OutPanel);
        OutPanel.setLayout(OutPanelLayout);
        OutPanelLayout.setHorizontalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(OutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutPanelLayout.createSequentialGroup()
                        .addComponent(LbSum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutPanelLayout.createSequentialGroup()
                        .addComponent(LbSum2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        OutPanelLayout.setVerticalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutPanelLayout.createSequentialGroup()
                .addGroup(OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OutPanelLayout.createSequentialGroup()
                        .addGroup(OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbSum, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbSum2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OutPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonNegative.setText("+/-");
        jButtonNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNegativeActionPerformed(evt);
            }
        });

        jButtonComma.setText(",");
        jButtonComma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCommaActionPerformed(evt);
            }
        });

        jButtonResult.setText("=");
        jButtonResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultActionPerformed(evt);
            }
        });

        jButtonAddition.setText("+");
        jButtonAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdditionActionPerformed(evt);
            }
        });

        jButtonSubtraction.setText("-");
        jButtonSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtractionActionPerformed(evt);
            }
        });

        jButtonMultiplication.setText("X");
        jButtonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicationActionPerformed(evt);
            }
        });

        jButtonDivision.setText("/");
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });

        jButtonPercentage.setText("%");
        jButtonPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPercentageActionPerformed(evt);
            }
        });

        jButtonClear.setText("C");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonNegative, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                    .addComponent(jButtonComma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMultiplication, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(jButtonSubtraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAddition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(OutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPercentage)
                    .addComponent(jButtonDivision)
                    .addComponent(jButtonClear))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8)
                        .addComponent(jButton9)
                        .addComponent(jButtonMultiplication)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButtonSubtraction)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButtonAddition))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0)
                    .addComponent(jButtonNegative)
                    .addComponent(jButtonComma)
                    .addComponent(jButtonResult))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LbSum2.setText(LbSum2.getText() + "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPercentageActionPerformed
        double num2 = calculator.percentage(Double.parseDouble(LbSum2.getText()));
        LbSum2.setText(String.format("%.2f", num2));
    }//GEN-LAST:event_jButtonPercentageActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        LbSum2.setText(LbSum2.getText() + "0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LbSum2.setText(LbSum2.getText() + "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LbSum2.setText(LbSum2.getText() + "3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LbSum2.setText(LbSum2.getText() + "4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        LbSum2.setText(LbSum2.getText() + "5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        LbSum2.setText(LbSum2.getText() + "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        LbSum2.setText(LbSum2.getText() + "7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        LbSum2.setText(LbSum2.getText() + "8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        LbSum2.setText(LbSum2.getText() + "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clear();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdditionActionPerformed
        LbSum.setText(LbSum2.getText());
        LbSum2.setText("");
        LbOperator.setText("+");
        aux = "";
    }//GEN-LAST:event_jButtonAdditionActionPerformed

    private void jButtonSubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtractionActionPerformed
        LbSum.setText(LbSum2.getText());
        LbSum2.setText("");
        LbOperator.setText("-");
        aux = "";
    }//GEN-LAST:event_jButtonSubtractionActionPerformed

    private void jButtonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicationActionPerformed
        LbSum.setText(LbSum2.getText());
        LbSum2.setText("");
        LbOperator.setText("*");
        aux = "";
    }//GEN-LAST:event_jButtonMultiplicationActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        LbSum.setText(LbSum2.getText());
        LbSum2.setText("");
        LbOperator.setText("/");
        aux = "";
    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jButtonResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultActionPerformed
        double num1 = Double.parseDouble(LbSum.getText().replace(",", "."));
        double num2 = Double.parseDouble(LbSum2.getText().replace(",", "."));
        double result;
        switch (LbOperator.getText()) {
            case "+":
                result = calculator.addition(num1, num2);
                LbResult.setText(String.format("%.2f", result));
                break;
            case "-":
                result = calculator.subtraction(num1, num2);
                LbResult.setText(String.format("%.2f", result));
                break;
            case "*":
                result = calculator.multiplication(num1, num2);
                LbResult.setText(String.format("%.2f", result));
                break;
            case "/":
                if(num2 != 0){
                result = calculator.division(num1, num2);
                LbResult.setText(String.format("%.2f", result));
                }else{
                    JOptionPane.showMessageDialog(null, "Erro!\nDivisor não pode ser 0");
                }
                break;
        }
    }//GEN-LAST:event_jButtonResultActionPerformed

    private void jButtonNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNegativeActionPerformed
        if(aux.equals("")){
        numeroPosi = LbSum2.getText();
        LbSum2.setText("-" + LbSum2.getText());
        aux = "-";
        }else{
            LbSum2.setText(numeroPosi);
            numeroPosi = "";
            aux = "";
        }       
    }//GEN-LAST:event_jButtonNegativeActionPerformed

    private void jButtonCommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCommaActionPerformed
        LbSum2.setText(LbSum2.getText()+",");
    }//GEN-LAST:event_jButtonCommaActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbOperator;
    private javax.swing.JLabel LbResult;
    private javax.swing.JLabel LbSum;
    private javax.swing.JLabel LbSum2;
    private javax.swing.JPanel OutPanel;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAddition;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonComma;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonMultiplication;
    private javax.swing.JButton jButtonNegative;
    private javax.swing.JButton jButtonPercentage;
    private javax.swing.JButton jButtonResult;
    private javax.swing.JButton jButtonSubtraction;
    // End of variables declaration//GEN-END:variables

    public void clear() {
        LbSum2.setText("");
        LbSum.setText("");
        LbOperator.setText("");
        LbResult.setText("");
        aux = "";
    }
}
