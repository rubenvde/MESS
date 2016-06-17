/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DatabaseManager;
import Model.Entiteit;
import Model.Periode;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author koray
 */
public class PeriodeView extends javax.swing.JFrame {
    private String beginDatum;
    private String eindDatum;
    private DatabaseManager dm;
    private boolean wijzigen;
    private String [] col;
    private int periodeId;
    private HoofdView hv;
    private Date huidigeDatum;
    private Calendar cal;
    
    /**
     * Creates new form PeriodeView
     * @param hv
     */
    public PeriodeView(HoofdView hv) {
        super("Nieuwe periode");
        this.beginDatum = "";
        this.eindDatum = "";
        this.periodeId = 0;
        this.huidigeDatum = new Date();
        cal = Calendar.getInstance();
        cal.setTime(this.huidigeDatum);
        this.wijzigen = false;
        this.hv = hv;
        this.dm = new DatabaseManager();
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

        jLabel1_periodegegevens = new javax.swing.JLabel();
        jLabel2_begindatum = new javax.swing.JLabel();
        jLabel4_einddatum = new javax.swing.JLabel();
        jButton_toevoegen = new javax.swing.JButton();
        jButton_annuleren = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1_dag = new javax.swing.JComboBox();
        jComboBox2_dag = new javax.swing.JComboBox();
        jComboBox1_maand = new javax.swing.JComboBox();
        jComboBox2_maand = new javax.swing.JComboBox();
        jComboBox1_jaar = new javax.swing.JComboBox();
        jComboBox2_jaar = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1_periodegegevens.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1_periodegegevens.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1_periodegegevens.setText("Periodegegevens");

        jLabel2_begindatum.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2_begindatum.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2_begindatum.setText("Begindatum");

        jLabel4_einddatum.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4_einddatum.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4_einddatum.setText("Einddatum");

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

        jLabel1.setText("Dag");

        jLabel2.setText("Maand");

        jLabel3.setText("Jaar");

        for(int i = 1; i < 32; i++){
            jComboBox1_dag.addItem(i);
        }
        jComboBox1_dag.setSelectedIndex(cal.get(Calendar.DAY_OF_MONTH)-1);

        for(int i = 1; i < 32; i++){
            jComboBox2_dag.addItem(i);
        }

        jComboBox2_dag.setSelectedIndex(cal.get(Calendar.DAY_OF_MONTH)-1);

        for(int i = 1; i < 13; i++){
            jComboBox1_maand.addItem(i);
        }
        jComboBox1_maand.setSelectedIndex(cal.get(Calendar.MONTH));

        for(int i = 1; i < 13; i++){
            jComboBox2_maand.addItem(i);
        }
        jComboBox2_maand.setSelectedIndex(cal.get(Calendar.MONTH));

        for(int i = cal.get(Calendar.YEAR); i < cal.get(Calendar.YEAR)+10; i++){
            jComboBox1_jaar.addItem(i);
        }

        for(int i = cal.get(Calendar.YEAR); i < cal.get(Calendar.YEAR)+10; i++){
            jComboBox2_jaar.addItem(i);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_toevoegen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_annuleren))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4_einddatum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2_begindatum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1_dag, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2_dag, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1_periodegegevens)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1_maand, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2_maand, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1_jaar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2_jaar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1_periodegegevens, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2_begindatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1_dag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4_einddatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2_dag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(jComboBox1_jaar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2_jaar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(jComboBox1_maand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2_maand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_annuleren)
                    .addComponent(jButton_toevoegen))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_annulerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_annulerenActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_annulerenActionPerformed

    private void jButton_toevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_toevoegenActionPerformed
        
        beginDatum = jComboBox1_jaar.getSelectedItem() + "-" + jComboBox1_maand.getSelectedItem() + "-" + jComboBox1_dag.getSelectedItem();
        eindDatum = jComboBox2_jaar.getSelectedItem() + "-" + jComboBox2_maand.getSelectedItem() + "-" + jComboBox2_dag.getSelectedItem();
        
        Entiteit periode;
        try {
            if(!wijzigen){
                periode = new Periode(periodeId, beginDatum, eindDatum);
                dm.insertEntity(periode);//toevoegen nieuwe periode
                JOptionPane.showMessageDialog(null, "Met succes toegevoegd.");
            }else{
                periode = new Periode(periodeId, beginDatum, eindDatum);
                dm.updateEntity(periode); // wijzigen periode
                JOptionPane.showMessageDialog(null, "Met succes gewijzigd.");
            }  
        } catch (SQLException e) {
            System.out.println("DM werkt niet, zie toevoegen functie van PeriodeView.");
            e.printStackTrace();
        }finally{
            this.dispose();
            hv.getRefreshJTable();
        }
    }//GEN-LAST:event_jButton_toevoegenActionPerformed

    public void periodeWijzigen(boolean wijzigen, JTable table){
        this.wijzigen = wijzigen;
        this.jButton_toevoegen.setText("Wijzigen");
        this.setTitle("Wijzigen periode");
        
        col = new String [table.getColumnCount()];
        
        for (int i = 0; i < col.length; i++) {
            col[i] = "" + table.getValueAt(table.getSelectedRow(), i);
        }
        periodeId = Integer.parseInt(col[0]);
        filterData(col);
    }
    
    public void filterData(String [] col){
        String [] beginD = col[1].split("-");
        String [] eindD = col[2].split("-");
        
        for (int i = 1; i < beginD.length; i++) {
            if(beginD[i].charAt(0) == '0'){
                String beginTrim = beginD[i].replaceFirst("0", " ").trim();
                beginD[i] = beginTrim;
            }
            
            if(eindD[i].charAt(0) == '0'){
                String eindTrim = eindD[i].replaceFirst("0", " ").trim();
                eindD[i] = eindTrim;
            }
        }
        
        try {
            for (int i = 0; i < jComboBox1_dag.getItemCount(); i++) {
                if(jComboBox1_dag.getItemAt(i).toString().equals(beginD[2])){jComboBox1_dag.setSelectedIndex(i);}
                if(jComboBox1_maand.getItemAt(i).toString().equals(beginD[1])){jComboBox1_maand.setSelectedIndex(i);}
                if(jComboBox1_jaar.getItemAt(i).toString().equals(beginD[0])){jComboBox1_jaar.setSelectedIndex(i);}
                
                if(jComboBox2_dag.getItemAt(i).toString().equals(eindD[2])){jComboBox2_dag.setSelectedIndex(i);}
                if(jComboBox2_maand.getItemAt(i).toString().equals(eindD[1])){jComboBox2_maand.setSelectedIndex(i);}
                if(jComboBox2_jaar.getItemAt(i).toString().equals(eindD[0])){jComboBox2_jaar.setSelectedIndex(i);}
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is te groot voor de loop index van maand en jaar. Maar dat weten we.");
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
            java.util.logging.Logger.getLogger(PeriodeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeriodeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeriodeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeriodeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PeriodeView().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_annuleren;
    private javax.swing.JButton jButton_toevoegen;
    private javax.swing.JComboBox jComboBox1_dag;
    private javax.swing.JComboBox jComboBox1_jaar;
    private javax.swing.JComboBox jComboBox1_maand;
    private javax.swing.JComboBox jComboBox2_dag;
    private javax.swing.JComboBox jComboBox2_jaar;
    private javax.swing.JComboBox jComboBox2_maand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_periodegegevens;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_begindatum;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4_einddatum;
    // End of variables declaration//GEN-END:variables
}
