/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.awt.Font;
/**
 *
 * @author wdrummond
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        jTextField1.setFont(font1);
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonPlus = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jButtonMultiply = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Postfix Calculator");
        setResizable(false);

        jButton1.setText("1");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
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

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        titleLabel.setText("                               Postfix Calculator");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButtonPlus.setText("+");
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        jButtonMinus.setText("-");
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });

        jButtonEquals.setText("=");
        jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualsActionPerformed(evt);
            }
        });

        jButtonMultiply.setText("*");
        jButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplyActionPerformed(evt);
            }
        });

        jButtonDivide.setText("/");
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivideActionPerformed(evt);
            }
        });

        jButtonClear.setText("clr");
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonPlus)
                                            .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonMultiply)
                                            .addComponent(jButtonDivide)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonClear)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton0)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jButton9))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(4, 4, 4)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonDivide, jButtonMinus, jButtonMultiply, jButtonPlus});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonClear});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButtonPlus)
                    .addComponent(jButtonMultiply))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButtonMinus)
                    .addComponent(jButtonDivide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0)
                    .addComponent(jButtonEquals)
                    .addComponent(jButtonClear)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String number = "1";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String number = "2";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String number = "3";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String number = "4";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String number = "5";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String number = "6";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String number = "7";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String number = "8";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String number = "9";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
        String number = "0";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivideActionPerformed
        // TODO add your handling code here:
        String number = "/";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButtonDivideActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
        // TODO add your handling code here:
        String number = "+";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
        // TODO add your handling code here:
        String number = "-";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButtonMinusActionPerformed

    private void jButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplyActionPerformed
        // TODO add your handling code here:
        String number = "*";
        jTextField1.setText(jTextField1.getText()+number);
    }//GEN-LAST:event_jButtonMultiplyActionPerformed

    private void jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualsActionPerformed
        // TODO add your handling code here:
        //Postfix calculations done here
        Stack<String> jStack = new Stack<>();
        String field = jTextField1.getText();
        char ch = 0;
         
         for (int c = 0; c < field.length(); c++)
         {
             ch = field.charAt(c);
             System.out.println(ch );
             
             //check for an integer, if its valid, push it onto stack
             if (ch >= '0' && ch <= '9')
             {
                 System.out.println("pushing an integer to the stack." );
                 jStack.push(Character.toString(ch));
             }
             
             //check for operators and calculate accordingly
             else if( ch == '+' )
           {

                int rVal = Integer.parseInt(jStack.pop());
                int lVal = Integer.parseInt(jStack.pop()); 
                jStack.push(Integer.toString(rVal + lVal));
             }
             
             else if( ch == '-' )
           {
               
                int rVal = Integer.parseInt(jStack.pop());
                int lVal = Integer.parseInt(jStack.pop()); 
                jStack.push(Integer.toString(lVal - rVal));
             }
             
             else if( ch == '*' )
           {
               
                int rVal = Integer.parseInt(jStack.pop());
                int lVal = Integer.parseInt(jStack.pop()); 
                jStack.push(Integer.toString(rVal * lVal));
             }
             
             else if( ch == '/' )
           {
               
                int rVal = Integer.parseInt(jStack.pop());
                int lVal = Integer.parseInt(jStack.pop()); 
                jStack.push(Integer.toString(lVal / rVal));
                
             } else {                  
            //
          }
        }
         if ( !jStack.empty())
         {
            String result = jStack.pop();
            System.out.println( result );
            jTextField1.setText(result);
            jStack.clear();
         }
         else {
             System.out.println( "Your stack is empty and it shouldnt be." );
         }
    }//GEN-LAST:event_jButtonEqualsActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMultiply;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
