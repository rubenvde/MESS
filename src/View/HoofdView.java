/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DatabaseManager;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author koray
 */
public class HoofdView extends javax.swing.JFrame {
    
    private DatabaseManager dm;
    private String nieuwGekozen;
    private String geselecteerdeVak;
    private String gekozenTabel;
    private String gekozenAttribuut;
    private JTable selectie;
    
    /**
     * Creates new form HoofdView
     */
    public HoofdView() {
        super("International MESS");
        dm = new DatabaseManager();
        initComponents();
        genereerTabelNamenInComboBox();

        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_selecteer_tabel = new javax.swing.JLabel();
        jComboBox_attribuut = new javax.swing.JComboBox();
        jLabel_selecteer_attribuut = new javax.swing.JLabel();
        jComboBox_tabel = new javax.swing.JComboBox();
        zoekveld = new javax.swing.JTextField();
        jLabel_zoekveld = new javax.swing.JLabel();
        jLabel_titel = new javax.swing.JLabel();
        jLabel_toevoegen = new javax.swing.JLabel();
        jComboBox_nieuw = new javax.swing.JComboBox();
        jButton_zoeken = new javax.swing.JButton();
        jButton_nieuw = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_verwijderen = new javax.swing.JButton();
        jButton_wijzigen = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_resultaat = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel_inschrijven = new javax.swing.JLabel();
        jButton_inschrijven = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 820));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1096, 804));
        //jPanel1.setSize(1096, 804);

        jLabel_selecteer_tabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_selecteer_tabel.setText("Selecteer tabel:");

        jComboBox_attribuut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_attribuutActionPerformed(evt);
            }
        });

        jLabel_selecteer_attribuut.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_selecteer_attribuut.setText("Selecteer attribuut:");

        jComboBox_tabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_tabelActionPerformed(evt);
            }
        });

        jLabel_zoekveld.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_zoekveld.setText("Zoekveld:");

        jLabel_titel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel_titel.setText("Welkom bij International MESS");

        jLabel_toevoegen.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_toevoegen.setText("Toevoegen:");

        jComboBox_nieuw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_nieuwActionPerformed(evt);
            }
        });

        jButton_zoeken.setText("Zoeken");
        jButton_zoeken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_zoekenActionPerformed(evt);
            }
        });

        jButton_nieuw.setText("Nieuw");
        jButton_nieuw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nieuwActionPerformed(evt);
            }
        });

        jButton_verwijderen.setText("Verwijderen");
        jButton_verwijderen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_verwijderenActionPerformed(evt);
            }
        });

        jButton_wijzigen.setText("Wijzigen");
        jButton_wijzigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_wijzigenActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        DatabaseManager dm = new DatabaseManager();
        /*
        try{
            jTable_resultaat.setModel(dm.selectEntity(gekozenTabl2, "", ""));
        }catch(Exception e){
            System.out.println("Fout bij de constructie jTable_resultaat");
            e.printStackTrace();
        }
        */
        jTable_resultaat.setAutoCreateRowSorter(true);
        /*
        jTable_resultaat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable_resultaat.setForeground(new java.awt.Color(255, 255, 255));
        jTable_resultaat.setModel(null);
        */
        jTable_resultaat.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable_resultaat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable_resultaat.setEditingColumn(0);
        jTable_resultaat.setEditingRow(0);
        jTable_resultaat.setGridColor(new java.awt.Color(51, 51, 51));
        jTable_resultaat.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable_resultaat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_resultaatMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_resultaat);

        jLabel_inschrijven.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_inschrijven.setText("Inschrijven:");

        jButton_inschrijven.setText("Inschrijven");
        jButton_inschrijven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_inschrijvenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_titel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_toevoegen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zoekveld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_zoekveld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_attribuut, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_selecteer_attribuut, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_tabel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_selecteer_tabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_zoeken, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_verwijderen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_wijzigen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_nieuw, javax.swing.GroupLayout.Alignment.LEADING, 0, 143, Short.MAX_VALUE)
                            .addComponent(jButton_nieuw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_inschrijven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_inschrijven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(34, 50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_selecteer_tabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_tabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_selecteer_attribuut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_attribuut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_zoekveld, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zoekveld, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_zoeken)
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_wijzigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_verwijderen)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel_toevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_nieuw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_nieuw)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_inschrijven)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_inschrijven)
                        .addGap(0, 269, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_nieuwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_nieuwActionPerformed
        JComboBox nieuw = (JComboBox) evt.getSource();
        this.nieuwGekozen = (String) nieuw.getSelectedItem();
        System.out.println("Nieuwe: " + this.nieuwGekozen);
        
        // Deze methode is voor om voor de insert in een tabel.
    }//GEN-LAST:event_jComboBox_nieuwActionPerformed

    private void jComboBox_tabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tabelActionPerformed
        JComboBox tabel = (JComboBox) evt.getSource();
        this.gekozenTabel = (String) tabel.getSelectedItem();
        System.out.println("Tabel: " + gekozenTabel);
        try {
            jTable_resultaat.setModel(dm.selectEntity(gekozenTabel, "", ""));
            genereerAttribuutNamenInComboBox(); // genereert attrubuutnamen in attribuut combobox
        } catch (SQLException ex) {
            System.out.println("check tabel combobox action : ");
            System.out.print(ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox_tabelActionPerformed

    private void jComboBox_attribuutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_attribuutActionPerformed
        JComboBox attribuut = (JComboBox) evt.getSource();
        this.gekozenAttribuut = "" + attribuut.getSelectedItem();
        System.out.println("Attribuut: " + gekozenAttribuut);

        // Hiermee kan je een attribuutnaam selecteren. Deze methode is voor de zoekfunctie.
    }//GEN-LAST:event_jComboBox_attribuutActionPerformed

    private void jButton_zoekenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_zoekenActionPerformed
        try {
            if(zoekveld.getText().isEmpty()){
                jTable_resultaat.setModel(dm.selectEntity(gekozenTabel, "", "")); // Alle rijen van één attribuut zien
            }else{
                jTable_resultaat.setModel(dm.selectEntity(gekozenTabel, gekozenAttribuut, zoekveld.getText())); // Alleen rijen zien van de zoekactie
            }
        } catch (SQLException ex) {
            System.out.println("Zie zoekveld functie");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton_zoekenActionPerformed

    private void jButton_nieuwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nieuwActionPerformed
        System.out.println("geklikt: " + "nieuw");
        switch (this.nieuwGekozen) {
            case "Binnenlands":
                StudentView binnen_student = new StudentView(this);
                binnen_student.setVisible(true);
                break;
            case "Buitenlands":
                StudentView buiten_student = new StudentView(this.nieuwGekozen, this);
                buiten_student.setVisible(true);
                break;
            case "Bedrijf":
                BedrijfView bedrijf = new BedrijfView(this);
                bedrijf.setVisible(true);
                break;
            case "Periode":
                PeriodeView periode = new PeriodeView(this);
                periode.setVisible(true);
                break;
            case "Opleiding":
                OpleidingView opleiding = new OpleidingView(this);
                opleiding.setVisible(true);
                break;
            case "Contactpersoon":
                ContactpersoonView contactpersoon = new ContactpersoonView(this);
                contactpersoon.setVisible(true);
                break;
            case "Onderwijseenheid":
                OnderwijseenheidView onderwijseenheid = new OnderwijseenheidView();
                onderwijseenheid.setVisible(true);
                break;
        }
    }//GEN-LAST:event_jButton_nieuwActionPerformed

    private void jButton_wijzigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_wijzigenActionPerformed
        
        if(geselecteerdeVak == null){
            JOptionPane.showMessageDialog(null, "Graag eerst een vak selecteren.");
        }else{
            switch (gekozenTabel) {
                case "Binnenlands":
                        StudentView binnenlands_student = new StudentView(this);
                        binnenlands_student.studentWijzigen(true, jTable_resultaat, true);
                        binnenlands_student.setVisible(true);
                        break;
                case "Buitenlands":
                        StudentView buitenandse_student = new StudentView(gekozenTabel, this);
                        buitenandse_student.studentWijzigen(false, jTable_resultaat, true);
                        buitenandse_student.setVisible(true);
                        break;
                case "Bedrijf":
                        BedrijfView bedrijf = new BedrijfView(this);
                        bedrijf.bedrijfWijzigen(true, jTable_resultaat);
                        bedrijf.setVisible(true);
                        break;
                case "Contactpersoon":
                        ContactpersoonView contact = new ContactpersoonView(this);
                        contact.contactWijzigen(true, jTable_resultaat);
                        contact.setVisible(true);
                        break;
                case "Opleiding":
                        OpleidingView opleiding = new OpleidingView(this);
                        opleiding.opleidingWijzigen(true, jTable_resultaat);
                        opleiding.setVisible(true);
                        break;
                case "Periode":
                        PeriodeView periode = new PeriodeView(this);
                        periode.periodeWijzigen(true, jTable_resultaat);
                        periode.setVisible(true);
                        break;
                case "Onderwijseenheid":
                        OnderwijseenheidView onderwijseenheid = new OnderwijseenheidView();
                        //Hier komt wijzigen functie!!!
                        onderwijseenheid.setVisible(true);
                        break;
            }
        }
    }//GEN-LAST:event_jButton_wijzigenActionPerformed

    private void jButton_verwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_verwijderenActionPerformed
        try {
            dm = new DatabaseManager();
            if(geselecteerdeVak == null){
                JOptionPane.showMessageDialog(this, "Graag eerst een vak selecteren!");
            }else{
                int keuze = JOptionPane.showConfirmDialog(null, "Wilt u, " + geselecteerdeVak + ", verwijderen?", "Verwijderen", JOptionPane.YES_NO_OPTION);
                if(keuze == 1){
                    System.out.println("Niet verwijderd");
                }else{
                    if(filterSelectie(geselecteerdeVak)){
                        dm.deleteEntity(gekozenTabel, Integer.parseInt(geselecteerdeVak));
                        JOptionPane.showMessageDialog(this, "Met succes verwijderd.");
                    }else{
                        int id = getTabelId(geselecteerdeVak);
                        dm.deleteEntity(gekozenTabel, id);
                        JOptionPane.showMessageDialog(this, "Met succes verwijderd.");
                        System.out.println("verwijderd");
                    }
                }    
            }
        } catch (SQLException | ArrayIndexOutOfBoundsException e) {           
            e.printStackTrace();
        } finally{
            getRefreshJTable();
        }
    }//GEN-LAST:event_jButton_verwijderenActionPerformed

    private boolean filterSelectie(String selectie){
        try {
            Integer.parseInt(selectie);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private int getTabelId(String row){
        int id = 0;
        try {
            switch(gekozenTabel){
                case "Bedrijf":
                    id = dm.getBedrijfID(row);
                    break;
                case "Opleiding":
                    id = dm.getOpleidingID(row);
                    break;
                case "Contactpersoon":
                    id = dm.getContactpersoonID(row);
                    break;
            }
        } catch (SQLException e) {
            System.out.println("getTabelId: " + e.getMessage());
        }
        return id;
    }
    
    private void jTable_resultaatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_resultaatMousePressed
        selectie = (JTable) evt.getSource();
        geselecteerdeVak = "" + selectie.getValueAt(selectie.getSelectedRow(), selectie.getSelectedColumn());
        System.out.println("Je hebt geselecteerd: " + geselecteerdeVak);
    }//GEN-LAST:event_jTable_resultaatMousePressed

    private void jButton_inschrijvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_inschrijvenActionPerformed
        //HIER KOMT INSCHRIJVEN!!!!
    }//GEN-LAST:event_jButton_inschrijvenActionPerformed
    
    private void genereerTabelNamenInComboBox(){
        String tabellen [] = {"Binnenlands", "Buitenlands", "Bedrijf", "Periode", "Opleiding", "Onderwijseenheid", "Contactpersoon"};

        for (String tabellen1 : tabellen) {
            jComboBox_tabel.addItem(tabellen1);
            jComboBox_nieuw.addItem(tabellen1);
        }
        //In deze methode komen de tabelnamen!!!
    }
    
    private void genereerAttribuutNamenInComboBox(){
        //Hier slaat hij alle attribuutnamen op die bestaan in een tabel.
        jComboBox_attribuut.removeAllItems();
        for (int i = 0; i < jTable_resultaat.getColumnCount(); i++) {
            jComboBox_attribuut.addItem(jTable_resultaat.getColumnName(i));
        }
    }

    public void getRefreshJTable(){
        try {
            jTable_resultaat.setModel(dm.selectEntity(gekozenTabel, "", ""));
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
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
            java.util.logging.Logger.getLogger(HoofdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoofdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoofdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoofdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HoofdView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_inschrijven;
    private javax.swing.JButton jButton_nieuw;
    private javax.swing.JButton jButton_verwijderen;
    private javax.swing.JButton jButton_wijzigen;
    private javax.swing.JButton jButton_zoeken;
    private javax.swing.JComboBox jComboBox_attribuut;
    private javax.swing.JComboBox jComboBox_nieuw;
    private javax.swing.JComboBox jComboBox_tabel;
    private javax.swing.JLabel jLabel_inschrijven;
    private javax.swing.JLabel jLabel_selecteer_attribuut;
    private javax.swing.JLabel jLabel_selecteer_tabel;
    private javax.swing.JLabel jLabel_titel;
    private javax.swing.JLabel jLabel_toevoegen;
    private javax.swing.JLabel jLabel_zoekveld;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable_resultaat;
    private javax.swing.JTextField zoekveld;
    // End of variables declaration//GEN-END:variables
}
