/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_ingreso_vehicular;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import conexion.ConexioMySQL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;

import java.sql.ResultSet;
import java.sql.Statement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author user
 */
public class Registros_Entrada extends javax.swing.JInternalFrame {

    private ConexioMySQL conexion;
    Calendar cal;
    String descripcion, year;

    /**
     * Creates new form TABLA
     */
    public Registros_Entrada() {
        initComponents();
        cal = Calendar.getInstance();
        year = Integer.toString(cal.get(Calendar.YEAR));
        fecha_v.setDate(cal.getTime());
        //fecha el sitema
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        fecha.setText(formato.format(sistFecha));
        //hora
        Timer tiempo = new Timer(100, new Registros_Entrada.horas());
        tiempo.start();
    }

    class horas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date sisHora = new Date();
            String pmAm = "hh:mm:ss a";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar Hoy = Calendar.getInstance();
            hora.setText(String.format(format.format(sisHora), Hoy));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TXTDNICONDUCTOR = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTCONDUCTOR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TXTID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        fecha_v = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        B_REGISTRAR = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        combotipov = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("DATOS DEL CONDUCTOR");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Ingresantes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(TXTDNICONDUCTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 260, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DNI del conductor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 140, -1));

        TXTCONDUCTOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCONDUCTORActionPerformed(evt);
            }
        });
        jPanel1.add(TXTCONDUCTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 260, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Conductor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        TXTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTIDActionPerformed(evt);
            }
        });
        jPanel1.add(TXTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 260, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Fecha");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Hora de entrada");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("Hora de salida");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 260, 30));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 260, 30));
        jPanel1.add(fecha_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 260, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 320, 790, 310));

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton6.setText("SALIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 120, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 255, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("HORA");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("FECHA");

        hora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 255, 0));
        hora.setText("jLabel5");

        fecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 255, 0));
        fecha.setText("Fecha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(hora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(182, 182, 182))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hora)
                    .addComponent(fecha))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 580, 170));

        B_REGISTRAR.setBackground(new java.awt.Color(0, 204, 51));
        B_REGISTRAR.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        B_REGISTRAR.setText("REGISTRAR");
        B_REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_REGISTRARActionPerformed(evt);
            }
        });
        getContentPane().add(B_REGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO DE VEHICULO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 153))); // NOI18N

        combotipov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR:", "Motocicletas", "Motocarro", "Mototriciclo", "Automovil", "Camioneta", "Bus", "Bicicleta", "Moto electrica" }));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Imagen1.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/coche1.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bicycle_icon_160403-removebg-preview.png"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/rickshaw-tuk-icon-image-260nw-736553407-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel19)
                .addGap(36, 36, 36)
                .addComponent(jLabel21)
                .addGap(32, 32, 32)
                .addComponent(jLabel22)
                .addGap(26, 26, 26)
                .addComponent(jLabel24)
                .addGap(107, 107, 107)
                .addComponent(combotipov, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(combotipov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)))
                    .addComponent(jLabel24))
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void limpiarCajas() {
        TXTID.setText("");
//           combotipov.setSelectedItem().toString();("");
        TXTCONDUCTOR.setText("");
        TXTDNICONDUCTOR.setText("");

    }

    private void TXTCONDUCTORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCONDUCTORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCONDUCTORActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Salio del Formulario ");
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void B_REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_REGISTRARActionPerformed
        // TODO add your handling code here:
        conexion = new ConexioMySQL();
        conexion.ConectarBasedeDatos();
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha_v.getDate());
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        String daystr;
        if (day <= 9) {
            daystr = '0' + String.valueOf(day);
        } else {
            daystr = String.valueOf(day);
        }

        String messtr;
        mes = mes + 1;
        if (mes <= 9) {
            messtr = '0' + String.valueOf(mes);
        } else {
            messtr = String.valueOf(mes);
        }

        String yearstr = String.valueOf(year);
        String fecha_registro = yearstr + "-" + messtr + "-" + daystr;

        String id = TXTID.getText();
        String tipo = combotipov.getSelectedItem().toString();
        String conductor = TXTCONDUCTOR.getText();
        String dnicon = TXTDNICONDUCTOR.getText();
//        String tiempo =  fecha.se;

        try {
            // Insertar datos en la base de datos
            String conSql = "INSERT INTO `tabla_entrada_salida`(`id_salida`, `tipo_vehiculo`, `conductor`, `dni`, `fecha`) VALUES (?,?,?,?,?,)";
            PreparedStatement pst = conexion.getConnection().prepareStatement(conSql);

            pst.setString(1, id);
            pst.setString(2, tipo);
            pst.setString(3, conductor);
            pst.setString(4, dnicon);
            pst.setString(5, fecha_registro);
//            pst.setString(6, tiempo);

            pst.execute();

            JOptionPane.showMessageDialog(this, "Datos guardado exitosamente.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Error al Registrar Datos");
            limpiarCajas();
        }
    }//GEN-LAST:event_B_REGISTRARActionPerformed

//    private  void GenerarCodigoQR()
//{
//	ByteArrayOutputStream out=QRCode.from(this.TXTID.getText()).to(ImageType.PNG).stream();
//	ImageIcon imageIcon=new ImageIcon(out.toByteArray());
//	this.lblcodigo.setIcon(imageIcon);
//}
    private void TXTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTIDActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_REGISTRAR;
    private javax.swing.JTextField TXTCONDUCTOR;
    private javax.swing.JTextField TXTDNICONDUCTOR;
    private javax.swing.JTextField TXTID;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combotipov;
    private javax.swing.JLabel fecha;
    private com.toedter.calendar.JDateChooser fecha_v;
    public static javax.swing.JLabel hora;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
ConexioMySQL Con = new ConexioMySQL();

}
