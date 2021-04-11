
package wayofisekai;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WayOfIsekaiGUI extends javax.swing.JFrame {

    public Character ch = new Character();
    public Enemy en = new Enemy();
    public funkcio<Character> chF = new funkcio<Character>();
    public funkcio<Enemy> enemyF = new funkcio<Enemy>();
    public ArrayList<Enemy> listenemy = enemyF.loadEnemy(ch);
    public Integer charDefHp;
    
    public WayOfIsekaiGUI() {
        initComponents();
        
        //Panelek eltüntetése / login panel meghívása
        meghiv(login);
        
        logScreen.setLocation(500, 200);
        
        //Login Panelen newChar panel !visible
        newChar.setVisible(Boolean.FALSE);
        loadPnl.setVisible(Boolean.FALSE);
        del.setEnabled(Boolean.FALSE);
        
    }
    
    public void meghiv(JPanel name){
        
        lpFrame.removeAll();
        lpFrame.add(name);
        lpFrame.repaint();
        lpFrame.revalidate();
        
    }
    
    private void fillTableCharacter(){
        
        //character táblázat feltöltés
        DefaultTableModel dtm = new DefaultTableModel(0, 0);
        String header[] = new String [] {"Name", "Lvl", "Xp"};
        dtm.setColumnIdentifiers(header);
        this.tbLoad.setModel(dtm);
        ArrayList<Character> list = chF.loadList(ch);
        for (Integer i = 0; i < list.size(); i++) {
            dtm.addRow(new Object[] {list.get(i).getName(), list.get(i).getLvl(), list.get(i).getXp()});
        }
        //Combo box feltöltés
        for (Character k : list) {
            
            cBox.addItem(k.getName());
            
        }
        
        tbLoad.setEnabled(Boolean.FALSE);
        
    }
    
    
    
    private void fillTableEnemy(){
        DefaultTableModel dtm = new DefaultTableModel(0, 0);
        String header[] = new String [] {"Name", "Hp", "Dmg", "Def", "quest"};
        dtm.setColumnIdentifiers(header);
        this.enemyListTable.setModel(dtm);
        Integer chLvl = ch.getLvl();
        for (Enemy k : this.listenemy) {
            if (k.getName().contains("KALKULUS")) {
                dtm.addRow(new Object[] {"???", k.getHp()*2*chLvl, k.getAtk()*2*chLvl, 
                    k.getDef()*2*chLvl, k.getQuest()});
            } else {
                dtm.addRow(new Object[] {k.getName(), k.getHp()*2*chLvl, k.getAtk()*2*chLvl, 
                    k.getDef()*2*chLvl, k.getQuest()});
            }
            
       }
    }
    
    public void clearTable(JTable tbl){
        
        //jTable clear
        DefaultTableModel dm = (DefaultTableModel)tbl.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        //ComboBox clear
        cBox.removeAllItems();
        
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
        cHpDisp = new javax.swing.JLabel();
        xpBar = new javax.swing.JProgressBar();
        xpBarDisp = new javax.swing.JLabel();
        cSex1 = new javax.swing.JLabel();
        cSexDisp = new javax.swing.JLabel();
        cSex2 = new javax.swing.JLabel();
        cDmgDisp = new javax.swing.JLabel();
        cSex3 = new javax.swing.JLabel();
        cMoneyDisp = new javax.swing.JLabel();
        lvl = new javax.swing.JLabel();
        cLvl = new javax.swing.JLabel();
        enemyList = new javax.swing.JButton();
        gameExit1 = new javax.swing.JButton();
        eTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        enemyListTable = new javax.swing.JTable();
        igsave = new javax.swing.JButton();
        fight = new javax.swing.JPanel();
        fDataPnl = new javax.swing.JPanel();
        fLvlDisp = new javax.swing.JLabel();
        fNameDisp = new javax.swing.JLabel();
        flvl = new javax.swing.JLabel();
        fHpDisp = new javax.swing.JLabel();
        fMonDisp = new javax.swing.JLabel();
        fDmgDisp = new javax.swing.JLabel();
        choice = new javax.swing.JPanel();
        LEAVE = new javax.swing.JButton();
        HIT = new javax.swing.JButton();
        lorc = new javax.swing.JPanel();
        latk = new javax.swing.JButton();
        catk = new javax.swing.JButton();
        enemyimg = new javax.swing.JLabel();
        charimg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fename = new javax.swing.JLabel();
        eHpBar = new javax.swing.JProgressBar();
        eHpDisp = new javax.swing.JLabel();
        efDmg = new javax.swing.JLabel();
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
        createCancel = new javax.swing.JButton();
        cimlbl = new javax.swing.JLabel();
        profilkep = new javax.swing.JLabel();
        alairas = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();
        loadPnl = new javax.swing.JPanel();
        loadlbl = new javax.swing.JLabel();
        cBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLoad = new javax.swing.JTable();
        loadSaveGame = new javax.swing.JButton();
        loadBack = new javax.swing.JButton();
        del = new javax.swing.JButton();
        removeAccept = new javax.swing.JCheckBox();

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
        cSex.setText("Hp: ");
        cSex.setToolTipText("");

        cHpDisp.setBackground(new java.awt.Color(255, 226, 163));
        cHpDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cHpDisp.setForeground(new java.awt.Color(255, 192, 160));
        cHpDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cHpDisp.setText("hp");
        cHpDisp.setToolTipText("");

        xpBarDisp.setBackground(new java.awt.Color(255, 192, 160));
        xpBarDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        xpBarDisp.setForeground(new java.awt.Color(255, 192, 160));
        xpBarDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xpBarDisp.setText("0 / 0");

        cSex1.setBackground(new java.awt.Color(255, 226, 163));
        cSex1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cSex1.setForeground(new java.awt.Color(255, 192, 160));
        cSex1.setText("Sex: ");
        cSex1.setToolTipText("");

        cSexDisp.setBackground(new java.awt.Color(255, 226, 163));
        cSexDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cSexDisp.setForeground(new java.awt.Color(255, 192, 160));
        cSexDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cSexDisp.setText("sex");
        cSexDisp.setToolTipText("");

        cSex2.setBackground(new java.awt.Color(255, 226, 163));
        cSex2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cSex2.setForeground(new java.awt.Color(255, 192, 160));
        cSex2.setText("Dmg:");
        cSex2.setToolTipText("");

        cDmgDisp.setBackground(new java.awt.Color(255, 226, 163));
        cDmgDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cDmgDisp.setForeground(new java.awt.Color(255, 192, 160));
        cDmgDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cDmgDisp.setText("dmg");
        cDmgDisp.setToolTipText("");

        cSex3.setBackground(new java.awt.Color(255, 226, 163));
        cSex3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cSex3.setForeground(new java.awt.Color(255, 192, 160));
        cSex3.setText("Money:");
        cSex3.setToolTipText("");

        cMoneyDisp.setBackground(new java.awt.Color(255, 226, 163));
        cMoneyDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cMoneyDisp.setForeground(new java.awt.Color(255, 192, 160));
        cMoneyDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cMoneyDisp.setText("money");
        cMoneyDisp.setToolTipText("");

        lvl.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lvl.setForeground(new java.awt.Color(255, 192, 160));
        lvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvl.setText("0");

        cLvl.setBackground(new java.awt.Color(255, 192, 160));
        cLvl.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cLvl.setForeground(new java.awt.Color(255, 192, 160));
        cLvl.setText("LvL:");

        javax.swing.GroupLayout cProfLayout = new javax.swing.GroupLayout(cProf);
        cProf.setLayout(cProfLayout);
        cProfLayout.setHorizontalGroup(
            cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cProfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cProfLayout.createSequentialGroup()
                        .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cSex2)
                            .addComponent(cSex1)
                            .addComponent(cSex3))
                        .addGap(18, 18, 18)
                        .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cMoneyDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cSexDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(cProfLayout.createSequentialGroup()
                                .addComponent(cDmgDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE))))
                    .addGroup(cProfLayout.createSequentialGroup()
                        .addComponent(cSex)
                        .addGap(41, 41, 41)
                        .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cProfLayout.createSequentialGroup()
                                .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(xpBarDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(xpBar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cHpDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cProfLayout.createSequentialGroup()
                        .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cNameDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(cProfLayout.createSequentialGroup()
                                .addComponent(cNameDot)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cLvl)
                            .addComponent(lvl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        cProfLayout.setVerticalGroup(
            cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cProfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNameDot)
                    .addComponent(cLvl))
                .addGap(18, 18, 18)
                .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNameDisp)
                    .addComponent(lvl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(xpBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(xpBarDisp)
                .addGap(24, 24, 24)
                .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSex)
                    .addComponent(cHpDisp))
                .addGap(18, 18, 18)
                .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSex1)
                    .addComponent(cSexDisp))
                .addGap(18, 18, 18)
                .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSex2)
                    .addComponent(cDmgDisp))
                .addGap(18, 18, 18)
                .addGroup(cProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSex3)
                    .addComponent(cMoneyDisp))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        enemyList.setBackground(new java.awt.Color(51, 51, 51));
        enemyList.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        enemyList.setForeground(new java.awt.Color(255, 192, 160));
        enemyList.setText("List Enemy");
        enemyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enemyListMouseClicked(evt);
            }
        });

        gameExit1.setBackground(new java.awt.Color(51, 51, 51));
        gameExit1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        gameExit1.setForeground(new java.awt.Color(255, 192, 160));
        gameExit1.setText("Exit");
        gameExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gameExit1MouseClicked(evt);
            }
        });

        enemyListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(enemyListTable);

        javax.swing.GroupLayout eTableLayout = new javax.swing.GroupLayout(eTable);
        eTable.setLayout(eTableLayout);
        eTableLayout.setHorizontalGroup(
            eTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
            .addGroup(eTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(eTableLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        eTableLayout.setVerticalGroup(
            eTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(eTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(eTableLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        igsave.setBackground(new java.awt.Color(51, 51, 51));
        igsave.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        igsave.setForeground(new java.awt.Color(255, 192, 160));
        igsave.setText("Save");
        igsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igsaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout gameLayout = new javax.swing.GroupLayout(game);
        game.setLayout(gameLayout);
        gameLayout.setHorizontalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addContainerGap(1226, Short.MAX_VALUE)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(gameExit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cProf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                        .addComponent(enemyList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(igsave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        gameLayout.setVerticalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addComponent(cProf, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enemyList)
                .addGap(18, 18, 18)
                .addComponent(igsave)
                .addGap(18, 18, 18)
                .addComponent(gameExit1)
                .addGap(14, 14, 14)
                .addComponent(eTable, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lpFrame.add(game, "card3");

        fDataPnl.setBackground(new java.awt.Color(96, 0, 25));

        fLvlDisp.setBackground(new java.awt.Color(255, 192, 160));
        fLvlDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        fLvlDisp.setForeground(new java.awt.Color(255, 192, 160));
        fLvlDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fLvlDisp.setText("LvL:");

        fNameDisp.setBackground(new java.awt.Color(255, 226, 163));
        fNameDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        fNameDisp.setForeground(new java.awt.Color(255, 192, 160));
        fNameDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fNameDisp.setText("name");
        fNameDisp.setToolTipText("");

        flvl.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        flvl.setForeground(new java.awt.Color(255, 192, 160));
        flvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flvl.setText("0");

        fHpDisp.setBackground(new java.awt.Color(255, 226, 163));
        fHpDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        fHpDisp.setForeground(new java.awt.Color(255, 192, 160));
        fHpDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fHpDisp.setText("hp");
        fHpDisp.setToolTipText("");

        fMonDisp.setBackground(new java.awt.Color(255, 226, 163));
        fMonDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        fMonDisp.setForeground(new java.awt.Color(255, 192, 160));
        fMonDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fMonDisp.setText("money");
        fMonDisp.setToolTipText("");

        fDmgDisp.setBackground(new java.awt.Color(255, 226, 163));
        fDmgDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        fDmgDisp.setForeground(new java.awt.Color(255, 192, 160));
        fDmgDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fDmgDisp.setText("dmg");
        fDmgDisp.setToolTipText("");

        javax.swing.GroupLayout fDataPnlLayout = new javax.swing.GroupLayout(fDataPnl);
        fDataPnl.setLayout(fDataPnlLayout);
        fDataPnlLayout.setHorizontalGroup(
            fDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fDataPnlLayout.createSequentialGroup()
                .addGroup(fDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fHpDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fDmgDisp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fMonDisp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fDataPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fNameDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fDataPnlLayout.createSequentialGroup()
                        .addComponent(fLvlDisp, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flvl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fDataPnlLayout.setVerticalGroup(
            fDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fDataPnlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(fNameDisp)
                .addGap(18, 18, 18)
                .addGroup(fDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fLvlDisp)
                    .addComponent(flvl))
                .addGap(47, 47, 47)
                .addComponent(fHpDisp)
                .addGap(18, 18, 18)
                .addComponent(fMonDisp)
                .addGap(18, 18, 18)
                .addComponent(fDmgDisp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        choice.setBackground(new java.awt.Color(96, 0, 25));

        LEAVE.setText("RUN!");
        LEAVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LEAVEMouseClicked(evt);
            }
        });

        HIT.setText("HIT");
        HIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HITMouseClicked(evt);
            }
        });
        HIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout choiceLayout = new javax.swing.GroupLayout(choice);
        choice.setLayout(choiceLayout);
        choiceLayout.setHorizontalGroup(
            choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LEAVE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
            .addGroup(choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HIT, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
        );
        choiceLayout.setVerticalGroup(
            choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choiceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LEAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(choiceLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(HIT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        lorc.setBackground(new java.awt.Color(96, 0, 25));

        latk.setText("Light Attack");
        latk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                latkMouseClicked(evt);
            }
        });

        catk.setText("Charged Attack");
        catk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lorcLayout = new javax.swing.GroupLayout(lorc);
        lorc.setLayout(lorcLayout);
        lorcLayout.setHorizontalGroup(
            lorcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lorcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(latk, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lorcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(catk, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        lorcLayout.setVerticalGroup(
            lorcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lorcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(latk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(catk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        enemyimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enemyimg.setText("ENEMY");

        charimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        charimg.setText("CHARACTER");

        jPanel2.setBackground(new java.awt.Color(96, 0, 25));

        fename.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        fename.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fename.setText("ENEMY NAME");

        eHpDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        eHpDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eHpDisp.setText("0 / 0");

        efDmg.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        efDmg.setText("Dmg: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(eHpDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eHpBar, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(efDmg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fename)
                .addGap(18, 18, 18)
                .addComponent(eHpBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eHpDisp)
                .addGap(18, 18, 18)
                .addComponent(efDmg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout fightLayout = new javax.swing.GroupLayout(fight);
        fight.setLayout(fightLayout);
        fightLayout.setHorizontalGroup(
            fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(fightLayout.createSequentialGroup()
                .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fightLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enemyimg, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fightLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lorc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fightLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(charimg, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addGap(990, 990, 990)))
        );
        fightLayout.setVerticalGroup(
            fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enemyimg, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fightLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lorc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(choice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fightLayout.createSequentialGroup()
                    .addContainerGap(324, Short.MAX_VALUE)
                    .addComponent(charimg, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
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

        load.setBackground(new java.awt.Color(51, 51, 51));
        load.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        load.setForeground(new java.awt.Color(255, 255, 255));
        load.setText("Load Game");
        load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadMouseClicked(evt);
            }
        });

        newSave.setBackground(new java.awt.Color(51, 51, 51));
        newSave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        newSave.setForeground(new java.awt.Color(255, 255, 255));
        newSave.setText("New Game");
        newSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newSaveMouseClicked(evt);
            }
        });

        exit.setBackground(new java.awt.Color(51, 51, 51));
        exit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        newChar.setPreferredSize(new java.awt.Dimension(280, 360));

        female.setBackground(new java.awt.Color(51, 51, 51));
        female.setForeground(new java.awt.Color(60, 63, 65));
        female.setText("Female");
        female.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                femaleStateChanged(evt);
            }
        });

        male.setBackground(new java.awt.Color(51, 51, 51));
        male.setForeground(new java.awt.Color(60, 63, 65));
        male.setText("male");
        male.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                maleStateChanged(evt);
            }
        });

        sex.setBackground(new java.awt.Color(51, 51, 51));
        sex.setForeground(new java.awt.Color(60, 63, 65));
        sex.setText("Sex: ");

        cName.setBackground(new java.awt.Color(51, 51, 51));
        cName.setForeground(new java.awt.Color(60, 63, 65));
        cName.setText("Name: ");
        cName.setToolTipText("");

        cNameText.setBackground(new java.awt.Color(204, 204, 204));
        cNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cNameTextKeyReleased(evt);
            }
        });

        createC.setBackground(new java.awt.Color(51, 51, 51));
        createC.setForeground(new java.awt.Color(255, 255, 255));
        createC.setText("Create");
        createC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCMouseClicked(evt);
            }
        });

        createCancel.setBackground(new java.awt.Color(51, 51, 51));
        createCancel.setForeground(new java.awt.Color(255, 255, 255));
        createCancel.setText("Cancel");
        createCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout newCharLayout = new javax.swing.GroupLayout(newChar);
        newChar.setLayout(newCharLayout);
        newCharLayout.setHorizontalGroup(
            newCharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newCharLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(newCharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addGroup(newCharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(createCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(createC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(createC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        cimlbl.setBackground(new java.awt.Color(255, 102, 102));
        cimlbl.setFont(new java.awt.Font("Footlight MT Light", 3, 24)); // NOI18N
        cimlbl.setForeground(new java.awt.Color(255, 102, 102));
        cimlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cimlbl.setText("Way of Isekai");

        javax.swing.GroupLayout logScreenLayout = new javax.swing.GroupLayout(logScreen);
        logScreen.setLayout(logScreenLayout);
        logScreenLayout.setHorizontalGroup(
            logScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logScreenLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(logScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newSave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cimlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(newChar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        logScreenLayout.setVerticalGroup(
            logScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logScreenLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(logScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logScreenLayout.createSequentialGroup()
                        .addComponent(cimlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logScreenLayout.createSequentialGroup()
                        .addComponent(newChar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        profilkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wayofisekai/profilkep.gif"))); // NOI18N
        profilkep.setToolTipText("");

        alairas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wayofisekai/aláírás.png"))); // NOI18N

        fName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wayofisekai/cim.gif"))); // NOI18N

        loadPnl.setBackground(new java.awt.Color(102, 102, 102));

        loadlbl.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        loadlbl.setForeground(new java.awt.Color(255, 153, 102));
        loadlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadlbl.setText("Load game");

        tbLoad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbLoad);

        loadSaveGame.setBackground(new java.awt.Color(51, 51, 51));
        loadSaveGame.setForeground(new java.awt.Color(255, 255, 255));
        loadSaveGame.setText("Load");
        loadSaveGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadSaveGameMouseClicked(evt);
            }
        });

        loadBack.setBackground(new java.awt.Color(51, 51, 51));
        loadBack.setForeground(new java.awt.Color(255, 255, 255));
        loadBack.setText("Back");
        loadBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadBackMouseClicked(evt);
            }
        });

        del.setBackground(new java.awt.Color(51, 51, 51));
        del.setForeground(new java.awt.Color(255, 255, 255));
        del.setText("Delete");
        del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delMouseClicked(evt);
            }
        });

        removeAccept.setBackground(new java.awt.Color(51, 51, 51));
        removeAccept.setForeground(new java.awt.Color(255, 255, 255));
        removeAccept.setText("Want to remove?");
        removeAccept.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                removeAcceptStateChanged(evt);
            }
        });

        javax.swing.GroupLayout loadPnlLayout = new javax.swing.GroupLayout(loadPnl);
        loadPnl.setLayout(loadPnlLayout);
        loadPnlLayout.setHorizontalGroup(
            loadPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loadPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loadlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loadPnlLayout.createSequentialGroup()
                        .addComponent(loadSaveGame, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loadBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loadPnlLayout.createSequentialGroup()
                        .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeAccept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        loadPnlLayout.setVerticalGroup(
            loadPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loadPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(loadPnlLayout.createSequentialGroup()
                        .addComponent(loadlbl)
                        .addGap(18, 18, 18)
                        .addComponent(cBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(loadPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadSaveGame)
                            .addComponent(loadBack))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loadPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(del)
                            .addComponent(removeAccept))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fName)
                .addGap(119, 119, 119)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(logScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(loadPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alairas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profilkep, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(loadPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(logScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginLayout.createSequentialGroup()
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
        
        if (exit.isEnabled() == Boolean.TRUE) {
            
            //Kilépés
            System.exit(0);
            
        }
        
    }//GEN-LAST:event_exitMouseClicked

    private void newSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newSaveMouseClicked
        
        if (newSave.isEnabled() == Boolean.TRUE) {
            
            //Kreáció panele
            newChar.setVisible(Boolean.TRUE);

            //gombok !enabled
            load.setEnabled(Boolean.FALSE);
            newSave.setEnabled(Boolean.FALSE);
            exit.setEnabled(Boolean.FALSE);
            createC.setEnabled(Boolean.FALSE);

            //Nem alap beállítása
            female.setSelected(Boolean.TRUE);
            
        }
        
    }//GEN-LAST:event_newSaveMouseClicked

    private void loadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseClicked
        
        if (load.isEnabled() == Boolean.TRUE) {
         
            //Játék betöltése
            fillTableCharacter();
            loadPnl.setVisible(Boolean.TRUE);
            logScreen.setVisible(Boolean.FALSE);
            if (cBox.getItemAt(0) == "") {
                
                loadSaveGame.setEnabled(Boolean.FALSE);
                
            } else {
                
                loadSaveGame.setEnabled(Boolean.TRUE);
                
            }
            
        }
        
    }//GEN-LAST:event_loadMouseClicked

    private void createCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createCMouseClicked
        
        if (createC.isEnabled() == Boolean.TRUE) {
            
            try {
            
                //Mentés, név alaphelyzetbe állítása, gombok ->enabled
                if (cNameText.getText().length() < 1) {

                    throw new Exception();

                } else {

                    ch.setName(cNameText.getText());
                    ch.setSex(charSex);
                    chF.saveObject(ch, ch.getName());
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
            
        }
        
    }//GEN-LAST:event_createCMouseClicked

    //Nemek csekkolása, radio-button váltás
    private Boolean charSex;
    
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

    private void loadSaveGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadSaveGameMouseClicked
        
        if (loadSaveGame.isEnabled() == Boolean.TRUE) {
            
            //Kiválasztja hogy melyik az az elmentett objektum amit be akarunk tölteni
            for(Character chk : chF.loadList(ch)){

                String boxName = cBox.getSelectedItem().toString();
                if (chk.getName().contains(boxName) && 
                        chk.getName().length() == boxName.length() ) {

                    cNameDisp.setText(chk.getName());
                    if (chk.getSex() == Boolean.TRUE) {
                        cSexDisp.setText("female");
                    } else {
                        cSexDisp.setText("male");
                    }
                    cDmgDisp.setText(chk.getAtk().toString());
                    cLvl.setText(chk.getLvl().toString());
                    cHpDisp.setText(chk.getHp().toString());
                    cMoneyDisp.setText(chk.getMoney().toString());
                    loadPnl.setVisible(Boolean.FALSE);
                    eTable.setVisible(Boolean.FALSE);
                    ch = new Character(chk.getName(), chk.getLvl(), 
                            chk.getXp(), chk.getSex(), chk.getMoney());
                    removeAccept.setSelected(Boolean.FALSE);
                    meghiv(game);

                }

            }
            
        }
        
    }//GEN-LAST:event_loadSaveGameMouseClicked

    private void loadBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadBackMouseClicked
        
        clearTable(tbLoad);
        loadPnl.setVisible(Boolean.FALSE);
        logScreen.setVisible(Boolean.TRUE);
        
    }//GEN-LAST:event_loadBackMouseClicked

    private void createCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createCancelMouseClicked
        
        cNameText.setText("");
        newChar.setVisible(Boolean.FALSE);
        load.setEnabled(Boolean.TRUE);
        newSave.setEnabled(Boolean.TRUE);
        exit.setEnabled(Boolean.TRUE);
        
    }//GEN-LAST:event_createCancelMouseClicked

    private void cNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNameTextKeyReleased
        if (cNameText.getText().length() > 2) {
            
            createC.setEnabled(Boolean.TRUE);
            
        } else {
            
            createC.setEnabled(Boolean.FALSE);
            
        }
    }//GEN-LAST:event_cNameTextKeyReleased

    private void delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseClicked
        
        if (del.isEnabled() == Boolean.TRUE) {
            
            chF.removeChar(ch, cBox.getSelectedItem().toString());
            clearTable(tbLoad);
            fillTableCharacter();
            
        }
        
    }//GEN-LAST:event_delMouseClicked

    private void removeAcceptStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_removeAcceptStateChanged
        
        if (removeAccept.isSelected()) {
            
            del.setEnabled(Boolean.TRUE);
            
        } else {
            
            del.setEnabled(Boolean.FALSE);
            
        }
        
    }//GEN-LAST:event_removeAcceptStateChanged

    private Boolean elc = Boolean.FALSE;
    private void enemyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enemyListMouseClicked
        
        if (elc == Boolean.FALSE) {
            
            elc = Boolean.TRUE;
            fillTableEnemy();
            enemyList.setText("Hide Enemy List");
            eTable.setVisible(Boolean.TRUE);
            
        } else {
            
            elc = Boolean.FALSE;
            clearTable(enemyListTable);
            enemyList.setText("List Enemy");
            eTable.setVisible(Boolean.FALSE);
            
        }
        
    }//GEN-LAST:event_enemyListMouseClicked

    private void gameExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameExit1MouseClicked
        
        logScreen.setVisible(Boolean.TRUE);
        clearTable(tbLoad);
        meghiv(login);
        
    }//GEN-LAST:event_gameExit1MouseClicked

    private void igsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igsaveMouseClicked
        chF.removeChar(ch, ch.getName());
        chF.saveObject(ch, ch.getName());
    }//GEN-LAST:event_igsaveMouseClicked

    private void HITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HITActionPerformed
        //véletlen volt... :'c
    }//GEN-LAST:event_HITActionPerformed

    private void HITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HITMouseClicked
        
        lorc.setVisible(Boolean.TRUE);
        
    }//GEN-LAST:event_HITMouseClicked

    private void LEAVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LEAVEMouseClicked
        
        meghiv(game);
        
    }//GEN-LAST:event_LEAVEMouseClicked

    private void latkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latkMouseClicked
        
        chF.fightCharacter(ch, en, Boolean.FALSE);
        chF.fightEnemy(ch, en);
        
    }//GEN-LAST:event_latkMouseClicked

    private void catkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catkMouseClicked
        
        chF.fightCharacter(ch, en, Boolean.TRUE);
        chF.fightEnemy(ch, en);
        
    }//GEN-LAST:event_catkMouseClicked

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
    private javax.swing.JButton HIT;
    private javax.swing.JButton LEAVE;
    private javax.swing.JLabel alairas;
    private javax.swing.JComboBox<String> cBox;
    private javax.swing.JLabel cDmgDisp;
    private javax.swing.JLabel cHpDisp;
    private javax.swing.JLabel cLvl;
    private javax.swing.JLabel cMoneyDisp;
    private javax.swing.JLabel cName;
    private javax.swing.JLabel cNameDisp;
    private javax.swing.JLabel cNameDot;
    private javax.swing.JTextField cNameText;
    private javax.swing.JPanel cProf;
    private javax.swing.JLabel cSex;
    private javax.swing.JLabel cSex1;
    private javax.swing.JLabel cSex2;
    private javax.swing.JLabel cSex3;
    private javax.swing.JLabel cSexDisp;
    private javax.swing.JButton catk;
    private javax.swing.JLabel charimg;
    private javax.swing.JPanel choice;
    private javax.swing.JLabel cimlbl;
    private javax.swing.JButton createC;
    private javax.swing.JButton createCancel;
    private javax.swing.JButton del;
    private javax.swing.JPanel dialogue;
    private javax.swing.JProgressBar eHpBar;
    private javax.swing.JLabel eHpDisp;
    private javax.swing.JPanel eTable;
    private javax.swing.JLabel efDmg;
    private javax.swing.JButton enemyList;
    private javax.swing.JTable enemyListTable;
    private javax.swing.JLabel enemyimg;
    private javax.swing.JButton exit;
    private javax.swing.JPanel fDataPnl;
    private javax.swing.JLabel fDmgDisp;
    private javax.swing.JLabel fHpDisp;
    private javax.swing.JLabel fLvlDisp;
    private javax.swing.JLabel fMonDisp;
    private javax.swing.JLabel fName;
    private javax.swing.JLabel fNameDisp;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel fename;
    private javax.swing.JPanel fight;
    private javax.swing.JLabel flvl;
    private javax.swing.JPanel game;
    private javax.swing.JButton gameExit1;
    private javax.swing.JButton igsave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton latk;
    private javax.swing.JButton load;
    private javax.swing.JButton loadBack;
    private javax.swing.JPanel loadPnl;
    private javax.swing.JButton loadSaveGame;
    private javax.swing.JLabel loadlbl;
    private javax.swing.JPanel logScreen;
    private javax.swing.JPanel login;
    private javax.swing.JPanel lorc;
    private javax.swing.JLayeredPane lpFrame;
    private javax.swing.JLabel lvl;
    private javax.swing.JRadioButton male;
    private javax.swing.JPanel newChar;
    private javax.swing.JButton newSave;
    private javax.swing.JLabel profilkep;
    private javax.swing.JCheckBox removeAccept;
    private javax.swing.JLabel sex;
    private javax.swing.JPanel sheldon;
    private javax.swing.JTable tbLoad;
    private javax.swing.JProgressBar xpBar;
    private javax.swing.JLabel xpBarDisp;
    // End of variables declaration//GEN-END:variables
}
