/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import icfes_proJect.*;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jalco
 */
public class FormMain extends javax.swing.JFrame {
   
    /**
     * Creates new form FormMain
     */
    public FormMain() {
        initComponents();
        File archivo = new File("imagenes/examen-icfes-saber-pro.jpg");
        try{
            ImageIcon icon = new ImageIcon(archivo.toString());
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), jLabel1.getWidth()));
            jLabel1.setIcon(icono);
        }catch (Exception e){
            System.out.println("esa imagen no cargo " + archivo.toString() + " " + e );
        }
        
        lbseleccionar.setVisible(false);
        btSeleccionar.setVisible(false);
        this.jTable1.setVisible(false);
        this.cbEstructura.setVisible(false);
        this.lbEstructura.setVisible(false);
        
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
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        lbseleccionar = new javax.swing.JLabel();
        cbPeriodo = new javax.swing.JComboBox<>();
        btSeleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbEstructura = new javax.swing.JLabel();
        cbEstructura = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

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
        setBackground(new java.awt.Color(255, 255, 255));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("DotumChe", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 51, 204));
        label1.setName("lbEncabezado"); // NOI18N
        label1.setText("        ASISTENTE DE CONSULTAS BASES DE DATOSICFES");

        jLabel2.setBackground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("PERIODO A CONSULTAR");

        lbseleccionar.setText("SELECCIONE POR QUE DATOS DESEA FILTRAR");

        cbPeriodo.setBackground(new java.awt.Color(0, 204, 255));
        cbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "2018-1", "2018-2", "2019-1", "2019-2" }));
        cbPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPeriodoActionPerformed(evt);
            }
        });

        btSeleccionar.setBackground(new java.awt.Color(0, 102, 204));
        btSeleccionar.setForeground(new java.awt.Color(51, 51, 51));
        btSeleccionar.setText("SELECCIONAR");
        btSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccionarActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(178, 208, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("jLabel1");

        jTextDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDocumentoActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar un dato especifico");

        lbEstructura.setText("SELECCIONE LA ESTRUCTURA");

        cbEstructura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Pila - Arreglo", "Cola - Arreglo", "Pila - Lista Sencilla", "Cola - Lista Sencilla", "Pila - Lista Doble", "cola - Lista Doble", "Lista Sencilla", "Lista Doblemente Enlazada", "Arreglo Dinamico", "Arbol Binario", "Cola de Prioridad" }));
        cbEstructura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstructuraActionPerformed(evt);
            }
        });

        jLabel4.setText("tiempos:");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jTextDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEstructura))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbPeriodo, 0, 189, Short.MAX_VALUE)
                                    .addComponent(cbEstructura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(lbseleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbseleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        label1.getAccessibleContext().setAccessibleName("lbEncabezado");
        label1.getAccessibleContext().setAccessibleDescription("");
        jLabel2.getAccessibleContext().setAccessibleName("lbperiodo");
        cbPeriodo.getAccessibleContext().setAccessibleName("cbperiodo");
        btSeleccionar.getAccessibleContext().setAccessibleName("btSeleccionar");
        btSeleccionar.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPeriodoActionPerformed
        // TODO add your handling code here:
        if(cbPeriodo.getSelectedItem().toString()!="--"){
            lbseleccionar.setVisible(true);
            btSeleccionar.setVisible(true);
           // paraleer archivo = new paraleer(cbPeriodo.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbPeriodoActionPerformed
    
    public void cargarTabla(LinkedList titulos){
        DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        for (int i=0 ;i<titulos.size();i++){
                modelo.addColumn((String)titulos.get(i));
        }
    }
   
    private void btSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccionarActionPerformed
        // TODO add your handling code here:
        frFiltro frame = new frFiltro(0, this);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setEnabled(true);
    }//GEN-LAST:event_btSeleccionarActionPerformed

    private void jTextDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDocumentoActionPerformed
        // TODO add your handling code here:
       String documento = jTextDocumento.getText();
    }//GEN-LAST:event_jTextDocumentoActionPerformed

    private void cbEstructuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstructuraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstructuraActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed
    public void setVisibletcontenido(boolean b){
        if (b)
            this.jTable1.setVisible(false);
        this.cbEstructura.setVisible(true);
        this.lbEstructura.setVisible(true);
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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSeleccionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbEstructura;
    private javax.swing.JComboBox<String> cbPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDocumento;
    private java.awt.Label label1;
    private javax.swing.JLabel lbEstructura;
    private javax.swing.JLabel lbseleccionar;
    // End of variables declaration//GEN-END:variables
}
