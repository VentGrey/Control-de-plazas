/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import MisClases.Comandante;
import java.util.ArrayList;

/**
 *
 * @author omar
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<Comandante> datos = new ArrayList<>();
    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        cap_comand = new javax.swing.JMenuItem();
        ver_coman = new javax.swing.JMenuItem();
        edit_coman = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        save_com = new javax.swing.JMenuItem();
        open_com = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 251, 252));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        jMenu4.setText("Comandantes");
        jMenu4.add(jSeparator3);

        cap_comand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/capture.png"))); // NOI18N
        cap_comand.setText("Ingresar Comandante");
        cap_comand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cap_comandActionPerformed(evt);
            }
        });
        jMenu4.add(cap_comand);

        ver_coman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/view.png"))); // NOI18N
        ver_coman.setText("Ver Comandantes");
        jMenu4.add(ver_coman);

        edit_coman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/modify.png"))); // NOI18N
        edit_coman.setText("Modificar Comandantes");
        jMenu4.add(edit_coman);
        jMenu4.add(jSeparator4);

        save_com.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/media-floppy.png"))); // NOI18N
        save_com.setText("Guardar Archivo de Comandantes");
        save_com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_comActionPerformed(evt);
            }
        });
        jMenu4.add(save_com);

        open_com.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/folder-blue-favorites.png"))); // NOI18N
        open_com.setText("Abrir Archivo de Comandantes");
        open_com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_comActionPerformed(evt);
            }
        });
        jMenu4.add(open_com);

        jMenuBar2.add(jMenu4);

        jMenu3.setText("Plazas");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/capture.png"))); // NOI18N
        jMenuItem1.setText("Ingresar Plaza");
        jMenu3.add(jMenuItem1);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/view.png"))); // NOI18N
        jMenuItem4.setText("Ver Plazas");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/modify.png"))); // NOI18N
        jMenuItem5.setText("Modificar Plazas");
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator5);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/media-floppy.png"))); // NOI18N
        jMenuItem10.setText("Guardar Archivo de Plazas");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/folder-blue-print.png"))); // NOI18N
        jMenuItem11.setText("Abrir Archivo de Plazas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar2.add(jMenu3);

        jMenu1.setText("Ordenes");
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cap_comandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cap_comandActionPerformed
        Pnt_Captura_Comandante cap = new Pnt_Captura_Comandante();
        cap.setDatos(datos);
        this.jDesktopPane1.add(cap);
        cap.setVisible(true);
    }//GEN-LAST:event_cap_comandActionPerformed

    private void save_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_comActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_comActionPerformed

    private void open_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_comActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_open_comActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cap_comand;
    private javax.swing.JMenuItem edit_coman;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenuItem open_com;
    private javax.swing.JMenuItem save_com;
    private javax.swing.JMenuItem ver_coman;
    // End of variables declaration//GEN-END:variables
}
