/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia_de_aviacion;

/**
 *
 * @author gabriel
 */
public class Añadirvuelo extends javax.swing.JPanel {

    /**
     * Creates new form Añadirvuelo
     */
    
    //CONSTRUCTOR
    public Añadirvuelo() {
        
        initComponents();
        this.setAlignmentX(1000);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(0, 102, 255));
        setPreferredSize(new java.awt.Dimension(312, 340));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BLA", "BRM", "CBL", "CCS", "CUM", "VIG", "LFR", "LSP", "LRV", "MAR", "MUN", "MYC", "PMV", "PBL", "PHV", "PZO", "SFD", "SOM", "STD", "TUV", "VLN" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 147, 121, -1));

        jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1564604280000L), null, null, java.util.Calendar.WEEK_OF_MONTH));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 73, 176, 31));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fecha Y Hora Del Vuelo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 36, 176, 19));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Destino");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 122, 176, 19));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar");
        jButton1.setFocusable(false);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 262, -1, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vuelo 1", "Vuelo 2", "Vuelo 3" }));
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 203, 121, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
