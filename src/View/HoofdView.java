/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author koray
 */
public class HoofdView extends javax.swing.JFrame {
    
    private String nieuwGekozen;
    private String geselecteerdeVak;
    
    /**
     * Creates new form HoofdView
     */
    public HoofdView() {
        super("International MESS");
        this.setSize(729, 700);
        initComponents();
        genereerTabelNamenInComboBox();
        genereerAttribuutNamenInComboBox();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_resultaat = new javax.swing.JTable();
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(729, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 385));

        jTable_resultaat.setAutoCreateRowSorter(true);
        jTable_resultaat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123456", "Koray Poyraz", "hbo-ICT"},
                {"654321", "Joep Mulder", "hbo-ICT"},
                {"123123", "Ruben Schaafsma", "hbo-ICT"},
                {"234324", "Ruben v den Engel", "hbo-ICT"}
            },
            new String [] {
                "student_id", "naam", "studie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_resultaat.setCellSelectionEnabled(true);
        jTable_resultaat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable_resultaat.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable_resultaat.setShowGrid(false);
        jTable_resultaat.setShowVerticalLines(true);
        jTable_resultaat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_resultaatMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_resultaat);

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
        jLabel_toevoegen.setText("Toevoegen...");

        jComboBox_nieuw.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Binnenlandse student", "Buitenlandse student", "Bedrijf", "Periode", "Onderwijseenheid" }));
        jComboBox_nieuw.setSelectedIndex(-1);
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

        jButton1.setText("verwijderen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_titel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox_nieuw, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_toevoegen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zoekveld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_zoekveld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_attribuut, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_selecteer_attribuut, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_tabel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_selecteer_tabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_zoeken, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_nieuw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_toevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_nieuw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_nieuw)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_nieuwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_nieuwActionPerformed
        JComboBox nieuw = (JComboBox) evt.getSource();
        this.nieuwGekozen = (String) nieuw.getSelectedItem();
        System.out.println("Nieuwe: " + this.nieuwGekozen);
        
        // Deze methode is voor om een nieuw student of bedrijf toe te voegen etc.
    }//GEN-LAST:event_jComboBox_nieuwActionPerformed

    private void jComboBox_tabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tabelActionPerformed
        JComboBox tabel = (JComboBox) evt.getSource();
        String gekozenTabel = (String) tabel.getSelectedItem();
        System.out.println("tabel: " + gekozenTabel);
        // Deze methode is voor de zoekfunctie.
    }//GEN-LAST:event_jComboBox_tabelActionPerformed

    private void jComboBox_attribuutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_attribuutActionPerformed
        JComboBox attribuut = (JComboBox) evt.getSource();
        String gekozenAttribuut = "" + attribuut.getSelectedItem();
        System.out.println("attribuut: " + gekozenAttribuut);
        
        String [] allesGeselecteerd = new String[attribuut.getItemCount()];
        if(gekozenAttribuut.equals("Alles selecteren")){
            for (int i = 0; i < attribuut.getItemCount(); i++) {
                allesGeselecteerd[i] = "" + attribuut.getItemAt(i);
                System.out.println("Test alles selecteren: " + allesGeselecteerd[i]);
            }
        }
        // Hiermee kan je alle attribuutnamen selecteren. Deze methode is voor de zoekfunctie.
    }//GEN-LAST:event_jComboBox_attribuutActionPerformed

    private void jTable_resultaatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_resultaatMousePressed
        JTable selectie = (JTable) evt.getSource();
        geselecteerdeVak = "" + selectie.getValueAt(selectie.getSelectedRow(), selectie.getSelectedColumn());
        System.out.println("Je hebt geselecteerd: " + geselecteerdeVak);
        //Test om de selectie te zien, vervolgens wordt dit gebruikt voor verwijderen en wijzigen.
    }//GEN-LAST:event_jTable_resultaatMousePressed

    private void jButton_zoekenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_zoekenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_zoekenActionPerformed

    private void jButton_nieuwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nieuwActionPerformed
        System.out.println("geklikt: " + "nieuw");
        if(this.nieuwGekozen.equals("Binnenlandse student")){
            StudentView binnen_student = new StudentView();
            binnen_student.setVisible(true);
        }else if(this.nieuwGekozen.equals("Buitenlandse student")){
            StudentView buiten_student = new StudentView(this.nieuwGekozen);
            buiten_student.setVisible(true);
        }
    }//GEN-LAST:event_jButton_nieuwActionPerformed

    private void genereerTabelNamenInComboBox(){
        String tabellen [] = {"vb nationaal student", "vb exchange student", "vb bedrijf", "vb opleiding"}; // Dit is een voorbeeld.

        for (String tabellen1 : tabellen) {
            jComboBox_tabel.addItem(tabellen1);
        }
        //In deze methode komen de tabelnamen!!!
        
    }
    
    private void genereerAttribuutNamenInComboBox(){
        //Hier slaat hij alle attribuutnamen op die bestaan in een tabel.
        String [] tabellen = new String [jTable_resultaat.getColumnCount()];
        
        for (int i = 0; i < jTable_resultaat.getColumnCount(); i++) {
            tabellen[i] = jTable_resultaat.getColumnName(i);
        }

        for (String tabellen1 : tabellen) {
            jComboBox_attribuut.addItem(tabellen1);
        }
        jComboBox_attribuut.addItem("Alles selecteren");
        //In deze methode komen de attribuutnamen!!!
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_nieuw;
    private javax.swing.JButton jButton_zoeken;
    private javax.swing.JComboBox jComboBox_attribuut;
    private javax.swing.JComboBox jComboBox_nieuw;
    private javax.swing.JComboBox jComboBox_tabel;
    private javax.swing.JLabel jLabel_selecteer_attribuut;
    private javax.swing.JLabel jLabel_selecteer_tabel;
    private javax.swing.JLabel jLabel_titel;
    private javax.swing.JLabel jLabel_toevoegen;
    private javax.swing.JLabel jLabel_zoekveld;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_resultaat;
    private javax.swing.JTextField zoekveld;
    // End of variables declaration//GEN-END:variables
}
