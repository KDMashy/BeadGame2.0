
package wayofisekai;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WayOfIsekaiGUI extends javax.swing.JFrame {

    Character ch = new Character();
    funkcio<Character> chF = new funkcio<Character>();
    
    public WayOfIsekaiGUI() {
        initComponents();
        
        //Panelek eltüntetése / login panel meghívása
        meghiv(login);
        
        logScreen.setLocation(500, 200);
        
        //Login Panelen newChar panel !visible
        newChar.setVisible(Boolean.FALSE);
        
    }
    
    public void meghiv(JPanel name){
        
        lpFrame.removeAll();
        lpFrame.add(name);
        lpFrame.repaint();
        lpFrame.revalidate();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lpFrame = new javax.swing.JLayeredPane();
        game = new javax.swing.JPanel();
        cProf = new javax.swing.JPanel();
        cNameDot = new javax.swing.JLabel();
        cNameDisp = new javax.swing.JLabel();
        cSex = new javax.swing.JLabel();
        cSexDisp = new javax.swing.JLabel();
        fight = new javax.swing.JPanel();
        dialogue = new javax.swing.JPanel();
        sheldon = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        logScreen = new javax.swing.JPanel();
        load = new javax.swing.JButton();
        newSave = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        newChar = new javax.swing.JPanel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        sex = new javax.swing.JLabel();
        cName = new javax.swing.JLabel();
        cNameText = new javax.swing.JTextField();
        createC = new javax.swing.JButton();
        profilkep = new javax.swing.JLabel();
        alairas = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lpFrame.setAlignmentX(0.0F);
        lpFrame.setAlignmentY(0.0F);
        lpFrame.setPreferredSize(new java.awt.Dimension(1600, 800));
        lpFrame.setLayout(new java.awt.CardLayout());

        cProf.setBackground(new java.awt.Color(96, 0, 25));
        cProf.setPreferredSize(new java.awt.Dimension(350, 790));

        cNameDot.setBackground(new java.awt.Color(255, 226, 163));
        cNameDot.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cNameDot.setForeground(new java.awt.Color(255, 192, 160));
        cNameDot.setText("Character Name: ");

        cNameDisp.setBackground(new java.awt.Color(255, 226, 163));
        cNameDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cNameDisp.setForeground(new java.awt.Color(255, 192, 160));
        cNameDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cNameDisp.setText("name");
        cNameDisp.setToolTipText("");

        cSex.setBackground(new java.awt.Color(255, 226, 163));
        cSex.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cSex.setForeground(new java.awt.Color(255, 192, 160));
        cSex.setText("Sex: ");
        cSex.setToolTipText("");

        cSexDisp.setBackground(new java.awt.Color(255, 226, 163));
        cSexDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cSexDisp.setForeground(new java.awt.Color(255, 192, 160));
        cSexDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cSexDisp.setText("Sex: ");
        cSexDisp.setToolTipText("");

        javax.swing.GroupLayout cProfLayout = new javax.swing.GroupLayout(cProf);
        cProf.setLayout(cProfLayout);
        cProfLayout.setHorizontalGroup(
            cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cProfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cNameDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cProfLayout.createSequentialGroup()
                        .addComponent(cNameDot)
                        .addGap(0, 202, Short.MAX_VALUE))
                    .addGroup(cProfLayout.createSequentialGroup()
                        .addComponent(cSex)
                        .addGap(18, 18, 18)
                        .addComponent(cSexDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cProfLayout.setVerticalGroup(
            cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cProfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cNameDot)
                .addGap(18, 18, 18)
                .addComponent(cNameDisp)
                .addGap(18, 18, 18)
                .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSex)
                    .addComponent(cSexDisp))
                .addContainerGap(682, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gameLayout = new javax.swing.GroupLayout(game);
        game.setLayout(gameLayout);
        gameLayout.setHorizontalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameLayout.createSequentialGroup()
                .addContainerGap(1244, Short.MAX_VALUE)
                .addComponent(cProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gameLayout.setVerticalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lpFrame.add(game, "card3");

        javax.swing.GroupLayout fightLayout = new javax.swing.GroupLayout(fight);
        fight.setLayout(fightLayout);
        fightLayout.setHorizontalGroup(
            fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        fightLayout.setVerticalGroup(
            fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        lpFrame.add(fight, "card4");

        javax.swing.GroupLayout dialogueLayout = new javax.swing.GroupLayout(dialogue);
        dialogue.setLayout(dialogueLayout);
        dialogueLayout.setHorizontalGroup(
            dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        dialogueLayout.setVerticalGroup(
            dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        lpFrame.add(dialogue, "card5");

        javax.swing.GroupLayout sheldonLayout = new javax.swing.GroupLayout(sheldon);
        sheldon.setLayout(sheldonLayout);
        sheldonLayout.setHorizontalGroup(
            sheldonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        sheldonLayout.setVerticalGroup(
            sheldonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        lpFrame.add(sheldon, "card6");

        logScreen.setBackground(new java.awt.Color(102, 102, 102));
        logScreen.setForeground(new java.awt.Color(102, 102, 102));
        logScreen.setAlignmentX(0.0F);
        logScreen.setAlignmentY(0.0F);
        logScreen.setPreferredSize(new java.awt.Dimension(600, 400));

        load.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        load.setText("Load Game");
        load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadMouseClicked(evt);
            }
        });

        newSave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        newSave.setText("New Game");
        newSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newSaveMouseClicked(evt);
            }
        });

        exit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        newChar.setPreferredSize(new java.awt.Dimension(280, 360));

        female.setText("Female");
        female.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                femaleStateChanged(evt);
            }
        });

        male.setText("male");
        male.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                maleStateChanged(evt);
            }
        });

        sex.setText("Sex: ");

        cName.setText("Name: ");
        cName.setToolTipText("");

        cNameText.setBackground(new java.awt.Color(102, 102, 102));

        createC.setText("Create");
        createC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout newCharLayout = new javax.swing.GroupLayout(newChar);
        newChar.setLayout(newCharLayout);
        newCharLayout.setHorizontalGroup(
            newCharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newCharLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(newCharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newCharLayout.createSequentialGroup()
                        .addGroup(newCharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cName)
                            .addComponent(sex))
                        .addGap(18, 18, 18)
                        .addGroup(newCharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(newCharLayout.createSequentialGroup()
                                .addComponent(female)
                                .addGap(18, 18, 18)
                                .addComponent(male))
                            .addComponent(cNameText)))
                    .addGroup(newCharLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(createC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        newCharLayout.setVerticalGroup(
            newCharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newCharLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(newCharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cName)
                    .addComponent(cNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(newCharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(female)
                    .addComponent(male)
                    .addComponent(sex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(createC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout logScreenLayout = new javax.swing.GroupLayout(logScreen);
        logScreen.setLayout(logScreenLayout);
        logScreenLayout.setHorizontalGroup(
            logScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logScreenLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(logScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newSave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(newChar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        logScreenLayout.setVerticalGroup(
            logScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logScreenLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logScreenLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(newChar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        profilkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wayofisekai/profilkep.gif"))); // NOI18N
        profilkep.setToolTipText("");

        alairas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wayofisekai/aláírás.png"))); // NOI18N

        fName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wayofisekai/cim.gif"))); // NOI18N

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(495, 495, 495)
                        .addComponent(logScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(alairas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profilkep)))
                .addContainerGap())
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(logScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profilkep)
                            .addComponent(fName))
                        .addGap(18, 18, 18)
                        .addComponent(alairas)))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        lpFrame.add(login, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lpFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        
        //Kilépés
        System.exit(0);
        
    }//GEN-LAST:event_exitMouseClicked

    private void newSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newSaveMouseClicked
        
        //Kreáció panele
        newChar.setVisible(Boolean.TRUE);
        
        //gombok !enabled
        load.setEnabled(Boolean.FALSE);
        newSave.setEnabled(Boolean.FALSE);
        exit.setEnabled(Boolean.FALSE);
        
        //Nem alap beállítása
        female.setSelected(Boolean.TRUE);
        
    }//GEN-LAST:event_newSaveMouseClicked

    private void loadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseClicked
        
        //Játék betöltése
        meghiv(game);
        
        cNameDisp.setText(ch.getName());
        
    }//GEN-LAST:event_loadMouseClicked

    private void createCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createCMouseClicked
        
        try {
            
            //Mentés, név alaphelyzetbe állítása, gombok ->enabled
            if (cNameText.getText().length() < 1) {
                
                throw new Exception();
                
            } else {
                
                ch.setName(cNameText.getText());
                ch.setSex(charSex);
                chF.save(ch);
                cNameText.setText("");
                
            }
            load.setEnabled(Boolean.TRUE);
            newSave.setEnabled(Boolean.TRUE);
            exit.setEnabled(Boolean.TRUE);

            //newChar panel !visible
            newChar.setVisible(Boolean.FALSE);
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(rootPane, "A karakternek nevet kell adni!");
            
        }
        
    }//GEN-LAST:event_createCMouseClicked

    //Nemek csekkolása, radio-button váltás
    private static Boolean charSex;
    
    private void femaleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_femaleStateChanged
        
        if (female.isSelected()) {
            female.setEnabled(Boolean.FALSE);
            male.setSelected(Boolean.FALSE);
            charSex = Boolean.TRUE;
        }
        else {
            female.setEnabled(Boolean.TRUE);
            male.setSelected(Boolean.TRUE);
            charSex = Boolean.FALSE;
        }
        
    }//GEN-LAST:event_femaleStateChanged

    private void maleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_maleStateChanged
        
        if (male.isSelected()) {
            male.setEnabled(Boolean.FALSE);
            female.setSelected(Boolean.FALSE);
            charSex = Boolean.FALSE;
        }
        else {
            male.setEnabled(Boolean.TRUE);
            female.setSelected(Boolean.TRUE);
            charSex = Boolean.TRUE;
        }
        
    }//GEN-LAST:event_maleStateChanged

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(WayOfIsekaiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WayOfIsekaiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WayOfIsekaiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WayOfIsekaiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WayOfIsekaiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alairas;
    private javax.swing.JLabel cName;
    private javax.swing.JLabel cNameDisp;
    private javax.swing.JLabel cNameDot;
    private javax.swing.JTextField cNameText;
    private javax.swing.JPanel cProf;
    private javax.swing.JLabel cSex;
    private javax.swing.JLabel cSexDisp;
    private javax.swing.JButton createC;
    private javax.swing.JPanel dialogue;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fName;
    private javax.swing.JRadioButton female;
    private javax.swing.JPanel fight;
    private javax.swing.JPanel game;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton load;
    private javax.swing.JPanel logScreen;
    private javax.swing.JPanel login;
    private javax.swing.JLayeredPane lpFrame;
    private javax.swing.JRadioButton male;
    private javax.swing.JPanel newChar;
    private javax.swing.JButton newSave;
    private javax.swing.JLabel profilkep;
    private javax.swing.JLabel sex;
    private javax.swing.JPanel sheldon;
    // End of variables declaration//GEN-END:variables
}
