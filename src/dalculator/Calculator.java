/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dalculator;

/**
 *
 * @author Mohammed Hamthan
 */
public class Calculator extends javax.swing.JFrame {
 
    double number,answer;
    int calculations;
    
    
    
    public Calculator() {
        initComponents();
        
        jRadioButton2.setEnabled(false);
    }
        
    public void arithmatic_operations ()
    {
        switch (calculations)
        {
            case 1: //addition
                answer= number + Double.parseDouble(results.getText());
                results.setText(Double.toString(answer));
                break;
                
            case 2: //substraction
                answer= number - Double.parseDouble(results.getText());
                results.setText(Double.toString(answer));
                break;
                
            case 3:  //mustplication
                answer= number * Double.parseDouble(results.getText());
                results.setText(Double.toString(answer));
                break;
                
            case 4: //division
                answer= number / Double.parseDouble(results.getText());
                results.setText(Double.toString(answer));
                break;
        }
    }
            
        
            
            
        public void enable ()
                
    {
        results.setEnabled(true);
        
        jRadioButton2.setEnabled(false); // on button disable
        jRadioButton1.setEnabled(true); // off button enable
        
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);  
        btn_back.setEnabled(true);
        btn_clear.setEnabled(true);
        btn_plus.setEnabled(true);
        btn_minus.setEnabled(true);
        btn_multi.setEnabled(true);
        btn_division.setEnabled(true);
        btn_equal.setEnabled(true);
        btn_point.setEnabled(true);
    }
    
        public void disable ()
    
    {
        results.setEnabled(false);
        
        jRadioButton2.setEnabled(true); // on button enable
        jRadioButton1.setEnabled(false); // off button disabel
        
        btn0.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);  
        btn_back.setEnabled(false);
        btn_clear.setEnabled(false);
        btn_plus.setEnabled(false);
        btn_minus.setEnabled(false);
        btn_multi.setEnabled(false);
        btn_division.setEnabled(false);
        btn_equal.setEnabled(false);
        btn_point.setEnabled(false);
        
    }
    
    @SuppressWarnings("unchecked")
    
    private void Enternumbers (String q)
    {
        String nums = results.getText() + q ;
        results.setText (nums);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_plus = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn_minus = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn_point = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        results = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setBackground(new java.awt.Color(204, 204, 204));
        btn_back.setFont(new java.awt.Font("Gotham", 1, 28)); // NOI18N
        btn_back.setText("<--");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 70, 70));

        btn_clear.setBackground(new java.awt.Color(204, 204, 204));
        btn_clear.setFont(new java.awt.Font("Gotham Black", 0, 29)); // NOI18N
        btn_clear.setText("C");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 70, 70));

        btn_plus.setBackground(new java.awt.Color(204, 204, 204));
        btn_plus.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn_plus.setText("+");
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 70, 70));

        btn7.setBackground(new java.awt.Color(204, 204, 204));
        btn7.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 70));

        btn8.setBackground(new java.awt.Color(204, 204, 204));
        btn8.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 70, 70));

        btn9.setBackground(new java.awt.Color(204, 204, 204));
        btn9.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 70, 70));

        btn_minus.setBackground(new java.awt.Color(204, 204, 204));
        btn_minus.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn_minus.setText("-");
        btn_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 70, 70));

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 70));

        btn5.setBackground(new java.awt.Color(204, 204, 204));
        btn5.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 70, 70));

        btn6.setBackground(new java.awt.Color(204, 204, 204));
        btn6.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 70, 70));

        btn_multi.setBackground(new java.awt.Color(204, 204, 204));
        btn_multi.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn_multi.setText("*");
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 70, 70));

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 70));

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 70, 70));

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 70, 70));

        btn_division.setBackground(new java.awt.Color(204, 204, 204));
        btn_division.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn_division.setText("/");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 70, 70));

        btn0.setBackground(new java.awt.Color(204, 204, 204));
        btn0.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 70, 70));

        btn_point.setBackground(new java.awt.Color(204, 204, 204));
        btn_point.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn_point.setText(".");
        btn_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pointActionPerformed(evt);
            }
        });
        getContentPane().add(btn_point, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 70, 70));

        btn_equal.setBackground(new java.awt.Color(204, 204, 204));
        btn_equal.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        btn_equal.setText("=");
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 70, 70));

        results.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        results.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultsActionPerformed(evt);
            }
        });
        getContentPane().add(results, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 50));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Off");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("On");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        int length = results.getText().length();
        int number = results.getText().length() - 1;
        String store;
        
        if (length > 0)
        {
            StringBuilder back= new StringBuilder (results.getText());
            back.deleteCharAt(number);
            store=back.toString();
            results.setText(store);
        }
        
        
        
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        results.setText(results.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        results.setText(results.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        number = Double.parseDouble(results.getText());
        calculations = 4;
        results.setText("");
        jLabel2.setText(number + "/");
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed
        arithmatic_operations ();
        jLabel2.setText("");
    }//GEN-LAST:event_btn_equalActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        results.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void resultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultsActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        results.setText(results.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        results.setText(results.getText() + "8");;
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        results.setText(results.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        results.setText(results.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        results.setText(results.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        results.setText(results.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        results.setText(results.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        results.setText(results.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
        number = Double.parseDouble(results.getText());
        calculations = 3;
        results.setText("");
        jLabel2.setText(number + "*");
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minusActionPerformed
        number = Double.parseDouble(results.getText());
        calculations = 2;
        results.setText("");
        jLabel2.setText(number + "-");
    }//GEN-LAST:event_btn_minusActionPerformed

    private void btn_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusActionPerformed
        number = Double.parseDouble(results.getText());
        calculations = 1;
        results.setText("");
        jLabel2.setText(number + "+");        
    }//GEN-LAST:event_btn_plusActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        enable() ; //calculator enable
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btn_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pointActionPerformed
        results.setText(results.getText() + ".");
    }//GEN-LAST:event_btn_pointActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        disable() ; //calculator disable
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_minus;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_plus;
    private javax.swing.JButton btn_point;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField results;
    // End of variables declaration//GEN-END:variables
}
