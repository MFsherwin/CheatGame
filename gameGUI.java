/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheat;

import java.util.ArrayList;
/**
 *
 * @author mwhee
 */
public class gameGUI extends javax.swing.JFrame {
    
    private gamePileController gamePC;
    private int count=0;
    private int pcount;
    private String playerOneName;
    private String playerTwoName;
    
    public gameGUI(String[] names,int playerCount) {
        pcount = playerCount;
        this.gamePC = new gamePileController(playerCount);
        
        initComponents();
        playerOneName = names[0];
        playerTwoName = names[1];
        playerNames =names;
        if(!playerNames[0].equals(""))
        {
            System.out.println("snip");
            Player1Name.setText(playerNames[0]);
        }
        if(!playerNames[1].equals(""))
        {
            System.out.println("snip");
            Player2Name.setText(playerNames[1]);
        }
        if(!playerNames[2].equals(""))
        {
            System.out.println("snip");
            Player3Name.setText(playerNames[2]);
        }
        if(!playerNames[3].equals(""))
        {
            System.out.println("snip");
            Player4Name.setText(playerNames[3]);
        }
        //Deal out cards to each player
        //gamePC.deal(playerCount);
        
        //Set the correct display for player1 cards
        ArrayList<Card> p1hand = gamePC.getPlayerOneHand();
        Card c=p1hand.get(0);
        Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(1);
        Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(2);
        Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(3);
        Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(4);
        Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(5);
        Card6.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(6);
        Card7.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(7);
        Card8.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(8);
        Card9.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(9);
        Card10.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(10);
        Card11.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(11);
        Card12.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        c=p1hand.get(12);
        Card13.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
        
        
    }
    public gameGUI()
    {
        this.gamePC = new gamePileController(2);
        initComponents();
    }

/**
     * Creates new form gameGUI
     */
    //create gamePileController
        //Need comments explaining these steps
    public void setPlayerNames(String[] names)
    {
        playerNames = names;
    }
    

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Player3Name = new javax.swing.JLabel();
        Player1Name = new javax.swing.JLabel();
        Player2Name = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Player4Name = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Card10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Card9 = new javax.swing.JLabel();
        Card8 = new javax.swing.JLabel();
        Card3 = new javax.swing.JLabel();
        Card11 = new javax.swing.JLabel();
        Card4 = new javax.swing.JLabel();
        Card12 = new javax.swing.JLabel();
        Card5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        Card13 = new javax.swing.JLabel();
        Card6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Card2 = new javax.swing.JLabel();
        Card1 = new javax.swing.JLabel();
        Card7 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        jDialog1.setTitle("Game End!");
        jDialog1.setLocationByPlatform(true);
        jDialog1.setMinimumSize(new java.awt.Dimension(450, 158));
        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(400, 300));
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("The Game is Over!");
        jDialog1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 111, 40));

        jButton4.setText("Restart Game");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 110, 30));

        jButton5.setText("Quit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 90, 30));

        jButton6.setText("Main Menu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 670));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 670));
        getContentPane().setLayout(null);

        Player3Name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Player3Name.setForeground(new java.awt.Color(255, 255, 255));
        Player3Name.setText("Player 3");
        getContentPane().add(Player3Name);
        Player3Name.setBounds(450, 80, 80, 16);

        Player1Name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Player1Name.setForeground(new java.awt.Color(51, 0, 204));
        Player1Name.setText("Player 1");
        getContentPane().add(Player1Name);
        Player1Name.setBounds(460, 600, 80, 16);

        Player2Name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Player2Name.setForeground(new java.awt.Color(51, 0, 204));
        Player2Name.setText("Player 2");
        getContentPane().add(Player2Name);
        Player2Name.setBounds(860, 310, 90, 16);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("13");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(230, 320, 40, 30);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setText("13");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(740, 320, 40, 20);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("0");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(470, 320, 40, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setText("13");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(460, 170, 40, 20);

        Player4Name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Player4Name.setForeground(new java.awt.Color(255, 255, 255));
        Player4Name.setText("Player 4");
        getContentPane().add(Player4Name);
        Player4Name.setBounds(40, 340, 70, 16);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Current Value:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 60, 100, 10);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ace");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(120, 60, 60, 10);

        jButton3.setBackground(new java.awt.Color(165, 50, 50));
        jButton3.setText("End Game!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(400, 20, 130, 25);

        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("A new game has just begun!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(780, 50, 200, 15);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/b2fv.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(720, 280, 80, 100);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/b2fv.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(440, 130, 70, 100);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/b2fv.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(210, 290, 80, 100);

        Card10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/2Clubs.png"))); // NOI18N
        getContentPane().add(Card10);
        Card10.setBounds(430, 470, 80, 100);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/b1fv.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(450, 290, 80, 100);

        Card9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/KingHearts.png"))); // NOI18N
        getContentPane().add(Card9);
        Card9.setBounds(340, 470, 80, 100);

        Card8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/AceDiamonds.png"))); // NOI18N
        getContentPane().add(Card8);
        Card8.setBounds(260, 470, 80, 100);

        Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/KingClubs.png"))); // NOI18N
        getContentPane().add(Card3);
        Card3.setBounds(390, 430, 80, 100);

        Card11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/10Hearts.png"))); // NOI18N
        getContentPane().add(Card11);
        Card11.setBounds(520, 470, 80, 100);

        Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/3Diamonds.png"))); // NOI18N
        getContentPane().add(Card4);
        Card4.setBounds(470, 430, 80, 100);

        Card12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/9Spades.png"))); // NOI18N
        getContentPane().add(Card12);
        Card12.setBounds(610, 470, 80, 100);

        Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/6Spades.png"))); // NOI18N
        getContentPane().add(Card5);
        Card5.setBounds(550, 430, 80, 100);

        jButton1.setText("Call Cheat?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 590, 100, 25);

        jButton2.setText("Advance Turn");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(829, 600, 120, 25);

        jButton7.setText("View Rules");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(50, 20, 100, 25);

        jLabel28.setForeground(new java.awt.Color(51, 0, 204));
        jLabel28.setText("It is now Player 1's Turn!");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(780, 80, 160, 15);

        Card13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/AceDiamonds.png"))); // NOI18N
        getContentPane().add(Card13);
        Card13.setBounds(690, 470, 80, 100);

        Card6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/9Spades.png"))); // NOI18N
        getContentPane().add(Card6);
        Card6.setBounds(630, 430, 80, 100);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(780, 30, 190, 90);

        Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/AceDiamonds.png"))); // NOI18N
        getContentPane().add(Card2);
        Card2.setBounds(310, 430, 80, 100);

        Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/AceDiamonds.png"))); // NOI18N
        getContentPane().add(Card1);
        Card1.setBounds(230, 430, 80, 100);

        Card7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/AceDiamonds.png"))); // NOI18N
        getContentPane().add(Card7);
        Card7.setBounds(710, 430, 80, 100);

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheat/background1000x830.jpg"))); // NOI18N
        jLabel29.setText("jLabel29");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(0, 0, 1057, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jDialog1.setVisible(false);
        celtofer c = new celtofer();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       rulesGUI rules = new rulesGUI();
       rules.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        //
            if (count ==0){
            ArrayList<Card> p2hand = gamePC.getPlayerTwoHand();
            Card c=p2hand.get(0);
            Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(1);
            Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(2);
            Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(3);
            Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(4);
            Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(5);
            Card6.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(6);
            Card7.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(7);
            Card8.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(8);
            Card9.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(9);
            Card10.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(10);
            Card11.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(11);
            Card12.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(12);
            Card13.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            Player2Name.setText(playerOneName);
            Player1Name.setText(playerTwoName);
            count++;
            }
            else if (count ==1 ){
            ArrayList<Card> p1hand = gamePC.getPlayerOneHand();
            Card c=p1hand.get(0);
            Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(1);
            Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(2);
            Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(3);
            Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(4);
            Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(5);
            Card6.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(6);
            Card7.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(7);
            Card8.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(8);
            Card9.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(9);
            Card10.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(10);
            Card11.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(11);
            Card12.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p1hand.get(12);
            Card13.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            Player2Name.setText(playerTwoName);
            Player1Name.setText(playerOneName);
            count--;
        
        
        }
           /* else if(pcount==3){
                if (count ==0){
            ArrayList<Card> p2hand = gamePC.getPlayerTwoHand();
            Card c=p2hand.get(0);
            Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(1);
            Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(2);
            Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(3);
            Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(4);
            Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(5);
            Card6.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(6);
            Card7.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(7);
            Card8.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(8);
            Card9.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(9);
            Card10.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(10);
            Card11.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(11);
            Card12.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));
            c=p2hand.get(12);
            Card13.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImage())));


            count++;
            
            
            }
        */
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(gameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Card1;
    private javax.swing.JLabel Card10;
    private javax.swing.JLabel Card11;
    private javax.swing.JLabel Card12;
    private javax.swing.JLabel Card13;
    private javax.swing.JLabel Card2;
    private javax.swing.JLabel Card3;
    private javax.swing.JLabel Card4;
    private javax.swing.JLabel Card5;
    private javax.swing.JLabel Card6;
    private javax.swing.JLabel Card7;
    private javax.swing.JLabel Card8;
    private javax.swing.JLabel Card9;
    private javax.swing.JLabel Player1Name;
    private javax.swing.JLabel Player2Name;
    private javax.swing.JLabel Player3Name;
    private javax.swing.JLabel Player4Name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    String[] playerNames;
}
