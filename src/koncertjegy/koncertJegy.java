/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package koncertjegy;

import javax.swing.JOptionPane;

/**
 *
 * @author CsorbaEszterKatinka(
 */
public class KoncertJegy extends javax.swing.JFrame {

    int jegyAlapar = 1;
    double helySzorzo, vegsoAr;
    int extrak, db;
    
    public KoncertJegy() {
        initComponents();
        
        helySzorzo = 1;
        jegyAlapar = 0;
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
        lblKosar = new javax.swing.JLabel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaKosar = new javax.swing.JTextArea();
        pnlPiros = new javax.swing.JPanel();
        pnlElmult = new javax.swing.JPanel();
        lblElmult = new javax.swing.JLabel();
        rbtnIgen = new javax.swing.JRadioButton();
        rbtnNem = new javax.swing.JRadioButton();
        lblLink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KoncertjegyVásárlás");
        setBackground(new java.awt.Color(209, 253, 231));

        pnlFekete.setBackground(new java.awt.Color(0, 0, 0));

        pnlJegyek.setBackground(new java.awt.Color(0, 0, 0));

        lblHely.setForeground(new java.awt.Color(255, 255, 255));
        lblHely.setText("Helyjegyek:");

        buttonGroup1.add(rbtnKuzdoter);
        rbtnKuzdoter.setForeground(new java.awt.Color(255, 255, 255));
        rbtnKuzdoter.setText("Küzdőtér");
        rbtnKuzdoter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnKuzdoterItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtnVip);
        rbtnVip.setForeground(new java.awt.Color(255, 255, 255));
        rbtnVip.setText("VIP lelátó");
        rbtnVip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnVipItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtnJterasz);
        rbtnJterasz.setForeground(new java.awt.Color(255, 255, 255));
        rbtnJterasz.setText("Jobb terasz");
        rbtnJterasz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnJteraszItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtnBterasz);
        rbtnBterasz.setForeground(new java.awt.Color(255, 255, 255));
        rbtnBterasz.setText("Bal terasz");
        rbtnBterasz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnBteraszItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlJegyekLayout = new javax.swing.GroupLayout(pnlJegyek);
        pnlJegyek.setLayout(pnlJegyekLayout);
        pnlJegyekLayout.setHorizontalGroup(
            pnlJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJegyekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJegyekLayout.createSequentialGroup()
                        .addComponent(lblHely)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJegyekLayout.createSequentialGroup()
                        .addGroup(pnlJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnKuzdoter)
                            .addComponent(rbtnVip))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(pnlJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnBterasz)
                            .addComponent(rbtnJterasz))
                        .addGap(41, 41, 41))))
        );
        pnlJegyekLayout.setVerticalGroup(
            pnlJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJegyekLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblHely)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        cmbxKoncert.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        cmbxKoncert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Válasszon Koncertet! -", "11. 20. - Hakumba", "11. 21. - Analóg Balaton", "11. 22. - Ivan & the Parazol", "11. 23. - Fiúk", "11. 24. - Csakneked Kislány", "11. 25. - Bohémian Betyars", "11. 26. - Hiperkarma" }));
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

        lblKoncertek.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        lblKoncertek.setForeground(new java.awt.Color(255, 255, 255));
        lblKoncertek.setText("Közelgő koncertek:");

        lblMennyiseg.setForeground(new java.awt.Color(255, 255, 255));
        lblMennyiseg.setText("Jegyek mennyisége:");

        spnrMennyiseg.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        spnrMennyiseg.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrMennyisegStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlKoncertekLayout = new javax.swing.GroupLayout(pnlKoncertek);
        pnlKoncertek.setLayout(pnlKoncertekLayout);
        pnlKoncertekLayout.setHorizontalGroup(
            pnlKoncertekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKoncertekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKoncertekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbxKoncert, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlKoncertekLayout.createSequentialGroup()
                        .addComponent(lblKoncertek)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlKoncertekLayout.createSequentialGroup()
                        .addComponent(lblMennyiseg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(spnrMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

        lblKosar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblKosar.setForeground(new java.awt.Color(255, 255, 255));
        lblKosar.setText("Kosaram:");

        pnlExtrak.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Extrák:");

        cbxBar.setForeground(new java.awt.Color(255, 255, 255));
        cbxBar.setText("Korlátlan fogyasztás a bárban (18+)");
        cbxBar.setEnabled(false);
        cbxBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBarActionPerformed(evt);
            }
        });

        cbxAfterparty.setForeground(new java.awt.Color(255, 255, 255));
        cbxAfterparty.setText("AfterParty részvétel (18+)");
        cbxAfterparty.setEnabled(false);

        cbxBelepes.setForeground(new java.awt.Color(255, 255, 255));
        cbxBelepes.setText("Belépés kapunyitás előtt");

        cbxBeszelgetes.setForeground(new java.awt.Color(255, 255, 255));
        cbxBeszelgetes.setText("Rövid beszélgetés a zenekarokkal");

        javax.swing.GroupLayout pnlExtrakLayout = new javax.swing.GroupLayout(pnlExtrak);
        pnlExtrak.setLayout(pnlExtrakLayout);
        pnlExtrakLayout.setHorizontalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlExtrakLayout.createSequentialGroup()
                        .addComponent(cbxBeszelgetes)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlExtrakLayout.createSequentialGroup()
                        .addGroup(pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxBelepes)
                            .addComponent(cbxBar)
                            .addComponent(cbxAfterparty)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        jbtnMegveszem.setText("Megveszem");
        jbtnMegveszem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnMegveszemMouseClicked(evt);
            }
        });

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
                .addComponent(lblKep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCim, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAlcim, javax.swing.GroupLayout.Alignment.TRAILING))
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

        txtaKosar.setColumns(20);
        txtaKosar.setRows(5);
        jScrollPane2.setViewportView(txtaKosar);

        pnlPiros.setBackground(new java.awt.Color(204, 0, 0));

        pnlElmult.setBackground(new java.awt.Color(204, 0, 0));
        pnlElmult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblElmult.setBackground(new java.awt.Color(255, 255, 255));
        lblElmult.setForeground(new java.awt.Color(255, 255, 255));
        lblElmult.setText("Elmúltál már 18 éves?");

        buttonGroup2.add(rbtnIgen);
        rbtnIgen.setForeground(new java.awt.Color(255, 255, 255));
        rbtnIgen.setText("Igen");
        rbtnIgen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnIgenItemStateChanged(evt);
            }
        });

        buttonGroup2.add(rbtnNem);
        rbtnNem.setForeground(new java.awt.Color(255, 255, 255));
        rbtnNem.setSelected(true);
        rbtnNem.setText("Nem");
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
                .addContainerGap()
                .addComponent(lblElmult)
                .addGap(18, 18, 18)
                .addComponent(rbtnIgen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnNem)
                .addContainerGap(20, Short.MAX_VALUE))
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
            .addGroup(pnlPirosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlElmult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblLink.setForeground(new java.awt.Color(255, 255, 255));
        lblLink.setText("További információ a szabályzatunkról");

        javax.swing.GroupLayout pnlFeketeLayout = new javax.swing.GroupLayout(pnlFekete);
        pnlFekete.setLayout(pnlFeketeLayout);
        pnlFeketeLayout.setHorizontalGroup(
            pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnlPiros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFeketeLayout.createSequentialGroup()
                .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFeketeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlLila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFeketeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFeketeLayout.createSequentialGroup()
                                .addComponent(lblLink)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnMegveszem)
                                .addGap(26, 26, 26)
                                .addComponent(jbtnMegse)
                                .addGap(33, 33, 33))
                            .addGroup(pnlFeketeLayout.createSequentialGroup()
                                .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pnlExtrak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlFeketeLayout.createSequentialGroup()
                                        .addComponent(pnlKoncertek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(78, 78, 78)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlJegyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKosar))
                                .addGap(0, 15, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlFeketeLayout.setVerticalGroup(
            pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeketeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlJegyek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlKoncertek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFeketeLayout.createSequentialGroup()
                        .addComponent(lblKosar)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlExtrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFeketeLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnlFeketeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnMegse)
                            .addComponent(jbtnMegveszem))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFeketeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLink)
                        .addGap(16, 16, 16))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFekete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFekete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxKoncertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxKoncertActionPerformed
        
        int koncertIndex = cmbxKoncert.getSelectedIndex();
        
        if (koncertIndex == 0){
            jegyAlapar = 0;
        }else if ((koncertIndex == 1)||(koncertIndex == 2)||(koncertIndex == 3)){
            jegyAlapar = 4500;
        }else if ((koncertIndex == 4)||(koncertIndex == 5)){
            jegyAlapar = 6500;
        }
        
//        szamitasKiirasKosar(){
//            vegsoAr = jegyAlapar + helySzorzo + extrak;
//            vegsoAr =* db;
//        
//            txtaKosar.setText(vegsoAr + "");
//        }
//    
        
        
    }//GEN-LAST:event_cmbxKoncertActionPerformed

    private void jbtnMegseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnMegseMouseClicked
        System.exit(0); 
    }//GEN-LAST:event_jbtnMegseMouseClicked

    private void jbtnMegveszemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnMegveszemMouseClicked
        int ikonTipus = JOptionPane.INFORMATION_MESSAGE; //
        JOptionPane.showMessageDialog(rootPane, "A jegyedet a korábban megadott e-mail címedere elküldtük!", "Jegyvásárlás", 1);
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
        
        if (rbtnNem.isSelected()){
            cbxBar.setEnabled(false);
            cbxAfterparty.setEnabled(false);
        }else {
            cbxBar.setEnabled(true);
            cbxAfterparty.setEnabled(true);
        }
        
    }//GEN-LAST:event_rbtnNemItemStateChanged

    private void rbtnKuzdoterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnKuzdoterItemStateChanged
        helySzorzo = 1;
        
//        String kuzdoter = "";
//        String kuzdoterValaszt=rbtnKuzdoter.getModel().getSelectedItem().toString();
//        kuzdoter = kuzdoterValaszt;
        
        String hely = "";

        if (rbtnKuzdoter.isSelected()){
           
            hely = "Küzdőtér";
       
        }else {
            hely = "";
        }
        

        txtaKosar.setText("Hely: " + hely);
        
    }//GEN-LAST:event_rbtnKuzdoterItemStateChanged

    private void spnrMennyisegStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrMennyisegStateChanged
        
      
        
        int mennyiseg=0;
        mennyiseg=spnrMennyiseg.getModel().getValue().hashCode();
       
        
       
        
        txtaKosar.setText("Jegy db: " + (mennyiseg));
        
        // MEGKERESNI hogy double helyett int legyen, de jól és hogy hogyan !!!!!!
        
    }//GEN-LAST:event_spnrMennyisegStateChanged

    private void cbxBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBarActionPerformed

    private void cmbxKoncertItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbxKoncertItemStateChanged
        
        String koncert = "";
        String koncertValaszt=cmbxKoncert.getModel().getSelectedItem().toString();
        koncert = koncertValaszt;
        
        txtaKosar.setText("Koncert: " + koncert);
        
    }//GEN-LAST:event_cmbxKoncertItemStateChanged

    private void rbtnJteraszItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnJteraszItemStateChanged
        
        String hely = "";

        if (rbtnJterasz.isSelected()){
           
            hely = "Jobb terasz";
       
        }else {
            hely = "";
        }
        

        txtaKosar.setText("Hely: " + hely);
        
    }//GEN-LAST:event_rbtnJteraszItemStateChanged

    private void rbtnVipItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnVipItemStateChanged
        
        String hely = "";

        if (rbtnVip.isSelected()){
           
            hely = "VIP lelátó";
       
        }else {
            hely = "";
        }
        

        txtaKosar.setText("Hely: " + hely);
        
    }//GEN-LAST:event_rbtnVipItemStateChanged

    private void rbtnBteraszItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnBteraszItemStateChanged
        
        String hely = "";

        if (rbtnBterasz.isSelected()){
           
            hely = "Bal terasz";
       
        }else {
            hely = "";
        }
        

        txtaKosar.setText("Hely: " + hely);
        
    }//GEN-LAST:event_rbtnBteraszItemStateChanged

    
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnMegse;
    private javax.swing.JButton jbtnMegveszem;
    private javax.swing.JLabel lblAlcim;
    private javax.swing.JLabel lblCim;
    private javax.swing.JLabel lblElmult;
    private javax.swing.JLabel lblHely;
    private javax.swing.JLabel lblKep;
    private javax.swing.JLabel lblKoncertek;
    private javax.swing.JLabel lblKosar;
    private javax.swing.JLabel lblLink;
    private javax.swing.JLabel lblMennyiseg;
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
