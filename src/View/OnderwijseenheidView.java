/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DatabaseManager;
import Model.Onderwijseenheid;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author rubenvde
 */
public class OnderwijseenheidView extends javax.swing.JFrame {

    private int ond_id;
    private int periode_id;
    private int bedrijf_id;
    private int opleiding_id;
    private String studie_soort;
    private String type_ond;
    private DatabaseManager dm = new DatabaseManager();
    private boolean wijzigen;
    private HoofdView hv;
    
    /**
     * Creates new form OnderwijseenheidView2
     */
    public OnderwijseenheidView(HoofdView hv) {
        super("Onderwijseenheid");
        this.ond_id = 0;
        this.periode_id = 0;
        this.bedrijf_id = 0;
        this.opleiding_id = 0;
        this.studie_soort = "";
        this.type_ond = "";
        this.wijzigen = false;
        this.hv = hv;
        initComponents();
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

        jLabel1_persoonsgegevens = new javax.swing.JLabel();
        jLabel_studiepunten = new javax.swing.JLabel();
        studiepunten = new javax.swing.JTextField();
        jLabel5_opleiding = new javax.swing.JLabel();
        jComboBox1_opleiding = new javax.swing.JComboBox();
        jLabel5_type = new javax.swing.JLabel();
        jComboBox1_type = new javax.swing.JComboBox();
        jLabel4_soortstudie = new javax.swing.JLabel();
        jLabel5_bedrijf = new javax.swing.JLabel();
        jComboBox1_bedrijf = new javax.swing.JComboBox();
        jButton_toevoegen = new javax.swing.JButton();
        jButton_annuleren = new javax.swing.JButton();
        jComboBox1_soort_studie = new javax.swing.JComboBox();
        jLabel4_soortstudie2 = new javax.swing.JLabel();
        jComboBox1_periode = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        stad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        land = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1_persoonsgegevens.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1_persoonsgegevens.setText("Onderwijseenheid");

        jLabel_studiepunten.setText("Studiepunten");

        jLabel5_opleiding.setText("Opleiding");

        try{
            String [] opleidingen = new String[dm.getOpleidingNamen().size()];
            for(int i = 0; i < opleidingen.length; i++){
                opleidingen[i] = dm.getOpleidingNamen().get(i);
                jComboBox1_opleiding.addItem(opleidingen[i]);
            }

            /*
            for(int i = 0; i < opleidingen.length; i++){
                jComboBox1_type.addItem(opleidingen[i]);
            }
            */

        }catch(SQLException e){
            System.out.println("Fout bij combobox opleiding van Binnenlandse StudentView.");
            e.printStackTrace();
        }
        /*
        jComboBox1_opleiding.setModel(new javax.swing.DefaultComboBoxModel(opleidingen));
        */
        jComboBox1_opleiding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_opleidingActionPerformed(evt);
            }
        });

        jLabel5_type.setText("Type");

        jComboBox1_type.addItem("Leeg");
        jComboBox1_type.addItem("Studie");
        jComboBox1_type.addItem("Stage");
        jComboBox1_type.addItem("Afstudeerstage");

        jComboBox1_soort_studie.setEnabled(false);
        jComboBox1_bedrijf.setEnabled(false);

        /*
        jComboBox1_type.setModel(new javax.swing.DefaultComboBoxModel(opleidingen));
        */
        jComboBox1_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_typeActionPerformed(evt);
            }
        });

        jLabel4_soortstudie.setText("Soort studie");

        jLabel5_bedrijf.setText("Bedrijf");

        try{
            ArrayList<String> bedrijven = new ArrayList<>(dm.getBedrijfsNamen());
            String [] bedrijf = new String[bedrijven.size()];
            bedrijf = bedrijven.toArray(bedrijf);
            for(int i = 0; i < bedrijf.length; i++){
                jComboBox1_bedrijf.addItem(bedrijf[i]);
            }

        }catch(SQLException e){
            System.out.println("Fout bij combobox opleiding van Binnenlandse StudentView.");
            e.printStackTrace();
        }
        /*
        jComboBox1_bedrijf.setModel(new javax.swing.DefaultComboBoxModel(opleidingen));
        */
        jComboBox1_bedrijf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_bedrijfActionPerformed(evt);
            }
        });

        jButton_toevoegen.setText("Toevoegen");
        jButton_toevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_toevoegenActionPerformed(evt);
            }
        });

        jButton_annuleren.setText("Annuleren");
        jButton_annuleren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_annulerenActionPerformed(evt);
            }
        });

        jComboBox1_soort_studie.addItem("Minors");
        jComboBox1_soort_studie.addItem("European Project Semesters");
        jComboBox1_soort_studie.addItem("Summer schools");

        /*
        for(int i = 0; i < opleidingen.length; i++){
            jComboBox1_type.addItem(opleidingen[i]);
        }
        */
        /*
        jComboBox1_soort_studie.setModel(new javax.swing.DefaultComboBoxModel(opleidingen));
        */
        jComboBox1_soort_studie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_soort_studieActionPerformed(evt);
            }
        });

        jLabel4_soortstudie2.setText("Periode");

        try{
            String [] periodes = new String[dm.getPeriodes().size()];
            for(int i = 0; i < periodes.length; i++){
                periodes[i] = dm.getPeriodes().get(i);
                jComboBox1_periode.addItem(periodes[i]);
            }

        }catch(SQLException e){
            System.out.println("Fout bij combobox periode van Onderwijseenheid.");
            e.printStackTrace();
        }
        /*
        jComboBox1_periode.setModel(new javax.swing.DefaultComboBoxModel(opleidingen));
        */
        jComboBox1_periode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_periodeActionPerformed(evt);
            }
        });

        jLabel1.setText("Stad");

        jLabel2.setText("Land");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_toevoegen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_annuleren))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1_persoonsgegevens)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5_type, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1_type, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4_soortstudie2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1_periode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5_opleiding, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1_opleiding, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_studiepunten, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(studiepunten, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(land, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4_soortstudie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1_soort_studie, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5_bedrijf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1_bedrijf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_persoonsgegevens, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_studiepunten, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studiepunten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1_opleiding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5_opleiding, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4_soortstudie2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1_periode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5_type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4_soortstudie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1_soort_studie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1_bedrijf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5_bedrijf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(land, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_annuleren)
                    .addComponent(jButton_toevoegen))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1_opleidingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_opleidingActionPerformed
        try {
            opleiding_id = dm.getOpleidingID(jComboBox1_opleiding.getSelectedItem().toString());
        } catch (SQLException ex) {
            System.out.println("Opleiding id niet gevonden");
        }
    }//GEN-LAST:event_jComboBox1_opleidingActionPerformed

    private void jComboBox1_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_typeActionPerformed
        type_ond = jComboBox1_type.getSelectedItem().toString();
        switch(type_ond) {
            case "Studie":
                jComboBox1_soort_studie.setEnabled(true);
                jComboBox1_bedrijf.setEnabled(false);
                break;
            case "Stage":
                jComboBox1_soort_studie.setEnabled(false);
                jComboBox1_bedrijf.setEnabled(true);
                break;
            case "Afstudeerstage":
                jComboBox1_soort_studie.setEnabled(false);
                jComboBox1_bedrijf.setEnabled(true);
                break;
            case "Leeg":
                type_ond = "";
                break;    
            default:
                jComboBox1_soort_studie.setEnabled(false);
                jComboBox1_bedrijf.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_jComboBox1_typeActionPerformed

    private void jComboBox1_bedrijfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_bedrijfActionPerformed
        try {
            bedrijf_id = dm.getBedrijfID(jComboBox1_bedrijf.getSelectedItem().toString());
        } catch (SQLException ex) {
            System.out.println("Bedrijfs id niet gevonden");
        }
    }//GEN-LAST:event_jComboBox1_bedrijfActionPerformed

    private void jButton_toevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_toevoegenActionPerformed

                Onderwijseenheid onderwijseenheid;
                dm = new DatabaseManager();
                
                try {

                    if(!wijzigen){
                        onderwijseenheid = new Onderwijseenheid(dm.getOnderwijseenheidID(), Integer.parseInt(studiepunten.getText()), 
                                "" +jComboBox1_soort_studie.getSelectedItem(), dm.getBedrijfID(jComboBox1_bedrijf.getSelectedItem().toString()), 
                                jComboBox1_type.getSelectedItem().toString(), land.getText(), stad.getText(), 
                                dm.getOpleidingID(jComboBox1_opleiding.getSelectedItem().toString()), dm.getPeriodeID("" + jComboBox1_periode.getSelectedItem()));

                        dm.insertEntity(onderwijseenheid);
                        JOptionPane.showMessageDialog(null, "Met succes toegevoegd.");
                    }else{
                        JTable viewTable = hv.getTable();
                        onderwijseenheid = new Onderwijseenheid((int) viewTable.getValueAt(viewTable.getSelectedRow(), 0), Integer.parseInt(studiepunten.getText()), 
                                "" +jComboBox1_soort_studie.getSelectedItem(), dm.getBedrijfID(jComboBox1_bedrijf.getSelectedItem().toString()), 
                                jComboBox1_type.getSelectedItem().toString(), land.getText(), stad.getText(), 
                                dm.getOpleidingID(jComboBox1_opleiding.getSelectedItem().toString()), dm.getPeriodeID("" + jComboBox1_periode.getSelectedItem()));

                        dm.updateEntity(onderwijseenheid);
                        
                        JOptionPane.showMessageDialog(null, "Met succes gewijzigd.");
                    }
                   
                } catch (SQLException ex) {
                    System.out.println("Onderwijseenheid is niet gewijzigd of toegevoegd in database!");
                    ex.printStackTrace();
                }
                this.dispose();
   
        //hv.getRefreshJTable();
    }//GEN-LAST:event_jButton_toevoegenActionPerformed

    public void onderwijseenheidWijzigen(boolean wijzigen, JTable table){
        this.wijzigen = wijzigen;
        this.jButton_toevoegen.setText("Wijzigen");
        this.setTitle("Wijzigen onderwijseenheid");
        
        String [] col = new String[table.getColumnCount()];
        
        for (int i = 0; i < col.length; i++) {
            col[i] = "" + table.getValueAt(table.getSelectedRow(), i);
        }
        
        
        
    }
    
    private void jButton_annulerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_annulerenActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_annulerenActionPerformed

    private void jComboBox1_soort_studieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_soort_studieActionPerformed
        this.studie_soort = "" + jComboBox1_soort_studie.getSelectedItem();
    }//GEN-LAST:event_jComboBox1_soort_studieActionPerformed

    private void jComboBox1_periodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_periodeActionPerformed
        try { 
            periode_id = dm.getPeriodeID("" + jComboBox1_periode.getSelectedItem());
        } catch (Exception e) {
            System.out.println("Periode id niet gevoden");
        }
    }//GEN-LAST:event_jComboBox1_periodeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_annuleren;
    private javax.swing.JButton jButton_toevoegen;
    private javax.swing.JComboBox jComboBox1_bedrijf;
    private javax.swing.JComboBox jComboBox1_opleiding;
    private javax.swing.JComboBox jComboBox1_periode;
    private javax.swing.JComboBox jComboBox1_soort_studie;
    private javax.swing.JComboBox jComboBox1_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_persoonsgegevens;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4_soortstudie;
    private javax.swing.JLabel jLabel4_soortstudie2;
    private javax.swing.JLabel jLabel5_bedrijf;
    private javax.swing.JLabel jLabel5_opleiding;
    private javax.swing.JLabel jLabel5_type;
    private javax.swing.JLabel jLabel_studiepunten;
    private javax.swing.JTextField land;
    private javax.swing.JTextField stad;
    private javax.swing.JTextField studiepunten;
    // End of variables declaration//GEN-END:variables
}
