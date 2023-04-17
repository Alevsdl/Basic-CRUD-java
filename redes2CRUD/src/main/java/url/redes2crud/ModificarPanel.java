/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package url.redes2crud;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleja
 */
public class ModificarPanel extends javax.swing.JPanel {

    /**
     * Creates new form ModificarPanel
     */
    Conexion cc = new Conexion();
    Connection cn = cc.getConnection();
    public ModificarPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        txtdes = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIngresar1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(740, 470));
        setMinimumSize(new java.awt.Dimension(740, 470));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 470));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese nombre de producto a modificar");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setText("Nuevo precio");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setText("Nueva descripción");

        txtname.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtname.setForeground(new java.awt.Color(204, 204, 204));
        txtname.setText("Ingrese nombre del producto...");
        txtname.setBorder(null);
        txtname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtnameMouseReleased(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setText("Nueva cantidad");

        txtprecio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtprecio.setForeground(new java.awt.Color(204, 204, 204));
        txtprecio.setText("Ingrese precio del producto...");
        txtprecio.setBorder(null);
        txtprecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtprecioMousePressed(evt);
            }
        });

        txtdes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtdes.setForeground(new java.awt.Color(204, 204, 204));
        txtdes.setText("Ingrese descripcion del producto...");
        txtdes.setBorder(null);
        txtdes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtdesMousePressed(evt);
            }
        });

        txttotal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txttotal.setForeground(new java.awt.Color(204, 204, 204));
        txttotal.setText("Ingrese cantidad del producto...");
        txttotal.setBorder(null);
        txttotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txttotalMousePressed(evt);
            }
        });
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jLabel6.setText("________________________________________________");

        jLabel7.setText("________________________________________________");

        jLabel8.setText("________________________________________________");

        jLabel9.setText("________________________________________________");

        jLabel5.setText(".");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(234, 199, 199));
        jLabel10.setText("PRODUCTO");
        jLabel10.setFocusable(false);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel11.setBackground(new java.awt.Color(234, 199, 199));
        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MODIFICAR");
        jLabel11.setFocusable(false);
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel11.setOpaque(true);

        txtIngresar1.setBackground(new java.awt.Color(234, 224, 218));
        txtIngresar1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtIngresar1.setForeground(new java.awt.Color(153, 153, 153));
        txtIngresar1.setText("  INGRESAR");
        txtIngresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtIngresar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtIngresar1.setOpaque(true);
        txtIngresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIngresar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtIngresar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtIngresar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(199, 199, 199))
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(txtIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMousePressed
        // TODO add your handling code here:
        if (txtname.getText().equals("Ingrese nombre del producto...")) {
            txtname.setText("");
            txtname.setForeground(Color.black);
        }
        if (String.valueOf(txtprecio.getText()).isEmpty()) {
            txtprecio.setText("Ingrese precio del producto...");
            txtprecio.setForeground(Color.gray);
        }
        if (String.valueOf(txtdes.getText()).isEmpty()) {
            txtdes.setText("Ingrese descripcion del producto...");
            txtdes.setForeground(Color.gray);
        }
        if (String.valueOf(txttotal.getText()).isEmpty()) {
            txttotal.setText("Ingrese cantidad del producto...");
            txttotal.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txtnameMousePressed

    private void txtnameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMouseReleased

    }//GEN-LAST:event_txtnameMouseReleased

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtprecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtprecioMousePressed
        // TODO add your handling code here:
       if (txtprecio.getText().equals("Ingrese precio de producto...")) {
            txtprecio.setText("");
            txtprecio.setForeground(Color.black);
        }
        if (String.valueOf(txtname.getText()).isEmpty()) {
            txtname.setText("Ingrese nombre de producto...");
            txtname.setForeground(Color.gray);
        }
        if (String.valueOf(txtdes.getText()).isEmpty()) {
            txtdes.setText("Ingrese descripcion de producto...");
            txtdes.setForeground(Color.gray);
        }
        if (String.valueOf(txttotal.getText()).isEmpty()) {
            txttotal.setText("Ingrese cantidad de producto...");
            txttotal.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtprecioMousePressed

    private void txtdesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdesMousePressed
        // TODO add your handling code here:
        if (txtdes.getText().equals("Ingrese descripcion de producto...")) {
            txtdes.setText("");
            txtdes.setForeground(Color.black);
        }
        if (String.valueOf(txtprecio.getText()).isEmpty()) {
            txtprecio.setText("Ingrese precio de producto...");
            txtprecio.setForeground(Color.gray);
        }
        if (String.valueOf(txtname.getText()).isEmpty()) {
            txtname.setText("Ingrese nombre de producto...");
            txtname.setForeground(Color.gray);
        }
        if (String.valueOf(txttotal.getText()).isEmpty()) {
            txttotal.setText("Ingrese cantidad de producto...");
            txttotal.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtdesMousePressed

    private void txttotalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttotalMousePressed
        // TODO add your handling code here:
        if (txttotal.getText().equals("Ingrese cantidad de producto...")) {
            txttotal.setText("");
            txttotal.setForeground(Color.black);
        }
        if (String.valueOf(txtprecio.getText()).isEmpty()) {
            txtprecio.setText("Ingrese precio de producto...");
            txtprecio.setForeground(Color.gray);
        }
        if (String.valueOf(txtname.getText()).isEmpty()) {
            txtname.setText("Ingrese nombre de producto...");
            txtname.setForeground(Color.gray);
        }

        if (String.valueOf(txtdes.getText()).isEmpty()) {
            txtdes.setText("Ingrese descripcion de producto...");
            txtdes.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txttotalMousePressed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtIngresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresar1MouseClicked
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            PreparedStatement pst = cn.prepareStatement("CALL modificar_producto_por_nombre (?,?,?,?)");
            pst.setString(1, txtname.getText());
            pst.setDouble(2, Integer.parseInt(txtprecio.getText()));
            pst.setString(3, txtdes.getText());
            pst.setInt(4, Integer.parseInt(txttotal.getText()));
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(rootPane, "Ingresado");
            jLabel5.setText("Producto modificado");
            txtname.setText("");
            txtprecio.setText("");
            txtdes.setText("");
            txttotal.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(ModificarPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtIngresar1MouseClicked

    private void txtIngresar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresar1MouseEntered
        // TODO add your handling code here:
        txtIngresar1.setBackground(new Color(234, 199, 199));
    }//GEN-LAST:event_txtIngresar1MouseEntered

    private void txtIngresar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresar1MouseExited
        // TODO add your handling code here:
        txtIngresar1.setBackground(new Color(234, 224, 218));
    }//GEN-LAST:event_txtIngresar1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txtIngresar1;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
