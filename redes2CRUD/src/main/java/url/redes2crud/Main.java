/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package url.redes2crud;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;

/**
 *
 * @author aleja
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     * rosado rgb(234, 199, 199)
     * azul rgb(160, 195, 210)
     * otro rgb(234, 224, 218)
     * mas clartio
     */
    public Main() {
        initComponents();
         setLocationRelativeTo(null);//pone la pantalla en el centro
        PrincipalPanel p = new PrincipalPanel();
        p.setSize(900, 550);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
        Connection con1 = null;
        Conexion conect1 = new Conexion();
        con1 = conect1.getConnection();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ingresar = new javax.swing.JLabel();
        eliminar = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();
        mod = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        barrita = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(160, 195, 210));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 245, 235));
        jLabel1.setText("  INVENTORY");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 40));

        ingresar.setBackground(new java.awt.Color(160, 195, 210));
        ingresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ingresar.setForeground(new java.awt.Color(247, 245, 235));
        ingresar.setText("            INGRESAR");
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingresar.setOpaque(true);
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarMouseExited(evt);
            }
        });
        menu.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 210, 60));

        eliminar.setBackground(new java.awt.Color(160, 195, 210));
        eliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        eliminar.setForeground(new java.awt.Color(247, 245, 235));
        eliminar.setText("             ELIMINAR");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminar.setOpaque(true);
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarMouseExited(evt);
            }
        });
        menu.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 60));

        ver.setBackground(new java.awt.Color(160, 195, 210));
        ver.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ver.setForeground(new java.awt.Color(247, 245, 235));
        ver.setText("                 VER");
        ver.setToolTipText("");
        ver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ver.setOpaque(true);
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verMouseExited(evt);
            }
        });
        menu.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 210, 60));

        mod.setBackground(new java.awt.Color(160, 195, 210));
        mod.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        mod.setForeground(new java.awt.Color(247, 245, 235));
        mod.setText("           MODIFICAR");
        mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mod.setOpaque(true);
        mod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modMouseExited(evt);
            }
        });
        menu.add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 210, 60));

        jLabel2.setBackground(new java.awt.Color(247, 245, 235));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 195, 210));
        jLabel2.setText(" Product ");
        jLabel2.setOpaque(true);
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        inicio.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 470));

        barrita.setBackground(new java.awt.Color(255, 255, 255));

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(102, 102, 102));
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setText("X");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setOpaque(true);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout barritaLayout = new javax.swing.GroupLayout(barrita);
        barrita.setLayout(barritaLayout);
        barritaLayout.setHorizontalGroup(
            barritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barritaLayout.createSequentialGroup()
                .addGap(0, 915, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barritaLayout.setVerticalGroup(
            barritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barritaLayout.createSequentialGroup()
                .addComponent(salir)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        inicio.add(barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

        content.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        inicio.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 740, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        // TODO add your handling code here:
        IngresarPanel p = new IngresarPanel();
        p.setSize(750, 550);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_ingresarMouseClicked

    private void ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseEntered
        // TODO add your handling code here:
        ingresar.setBackground(new Color(234, 199, 199));
    }//GEN-LAST:event_ingresarMouseEntered

    private void ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseExited
        // TODO add your handling code here:
        ingresar.setBackground(new Color(160, 195, 210));
    }//GEN-LAST:event_ingresarMouseExited

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        // TODO add your handling code here:
        EliminarPanel p = new EliminarPanel();
        p.setSize(750, 550);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_eliminarMouseClicked

    private void eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseEntered
        // TODO add your handling code here:
        eliminar.setBackground(new Color(234, 199, 199));
    }//GEN-LAST:event_eliminarMouseEntered

    private void eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseExited
        // TODO add your handling code here:
        eliminar.setBackground(new Color(160, 195, 210));
    }//GEN-LAST:event_eliminarMouseExited

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        // TODO add your handling code here:
        verPanel p = new verPanel();
        p.setSize(750, 550);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_verMouseClicked

    private void verMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseEntered
        // TODO add your handling code here:
        ver.setBackground(new Color(234, 199, 199));
    }//GEN-LAST:event_verMouseEntered

    private void verMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseExited
        // TODO add your handling code here:
        ver.setBackground(new Color(160, 195, 210));
    }//GEN-LAST:event_verMouseExited

    private void modMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modMouseClicked
        // TODO add your handling code here:
        ModificarPanel p = new ModificarPanel();
        p.setSize(750, 550);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_modMouseClicked

    private void modMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modMouseEntered
        // TODO add your handling code here:
        mod.setBackground(new Color(234, 199, 199));
    }//GEN-LAST:event_modMouseEntered

    private void modMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modMouseExited
        // TODO add your handling code here:
        mod.setBackground(new Color(160, 195, 210));
    }//GEN-LAST:event_modMouseExited

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        // TODO add your handling code here:
        salir.setBackground(Color.red);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        // TODO add your handling code here:
        salir.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_salirMouseExited

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barrita;
    private javax.swing.JPanel content;
    private javax.swing.JLabel eliminar;
    private javax.swing.JLabel ingresar;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel mod;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
