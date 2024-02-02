/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_ingreso_vehicular;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexion.ConexioMySQL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import conexion.Ctrl_Usuario;

/**
 *
 * @author Sheyla Maria
 */
public class Registro_Usuarios extends javax.swing.JInternalFrame {

    ConexioMySQL enlace = new ConexioMySQL();
    Connection Conect = (Connection) enlace.getConexion();

    /**
     * Creates new form Registro_Usuarios
     */
    public Registro_Usuarios() {
        initComponents();
        mostrarDatosUsuario();
    }

    public void mostrarDatosUsuario() {
        DefaultTableModel tb_usuarios = new DefaultTableModel();
        tb_usuarios.addColumn("ID");
        tb_usuarios.addColumn("Usuario");
        tb_usuarios.addColumn("Contraseña");

        tablausuarios.setModel(tb_usuarios);
        String[] dato = new String[3];

        try {
            ConexioMySQL Con = new ConexioMySQL();
            Con.ConectarBasedeDatos();

            String SQL = "SELECT * FROM tabla_usuarios";
            Con.resultado = Con.sentencia.executeQuery(SQL);

            while (Con.resultado.next()) {
                dato[0] = Con.resultado.getString(1);
                dato[1] = Con.resultado.getString(2);
                dato[2] = Con.resultado.getString(3);
                tb_usuarios.addRow(dato);
            }
            tablausuarios.setModel(tb_usuarios);
        } catch (Exception e) {
        }
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
        jLabel7 = new javax.swing.JLabel();
        TXTID = new javax.swing.JTextField();
        TXTNOMBRE = new javax.swing.JTextField();
        TXTCONTRASEÑA = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        BTNMODI = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BTNSALIR = new javax.swing.JButton();
        BTNREGISTRO = new javax.swing.JButton();
        BTNELIMINAR = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuarios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("REGISTRO DE USUARIO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("ID USUARIO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Nombre Usuario");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Contraseña");

        TXTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTIDActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 0, 51))); // NOI18N

        BTNMODI.setBackground(new java.awt.Color(255, 0, 51));
        BTNMODI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BTNMODI.setText("MODIFICAR");
        BTNMODI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMODIActionPerformed(evt);
            }
        });

        Actualizar.setBackground(new java.awt.Color(0, 153, 204));
        Actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Actualizar.setText("ACTUALIZAR");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(BTNMODI)
                .addGap(18, 18, 18)
                .addComponent(Actualizar)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNMODI)
                    .addComponent(Actualizar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        BTNSALIR.setBackground(new java.awt.Color(255, 0, 204));
        BTNSALIR.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BTNSALIR.setText("SALIR");
        BTNSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSALIRActionPerformed(evt);
            }
        });

        BTNREGISTRO.setBackground(new java.awt.Color(51, 255, 255));
        BTNREGISTRO.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BTNREGISTRO.setText("REGISTRO");
        BTNREGISTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNREGISTROActionPerformed(evt);
            }
        });

        BTNELIMINAR.setBackground(new java.awt.Color(102, 255, 0));
        BTNELIMINAR.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BTNELIMINAR.setText("ELIMINAR");
        BTNELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNELIMINARActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTNSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNELIMINAR)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNREGISTRO))
                .addGap(339, 339, 339))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BTNREGISTRO)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(BTNELIMINAR)
                .addGap(18, 18, 18)
                .addComponent(BTNSALIR)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tablausuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablausuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TXTCONTRASEÑA, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TXTNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(46, 46, 46)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(TXTNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TXTCONTRASEÑA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void limpiarCajas() {

        TXTID.setText("");
        TXTNOMBRE.setText("");
        TXTCONTRASEÑA.setText("");
        //  botonbuscar.setText("");
    }

    private void TXTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTIDActionPerformed

    private void BTNMODIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMODIActionPerformed

        int fila = tablausuarios.getSelectedRow();
        if (fila >= 0) {

            TXTID.setText(tablausuarios.getValueAt(fila, 0).toString());
            TXTNOMBRE.setText(tablausuarios.getValueAt(fila, 1).toString());
            TXTCONTRASEÑA.setText(tablausuarios.getValueAt(fila, 2).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Fila No Seleccionada");
        }

    }//GEN-LAST:event_BTNMODIActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        try {
            // TODO add your handling code here:
            PreparedStatement acctualizar = (PreparedStatement) Conect.prepareStatement("UPDATE `tabla_usuarios` SET `Id_Usuarios`='"
                    + TXTID.getText() + "',`Usuario`='" + TXTNOMBRE.getText() + "',`Contraseña`='" + TXTCONTRASEÑA.getText() + "' WHERE Id_Usuarios='" + TXTID.getText() + "'");// + id;
            acctualizar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Actualizados Exitosamente");
            limpiarCajas();
            mostrarDatosUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(Registro_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void BTNSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSALIRActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BTNSALIRActionPerformed

    private void BTNREGISTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNREGISTROActionPerformed

        //
        try {
            java.sql.PreparedStatement guardar = Conect.prepareStatement("INSERT INTO tabla_usuarios (Id_Usuarios,Usuario,Contraseña) VALUES(?,?,?)");
            guardar.setString(1, TXTID.getText());
            guardar.setString(2, TXTNOMBRE.getText());
            guardar.setString(3, TXTCONTRASEÑA.getText());
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente");
            limpiarCajas();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "No se logro Registrar al Usuario");
            limpiarCajas();
        }

    }//GEN-LAST:event_BTNREGISTROActionPerformed

    private void BTNELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNELIMINARActionPerformed
        // TODO add your handling code here:
        int fila = tablausuarios.getSelectedRow();
        String valor = tablausuarios.getValueAt(fila, 0).toString();
        if (fila >= 0) {
            try {
                java.sql.PreparedStatement ELIMINA = Conect.prepareStatement("DELETE FROM `tabla_usuarios` WHERE Id_Usuarios='" + valor + "'");
                ELIMINA.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato Eliminado");

            } catch (SQLException ex) {
                Logger.getLogger(Registro_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BTNELIMINARActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton BTNELIMINAR;
    private javax.swing.JButton BTNMODI;
    private javax.swing.JButton BTNREGISTRO;
    private javax.swing.JButton BTNSALIR;
    private javax.swing.JTextField TXTCONTRASEÑA;
    private javax.swing.JTextField TXTID;
    private javax.swing.JTextField TXTNOMBRE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablausuarios;
    // End of variables declaration//GEN-END:variables
}
