/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package koncertjegy;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author CsorbaEszterKatinka(
 */
public class KoncertJegy extends javax.swing.JFrame {

    int jegyAlapar = -1;
    double helySzorzo, vegsoAr;
    int extrak, dbAr;
    String koncert = "";
    
    int extraBelepesAr=0;
    int extraBarAr=0;
    int extraBeszelgetesAr=0;
    int extraAfterAr=0;
    String extraBelepes="";
    String extraBar="";
    String extraBeszelgetes="";
    String extraAfter="";
    
    //String nevExtrak="";
    String osszegzes="";
    String hely="";
    String db="";
    
    public KoncertJegy() {
        initComponents();
        
        
        jegyAlapar = 4500;
        helySzorzo = 1;
        
        //extrak=extraBelepesAr+extraBarAr+extraBeszelgetesAr+extraAfterAr;
        dbAr=1;
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlFekete = new javax.swing.JPanel();
        pnlJegyek = new javax.swing.JPanel();
        lblHely = new javax.swing.JLabel();
        rbtnKuzdoter = new javax.swing.JRadioButton();
        rbtnVip = new javax.swing.JRadioButton();
        rbtnJterasz = new javax.swing.JRadioButton();
        rbtnBterasz = new javax.swing.JRadioButton();
        pnlKoncertek = new javax.swing.JPanel();
        cmbxKoncert = new javax.swing.JComboBox<>();
        lblKoncertek = new javax.swing.JLabel();
        lblMennyiseg = new javax.swing.JLabel();
        spnrMennyiseg = new javax.swing.JSpinner();
        pnlExtrak = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbxBar = new javax.swing.JCheckBox();
        cbxAfterparty = new javax.swing.JCheckBox();
        cbxBelepes = new javax.swing.JCheckBox();
        cbxBeszelgetes = new javax.swing.JCheckBox();
        jbtnMegveszem = new javax.swing.JButton();
        jbtnMegse = new javax.swing.JButton();
        pnlLila = new javax.swing.JPanel();
        lblCim = new javax.swing.JLabel();
        lblAlcim = new javax.swing.JLabel();
        lblKep = new javax.swing.JLabel();
        pnlPiros = new javax.swing.JPanel();
        pnlElmult = new javax.swing.JPanel();
        lblElmult = new javax.swing.JLabel();
        rbtnIgen = new javax.swing.JRadioButton();
        rbtnNem = new javax.swing.JRadioButton();
        lblLink = new javax.swing.JLabel();
        lblossz = new javax.swing.JLabel();
        lblVegosszeg = new javax.swing.JLabel();
        lblFt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaKosar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KoncertjegyVásárlás");
        setBackground(new java.awt.Color(209, 253, 231));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlFekete.setBackground(new java.awt.Color(0, 0, 0));

        pnlJegyek.setBackground(new java.awt.Color(0, 0, 0));

        lblHely.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblHely.setForeground(new java.awt.Color(255, 255, 255));
        lblHely.setText("Helyjegyek:");

        buttonGroup1.add(rbtnKuzdoter);
        rbtnKuzdoter.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        rbtnKuzdoter.setForeground(new java.awt.Color(255, 255, 255));
        rbtnKuzdoter.setText("Küzdőtér");
        rbtnKuzdoter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnKuzdoter.setEnabled(false);
        rbtnKuzdoter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnKuzdoterItemStateChanged(evt);
                helyKijelolesEngedely(evt);
            }
        });

        buttonGroup1.add(rbtnVip);
        rbtnVip.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        rbtnVip.setForeground(new java.awt.Color(255, 255, 255));
        rbtnVip.setText("VIP lelátó");
        rbtnVip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnVip.setEnabled(false);
        rbtnVip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnVipItemStateChanged(evt);
                helyKijelolesEngedely(evt);
            }
        });

        buttonGroup1.add(rbtnJterasz);
        rbtnJterasz.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        rbtnJterasz.setForeground(new java.awt.Color(255, 255, 255));
        rbtnJterasz.setText("Jobb terasz");
        rbtnJterasz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnJterasz.setEnabled(false);
        rbtnJterasz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnJteraszItemStateChanged(evt);
                helyKijelolesEngedely(evt);
            }
        });

        buttonGroup1.add(rbtnBterasz);
        rbtnBterasz.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        rbtnBterasz.setForeground(new java.awt.Color(255, 255, 255));
        rbtnBterasz.setText("Bal terasz");
        rbtnBterasz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnBterasz.setEnabled(false);
        rbtnBterasz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnBteraszItemStateChanged(evt);
                helyKijelolesEngedely(evt);
            }
        });

        javax.swing.GroupLayout pnlJegyekLayout = new javax.swing.GroupLayout(pnlJegyek);
        pnlJegyek.setLayout(pnlJegyekLayout);
        pnlJegyekLayout.setHorizontalGroup(
            pnlJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJegyekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnKuzdoter)
                    .addComponent(rbtnVip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(pnlJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnBterasz)
                    .addComponent(rbtnJterasz))
                .addGap(41, 41, 41))
            .addGroup(pnlJegyekLayout.createSequentialGroup()
                .addComponent(lblHely)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlJegyekLayout.setVerticalGroup(
            pnlJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJegyekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHely)
                .addGap(18, 18, 18)
                .addGroup(pnlJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnKuzdoter)
                    .addComponent(rbtnJterasz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnBterasz)
                    .addComponent(rbtnVip))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKoncertek.setBackground(new java.awt.Color(0, 0, 0));
        pnlKoncertek.setToolTipText("");

        cmbxKoncert.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cmbxKoncert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Válassz Koncertet! -", "11. 22. - Hakumba", "11. 25. - Analóg Balaton", "11. 28. - Ivan & the Parazol", "11. 30. - Fiúk", "12. 02. - Csakneked Kislány", "12. 08. - Bohémian Betyars", "12. 15. - Hiperkarma" }));
        cmbxKoncert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbxKoncert.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbxKoncertItemStateChanged(evt);
            }
        });
        cmbxKoncert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxKoncertActionPerformed(evt);
            }
        });

        lblKoncertek.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblKoncertek.setForeground(new java.awt.Color(255, 255, 255));
        lblKoncertek.setText("Közelgő koncertek:");

        lblMennyiseg.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lblMennyiseg.setForeground(new java.awt.Color(255, 255, 255));
        lblMennyiseg.setText("Jegyek mennyisége:");

        spnrMennyiseg.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        spnrMennyiseg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spnrMennyiseg.setEnabled(false);
        spnrMennyiseg.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrMennyisegStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlKoncertekLayout = new javax.swing.GroupLayout(pnlKoncertek);
        pnlKoncertek.setLayout(pnlKoncertekLayout);
        pnlKoncertekLayout.setHorizontalGroup(
            pnlKoncertekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKoncertekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKoncertekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblKoncertek, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKoncertekLayout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(pnlKoncertekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlKoncertekLayout.createSequentialGroup()
                                .addComponent(lblMennyiseg)
                                .addGap(18, 18, 18)
                                .addComponent(spnrMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbxKoncert, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        pnlKoncertekLayout.setVerticalGroup(
            pnlKoncertekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKoncertekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKoncertek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbxKoncert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlKoncertekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMennyiseg)
                    .addComponent(spnrMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlExtrak.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Extrák:");

        cbxBar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cbxBar.setForeground(new java.awt.Color(255, 255, 255));
        cbxBar.setText("Korlátlan fogyasztás a bárban (18+)");
        cbxBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxBar.setEnabled(false);
        cbxBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBarActionPerformed(evt);
            }
        });

        cbxAfterparty.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cbxAfterparty.setForeground(new java.awt.Color(255, 255, 255));
        cbxAfterparty.setText("AfterParty részvétel (18+)");
        cbxAfterparty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxAfterparty.setEnabled(false);
        cbxAfterparty.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAfterpartyItemStateChanged(evt);
            }
        });

        cbxBelepes.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cbxBelepes.setForeground(new java.awt.Color(255, 255, 255));
        cbxBelepes.setText("Belépés kapunyitás előtt");
        cbxBelepes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxBelepes.setEnabled(false);
        cbxBelepes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxBelepesItemStateChanged(evt);
            }
        });

        cbxBeszelgetes.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cbxBeszelgetes.setForeground(new java.awt.Color(255, 255, 255));
        cbxBeszelgetes.setText("Rövid beszélgetés a zenekarokkal");
        cbxBeszelgetes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxBeszelgetes.setEnabled(false);
        cbxBeszelgetes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxBeszelgetesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlExtrakLayout = new javax.swing.GroupLayout(pnlExtrak);
        pnlExtrak.setLayout(pnlExtrakLayout);
        pnlExtrakLayout.setHorizontalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(pnlExtrakLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxBeszelgetes)
                            .addComponent(cbxBelepes)
                            .addComponent(cbxBar)
                            .addComponent(cbxAfterparty))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlExtrakLayout.setVerticalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxBelepes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxBeszelgetes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxAfterparty)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jbtnMegveszem.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jbtnMegveszem.setText("Megveszem");
        jbtnMegveszem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnMegveszemMouseClicked(evt);
            }
        });

        jbtnMegse.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jbtnMegse.setText("Mégse");
        jbtnMegse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnMegseMouseClicked(evt);
            }
        });

        pnlLila.setBackground(new java.awt.Color(156, 32, 143));

        lblCim.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lblCim.setForeground(new java.awt.Color(255, 255, 255));
        lblCim.setText("Téged is vár a Koncert Kert!");

        lblAlcim.setBackground(new java.awt.Color(255, 255, 255));
        lblAlcim.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lblAlcim.setForeground(new java.awt.Color(255, 255, 255));
        lblAlcim.setText("Vásárolj koncertjegyeket online!");

        lblKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koncertjegy/kepek/Performance-Venue2.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlLilaLayout = new javax.swing.GroupLayout(pnlLila);
        pnlLila.setLayout(pnlLilaLayout);
        pnlLilaLayout.setHorizontalGroup(
            pnlLilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLilaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addGroup(pnlLilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCim)
                    .addComponent(lblAlcim))
                .addContainerGap())
        );
        pnlLilaLayout.setVerticalGroup(
            pnlLilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLilaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlcim)
                .addGap(23, 23, 23))
            .addGroup(pnlLilaLayout.createSequentialGroup()
                .addComponent(lblKep)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlPiros.setBackground(new java.awt.Color(204, 0, 0));

        pnlElmult.setBackground(new java.awt.Color(204, 0, 0));
        pnlElmult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblElmult.setBackground(new java.awt.Color(255, 255, 255));
        lblElmult.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblElmult.setForeground(new java.awt.Color(255, 255, 255));
        lblElmult.setText("Elmúltál már 18 éves?");

        buttonGroup2.add(rbtnIgen);
        rbtnIgen.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        rbtnIgen.setForeground(new java.awt.Color(255, 255, 255));
        rbtnIgen.setText("Igen");
        rbtnIgen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnIgen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnIgenItemStateChanged(evt);
            }
        });

        buttonGroup2.add(rbtnNem);
        rbtnNem.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        rbtnNem.setForeground(new java.awt.Color(255, 255, 255));
        rbtnNem.setSelected(true);
        rbtnNem.setText("Nem");
        rbtnNem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnNem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnNemItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlElmultLayout = new javax.swing.GroupLayout(pnlElmult);
        pnlElmult.setLayout(pnlElmultLayout);
        pnlElmultLayout.setHorizontalGroup(
            pnlElmultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlElmultLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblElmult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnIgen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnNem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlElmultLayout.setVerticalGroup(
            pnlElmultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlElmultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlElmultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElmult)
                    .addComponent(rbtnIgen)
                    .addComponent(rbtnNem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPirosLayout = new javax.swing.GroupLayout(pnlPiros);
        pnlPiros.setLayout(pnlPirosLayout);
        pnlPirosLayout.setHorizontalGroup(
            pnlPirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPirosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlElmult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        pnlPirosLayout.setVerticalGroup(
            pnlPirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPirosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlElmult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblLink.setForeground(new java.awt.Color(255, 255, 255));
        lblLink.setText("<html><a href=\"link\"> További információ a szabályzatunkról</a></html>");

        lblossz.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lblossz.setForeground(new java.awt.Color(255, 255, 255));
        lblossz.setText("Végösszeg: ");

        lblVegosszeg.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblVegosszeg.setForeground(new java.awt.Color(255, 255, 255));
        lblVegosszeg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVegosszeg.setText("0");

        lblFt.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblFt.setForeground(new java.awt.Color(255, 255, 255));
        lblFt.setText("Ft");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Kosaram: ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtaKosar.setColumns(20);
        txtaKosar.setRows(5);
        jScrollPane2.setViewportView(txtaKosar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFeketeLayout = new javax.swing.GroupLayout(pnlFekete);
        pnlFekete.setLayout(pnlFeketeLayout);
        pnlFeketeLayout.setHorizontalGroup(
            pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnlPiros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFeketeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlExtrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlKoncertek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFeketeLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFeketeLayout.createSequentialGroup()
                                .addComponent(lblossz)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFeketeLayout.createSequentialGroup()
                                .addComponent(jbtnMegveszem)
                                .addGap(9, 9, 9)))
                        .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlFeketeLayout.createSequentialGroup()
                                .addComponent(lblVegosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFt))
                            .addComponent(jbtnMegse))
                        .addGap(33, 33, 33))
                    .addGroup(pnlFeketeLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pnlJegyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlFeketeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFeketeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        pnlFeketeLayout.setVerticalGroup(
            pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeketeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pnlLila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFeketeLayout.createSequentialGroup()
                        .addComponent(pnlKoncertek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(pnlExtrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFeketeLayout.createSequentialGroup()
                        .addComponent(pnlJegyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblossz)
                    .addComponent(lblVegosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMegveszem)
                    .addComponent(jbtnMegse))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFekete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlFekete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxKoncertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxKoncertActionPerformed
        
        int koncertIndex = cmbxKoncert.getSelectedIndex();
        
        if (koncertIndex == 0){
            jegyAlapar = 0;
            rbtnKuzdoter.setEnabled(false);
            rbtnBterasz.setEnabled(false);
            rbtnJterasz.setEnabled(false);
            rbtnVip.setEnabled(false);
            spnrMennyiseg.setEnabled(false);
//            cbxBelepes.setEnabled(false);
//            cbxBeszelgetes.setEnabled(false);
//            cbxAfterparty.setEnabled(false);
        }else if ((koncertIndex == 1)||(koncertIndex == 2)||(koncertIndex == 3)||(koncertIndex == 4)){
            jegyAlapar = 4500;
            rbtnKuzdoter.setEnabled(true);
            rbtnBterasz.setEnabled(true);
            rbtnJterasz.setEnabled(true);
            rbtnVip.setEnabled(true);
            spnrMennyiseg.setEnabled(true);
//            cbxBelepes.setEnabled(true);
//            cbxBeszelgetes.setEnabled(true);
//            if (rbtnNem.isSelected()){
//                cbxBar.setEnabled(false);
//                cbxAfterparty.setEnabled(false);
//            }else {
//                cbxBar.setEnabled(true);
//                cbxAfterparty.setEnabled(true);
//        }
        }else if ((koncertIndex == 5)||(koncertIndex == 6)||(koncertIndex == 7)){
            jegyAlapar = 6500;
            rbtnKuzdoter.setEnabled(true);
            rbtnBterasz.setEnabled(true);
            rbtnJterasz.setEnabled(true);
            rbtnVip.setEnabled(true);
            spnrMennyiseg.setEnabled(true);
//            cbxBelepes.setEnabled(true);
//            cbxBeszelgetes.setEnabled(true);
//            if (rbtnNem.isSelected()){
//                cbxBar.setEnabled(false);
//                cbxAfterparty.setEnabled(false);
//            }else {
//                cbxBar.setEnabled(true);
//                cbxAfterparty.setEnabled(true);
//        }
        }
        
        
        osszegzesKiirasKosar();
        osszegzesKiirasVegosszeg();
        
//        szamitasKiirasKosar(){
//            vegsoAr = jegyAlapar + helySzorzo + extrak;
//            vegsoAr =* db;
//        
//            txtaKosar.setText(vegsoAr + "");
//        }
//    
        
        
    }//GEN-LAST:event_cmbxKoncertActionPerformed

//    private void extrakSzamitasa() {
//        int extraBelepesAr=0;
//        int extraBarAr=0;
//        int extraBeszelgetesAr=0;
//        int extraAfterAr=0;
//        extrak=extraBelepesAr+extraBarAr+extraBeszelgetesAr+extraAfterAr;
//    }
//    
//   
    private void jbtnMegseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnMegseMouseClicked
        System.exit(0); 
    }//GEN-LAST:event_jbtnMegseMouseClicked

    private void jbtnMegveszemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnMegveszemMouseClicked
        int ikonTipus = JOptionPane.INFORMATION_MESSAGE; //
        JOptionPane.showMessageDialog(null, "Köszönjük a vásárlást!"+System.lineSeparator()+"A jegyedet a korábban megadott e-mail címedere elküldtük!"+System.lineSeparator()+"Hamarosan találkozunk!", "Jegyvásárlás visszaigazolása", 1);
        System.exit(0);
    }//GEN-LAST:event_jbtnMegveszemMouseClicked

    private void rbtnIgenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnIgenItemStateChanged
        
//        if (rbtnIgen.isSelected()){
//            cbxBar.setEnabled(true);
//            cbxAfterparty.setEnabled(true);
//        }else {
//            cbxBar.setEnabled(false);
//            cbxAfterparty.setEnabled(false);
//        }
        
    }//GEN-LAST:event_rbtnIgenItemStateChanged

    private void rbtnNemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnNemItemStateChanged
        
//        if (rbtnNem.isSelected()){
//            cbxBar.setEnabled(false);
//            cbxAfterparty.setEnabled(false);
//        }else {
//            cbxBar.setEnabled(true);
//            cbxAfterparty.setEnabled(true);
//        }
//        
    }//GEN-LAST:event_rbtnNemItemStateChanged

    private void rbtnKuzdoterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnKuzdoterItemStateChanged
        helySzorzo = 1;
        
//        String kuzdoter = "";
//        String kuzdoterValaszt=rbtnKuzdoter.getModel().getSelectedItem().toString();
//        kuzdoter = kuzdoterValaszt;
        
        //String hely = "";

        if (rbtnKuzdoter.isSelected()){
           
            hely = "Küzdőtér";
       
        }else {
            hely = "";
        }
        
//        if (rbtnKuzdoter.isEnabled()){
//            cbxBelepes.setEnabled(true);
//            cbxBeszelgetes.setEnabled(true);
//            if (rbtnNem.isSelected()){
//                cbxBar.setEnabled(false);
//                cbxAfterparty.setEnabled(false);
//            }else {
//                cbxBar.setEnabled(true);
//                cbxAfterparty.setEnabled(true);
//            }
//        }else{
//            cbxBelepes.setEnabled(false);
//            cbxBeszelgetes.setEnabled(false);
//        }
        

        //txtaKosar.setText("Hely: " + hely);
        osszegzesKiirasKosar();
        osszegzesKiirasVegosszeg();
    }//GEN-LAST:event_rbtnKuzdoterItemStateChanged

    private void spnrMennyisegStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrMennyisegStateChanged
        
      
        
        int mennyiseg=0;
        mennyiseg=spnrMennyiseg.getModel().getValue().hashCode();
        db=" - "+mennyiseg+" db";
        dbAr=mennyiseg;
        
        //dbAr=(int)spnrMennyiseg.getValue();
        
        //dbAr=jegyAlapar*mennyiseg;
       
        
       
        
        //txtaKosar.setText("Jegy db: " + (mennyiseg));
        
        // MEGKERESNI hogy double helyett int legyen, de jól és hogy hogyan !!!!!!
        osszegzesKiirasKosar();
        osszegzesKiirasVegosszeg();
    }//GEN-LAST:event_spnrMennyisegStateChanged

    private void cbxBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBarActionPerformed
        
        if (cbxBar.isSelected()){
            extraBar=System.lineSeparator()+"Korlátlan italfogyasztás a bárban (18+)";
            extraBarAr+=5000;
        }else{
            extraBar="";
            extraBarAr-=5000;
        }
        
    osszegzesKiirasKosar();        
    osszegzesKiirasVegosszeg();    
    }//GEN-LAST:event_cbxBarActionPerformed

    private void cmbxKoncertItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbxKoncertItemStateChanged
        
        //String koncert = "";
        String koncertValaszt=cmbxKoncert.getModel().getSelectedItem().toString();
        koncert = koncertValaszt;
        
        //txtaKosar.setText("Koncert: " + koncert);
        osszegzesKiirasKosar();
        osszegzesKiirasVegosszeg();
    }//GEN-LAST:event_cmbxKoncertItemStateChanged

    private void rbtnJteraszItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnJteraszItemStateChanged
        helySzorzo=1.25;
        
        //String hely = "";

        if (rbtnJterasz.isSelected()){
           
            hely = "Jobb terasz";
       
        }else {
            hely = "";
        }
        
//        if (rbtnJterasz.isEnabled()){
//            cbxBelepes.setEnabled(true);
//            cbxBeszelgetes.setEnabled(true);
//            if (rbtnNem.isSelected()){
//                cbxBar.setEnabled(false);
//                cbxAfterparty.setEnabled(false);
//            }else {
//                cbxBar.setEnabled(true);
//                cbxAfterparty.setEnabled(true);
//            }
//        }else{
//            cbxBelepes.setEnabled(false);
//            cbxBeszelgetes.setEnabled(false);
//        }

        //txtaKosar.setText("Hely: " + hely);
        osszegzesKiirasKosar();
        osszegzesKiirasVegosszeg();
    }//GEN-LAST:event_rbtnJteraszItemStateChanged

    private void rbtnVipItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnVipItemStateChanged
        helySzorzo=2;
        //String hely = "";

        if (rbtnVip.isSelected()){
           
            hely = "VIP lelátó";
       
        }else {
            hely = "";
        }
        
//        if (rbtnVip.isEnabled()){
//            cbxBelepes.setEnabled(true);
//            cbxBeszelgetes.setEnabled(true);
//            if (rbtnNem.isSelected()){
//                cbxBar.setEnabled(false);
//                cbxAfterparty.setEnabled(false);
//            }else {
//                cbxBar.setEnabled(true);
//                cbxAfterparty.setEnabled(true);
//            }
//        }else{
//            cbxBelepes.setEnabled(false);
//            cbxBeszelgetes.setEnabled(false);
//        }
        
        //txtaKosar.setText("Hely: " + hely);
        osszegzesKiirasKosar();
        osszegzesKiirasVegosszeg();
    }//GEN-LAST:event_rbtnVipItemStateChanged

    private void rbtnBteraszItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnBteraszItemStateChanged
        helySzorzo=1.25;
        //String hely = "";

        if (rbtnBterasz.isSelected()){
           
            hely = "Bal terasz";
       
        }else {
            hely = "";
        }
        
//        if (rbtnBterasz.isEnabled()){
//            cbxBelepes.setEnabled(true);
//            cbxBeszelgetes.setEnabled(true);
//            if (rbtnNem.isSelected()){
//                cbxBar.setEnabled(false);
//                cbxAfterparty.setEnabled(false);
//            }else {
//                cbxBar.setEnabled(true);
//                cbxAfterparty.setEnabled(true);
//            }
//        }else{
//            cbxBelepes.setEnabled(false);
//            cbxBeszelgetes.setEnabled(false);
//        }

        //txtaKosar.setText("Hely: " + hely);
        osszegzesKiirasKosar();
        osszegzesKiirasVegosszeg();
    }//GEN-LAST:event_rbtnBteraszItemStateChanged

    private void cbxBelepesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxBelepesItemStateChanged
        
        if (cbxBelepes.isSelected()){
            extraBelepes=System.lineSeparator()+"Belépés a kapunyitás előtt";
            extraBelepesAr+=1500;
        }else{
            extraBelepes="";
            extraBelepesAr-=1500;
        }
        
    osszegzesKiirasKosar();
    osszegzesKiirasVegosszeg();
    }//GEN-LAST:event_cbxBelepesItemStateChanged

    private void cbxBeszelgetesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxBeszelgetesItemStateChanged
        
        if (cbxBeszelgetes.isSelected()){
            extraBeszelgetes=System.lineSeparator()+"Rövid beszélgetés a zenekarokkal";
            extraBeszelgetesAr+=3000;
        }else{
            extraBeszelgetes="";
            extraBeszelgetesAr-=3000;
        }
        
    osszegzesKiirasKosar();        
    osszegzesKiirasVegosszeg();    
        
    }//GEN-LAST:event_cbxBeszelgetesItemStateChanged

    private void cbxAfterpartyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxAfterpartyItemStateChanged
        
        if (cbxAfterparty.isSelected()){
            extraAfter=System.lineSeparator()+"AfterParty-n való részvétel (18+)";
            extraAfterAr+=8000;
        }else{
            extraAfter="";
            extraAfterAr-=8000;
        }
        
    osszegzesKiirasKosar();    
    osszegzesKiirasVegosszeg();
    }//GEN-LAST:event_cbxAfterpartyItemStateChanged

    private void helyKijelolesEngedely(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_helyKijelolesEngedely
        
        JRadioButton rbt = (JRadioButton) evt.getSource();
        
        if (rbt.isEnabled()){
            cbxBelepes.setEnabled(true);
            cbxBeszelgetes.setEnabled(true);
            elmultalMar18();
        }else{
            cbxBelepes.setEnabled(false);
            cbxBeszelgetes.setEnabled(false);
            elmultalMar18();
        }
        
        
        
    }//GEN-LAST:event_helyKijelolesEngedely

    private void elmultalMar18() {
        if (rbtnNem.isSelected()){
            cbxBar.setEnabled(false);
            cbxAfterparty.setEnabled(false);
        }else {
            cbxBar.setEnabled(true);
            cbxAfterparty.setEnabled(true);
        }
    }

    
    private void osszegzesKiirasKosar(){
        String kiKoncert="Választott koncert: "+System.lineSeparator()+koncert+db;
        osszegzes=kiKoncert+System.lineSeparator()+"Hely: "+hely+System.lineSeparator()+"Extrák: "+System.lineSeparator()+extraBelepes+extraBar+extraBeszelgetes+extraAfter;
        txtaKosar.setText(osszegzes);
    }
    
    private void osszegzesKiirasVegosszeg(){
        extrak=extraBelepesAr+extraBarAr+extraBeszelgetesAr+extraAfterAr;
        vegsoAr=jegyAlapar*helySzorzo+extrak;
        vegsoAr*=dbAr;
        System.out.println(vegsoAr);
        lblVegosszeg.setText(vegsoAr+"");
    }
            
    
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
            java.util.logging.Logger.getLogger(KoncertJegy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KoncertJegy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KoncertJegy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KoncertJegy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KoncertJegy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbxAfterparty;
    private javax.swing.JCheckBox cbxBar;
    private javax.swing.JCheckBox cbxBelepes;
    private javax.swing.JCheckBox cbxBeszelgetes;
    private javax.swing.JComboBox<String> cmbxKoncert;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnMegse;
    private javax.swing.JButton jbtnMegveszem;
    private javax.swing.JLabel lblAlcim;
    private javax.swing.JLabel lblCim;
    private javax.swing.JLabel lblElmult;
    private javax.swing.JLabel lblFt;
    private javax.swing.JLabel lblHely;
    private javax.swing.JLabel lblKep;
    private javax.swing.JLabel lblKoncertek;
    private javax.swing.JLabel lblLink;
    private javax.swing.JLabel lblMennyiseg;
    private javax.swing.JLabel lblVegosszeg;
    private javax.swing.JLabel lblossz;
    private javax.swing.JPanel pnlElmult;
    private javax.swing.JPanel pnlExtrak;
    private javax.swing.JPanel pnlFekete;
    private javax.swing.JPanel pnlJegyek;
    private javax.swing.JPanel pnlKoncertek;
    private javax.swing.JPanel pnlLila;
    private javax.swing.JPanel pnlPiros;
    private javax.swing.JRadioButton rbtnBterasz;
    private javax.swing.JRadioButton rbtnIgen;
    private javax.swing.JRadioButton rbtnJterasz;
    private javax.swing.JRadioButton rbtnKuzdoter;
    private javax.swing.JRadioButton rbtnNem;
    private javax.swing.JRadioButton rbtnVip;
    private javax.swing.JSpinner spnrMennyiseg;
    private javax.swing.JTextArea txtaKosar;
    // End of variables declaration//GEN-END:variables
}
