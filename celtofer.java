/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheat;

/**
 *
 * @author fores
 */
public class celtofer extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public celtofer() {
        playerCount = 1;
        initComponents();
        playerNames = new String[4];
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 670));
        setSize(new java.awt.Dimension(1000, 670));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Start Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 470, 110, 27);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "One Player", "Two Players", "Three Players", "Four Players" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(140, 300, 111, 24);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("Number of Players");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 260, 170, 22);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("View Rules");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(332, 465, 99, 27);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("AI Difficulty");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(720, 270, 110, 22);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy", "Medium", "Impossible" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(720, 300, 97, 24);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 50, 50));
        jLabel5.setText("Player 1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 80, 60, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 50, 50));
        jLabel6.setText("Player 2");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 120, 60, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 50, 50));
        jLabel7.setText("Player 3");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 160, 60, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 50, 50));
        jLabel8.setText("Player 4");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 200, 60, 20);

        jTextField1.setName(""); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 80, 90, 30);

        jTextField2.setBackground(new java.awt.Color(125, 125, 125));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 120, 90, 30);

        jTextField3.setBackground(new java.awt.Color(125, 125, 125));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 160, 90, 30);

        jTextField4.setBackground(new java.awt.Color(125, 125, 125));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(190, 200, 90, 30);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(720, 270, 120, 20);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(140, 260, 170, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/background1000x830.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -60, 1000, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        playerNames[0] = jTextField1.getText();
        playerNames[1] = jTextField2.getText();
        playerNames[2] = jTextField3.getText();
        playerNames[3] = jTextField4.getText();
        
        
        //for(int i = 0; i < 4; i++)
        //{
           // System.out.println(playerNames[i] + " " + i);
        //}
        
        gameGUI gameG = new gameGUI(playerNames,playerCount);
        gameG.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        rulesGUI rulesG = new rulesGUI(true);
        rulesG.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Object selection = jComboBox1.getSelectedItem();
        if(selection != null)
        {
            if(selection.equals("One Player"))
            {
                playerCount = 1;
               // playerNames[1] = "";
                jTextField2.setBackground(new java.awt.Color(125, 125, 125));
              //  playerNames[2] = "";
                jTextField3.setBackground(new java.awt.Color(125, 125, 125));
               // playerNames[3] = "";
                jTextField4.setBackground(new java.awt.Color(125, 125, 125));
            }
            else if(selection.equals("Two Players"))
            {
                playerCount = 2;
               // playerNames[2] = "";
                jTextField2.setBackground(new java.awt.Color(250, 250, 250));
                jTextField3.setBackground(new java.awt.Color(125, 125, 125));
               // playerNames[3] = "";
                jTextField4.setBackground(new java.awt.Color(125, 125, 125));
            }
            else if(selection.equals("Three Players"))
            {
                playerCount = 3;
               // playerNames[3] = "";
                jTextField2.setBackground(new java.awt.Color(250, 250, 250));
                jTextField3.setBackground(new java.awt.Color(250, 250, 250));
                jTextField4.setBackground(new java.awt.Color(125, 125, 125));
            }
            else if(selection.equals("Four Players"))
            {
                jTextField2.setBackground(new java.awt.Color(250, 250, 250));
                jTextField3.setBackground(new java.awt.Color(250, 250, 250));
                jTextField4.setBackground(new java.awt.Color(250, 250, 250));
                playerCount = 4;
            }
        }
        
        System.out.println(playerCount);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        System.out.println(jTextField1.getText());
        playerNames[0] = jTextField1.getText();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        if(playerCount > 1)
            playerNames[1] = jTextField2.getText();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        if(playerCount > 2)
            playerNames[2] = jTextField3.getText();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        if(playerCount > 3)
            playerNames[3] = jTextField4.getText();
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(celtofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(celtofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(celtofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(celtofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new celtofer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    int playerCount;
    String playerNames[];
}