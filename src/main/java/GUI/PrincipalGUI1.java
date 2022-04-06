/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;



import Principal.Controlador;
import Principal.Principal;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Alex
 */
public class PrincipalGUI1 extends javax.swing.JFrame {

    private Principal principal;

    public PrincipalGUI1(Principal principal) {
        initComponents();
        this.principal = principal;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cargarCarpeta1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cargarCarpeta2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ANALIZATEXT");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel4.setText(" ");
        jPanel1.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jLabel10.setText("     ");
        jPanel1.add(jLabel10, java.awt.BorderLayout.LINE_END);

        jLabel11.setText("     ");
        jPanel1.add(jLabel11, java.awt.BorderLayout.LINE_START);

        jLabel12.setText("  ");
        jPanel1.add(jLabel12, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jButton3.setText("ANALIZAR");
        jPanel3.add(jButton3);

        jButton4.setText("SALIR");
        jPanel3.add(jButton4);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel1.setText(" ");
        jPanel8.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel3.setText("     ");
        jPanel8.add(jLabel3, java.awt.BorderLayout.LINE_END);

        jLabel5.setText("     ");
        jPanel8.add(jLabel5, java.awt.BorderLayout.LINE_START);

        cargarCarpeta1.setText("Cargar Carpeta");
        cargarCarpeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarCarpeta1ActionPerformed(evt);
            }
        });
        jPanel8.add(cargarCarpeta1, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel8.setText("     ");
        jPanel9.add(jLabel8, java.awt.BorderLayout.LINE_END);

        jLabel9.setText("     ");
        jPanel9.add(jLabel9, java.awt.BorderLayout.LINE_START);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel6.setText("     ");
        jPanel10.add(jLabel6, java.awt.BorderLayout.LINE_END);

        jLabel7.setText("     ");
        jPanel10.add(jLabel7, java.awt.BorderLayout.LINE_START);

        cargarCarpeta2.setText("Cargar Carpeta");
        cargarCarpeta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarCarpeta2ActionPerformed(evt);
            }
        });
        jPanel10.add(cargarCarpeta2, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jPanel7.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel7.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel5.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarCarpeta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarCarpeta1ActionPerformed
        principal.cargarCarpeta(true);
    }//GEN-LAST:event_cargarCarpeta1ActionPerformed

    private void cargarCarpeta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarCarpeta2ActionPerformed
        principal.cargarCarpeta(false);
    }//GEN-LAST:event_cargarCarpeta2ActionPerformed

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public JTextArea getjTextArea2() {
        return jTextArea2;
    }

    public void setjTextArea2(JTextArea jTextArea2) {
        this.jTextArea2 = jTextArea2;
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarCarpeta1;
    private javax.swing.JButton cargarCarpeta2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
