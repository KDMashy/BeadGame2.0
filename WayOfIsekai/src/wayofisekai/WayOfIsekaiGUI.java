
package wayofisekai;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.xpath.XPathExpressionException;

public class WayOfIsekaiGUI extends javax.swing.JFrame {

    public Character ch = new Character();
    public Enemy en = new Enemy();
    public funkcio<Character> chF = new funkcio<Character>();
    public funkcio<Enemy> enemyF = new funkcio<Enemy>();
    public ArrayList<Enemy> listenemy = enemyF.loadEnemy(ch);
    public funkcio<npc> npcsave = new funkcio<>();
    public ArrayList<npc> npcList = new ArrayList<>();
    
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
        quests = new javax.swing.JPanel();
        q1 = new javax.swing.JPanel();
        q1name = new javax.swing.JLabel();
        q1start = new javax.swing.JButton();
        q2 = new javax.swing.JPanel();
        q2name = new javax.swing.JLabel();
        q2start = new javax.swing.JButton();
        req4 = new javax.swing.JLabel();
        q3 = new javax.swing.JPanel();
        q3name = new javax.swing.JLabel();
        q3start = new javax.swing.JButton();
        req3 = new javax.swing.JLabel();
        q4 = new javax.swing.JPanel();
        q4name = new javax.swing.JLabel();
        q4start = new javax.swing.JButton();
        req2 = new javax.swing.JLabel();
        q5 = new javax.swing.JPanel();
        q5name = new javax.swing.JLabel();
        q5start = new javax.swing.JButton();
        req1 = new javax.swing.JLabel();
        city = new javax.swing.JPanel();
        cityName = new javax.swing.JLabel();
        mashiriaB = new javax.swing.JButton();
        req = new javax.swing.JLabel();
        mapDisp = new javax.swing.JPanel();
        mapLabel = new javax.swing.JLabel();
        mapLayers = new javax.swing.JLayeredPane();
        cityPoint = new javax.swing.JButton();
        q1point = new javax.swing.JButton();
        q2point = new javax.swing.JButton();
        q3point = new javax.swing.JButton();
        q4point = new javax.swing.JButton();
        q5point = new javax.swing.JButton();
        MAP = new javax.swing.JLabel();
        fight = new javax.swing.JPanel();
        fDataPnl = new javax.swing.JPanel();
        fLvlDisp = new javax.swing.JLabel();
        fNameDisp = new javax.swing.JLabel();
        flvl = new javax.swing.JLabel();
        fHpDisp = new javax.swing.JLabel();
        fMonDisp = new javax.swing.JLabel();
        fDmgDisp = new javax.swing.JLabel();
        heal = new javax.swing.JButton();
        choice = new javax.swing.JPanel();
        LEAVE = new javax.swing.JButton();
        HIT = new javax.swing.JButton();
        lorc = new javax.swing.JPanel();
        atk = new javax.swing.JButton();
        enemyimg = new javax.swing.JLabel();
        charimg = new javax.swing.JLabel();
        epnl = new javax.swing.JPanel();
        fename = new javax.swing.JLabel();
        eHpBar = new javax.swing.JProgressBar();
        eHpDisp = new javax.swing.JLabel();
        efDmg = new javax.swing.JLabel();
        dialogue = new javax.swing.JPanel();
        MashiriaCity = new javax.swing.JPanel();
        mashiriaLayers = new javax.swing.JLayeredPane();
        chiComp = new javax.swing.JLabel();
        masComp = new javax.swing.JLabel();
        kuroComp = new javax.swing.JLabel();
        shiComp = new javax.swing.JLabel();
        kaeComp = new javax.swing.JLabel();
        shiroComp = new javax.swing.JLabel();
        hiroComp = new javax.swing.JLabel();
        rakuComp = new javax.swing.JLabel();
        kuro = new javax.swing.JButton();
        shiina = new javax.swing.JButton();
        raku = new javax.swing.JButton();
        shiro = new javax.swing.JButton();
        mashiron = new javax.swing.JButton();
        hiro = new javax.swing.JButton();
        chi = new javax.swing.JButton();
        kaede = new javax.swing.JButton();
        sheldon = new javax.swing.JButton();
        travelB = new javax.swing.JButton();
        kuroPnl = new javax.swing.JPanel();
        kuroName = new javax.swing.JLabel();
        kuroAnswB = new javax.swing.JButton();
        kuroQ = new javax.swing.JLabel();
        kuroAnsw = new javax.swing.JComboBox<>();
        shiroPnl = new javax.swing.JPanel();
        shiroName = new javax.swing.JLabel();
        shiroAnsw = new javax.swing.JComboBox<>();
        shiroAnswB = new javax.swing.JButton();
        shiroQ = new javax.swing.JLabel();
        rakuPnl = new javax.swing.JPanel();
        rakuName = new javax.swing.JLabel();
        rakuQ = new javax.swing.JLabel();
        rakuAnsw = new javax.swing.JComboBox<>();
        rakuAnswB = new javax.swing.JButton();
        shiPnl = new javax.swing.JPanel();
        shiName = new javax.swing.JLabel();
        shiQ = new javax.swing.JLabel();
        shiAccB = new javax.swing.JButton();
        kaePnl = new javax.swing.JPanel();
        kaeName = new javax.swing.JLabel();
        kaeQ = new javax.swing.JLabel();
        kaeAccB = new javax.swing.JButton();
        masPnl = new javax.swing.JPanel();
        masName = new javax.swing.JLabel();
        masAccB = new javax.swing.JButton();
        masQ = new javax.swing.JLabel();
        hiroPnl = new javax.swing.JPanel();
        hiroName = new javax.swing.JLabel();
        hiroQ = new javax.swing.JLabel();
        hiroAccB = new javax.swing.JButton();
        chiPnl = new javax.swing.JPanel();
        chiName = new javax.swing.JLabel();
        chiQ = new javax.swing.JLabel();
        chiAccB = new javax.swing.JButton();
        sheldonPnl = new javax.swing.JPanel();
        shelLayer = new javax.swing.JLayeredPane();
        shelQ = new javax.swing.JLabel();
        shelC = new javax.swing.JComboBox<>();
        sheldonName = new javax.swing.JLabel();
        winlose = new javax.swing.JTextField();
        shelImg = new javax.swing.JLabel();
        shelChoose = new javax.swing.JButton();
        mashiriaMap = new javax.swing.JLabel();
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
        cNameDot.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        cNameDot.setForeground(new java.awt.Color(255, 192, 160));
        cNameDot.setText("Character Name: ");

        cNameDisp.setBackground(new java.awt.Color(255, 226, 163));
        cNameDisp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        cNameDisp.setForeground(new java.awt.Color(255, 192, 160));
        cNameDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cNameDisp.setText("name");
        cNameDisp.setToolTipText("");

        cSex.setBackground(new java.awt.Color(255, 226, 163));
        cSex.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        cSex.setForeground(new java.awt.Color(255, 192, 160));
        cSex.setText("Hp: ");
        cSex.setToolTipText("");

        cHpDisp.setBackground(new java.awt.Color(255, 226, 163));
        cHpDisp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        cHpDisp.setForeground(new java.awt.Color(255, 192, 160));
        cHpDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cHpDisp.setText("hp");
        cHpDisp.setToolTipText("");

        xpBarDisp.setBackground(new java.awt.Color(255, 192, 160));
        xpBarDisp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        xpBarDisp.setForeground(new java.awt.Color(255, 192, 160));
        xpBarDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xpBarDisp.setText("0 / 0");

        cSex1.setBackground(new java.awt.Color(255, 226, 163));
        cSex1.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        cSex1.setForeground(new java.awt.Color(255, 192, 160));
        cSex1.setText("Sex: ");
        cSex1.setToolTipText("");

        cSexDisp.setBackground(new java.awt.Color(255, 226, 163));
        cSexDisp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        cSexDisp.setForeground(new java.awt.Color(255, 192, 160));
        cSexDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cSexDisp.setText("sex");
        cSexDisp.setToolTipText("");

        cSex2.setBackground(new java.awt.Color(255, 226, 163));
        cSex2.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        cSex2.setForeground(new java.awt.Color(255, 192, 160));
        cSex2.setText("Dmg:");
        cSex2.setToolTipText("");

        cDmgDisp.setBackground(new java.awt.Color(255, 226, 163));
        cDmgDisp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        cDmgDisp.setForeground(new java.awt.Color(255, 192, 160));
        cDmgDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cDmgDisp.setText("dmg");
        cDmgDisp.setToolTipText("");

        cSex3.setBackground(new java.awt.Color(255, 226, 163));
        cSex3.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        cSex3.setForeground(new java.awt.Color(255, 192, 160));
        cSex3.setText("Money:");
        cSex3.setToolTipText("");

        cMoneyDisp.setBackground(new java.awt.Color(255, 226, 163));
        cMoneyDisp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        cMoneyDisp.setForeground(new java.awt.Color(255, 192, 160));
        cMoneyDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cMoneyDisp.setText("money");
        cMoneyDisp.setToolTipText("");

        lvl.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        lvl.setForeground(new java.awt.Color(255, 192, 160));
        lvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvl.setText("0");

        cLvl.setBackground(new java.awt.Color(255, 192, 160));
        cLvl.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
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
                                .addGap(0, 0, Short.MAX_VALUE))))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        enemyList.setBackground(new java.awt.Color(51, 51, 51));
        enemyList.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        enemyList.setForeground(new java.awt.Color(255, 192, 160));
        enemyList.setText("List Enemy");
        enemyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enemyListMouseClicked(evt);
            }
        });

        gameExit1.setBackground(new java.awt.Color(51, 51, 51));
        gameExit1.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
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
            .addGap(0, 0, Short.MAX_VALUE)
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
        igsave.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        igsave.setForeground(new java.awt.Color(255, 192, 160));
        igsave.setText("Save");
        igsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igsaveMouseClicked(evt);
            }
        });

        quests.setBackground(new java.awt.Color(102, 102, 102));

        q1.setBackground(new java.awt.Color(96, 0, 25));

        q1name.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        q1name.setForeground(new java.awt.Color(255, 192, 160));
        q1name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1name.setText("1 - Unexpected Journey");

        q1start.setBackground(new java.awt.Color(51, 51, 51));
        q1start.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        q1start.setForeground(new java.awt.Color(255, 192, 160));
        q1start.setText("Start here or Quest 1");
        q1start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q1startMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout q1Layout = new javax.swing.GroupLayout(q1);
        q1.setLayout(q1Layout);
        q1Layout.setHorizontalGroup(
            q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q1name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(q1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(q1start, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        q1Layout.setVerticalGroup(
            q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(q1name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(q1start)
                .addContainerGap())
        );

        q2.setBackground(new java.awt.Color(96, 0, 25));

        q2name.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        q2name.setForeground(new java.awt.Color(255, 192, 160));
        q2name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2name.setText("2 - To the Mountains");

        q2start.setBackground(new java.awt.Color(51, 51, 51));
        q2start.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        q2start.setForeground(new java.awt.Color(255, 192, 160));
        q2start.setText("Start here or Quest 2");
        q2start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q2startMouseClicked(evt);
            }
        });

        req4.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        req4.setForeground(new java.awt.Color(255, 192, 160));
        req4.setText("Required lvl: 5");

        javax.swing.GroupLayout q2Layout = new javax.swing.GroupLayout(q2);
        q2.setLayout(q2Layout);
        q2Layout.setHorizontalGroup(
            q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q2name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q2Layout.createSequentialGroup()
                        .addComponent(req4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(q2start, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        q2Layout.setVerticalGroup(
            q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(q2name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q2start)
                    .addComponent(req4))
                .addContainerGap())
        );

        q3.setBackground(new java.awt.Color(96, 0, 25));

        q3name.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        q3name.setForeground(new java.awt.Color(255, 192, 160));
        q3name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3name.setText("3 - Caves of the Mountain");

        q3start.setBackground(new java.awt.Color(51, 51, 51));
        q3start.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        q3start.setForeground(new java.awt.Color(255, 192, 160));
        q3start.setText("Start here or Quest 3");
        q3start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q3startMouseClicked(evt);
            }
        });

        req3.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        req3.setForeground(new java.awt.Color(255, 192, 160));
        req3.setText("Required lvl: 15");

        javax.swing.GroupLayout q3Layout = new javax.swing.GroupLayout(q3);
        q3.setLayout(q3Layout);
        q3Layout.setHorizontalGroup(
            q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q3name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q3Layout.createSequentialGroup()
                        .addComponent(req3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(q3start, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        q3Layout.setVerticalGroup(
            q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(q3name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q3start)
                    .addComponent(req3))
                .addContainerGap())
        );

        q4.setBackground(new java.awt.Color(96, 0, 25));

        q4name.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        q4name.setForeground(new java.awt.Color(255, 192, 160));
        q4name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4name.setText("4 - The Wild Forest");

        q4start.setBackground(new java.awt.Color(51, 51, 51));
        q4start.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        q4start.setForeground(new java.awt.Color(255, 192, 160));
        q4start.setText("Start here or Quest 4");
        q4start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q4startMouseClicked(evt);
            }
        });

        req2.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        req2.setForeground(new java.awt.Color(255, 192, 160));
        req2.setText("Required lvl: 30");

        javax.swing.GroupLayout q4Layout = new javax.swing.GroupLayout(q4);
        q4.setLayout(q4Layout);
        q4Layout.setHorizontalGroup(
            q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q4Layout.createSequentialGroup()
                .addGroup(q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q4name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(req2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(q4start, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        q4Layout.setVerticalGroup(
            q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(q4name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q4start)
                    .addComponent(req2))
                .addContainerGap())
        );

        q5.setBackground(new java.awt.Color(96, 0, 25));

        q5name.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        q5name.setForeground(new java.awt.Color(255, 192, 160));
        q5name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5name.setText("5 - Dome of DOOM");

        q5start.setBackground(new java.awt.Color(51, 51, 51));
        q5start.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        q5start.setForeground(new java.awt.Color(255, 192, 160));
        q5start.setText("Start here or Quest 5");
        q5start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q5startMouseClicked(evt);
            }
        });

        req1.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        req1.setForeground(new java.awt.Color(255, 192, 160));
        req1.setText("Required lvl: 45");

        javax.swing.GroupLayout q5Layout = new javax.swing.GroupLayout(q5);
        q5.setLayout(q5Layout);
        q5Layout.setHorizontalGroup(
            q5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(q5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q5name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q5Layout.createSequentialGroup()
                        .addComponent(req1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(q5start, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        q5Layout.setVerticalGroup(
            q5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(q5name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(q5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q5start)
                    .addComponent(req1))
                .addContainerGap())
        );

        city.setBackground(new java.awt.Color(0, 102, 102));

        cityName.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        cityName.setForeground(new java.awt.Color(255, 192, 160));
        cityName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityName.setText("Mashiria");

        mashiriaB.setBackground(new java.awt.Color(51, 51, 51));
        mashiriaB.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        mashiriaB.setForeground(new java.awt.Color(255, 192, 160));
        mashiriaB.setText("Travel to city or Mashiria");
        mashiriaB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mashiriaBMouseClicked(evt);
            }
        });

        req.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        req.setForeground(new java.awt.Color(255, 192, 160));
        req.setText("Required lvl: 15");

        javax.swing.GroupLayout cityLayout = new javax.swing.GroupLayout(city);
        city.setLayout(cityLayout);
        cityLayout.setHorizontalGroup(
            cityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cityLayout.createSequentialGroup()
                        .addComponent(req)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mashiriaB, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        cityLayout.setVerticalGroup(
            cityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cityName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mashiriaB)
                    .addComponent(req))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout questsLayout = new javax.swing.GroupLayout(quests);
        quests.setLayout(questsLayout);
        questsLayout.setHorizontalGroup(
            questsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(questsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questsLayout.createSequentialGroup()
                        .addGroup(questsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(q1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        questsLayout.setVerticalGroup(
            questsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mapDisp.setBackground(new java.awt.Color(204, 204, 204));

        mapLabel.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        mapLabel.setForeground(new java.awt.Color(102, 102, 102));
        mapLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mapLabel.setText("Map");

        mapLayers.setBackground(new java.awt.Color(204, 204, 204));
        mapLayers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cityPoint.setBackground(new java.awt.Color(51, 51, 51));
        cityPoint.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        cityPoint.setForeground(new java.awt.Color(255, 192, 160));
        cityPoint.setText("Mashiria");
        cityPoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityPointMouseClicked(evt);
            }
        });
        mapLayers.add(cityPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 140, 50));

        q1point.setBackground(new java.awt.Color(51, 51, 51));
        q1point.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        q1point.setForeground(new java.awt.Color(255, 192, 160));
        q1point.setText("Quest 1");
        q1point.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q1pointMouseClicked(evt);
            }
        });
        mapLayers.add(q1point, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 140, 50));

        q2point.setBackground(new java.awt.Color(51, 51, 51));
        q2point.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        q2point.setForeground(new java.awt.Color(255, 192, 160));
        q2point.setText("Quest 2");
        q2point.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q2pointMouseClicked(evt);
            }
        });
        mapLayers.add(q2point, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 140, 50));

        q3point.setBackground(new java.awt.Color(51, 51, 51));
        q3point.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        q3point.setForeground(new java.awt.Color(255, 192, 160));
        q3point.setText("Quest 3");
        q3point.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q3pointMouseClicked(evt);
            }
        });
        mapLayers.add(q3point, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 140, 50));

        q4point.setBackground(new java.awt.Color(51, 51, 51));
        q4point.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        q4point.setForeground(new java.awt.Color(255, 192, 160));
        q4point.setText("Quest 4");
        q4point.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q4pointMouseClicked(evt);
            }
        });
        mapLayers.add(q4point, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 140, 50));

        q5point.setBackground(new java.awt.Color(51, 51, 51));
        q5point.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        q5point.setForeground(new java.awt.Color(255, 192, 160));
        q5point.setText("Quest 5");
        q5point.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q5pointMouseClicked(evt);
            }
        });
        mapLayers.add(q5point, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 140, 50));

        MAP.setBackground(new java.awt.Color(204, 204, 204));
        MAP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MAP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wayofisekai/MAP.png"))); // NOI18N
        MAP.setText("MAP");
        mapLayers.add(MAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 710));

        javax.swing.GroupLayout mapDispLayout = new javax.swing.GroupLayout(mapDisp);
        mapDisp.setLayout(mapDispLayout);
        mapDispLayout.setHorizontalGroup(
            mapDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapDispLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mapDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mapLayers, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addComponent(mapLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mapDispLayout.setVerticalGroup(
            mapDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapDispLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mapLabel)
                .addGap(18, 18, 18)
                .addComponent(mapLayers, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gameLayout = new javax.swing.GroupLayout(game);
        game.setLayout(gameLayout);
        gameLayout.setHorizontalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mapDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(gameExit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cProf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
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
            .addGroup(gameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mapDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

        heal.setBackground(new java.awt.Color(51, 51, 51));
        heal.setForeground(new java.awt.Color(255, 192, 160));
        heal.setText("Heal / 100");
        heal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                healMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fDataPnlLayout = new javax.swing.GroupLayout(fDataPnl);
        fDataPnl.setLayout(fDataPnlLayout);
        fDataPnlLayout.setHorizontalGroup(
            fDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fDataPnlLayout.createSequentialGroup()
                .addGroup(fDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fHpDisp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fDmgDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fMonDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fDataPnlLayout.createSequentialGroup()
                        .addComponent(fLvlDisp, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flvl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fDataPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(heal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fNameDisp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(heal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        choice.setBackground(new java.awt.Color(96, 0, 25));

        LEAVE.setBackground(new java.awt.Color(51, 51, 51));
        LEAVE.setForeground(new java.awt.Color(255, 192, 160));
        LEAVE.setText("RUN!");
        LEAVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LEAVEMouseClicked(evt);
            }
        });

        HIT.setBackground(new java.awt.Color(51, 51, 51));
        HIT.setForeground(new java.awt.Color(255, 192, 160));
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
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(LEAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(choiceLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(HIT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        lorc.setBackground(new java.awt.Color(96, 0, 25));

        atk.setBackground(new java.awt.Color(51, 51, 51));
        atk.setForeground(new java.awt.Color(255, 192, 160));
        atk.setText("Attack");
        atk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lorcLayout = new javax.swing.GroupLayout(lorc);
        lorc.setLayout(lorcLayout);
        lorcLayout.setHorizontalGroup(
            lorcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lorcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atk, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        lorcLayout.setVerticalGroup(
            lorcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lorcLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(atk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        enemyimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enemyimg.setText("ENEMY");

        charimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        epnl.setBackground(new java.awt.Color(96, 0, 25));

        fename.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        fename.setForeground(new java.awt.Color(255, 192, 160));
        fename.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fename.setText("ENEMY NAME");

        eHpDisp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        eHpDisp.setForeground(new java.awt.Color(255, 192, 160));
        eHpDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eHpDisp.setText("0 / 0");

        efDmg.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        efDmg.setForeground(new java.awt.Color(255, 192, 160));
        efDmg.setText("Dmg: 0");

        javax.swing.GroupLayout epnlLayout = new javax.swing.GroupLayout(epnl);
        epnl.setLayout(epnlLayout);
        epnlLayout.setHorizontalGroup(
            epnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(eHpDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(epnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(epnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eHpBar, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, epnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(efDmg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        epnlLayout.setVerticalGroup(
            epnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(epnlLayout.createSequentialGroup()
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
                .addGap(139, 139, 139)
                .addComponent(epnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fightLayout.createSequentialGroup()
                        .addComponent(enemyimg, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fightLayout.createSequentialGroup()
                        .addComponent(lorc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fightLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(charimg, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
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
                        .addComponent(epnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lorc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        mashiriaLayers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chiComp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        chiComp.setForeground(new java.awt.Color(204, 255, 255));
        chiComp.setText("Már teljesítetted !");
        mashiriaLayers.add(chiComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 740, -1, -1));

        masComp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        masComp.setForeground(new java.awt.Color(204, 255, 255));
        masComp.setText("Már teljesítetted !");
        mashiriaLayers.add(masComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 740, -1, -1));

        kuroComp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        kuroComp.setForeground(new java.awt.Color(204, 255, 255));
        kuroComp.setText("Már teljesítetted !");
        mashiriaLayers.add(kuroComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        shiComp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        shiComp.setForeground(new java.awt.Color(204, 255, 255));
        shiComp.setText("Már teljesítetted !");
        mashiriaLayers.add(shiComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));

        kaeComp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        kaeComp.setForeground(new java.awt.Color(204, 255, 255));
        kaeComp.setText("Már teljesítetted !");
        mashiriaLayers.add(kaeComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        shiroComp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        shiroComp.setForeground(new java.awt.Color(204, 255, 255));
        shiroComp.setText("Már teljesítetted !");
        mashiriaLayers.add(shiroComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        hiroComp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        hiroComp.setForeground(new java.awt.Color(204, 255, 255));
        hiroComp.setText("Már teljesítetted !");
        mashiriaLayers.add(hiroComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, -1, -1));

        rakuComp.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        rakuComp.setForeground(new java.awt.Color(204, 255, 255));
        rakuComp.setText("Már teljesítetted !");
        mashiriaLayers.add(rakuComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 420, -1, -1));

        kuro.setBackground(new java.awt.Color(51, 51, 51));
        kuro.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        kuro.setForeground(new java.awt.Color(255, 192, 160));
        kuro.setText("Kuro");
        kuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kuroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kuroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kuroMouseExited(evt);
            }
        });
        kuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuroActionPerformed(evt);
            }
        });
        mashiriaLayers.add(kuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 150, 50));

        shiina.setBackground(new java.awt.Color(51, 51, 51));
        shiina.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        shiina.setForeground(new java.awt.Color(255, 192, 160));
        shiina.setText("Shiina");
        shiina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shiinaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shiinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shiinaMouseExited(evt);
            }
        });
        mashiriaLayers.add(shiina, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 150, 50));

        raku.setBackground(new java.awt.Color(51, 51, 51));
        raku.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        raku.setForeground(new java.awt.Color(255, 192, 160));
        raku.setText("Raku");
        raku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rakuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rakuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rakuMouseExited(evt);
            }
        });
        mashiriaLayers.add(raku, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 460, 150, 50));

        shiro.setBackground(new java.awt.Color(51, 51, 51));
        shiro.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        shiro.setForeground(new java.awt.Color(255, 192, 160));
        shiro.setText("Shiro");
        shiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shiroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shiroMouseExited(evt);
            }
        });
        mashiriaLayers.add(shiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 150, 50));

        mashiron.setBackground(new java.awt.Color(51, 51, 51));
        mashiron.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        mashiron.setForeground(new java.awt.Color(255, 192, 160));
        mashiron.setText("Mashiron");
        mashiron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mashironMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mashironMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mashironMouseExited(evt);
            }
        });
        mashiriaLayers.add(mashiron, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, 150, 50));

        hiro.setBackground(new java.awt.Color(51, 51, 51));
        hiro.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        hiro.setForeground(new java.awt.Color(255, 192, 160));
        hiro.setText("Hiro");
        hiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hiroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hiroMouseExited(evt);
            }
        });
        mashiriaLayers.add(hiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 150, 50));

        chi.setBackground(new java.awt.Color(51, 51, 51));
        chi.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        chi.setForeground(new java.awt.Color(255, 192, 160));
        chi.setText("Chi");
        chi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chiMouseExited(evt);
            }
        });
        mashiriaLayers.add(chi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 680, 150, 50));

        kaede.setBackground(new java.awt.Color(51, 51, 51));
        kaede.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        kaede.setForeground(new java.awt.Color(255, 192, 160));
        kaede.setText("Kaede");
        kaede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kaedeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kaedeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kaedeMouseExited(evt);
            }
        });
        mashiriaLayers.add(kaede, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 150, 50));

        sheldon.setBackground(new java.awt.Color(51, 51, 51));
        sheldon.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        sheldon.setForeground(new java.awt.Color(255, 192, 160));
        sheldon.setText("Sheldon");
        sheldon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sheldonMouseClicked(evt);
            }
        });
        sheldon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sheldonActionPerformed(evt);
            }
        });
        mashiriaLayers.add(sheldon, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 720, 150, 50));

        travelB.setBackground(new java.awt.Color(51, 51, 51));
        travelB.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        travelB.setForeground(new java.awt.Color(255, 192, 160));
        travelB.setText("Travel Back");
        travelB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                travelBMouseClicked(evt);
            }
        });
        mashiriaLayers.add(travelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 240, 70));

        kuroName.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        kuroName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kuroName.setText("Kuro");

        kuroAnswB.setBackground(new java.awt.Color(51, 51, 51));
        kuroAnswB.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        kuroAnswB.setForeground(new java.awt.Color(255, 192, 160));
        kuroAnswB.setText("Answer");
        kuroAnswB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kuroAnswBMouseClicked(evt);
            }
        });

        kuroQ.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        kuroQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kuroQ.setText("<html>\n<p>\nHonnan kezdődik a játék? <br>\n1000 xp, 500 gold\n</p>\n</html>");

        kuroAnsw.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mount Sep", "Dome of DOOM", "Mashiria", "The Shire" }));

        javax.swing.GroupLayout kuroPnlLayout = new javax.swing.GroupLayout(kuroPnl);
        kuroPnl.setLayout(kuroPnlLayout);
        kuroPnlLayout.setHorizontalGroup(
            kuroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kuroPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kuroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kuroName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kuroPnlLayout.createSequentialGroup()
                        .addComponent(kuroAnsw, 0, 180, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(kuroAnswB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kuroQ))
                .addContainerGap())
        );
        kuroPnlLayout.setVerticalGroup(
            kuroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kuroPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kuroName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kuroQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(kuroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kuroAnswB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kuroAnsw))
                .addGap(14, 14, 14))
        );

        mashiriaLayers.add(kuroPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 330, 150));

        shiroName.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        shiroName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiroName.setText("Shiro");

        shiroAnsw.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mount of DOOM", "Mount of Trolls", "Mount of Sep", "Mount of Separator" }));

        shiroAnswB.setBackground(new java.awt.Color(51, 51, 51));
        shiroAnswB.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        shiroAnswB.setForeground(new java.awt.Color(255, 192, 160));
        shiroAnswB.setText("Answer");
        shiroAnswB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shiroAnswBMouseClicked(evt);
            }
        });

        shiroQ.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        shiroQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiroQ.setText("<html>\n<p>\nMi a hegy neve? <br>\n1500 - 3000 xp, 500 gold\n</p>\n</html>");

        javax.swing.GroupLayout shiroPnlLayout = new javax.swing.GroupLayout(shiroPnl);
        shiroPnl.setLayout(shiroPnlLayout);
        shiroPnlLayout.setHorizontalGroup(
            shiroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shiroPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shiroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shiroName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(shiroPnlLayout.createSequentialGroup()
                        .addComponent(shiroAnsw, 0, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(shiroAnswB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(shiroQ))
                .addContainerGap())
        );
        shiroPnlLayout.setVerticalGroup(
            shiroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shiroPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shiroName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shiroQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(shiroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shiroAnswB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shiroAnsw, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mashiriaLayers.add(shiroPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 300, 130));

        rakuName.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        rakuName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rakuName.setText("Raku");

        rakuQ.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        rakuQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rakuQ.setText("<html>\n<p>\nMi a főgonosz neve? <br>\n15000 xp, 10000 gold\n</p>\n</html>");

        rakuAnsw.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Creeper", "G-Man", "KALKULUS", "C language" }));

        rakuAnswB.setBackground(new java.awt.Color(51, 51, 51));
        rakuAnswB.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        rakuAnswB.setForeground(new java.awt.Color(255, 192, 160));
        rakuAnswB.setText("Answer");
        rakuAnswB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rakuAnswBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rakuPnlLayout = new javax.swing.GroupLayout(rakuPnl);
        rakuPnl.setLayout(rakuPnlLayout);
        rakuPnlLayout.setHorizontalGroup(
            rakuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rakuPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rakuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rakuName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rakuQ, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addGroup(rakuPnlLayout.createSequentialGroup()
                        .addComponent(rakuAnsw, 0, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(rakuAnswB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        rakuPnlLayout.setVerticalGroup(
            rakuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rakuPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rakuName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rakuQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rakuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rakuAnswB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rakuAnsw, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        mashiriaLayers.add(rakuPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 380, 300, 140));

        shiName.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        shiName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiName.setText("Shiina");

        shiQ.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        shiQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiQ.setText("<html>\n<p>\nTeljesítsd újra az első küldetést<br>\n500 - 3000 xp, <br>\n500 - 1000 gold\n</p>\n</html>");

        shiAccB.setBackground(new java.awt.Color(51, 51, 51));
        shiAccB.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        shiAccB.setForeground(new java.awt.Color(255, 192, 160));
        shiAccB.setText("Accept");
        shiAccB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shiAccBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout shiPnlLayout = new javax.swing.GroupLayout(shiPnl);
        shiPnl.setLayout(shiPnlLayout);
        shiPnlLayout.setHorizontalGroup(
            shiPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shiPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shiPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shiName, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addGroup(shiPnlLayout.createSequentialGroup()
                        .addComponent(shiQ, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shiAccB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        shiPnlLayout.setVerticalGroup(
            shiPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shiPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shiName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shiPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shiAccB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(shiPnlLayout.createSequentialGroup()
                        .addComponent(shiQ, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        mashiriaLayers.add(shiPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 330, -1));

        kaeName.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        kaeName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kaeName.setText("Kaede");

        kaeQ.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        kaeQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kaeQ.setText("<html>\n<p>\nNéhány szörny visszatért a hegy barlangjaiba.<br>\nKérlek intézd el őket.<br>\n1000 - 5000  xp,<br>\n500 - 3500 gold\n</p>\n</html>");

        kaeAccB.setBackground(new java.awt.Color(51, 51, 51));
        kaeAccB.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        kaeAccB.setForeground(new java.awt.Color(255, 192, 160));
        kaeAccB.setText("Accept");
        kaeAccB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kaeAccBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kaePnlLayout = new javax.swing.GroupLayout(kaePnl);
        kaePnl.setLayout(kaePnlLayout);
        kaePnlLayout.setHorizontalGroup(
            kaePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kaePnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kaePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kaeName, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addGroup(kaePnlLayout.createSequentialGroup()
                        .addComponent(kaeQ, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kaeAccB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        kaePnlLayout.setVerticalGroup(
            kaePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kaePnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kaeName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kaePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kaeQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kaeAccB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        mashiriaLayers.add(kaePnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 350, 150));

        masName.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        masName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masName.setText("Mashiron");

        masAccB.setBackground(new java.awt.Color(51, 51, 51));
        masAccB.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        masAccB.setForeground(new java.awt.Color(255, 192, 160));
        masAccB.setText("Accept");
        masAccB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masAccBMouseClicked(evt);
            }
        });

        masQ.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        masQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masQ.setText("<html>\n<p>\nAz erdőre ráférne egy kis tisztítás...<br>\n1000 - 10000 xp,<br>\n1000 - 5000 gold\n</p>\n</html>");

        javax.swing.GroupLayout masPnlLayout = new javax.swing.GroupLayout(masPnl);
        masPnl.setLayout(masPnlLayout);
        masPnlLayout.setHorizontalGroup(
            masPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(masPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(masName, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addGroup(masPnlLayout.createSequentialGroup()
                        .addComponent(masQ, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masAccB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        masPnlLayout.setVerticalGroup(
            masPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(masPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(masPnlLayout.createSequentialGroup()
                        .addComponent(masAccB, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addGroup(masPnlLayout.createSequentialGroup()
                        .addComponent(masQ)
                        .addContainerGap())))
        );

        mashiriaLayers.add(masPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 340, 130));

        hiroName.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        hiroName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hiroName.setText("Hiro");

        hiroQ.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        hiroQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hiroQ.setText("<html>\n<p>\nA hegy újra kezd veszélyes lenni...<br>\n1000 - 3000  xp,<br>\n500 - 1500 gold\n</p>\n</html>");

        hiroAccB.setBackground(new java.awt.Color(51, 51, 51));
        hiroAccB.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        hiroAccB.setForeground(new java.awt.Color(255, 192, 160));
        hiroAccB.setText("Accept");
        hiroAccB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hiroAccBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hiroPnlLayout = new javax.swing.GroupLayout(hiroPnl);
        hiroPnl.setLayout(hiroPnlLayout);
        hiroPnlLayout.setHorizontalGroup(
            hiroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiroPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hiroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hiroName, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addGroup(hiroPnlLayout.createSequentialGroup()
                        .addComponent(hiroQ, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hiroAccB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        hiroPnlLayout.setVerticalGroup(
            hiroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiroPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hiroName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hiroPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hiroPnlLayout.createSequentialGroup()
                        .addComponent(hiroAccB, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(hiroPnlLayout.createSequentialGroup()
                        .addComponent(hiroQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        mashiriaLayers.add(hiroPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 360, 140));

        chiName.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        chiName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chiName.setText("Chi");

        chiQ.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        chiQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chiQ.setText("<html>\n<p>\nKiváncsi vagyok a szörnyekre onnan, ahonnan jöttél (The Shire)<br>\n750 - 3000 xp, 1000 gold\n</p>\n</html>");

        chiAccB.setBackground(new java.awt.Color(51, 51, 51));
        chiAccB.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        chiAccB.setForeground(new java.awt.Color(255, 192, 160));
        chiAccB.setText("Accept");
        chiAccB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chiAccBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout chiPnlLayout = new javax.swing.GroupLayout(chiPnl);
        chiPnl.setLayout(chiPnlLayout);
        chiPnlLayout.setHorizontalGroup(
            chiPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chiPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chiPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chiName, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addGroup(chiPnlLayout.createSequentialGroup()
                        .addComponent(chiQ, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chiAccB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        chiPnlLayout.setVerticalGroup(
            chiPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chiPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chiName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chiPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chiQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chiAccB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        mashiriaLayers.add(chiPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 550, 330, 130));

        shelLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shelQ.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        shelQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shelQ.setText("<html>\n<p>\nJátszunk egy játékot...<br>\nKő-Papír-Olló-Gyík-Spoch<br>\n0 - 15000  xp,<br>\n0 - 15000 gold\n</p>\n</html>");
        shelLayer.add(shelQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 140, 130));

        shelC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kő", "Papír", "Olló", "Gyík", "Spoch" }));
        shelLayer.add(shelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 141, -1));

        sheldonName.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        sheldonName.setText("Sheldon a remete");
        shelLayer.add(sheldonName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        winlose.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        winlose.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        winlose.setText("win");
        shelLayer.add(winlose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 30));

        shelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wayofisekai/sheldon.png"))); // NOI18N
        shelImg.setText("jLabel2");
        shelLayer.add(shelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 0, 238, 187));

        shelChoose.setBackground(new java.awt.Color(51, 51, 51));
        shelChoose.setFont(new java.awt.Font("Papyrus", 3, 12)); // NOI18N
        shelChoose.setForeground(new java.awt.Color(255, 192, 160));
        shelChoose.setText("Choose");
        shelChoose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shelChooseMouseClicked(evt);
            }
        });
        shelLayer.add(shelChoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 30));

        javax.swing.GroupLayout sheldonPnlLayout = new javax.swing.GroupLayout(sheldonPnl);
        sheldonPnl.setLayout(sheldonPnlLayout);
        sheldonPnlLayout.setHorizontalGroup(
            sheldonPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shelLayer)
        );
        sheldonPnlLayout.setVerticalGroup(
            sheldonPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shelLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, Short.MAX_VALUE)
        );

        mashiriaLayers.add(sheldonPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 420, 140));

        mashiriaMap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mashiriaMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wayofisekai/mashiriamap.png"))); // NOI18N
        mashiriaLayers.add(mashiriaMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 790));

        javax.swing.GroupLayout MashiriaCityLayout = new javax.swing.GroupLayout(MashiriaCity);
        MashiriaCity.setLayout(MashiriaCityLayout);
        MashiriaCityLayout.setHorizontalGroup(
            MashiriaCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mashiriaLayers)
        );
        MashiriaCityLayout.setVerticalGroup(
            MashiriaCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MashiriaCityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mashiriaLayers)
                .addContainerGap())
        );

        lpFrame.add(MashiriaCity, "card6");

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
                    
                    if (cNameText.getText().equals("Kaede")) {
                        
                        ch.setXp(1000000);
                        
                        while (ch.getXp() >= chF.lvlUpXp(ch.getLvl())) {
                    
                            ch.lvlUp();

                        }
                    }
                    
                    chF.saveObject(ch, ch.getName());
                    
                    String[] npcNames = new String[] 
                        {"Mashiron", "Shiina",
                        "Raku", "Kaede",
                        "Chi", "Shiro",
                        "Kuro", "Hiro"};
                    for (int i = 0; i < 8; i++) {
                        npc xy = new npc(npcNames[i], Boolean.FALSE, Boolean.FALSE, ch.getName());
                        npcsave.saveObject(xy, npcNames[i]);
                    }
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
                    lvl.setText(chk.getLvl().toString());
                    cHpDisp.setText(chk.getHp().toString());
                    xpBar.setMaximum(chF.lvlUpXp(chk.getLvl()));
                    xpBar.setValue(chk.getXp());
                    xpBarDisp.setText(chk.getXp() + " / " + 
                            chF.lvlUpXp(chk.getLvl()));
                    cMoneyDisp.setText(chk.getMoney().toString());
                    loadPnl.setVisible(Boolean.FALSE);
                    eTable.setVisible(Boolean.FALSE);
                    ch = new Character(chk.getName(), chk.getLvl(), 
                            chk.getXp(), chk.getSex(), chk.getMoney());
                    hp = ch.getHp();
                    removeAccept.setSelected(Boolean.FALSE);
                    
                    gameUpdate();
                    
                    npc xynpc = new npc("xy", Boolean.FALSE,
                        Boolean.FALSE, "nb");
                    npcList = chF.loadNpc(xynpc);
                    
                    q5start.setEnabled(Boolean.FALSE);
                    q4start.setEnabled(Boolean.FALSE);
                    q3start.setEnabled(Boolean.FALSE);
                    q2start.setEnabled(Boolean.FALSE);
                    mashiriaB.setEnabled(Boolean.FALSE);
                    
                    if (ch.getLvl() >= 45) { 
                        q5start.setEnabled(Boolean.TRUE); 
                        q4start.setEnabled(Boolean.TRUE);
                        q3start.setEnabled(Boolean.TRUE);
                        q2start.setEnabled(Boolean.TRUE);
                        mashiriaB.setEnabled(Boolean.TRUE);
                    } else if (ch.getLvl() >= 30) {
                        q4start.setEnabled(Boolean.TRUE);
                        q3start.setEnabled(Boolean.TRUE);
                        q2start.setEnabled(Boolean.TRUE);
                        mashiriaB.setEnabled(Boolean.TRUE);
                    } else if (ch.getLvl() >= 15) {
                        q3start.setEnabled(Boolean.TRUE);
                        q2start.setEnabled(Boolean.TRUE);
                        mashiriaB.setEnabled(Boolean.TRUE);
                    } else if (ch.getLvl() >= 5) {
                        q2start.setEnabled(Boolean.TRUE);
                    }
                    
                    meghiv(game);

                }

            }
            
        }
        
    }//GEN-LAST:event_loadSaveGameMouseClicked

    public void gameUpdate(){
        
        if (questId == 1 && dead == Boolean.FALSE) {
            accQuest(Boolean.TRUE, "Shiina", 500, 3000, 500, 1000, shiina);
            accQuest(Boolean.TRUE, "Chi", 750, 3000, 0, 1000, chi);
        }
        else if (questId == 2 && dead == Boolean.FALSE) 
            accQuest(Boolean.TRUE, "Hiro", 1000, 3000, 500, 1500, hiro);
        else if (questId == 3 && dead == Boolean.FALSE) 
            accQuest(Boolean.TRUE, "Kaede", 1000, 5000, 500, 3500, kaede);
        else if (questId == 4 && dead == Boolean.FALSE) 
            accQuest(Boolean.TRUE, "Mashiron", 1000, 10000, 1000, 5000, mashiron);
        
        cost = 100;
        hp = ch.getHp();
        cNameDisp.setText(ch.getName());
        if (ch.getSex() == Boolean.TRUE) {
            cSexDisp.setText("female");
        } else {
            cSexDisp.setText("male");
        }
        cDmgDisp.setText(ch.getAtk().toString());
        lvl.setText(ch.getLvl().toString());
        xpBar.setMaximum(chF.lvlUpXp(ch.getLvl()));
        xpBar.setValue(ch.getXp());
        xpBarDisp.setText(ch.getXp().toString() + " / "
                + chF.lvlUpXp(ch.getLvl()));
        cHpDisp.setText(ch.getHp().toString());
        cMoneyDisp.setText(ch.getMoney().toString());
        eTable.setVisible(Boolean.FALSE);
        
        while (ch.getXp() >= chF.lvlUpXp(ch.getLvl())) {
                    
            ch.lvlUp();

        }
        
        kaede.setVisible(Boolean.FALSE);
        sheldon.setVisible(Boolean.FALSE);
        mashiron.setVisible(Boolean.FALSE);
        raku.setVisible(Boolean.FALSE);
        
        if (ch.getLvl() >= 45) {
            raku.setVisible(Boolean.TRUE); //45
            mashiron.setVisible(Boolean.TRUE); //30
            kaede.setVisible(Boolean.TRUE); //15
            sheldon.setVisible(Boolean.TRUE); //23
        } else if (ch.getLvl() >= 30){
            mashiron.setVisible(Boolean.TRUE);
            sheldon.setVisible(Boolean.TRUE);
            kaede.setVisible(Boolean.TRUE);
        } else if (ch.getLvl() >= 23){
            sheldon.setVisible(Boolean.TRUE);
            kaede.setVisible(Boolean.TRUE);
        } else if (ch.getLvl() >= 15) {
            kaede.setVisible(Boolean.TRUE);
        }
        
    }
    
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
            npc xy = new npc("asd", Boolean.FALSE, Boolean.FALSE, "asd");
            npcList = npcsave.loadNpc(xy);
            for (npc savenpc : npcList) {
                npcsave.removeNpcs(savenpc, cBox.getSelectedItem().toString());
            }
            removeAccept.setSelected(Boolean.FALSE);
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
        chF.removeChar(ch, ch.getName());
        chF.saveObject(ch, ch.getName());
        for (npc savenpc : npcList) {
            npcsave.removeNpcs(savenpc, savenpc.getCname());
            npcsave.saveObject(savenpc, savenpc.getVilName());
        }
        meghiv(login);
        
    }//GEN-LAST:event_gameExit1MouseClicked

    private void igsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igsaveMouseClicked
        
        chF.removeChar(ch, ch.getName());
        chF.saveObject(ch, ch.getName());
        for (npc savenpc : npcList) {
            npcsave.removeNpcs(savenpc, savenpc.getCname());
            npcsave.saveObject(savenpc, savenpc.getVilName());
        }
        
    }//GEN-LAST:event_igsaveMouseClicked

    private void HITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HITActionPerformed
        //véletlen volt... :'c
    }//GEN-LAST:event_HITActionPerformed

    private void HITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HITMouseClicked
        
        lorc.setVisible(Boolean.TRUE);
        
    }//GEN-LAST:event_HITMouseClicked

    private void LEAVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LEAVEMouseClicked
        
        gameUpdate();
        meghiv(game);
        
    }//GEN-LAST:event_LEAVEMouseClicked

    public Integer enemyFightID = 0;
    public Boolean dead = Boolean.FALSE;
    public Integer hp = ch.getHp();
    public Integer enemyHp;
    
    private void atkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atkMouseClicked
        System.out.println(hp);
        enemyHp -= ch.getAtk();
        
        System.out.println(enemyHp);
        if (enemyHp <= 0 && enemyFightID < 3) {
            
            enemyFightID++;
            if (enemyFightID != 3) {
                
                dead = Boolean.TRUE;
                fightUpdate();
                
            } else if (enemyFightID == 3){
                
                Integer m = 0;
                Integer xpd = 0;
                for(Enemy y : le) {
                    
                    xpd += y.getXpDrop();
                    m += y.getMoneyDrop();
                    
                }
                ch.setXp(xpd);
                ch.setMoney(m);
                if (ch.getXp() >= chF.lvlUpXp(ch.getLvl())) {
                    
                    ch.lvlUp();
                    
                }
                enemyFightID = 0;
                hp = ch.getHp();
                gameUpdate();
                meghiv(game);
                
            }
               
        }
        hp -= le.get(enemyFightID).getAtk();
        if (hp <= 0) {
               
            JOptionPane.showMessageDialog(null, "Meghaltál");
            hp = ch.getHp();
            dead = Boolean.TRUE;
            gameUpdate();
            meghiv(game);
               
        }
        
        fightUpdate();
        
    }//GEN-LAST:event_atkMouseClicked

    public ArrayList<Enemy> le = new ArrayList<>();
    public Integer questId = 0;
    
    public void fightStart(Integer qid){
        
        questId = qid;
        dead = Boolean.FALSE;
        
        fNameDisp.setText(ch.getName());
        flvl.setText(ch.getLvl().toString());
        fHpDisp.setText("Hp: " + 
                ch.getHp().toString() + " / " + ch.getHp().toString());
        fDmgDisp.setText("Dmg: " + ch.getAtk().toString());
        fMonDisp.setText("Money: " + ch.getMoney().toString());
        lorc.setVisible(Boolean.FALSE);
        
        ImageIcon fightIcon = new ImageIcon();
        if (ch.getSex() == Boolean.TRUE) {
            fightIcon = new ImageIcon("src\\wayofisekai\\charfightfemale.png");
            charimg.setIcon(fightIcon);
        } else {
            fightIcon = new ImageIcon("src\\wayofisekai\\charfightmale.png");
            charimg.setIcon(fightIcon);
        }
        
        le = enemyF.quest(ch, qid);
        enemyHp = le.get(0).getHp();
        fename.setText(le.get(0).getName());
        eHpBar.setMaximum(le.get(0).getHp());
        eHpBar.setValue(le.get(0).getHp());
        String hp =le.get(0).getHp().toString();
        eHpDisp.setText(hp + " / " + hp);
        efDmg.setText(le.get(0).getAtk().toString());
        
    }
    
    public void fightUpdate(){
        
        //le.get(enemyFightID - 1).setHp(le.get(enemyFightID - 1).getDefHp());
        if (dead == Boolean.TRUE) {
            
            fename.setText(le.get(enemyFightID).getName());
            eHpBar.setMaximum(le.get(enemyFightID).getHp());
            eHpBar.setValue(le.get(enemyFightID).getHp());
            String hp = le.get(enemyFightID).getHp().toString();
            eHpDisp.setText(hp + " / " + 
                    le.get(enemyFightID).getDefHp().toString());
            efDmg.setText(le.get(enemyFightID).getAtk().toString());
            enemyHp = le.get(enemyFightID).getHp();
            dead = Boolean.FALSE;
            
        } else {
            
            eHpBar.setValue(enemyHp);
            String hps = enemyHp.toString();
            eHpDisp.setText(hps + " / " + 
                    le.get(enemyFightID).getDefHp().toString());
            fHpDisp.setText("Hp: " + 
                    hp.toString() + " / " + ch.getHp().toString());
            
        }
        
        
    }
    
    private void q1startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q1startMouseClicked
        
        if (q1start.isEnabled() == Boolean.TRUE) {
            chF.quest(ch, 1);
            fightStart(1);
            meghiv(fight);
        }
        
    }//GEN-LAST:event_q1startMouseClicked

    private void q2startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q2startMouseClicked
        
        if (q2start.isEnabled() == Boolean.TRUE) {
            chF.quest(ch, 2);
            fightStart(2);
            meghiv(fight);
        }
        
    }//GEN-LAST:event_q2startMouseClicked

    private void q3startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q3startMouseClicked
        
        if (q3start.isEnabled() == Boolean.TRUE) {
            chF.quest(ch, 3);
            fightStart(3);
            meghiv(fight);
        }
        
    }//GEN-LAST:event_q3startMouseClicked

    private void q4startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q4startMouseClicked
        
        if (q4start.isEnabled() == Boolean.TRUE) {
            chF.quest(ch, 4);
            fightStart(4);
            meghiv(fight);
        }
        
    }//GEN-LAST:event_q4startMouseClicked

    private void q5startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q5startMouseClicked
        
        if (q5start.isEnabled() == Boolean.TRUE) {
            chF.quest(ch, 5);
            fightStart(5);
            meghiv(fight);
        }
        
    }//GEN-LAST:event_q5startMouseClicked

    private void q1pointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q1pointMouseClicked
        q1startMouseClicked(evt);
    }//GEN-LAST:event_q1pointMouseClicked

    private void q2pointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q2pointMouseClicked
        q2startMouseClicked(evt);
    }//GEN-LAST:event_q2pointMouseClicked

    private void q3pointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q3pointMouseClicked
        q3startMouseClicked(evt);
    }//GEN-LAST:event_q3pointMouseClicked

    private void q4pointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q4pointMouseClicked
        q4startMouseClicked(evt);
    }//GEN-LAST:event_q4pointMouseClicked

    private void q5pointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q5pointMouseClicked
        q5startMouseClicked(evt);
    }//GEN-LAST:event_q5pointMouseClicked

    private void cityPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityPointMouseClicked
        mashiriaBMouseClicked(evt);
    }//GEN-LAST:event_cityPointMouseClicked

    private void mashiriaBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mashiriaBMouseClicked
        
        if (mashiriaB.isEnabled() == Boolean.TRUE) {
            
            masPnl.setVisible(Boolean.FALSE);
            shiPnl.setVisible(Boolean.FALSE);
            rakuPnl.setVisible(Boolean.FALSE);
            kaePnl.setVisible(Boolean.FALSE);
            chiPnl.setVisible(Boolean.FALSE);
            shiPnl.setVisible(Boolean.FALSE);
            shiroPnl.setVisible(Boolean.FALSE);
            kuroPnl.setVisible(Boolean.FALSE);
            hiroPnl.setVisible(Boolean.FALSE);
            sheldonPnl.setVisible(Boolean.FALSE);
            
            masComp.setVisible(Boolean.FALSE);
            shiComp.setVisible(Boolean.FALSE);
            rakuComp.setVisible(Boolean.FALSE);
            kaeComp.setVisible(Boolean.FALSE);
            chiComp.setVisible(Boolean.FALSE);
            shiComp.setVisible(Boolean.FALSE);
            shiroComp.setVisible(Boolean.FALSE);
            kuroComp.setVisible(Boolean.FALSE);
            hiroComp.setVisible(Boolean.FALSE);
            
            for(npc np : npcList){
                switch (np.getVilName()){
                    case "Mashiron":
                        if (np.isComp()) mashiron.setEnabled(Boolean.FALSE);
                        break;
                    case "Kaede":
                        if (np.isComp()) kaede.setEnabled(Boolean.FALSE);
                        break;
                    case "Shiro":
                        if (np.isComp()) shiro.setEnabled(Boolean.FALSE);
                        break;
                    case "Kuro":
                        if (np.isComp()) kuro.setEnabled(Boolean.FALSE);
                        break;
                    case "Shiina":
                        if (np.isComp()) shiina.setEnabled(Boolean.FALSE);
                        break;
                    case "Hiro":
                        if (np.isComp()) hiro.setEnabled(Boolean.FALSE);
                        break;
                    case "Raku":
                        if (np.isComp()) raku.setEnabled(Boolean.FALSE);
                        break;
                    case "Chi":
                        if (np.isComp()) chi.setEnabled(Boolean.FALSE);
                        break;
                }
            }
            
            meghiv(MashiriaCity);
        }
        
    }//GEN-LAST:event_mashiriaBMouseClicked

    private void kuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuroActionPerformed
        //véletlen:cccccccc
    }//GEN-LAST:event_kuroActionPerformed

    private void sheldonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sheldonActionPerformed
        //még mindig véletlen:/
    }//GEN-LAST:event_sheldonActionPerformed

    private void travelBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelBMouseClicked
       
        sheldon.setEnabled(Boolean.TRUE);
        gameUpdate();
        meghiv(game);
        
    }//GEN-LAST:event_travelBMouseClicked

    public Integer cost = 100;
    
    private void healMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_healMouseClicked
        
        if (ch.getMoney() >= cost && ch.getHp() != hp) {
            hp = ch.getHp();
            ch.setMoney(-cost);
            cost += 50;
            heal.setText("Heal / " + cost);
            fMonDisp.setText("Money: " + ch.getMoney().toString());
            fightUpdate();
        } else {
            JOptionPane.showMessageDialog(null, "Nincs elég pénzed Healre, vagy teljes az életerőd!");
        }
        
    }//GEN-LAST:event_healMouseClicked

    public void switchQ(JPanel pnl, JButton btn){
        if (btn.isEnabled() == Boolean.TRUE) {
            
            pnl.setVisible(Boolean.TRUE);
            btn.setEnabled(Boolean.FALSE);
            
        } else if (pnl.isVisible() == Boolean.TRUE || btn.getText().contains("Sheldon")){
            
            pnl.setVisible(Boolean.FALSE);
            btn.setEnabled(Boolean.TRUE);
            
        }
    }
    
    private void mashironMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mashironMouseClicked
        if (searchComplete("Mashiron") == Boolean.FALSE && ch.getLvl() >= 30) {
            switchQ(masPnl, mashiron);
        }
    }//GEN-LAST:event_mashironMouseClicked

    private void kaedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaedeMouseClicked
        if (searchComplete("Kaede") == Boolean.FALSE && ch.getLvl() >= 15) {
            switchQ(kaePnl, kaede);
        }
    }//GEN-LAST:event_kaedeMouseClicked

    private void shiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiroMouseClicked
        if (searchComplete("Shiro") == Boolean.FALSE) {
            switchQ(shiroPnl, shiro);
        }
    }//GEN-LAST:event_shiroMouseClicked

    private void kuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kuroMouseClicked
        if (searchComplete("Kuro") == Boolean.FALSE) {
            switchQ(kuroPnl, kuro);
        }
    }//GEN-LAST:event_kuroMouseClicked

    private void shiinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiinaMouseClicked
        if (searchComplete("Shiina") == Boolean.FALSE) {
            switchQ(shiPnl, shiina);
        }
    }//GEN-LAST:event_shiinaMouseClicked

    private void hiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hiroMouseClicked
        if (searchComplete("Hiro") == Boolean.FALSE) {
            switchQ(hiroPnl, hiro);
        }
    }//GEN-LAST:event_hiroMouseClicked

    private void rakuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rakuMouseClicked
        if (searchComplete("Raku") == Boolean.FALSE && ch.getLvl() >= 45) {
            switchQ(rakuPnl, raku);
        }
    }//GEN-LAST:event_rakuMouseClicked

    private void chiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chiMouseClicked
        if (searchComplete("Chi") == Boolean.FALSE) {
            switchQ(chiPnl, chi);
        }
    }//GEN-LAST:event_chiMouseClicked

    private void sheldonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sheldonMouseClicked
        if (ch.getLvl() >= 23) {
            switchQ(sheldonPnl, sheldon);
        }
    }//GEN-LAST:event_sheldonMouseClicked

    public void searchAccept(String name, JPanel pnl, JButton btn){
        
        for (npc np : npcList){
            if (np.getVilName().contains(name)) {
                np.setAcc(Boolean.TRUE);
                pnl.setVisible(Boolean.FALSE);
                btn.setEnabled(Boolean.FALSE);
            }
        }
        
    }
    
    public Boolean searchComplete(String name){
        for (npc np : npcList) {
            if (np.getVilName().contains(name)) {
                return np.isComp();
            }
        }
        
        return Boolean.FALSE;
    }
    
    private void mashironMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mashironMouseEntered
        if (searchComplete("Mashiron") == Boolean.TRUE) {
            masComp.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_mashironMouseEntered

    private void mashironMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mashironMouseExited
        if (searchComplete("Mashiron") == Boolean.TRUE) {
            masComp.setVisible(Boolean.FALSE);
        }
    }//GEN-LAST:event_mashironMouseExited

    private void kaedeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaedeMouseEntered
        if (searchComplete("Kaede") == Boolean.TRUE) {
            kaeComp.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_kaedeMouseEntered

    private void kaedeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaedeMouseExited
        if (searchComplete("Kaede") == Boolean.TRUE) {
            kaeComp.setVisible(Boolean.FALSE);
        }
    }//GEN-LAST:event_kaedeMouseExited

    private void kuroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kuroMouseEntered
        if (searchComplete("Kuro") == Boolean.TRUE) {
            kuroComp.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_kuroMouseEntered

    private void kuroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kuroMouseExited
        if (searchComplete("Kuro") == Boolean.TRUE) {
            kuroComp.setVisible(Boolean.FALSE);
        }
    }//GEN-LAST:event_kuroMouseExited

    private void shiinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiinaMouseEntered
        if (searchComplete("Shiina") == Boolean.TRUE) {
            shiComp.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_shiinaMouseEntered

    private void shiinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiinaMouseExited
        if (searchComplete("Shiina") == Boolean.TRUE) {
            shiComp.setVisible(Boolean.FALSE);
        }
    }//GEN-LAST:event_shiinaMouseExited

    private void shiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiroMouseEntered
        if (searchComplete("Shiro") == Boolean.TRUE) {
            shiroComp.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_shiroMouseEntered

    private void shiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiroMouseExited
        if (searchComplete("Shiro") == Boolean.TRUE) {
            shiroComp.setVisible(Boolean.FALSE);
        }
    }//GEN-LAST:event_shiroMouseExited

    private void hiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hiroMouseEntered
        if (searchComplete("Hiro") == Boolean.TRUE) {
            hiroComp.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_hiroMouseEntered

    private void hiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hiroMouseExited
        if (searchComplete("Hiro") == Boolean.TRUE) {
            hiroComp.setVisible(Boolean.FALSE);
        }
    }//GEN-LAST:event_hiroMouseExited

    private void rakuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rakuMouseEntered
        if (searchComplete("Raku") == Boolean.TRUE) {
            rakuComp.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_rakuMouseEntered

    private void rakuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rakuMouseExited
        if (searchComplete("Raku") == Boolean.TRUE) {
            rakuComp.setVisible(Boolean.FALSE);
        }
    }//GEN-LAST:event_rakuMouseExited

    private void chiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chiMouseEntered
        if (searchComplete("Chi") == Boolean.TRUE) {
            chiComp.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_chiMouseEntered

    private void chiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chiMouseExited
        if (searchComplete("Chi") == Boolean.TRUE) {
            chiComp.setVisible(Boolean.FALSE);
        }
    }//GEN-LAST:event_chiMouseExited

    private void kuroAnswBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kuroAnswBMouseClicked
        qaQuest(kuroAnsw, "The Shire", 0, 1000, 0, 500, "Kuro", kuroPnl, kuro);
    }//GEN-LAST:event_kuroAnswBMouseClicked

    private void shiroAnswBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiroAnswBMouseClicked
        qaQuest(shiroAnsw, "Mount of Sep", 1500, 3000, 0, 500, "Shiro", shiroPnl, shiro);
    }//GEN-LAST:event_shiroAnswBMouseClicked

    private void rakuAnswBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rakuAnswBMouseClicked
        qaQuest(rakuAnsw, "KALKULUS", 0, 15000, 0, 15000, "Raku", rakuPnl, raku);
    }//GEN-LAST:event_rakuAnswBMouseClicked

    private void shiAccBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiAccBMouseClicked
        if (shiAccB.isEnabled() == Boolean.TRUE) {
            searchAccept("Shiina", shiPnl, shiAccB);
        }
    }//GEN-LAST:event_shiAccBMouseClicked

    private void masAccBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masAccBMouseClicked
        if (masAccB.isEnabled() == Boolean.TRUE) {
            searchAccept("Mashiron", masPnl, masAccB);
        }
    }//GEN-LAST:event_masAccBMouseClicked

    private void kaeAccBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaeAccBMouseClicked
        if (kaeAccB.isEnabled() == Boolean.TRUE) {
            searchAccept("Kaede", kaePnl, kaeAccB);
        }
    }//GEN-LAST:event_kaeAccBMouseClicked

    private void hiroAccBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hiroAccBMouseClicked
        if (hiroAccB.isEnabled() == Boolean.TRUE) {
            searchAccept("Hiro", hiroPnl, hiroAccB);
        }
    }//GEN-LAST:event_hiroAccBMouseClicked

    private void chiAccBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chiAccBMouseClicked
        if (chiAccB.isEnabled() == Boolean.TRUE) {
            searchAccept("Chi", chiPnl, chiAccB);
        }
    }//GEN-LAST:event_chiAccBMouseClicked

    private void shelChooseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shelChooseMouseClicked
        Shelli();
    }//GEN-LAST:event_shelChooseMouseClicked
    
    public void accQuest(Boolean comp, String vilname,
            Integer xpMin, Integer xpMax,
            Integer gMin, Integer gMax,
            JButton btn){
        
        for (npc np : npcList){
            if (np.getVilName().contains(vilname)) {
                if (comp == Boolean.TRUE && np.isAcc() == Boolean.TRUE) {
                    npcsave.npcQuestComplete(ch, xpMin, xpMax, gMin, gMax);
                    np.setComp(Boolean.TRUE);
                    np.setAcc(Boolean.FALSE);
                    btn.setEnabled(Boolean.FALSE);
                }  
            }
        }
    }
    
    public void qaQuest(JComboBox box, String answer,
            Integer xpMin, Integer xpMax,
            Integer gMin, Integer gMax,
            String vilname, JPanel pnl,
            JButton btn){
        
        try {
            if (box.getSelectedItem().toString().contains(answer)) {
                npcsave.npcQuestComplete(ch, xpMin, xpMax, gMin, gMax);
                for (npc np : npcList){
                    if (np.getVilName().contains(vilname)) {
                        np.setComp(Boolean.TRUE);
                    }
                }
                pnl.setVisible(Boolean.FALSE);
                btn.setEnabled(Boolean.FALSE);
            } else {
                throw new Exception();
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Nem jó válasz!");
        }
        
    }
    
    public void Shelli(){
        Random rnd = new Random();
        Integer val = shelC.getSelectedIndex() + 1;
        Integer gep = rnd.nextInt(5) + 1;
        
        try{
            switch (gep) {
            case 1:
                if (val == 2 || val == 5) {
                   winlose.setText("Nyertél");
                   npcsave.npcQuestComplete(ch, 0, 15000, 0, 15000);
                }
                else if (val == 3 || val == 4) winlose.setText("Vesztettél");
                else winlose.setText("Döntetlen");
                break;
            case 2:
                if (val == 1 || val == 5) winlose.setText("Vesztettél");
                else if (val == 3 || val == 4) {
                    winlose.setText("Nyertél");
                    npcsave.npcQuestComplete(ch, 0, 15000, 0, 15000);
                }
                else winlose.setText("Döntetlen");
                break;
            case 3:
                if (val == 1 || val == 5) {
                    winlose.setText("Nyertél");
                    npcsave.npcQuestComplete(ch, 0, 15000, 0, 15000);
                }
                else if (val == 2 || val == 4) winlose.setText("Vesztettél");
                else winlose.setText("Döntetlen");
                break;
            case 4:
                if (val == 1 || val == 3) {
                    winlose.setText("Nyertél");
                    npcsave.npcQuestComplete(ch, 0, 15000, 0, 15000);
                }
                else if (val == 2 || val == 5) winlose.setText("Vesztettél");
                else winlose.setText("Döntetlen");
                break;
            case 5:
                if (val == 1 || val == 3) winlose.setText("Vesztettél");
                else if (val == 2 || val == 5) {
                    winlose.setText("Nyertél");
                    npcsave.npcQuestComplete(ch, 0, 15000, 0, 15000);
                }
                else winlose.setText("Döntetlen");
                break;
            default:
                break;
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        } finally {
            gameUpdate();
        }
        
    }
    
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
    private javax.swing.JLabel MAP;
    private javax.swing.JPanel MashiriaCity;
    private javax.swing.JLabel alairas;
    private javax.swing.JButton atk;
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
    private javax.swing.JLabel charimg;
    private javax.swing.JButton chi;
    private javax.swing.JButton chiAccB;
    private javax.swing.JLabel chiComp;
    private javax.swing.JLabel chiName;
    private javax.swing.JPanel chiPnl;
    private javax.swing.JLabel chiQ;
    private javax.swing.JPanel choice;
    private javax.swing.JLabel cimlbl;
    private javax.swing.JPanel city;
    private javax.swing.JLabel cityName;
    private javax.swing.JButton cityPoint;
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
    private javax.swing.JPanel epnl;
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
    private javax.swing.JButton heal;
    private javax.swing.JButton hiro;
    private javax.swing.JButton hiroAccB;
    private javax.swing.JLabel hiroComp;
    private javax.swing.JLabel hiroName;
    private javax.swing.JPanel hiroPnl;
    private javax.swing.JLabel hiroQ;
    private javax.swing.JButton igsave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kaeAccB;
    private javax.swing.JLabel kaeComp;
    private javax.swing.JLabel kaeName;
    private javax.swing.JPanel kaePnl;
    private javax.swing.JLabel kaeQ;
    private javax.swing.JButton kaede;
    private javax.swing.JButton kuro;
    private javax.swing.JComboBox<String> kuroAnsw;
    private javax.swing.JButton kuroAnswB;
    private javax.swing.JLabel kuroComp;
    private javax.swing.JLabel kuroName;
    private javax.swing.JPanel kuroPnl;
    private javax.swing.JLabel kuroQ;
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
    private javax.swing.JPanel mapDisp;
    private javax.swing.JLabel mapLabel;
    private javax.swing.JLayeredPane mapLayers;
    private javax.swing.JButton masAccB;
    private javax.swing.JLabel masComp;
    private javax.swing.JLabel masName;
    private javax.swing.JPanel masPnl;
    private javax.swing.JLabel masQ;
    private javax.swing.JButton mashiriaB;
    private javax.swing.JLayeredPane mashiriaLayers;
    private javax.swing.JLabel mashiriaMap;
    private javax.swing.JButton mashiron;
    private javax.swing.JPanel newChar;
    private javax.swing.JButton newSave;
    private javax.swing.JLabel profilkep;
    private javax.swing.JPanel q1;
    private javax.swing.JLabel q1name;
    private javax.swing.JButton q1point;
    private javax.swing.JButton q1start;
    private javax.swing.JPanel q2;
    private javax.swing.JLabel q2name;
    private javax.swing.JButton q2point;
    private javax.swing.JButton q2start;
    private javax.swing.JPanel q3;
    private javax.swing.JLabel q3name;
    private javax.swing.JButton q3point;
    private javax.swing.JButton q3start;
    private javax.swing.JPanel q4;
    private javax.swing.JLabel q4name;
    private javax.swing.JButton q4point;
    private javax.swing.JButton q4start;
    private javax.swing.JPanel q5;
    private javax.swing.JLabel q5name;
    private javax.swing.JButton q5point;
    private javax.swing.JButton q5start;
    private javax.swing.JPanel quests;
    private javax.swing.JButton raku;
    private javax.swing.JComboBox<String> rakuAnsw;
    private javax.swing.JButton rakuAnswB;
    private javax.swing.JLabel rakuComp;
    private javax.swing.JLabel rakuName;
    private javax.swing.JPanel rakuPnl;
    private javax.swing.JLabel rakuQ;
    private javax.swing.JCheckBox removeAccept;
    private javax.swing.JLabel req;
    private javax.swing.JLabel req1;
    private javax.swing.JLabel req2;
    private javax.swing.JLabel req3;
    private javax.swing.JLabel req4;
    private javax.swing.JLabel sex;
    private javax.swing.JComboBox<String> shelC;
    private javax.swing.JButton shelChoose;
    private javax.swing.JLabel shelImg;
    private javax.swing.JLayeredPane shelLayer;
    private javax.swing.JLabel shelQ;
    private javax.swing.JButton sheldon;
    private javax.swing.JLabel sheldonName;
    private javax.swing.JPanel sheldonPnl;
    private javax.swing.JButton shiAccB;
    private javax.swing.JLabel shiComp;
    private javax.swing.JLabel shiName;
    private javax.swing.JPanel shiPnl;
    private javax.swing.JLabel shiQ;
    private javax.swing.JButton shiina;
    private javax.swing.JButton shiro;
    private javax.swing.JComboBox<String> shiroAnsw;
    private javax.swing.JButton shiroAnswB;
    private javax.swing.JLabel shiroComp;
    private javax.swing.JLabel shiroName;
    private javax.swing.JPanel shiroPnl;
    private javax.swing.JLabel shiroQ;
    private javax.swing.JTable tbLoad;
    private javax.swing.JButton travelB;
    private javax.swing.JTextField winlose;
    private javax.swing.JProgressBar xpBar;
    private javax.swing.JLabel xpBarDisp;
    // End of variables declaration//GEN-END:variables
}
