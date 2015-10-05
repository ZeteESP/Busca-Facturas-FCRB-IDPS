/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadorfacturas;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Adrián
 */
public class Buscafacturas extends javax.swing.JFrame {

    /**
     * Creates new form BuscaFra
     */
    public Buscafacturas() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        idps = new javax.swing.JRadioButton();
        fcrb = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busca Facturas FCRB/IDPS");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Buscar!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFacturas(evt);
            }
        });

        jLabel1.setText("Factures a buscar:");

        jScrollPane2.setViewportView(jTextPane1);

        jScrollPane3.setViewportView(jTextPane2);

        jLabel2.setText("Factures no trobades:");

        jLabel3.setText("Resum:");

        jButton2.setText("Carpeta Destí");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escollirCarpetaDesti(evt);
            }
        });

        idps.setText("IDPS");

        fcrb.setText("FCRB");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscadorfacturas/logo_FCRB.gif"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscadorfacturas/Idibaps.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fcrb)
                                    .addComponent(idps)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(fcrb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idps)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escollirCarpetaDesti(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escollirCarpetaDesti
//        String path = "C:\\Users\\Adrián\\Documents";
//        JFileChooser chooser = new JFileChooser(path);
//        int returnVal = chooser.showOpenDialog(this);
//        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        chooser.setAcceptAllFileFilterUsed(false);
//        if (returnVal == JFileChooser.APPROVE_OPTION) {
//            destino = chooser.getCurrentDirectory().getName();
//            System.out.println("Has seleccionat el directori: "
//                    + chooser.getCurrentDirectory().getAbsolutePath());
//        }
         
         JFileChooser chooser;
//         String choosertitle;

        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
//        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        //    
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            destino =  chooser.getSelectedFile().getAbsolutePath();
            System.out.println("getCurrentDirectory(): "
                    + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : "
                    + chooser.getSelectedFile());
        } else {
            System.out.println("No Selection ");
        }
        
        
    }//GEN-LAST:event_escollirCarpetaDesti

    private void guardarFacturas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFacturas
        boolean encontrado = false;   //Si ha encontrado la factura
        if (!jTextArea1.getText().isEmpty()) {   // Una comprobacion que no este vacio el area donde se introducen facturas
            facturasBuscar = jTextArea1.getText().split("\n");   //Mete en el array lo que hay en JTextArea con un split por linea
            cuentaFra = facturasBuscar.length;   //Para el panel de info, mete la cantidad de facturas a buscar
            System.out.println("guardarfactura"+jTextArea1.getText()+ " num fact "+ cuentaFra);
            if (cuentaFra > 0) {  //Comprobacion que haya al menos una factura a buscar
                File f = new File(pathBusqueda), subf;  //Crea el objeto f con el path comun y el objecto subf para
                String[] fs = f.list();  //lista el contenido de f y lo mete en el array de Strings fs
                for (String fac : facturasBuscar) {  //hace un for para cada fac del estring facturasBuscar

                    if (fcrb.isSelected()) {  //Inicia busqueda para los gastos marcados para FUND
                        for (int i = 0; i < fs.length && !encontrado; i++) {  //busca en fs si no se ha encontrado la factura
                            Pattern p = Pattern.compile("^FUNDACIO 20.*");
                            Matcher m= p.matcher(fs[i]);
                            System.out.println("factura "+fs[i]);
                            if (m.matches()){
                                System.out.println("factura1 "+fs[i]);
//                            if (fs[i].matches("FUNDACIO 20##")) {  //Si el f[i] coincide con un path que lleva a FUND
                                subf = new File(pathBusqueda+fs[i]);   //Crea el objeto subf que contiene el fs en la posición i
                                if (subf.isDirectory()) {  //Comprueba si subf es un directorio
                                    System.out.println("hemos entrado en la carpeta "+subf.getName());
                                    encontrado = buscarFacturaDirectorio(fac, subf);  //envia al metodo la fac y el directorio
                                }

                            }
                        }
                    }

                }
            }
        }
    }//GEN-LAST:event_guardarFacturas

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
            java.util.logging.Logger.getLogger(Buscafacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscafacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscafacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscafacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscafacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton fcrb;
    private javax.swing.JRadioButton idps;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
    private String facturasBuscar[];
    private String facturasNoE[];
    int cuentaFra, cuentaFraNoE;
    double porcFraNoE;   
    String pathBusqueda = "C:/FUNDACIO/CARPETA FACTURAS/";
    String pathBusquedaCMD = "C:/FUNDACIO/\"CARPETA FACTURAS\"/";
    private String destino;
    //prueba commit 2 
    
    


    private boolean buscarFacturaDirectorio(String fac, File subf) {
        String[] subdir = subf.list();   //mete en el string subdir el contenido de subf que previamente se ha cromprobado que es un Directorio
        boolean encontrado = false;    //Devolvera un boolean si lo encuentra
        for (int i = 0; i < subdir.length && !encontrado; i++) {//for para buscar en subdir
            File f = new File(subdir[i]); 
            System.out.println(f.getName()+ " " +fac + " " + f.isDirectory());// crea el objeto f de la clase flie con subdir[i]
            if (!f.isDirectory()&& f.getName().matches(fac)) { try {
                //Si es un archivo debera comprobar si es la factura que buscamos
                System.out.println("encontrado"+subf.getAbsolutePath()+"\\"+fac);
                FileCopy fileCopy = new FileCopy(subf.getAbsolutePath()+"\\"+fac,destino);
                } catch (Exception ex) {
                    Logger.getLogger(Buscafacturas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else if (f.isDirectory()) { //Si es un Directorio el metodo se llamara a si mismo para seguir buscando
                encontrado = buscarFacturaDirectorio(fac, f);
            }
        }
        return encontrado;
    }

}
