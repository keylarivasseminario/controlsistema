/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_ingreso_vehicular;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import conexion.ConexioMySQL;

import java.sql.Date;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;

import java.io.ByteArrayOutputStream;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import java.lang.String;
import javax.swing.ImageIcon;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
/**
 *
 * @author user
 */
public class Registros_ingresantes_vehiculos extends javax.swing.JInternalFrame {
    private ConexioMySQL conexion;
     
    /**
     * Creates new form TABLA
     */
    public Registros_ingresantes_vehiculos() {
        initComponents();
        
        mostraringresantes_vehiculos();
    }
     
    public  void mostraringresantes_vehiculos(){
            DefaultTableModel tablaModel = new DefaultTableModel();
            tablaModel.addColumn("Id");
       tablaModel.addColumn("Propietario del Vehiculo");
       tablaModel.addColumn("Dni del Propietario");
       tablaModel.addColumn("Conductor");
        tablaModel.addColumn("Dni del conductor");
        tablaModel.addColumn("Correo del conductor");
        tablaModel.addColumn("Telefono conductor");
        tablaModel.addColumn("Licencia de conducir");
        tablaModel.addColumn("Tipo de vehiculo");
        tablaModel.addColumn("Marca");
          tablaModel.addColumn("Placa Anterior");
        tablaModel.addColumn("Placa Vigente");
        tablaModel.addColumn("N Vin");
        tablaModel.addColumn("SEDE");
         tablaModel.addColumn("Color");
        tablaModel.addColumn("N Serie:");
        tablaModel.addColumn("Desripcion");
          //
            Tabla_vehiculo.setModel(tablaModel);
            String []dato = new String[17];
            
            try {
                ConexioMySQL Con = new ConexioMySQL();
                Con.ConectarBasedeDatos();
                        
                String SQL = "SELECT * FROM tabla_vehiculos";
                Con.resultado = Con.sentencia.executeQuery(SQL);
                
                while(Con.resultado.next()){
                    dato[0] = Con.resultado.getString(1);
                    dato[1] = Con.resultado.getString(2);
                    dato[2] = Con.resultado.getString(3);
                    dato[3] = Con.resultado.getString(4);
                    dato[4] = Con.resultado.getString(5);
                    dato[5] = Con.resultado.getString(6);
                    dato[6] = Con.resultado.getString(7);
                    dato[7] = Con.resultado.getString(8);
                    dato[8] = Con.resultado.getString(9);
                    dato[9] = Con.resultado.getString(10);
                    dato[10] = Con.resultado.getString(11);
                    dato[11] = Con.resultado.getString(12);
                    dato[12] = Con.resultado.getString(13);
                    dato[13] = Con.resultado.getString(14);
                    dato[14] = Con.resultado.getString(15);
                    dato[15] = Con.resultado.getString(16);
                    dato[16] = Con.resultado.getString(17);
                    tablaModel.addRow(dato);
                }
                
                 Tabla_vehiculo.setModel(tablaModel);
            } catch (Exception e) {
            }
        }


    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        DNIPROPIETARIO = new javax.swing.JTextField();
        TXTPROPIETARIO = new javax.swing.JTextField();
        RBSI = new javax.swing.JRadioButton();
        RBNO = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTDNICONDUCTOR = new javax.swing.JTextField();
        TXTCORREOCONDUCTOR = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTCONDUCTOR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TXTTELEFONOCONDUCTOR = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TXTCOLOR = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TXTPLACAV = new javax.swing.JTextField();
        TXTPLACAA = new javax.swing.JTextField();
        NUMSERIE = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        NUMVIN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        COMBOSEDE = new javax.swing.JComboBox<>();
        TXTMARCA = new javax.swing.JTextField();
        TXTDESCRIPCION = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_vehiculo = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Midate = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        combotipov = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        B_REGISTRAR = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lblcodigoQR = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("DATOS DEL CONDUCTOR");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Ingresantes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(DNIPROPIETARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 260, 30));
        jPanel1.add(TXTPROPIETARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 260, 30));

        buttonGroup1.add(RBSI);
        RBSI.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        RBSI.setForeground(new java.awt.Color(51, 255, 51));
        RBSI.setText("SI");
        jPanel1.add(RBSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        buttonGroup1.add(RBNO);
        RBNO.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        RBNO.setForeground(new java.awt.Color(0, 255, 0));
        RBNO.setText("NO");
        RBNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBNOActionPerformed(evt);
            }
        });
        jPanel1.add(RBNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Telefono del conductor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Correo del conductor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 190, -1));
        jPanel1.add(TXTDNICONDUCTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 260, 30));
        jPanel1.add(TXTCORREOCONDUCTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 260, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DNI del conductor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 140, -1));

        TXTCONDUCTOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCONDUCTORActionPerformed(evt);
            }
        });
        jPanel1.add(TXTCONDUCTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 260, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Conductor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 260, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("DNI del Propietario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Propietario del vehiculo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));
        jPanel1.add(TXTTELEFONOCONDUCTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 260, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Lincencia de Conducir");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 170, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL VEHICULO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(51, 0, 204))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel9.setText("Placa Vigente ");

        jLabel14.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel14.setText("Nº Vin:");

        jLabel15.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel15.setText("Marca");

        jLabel16.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel16.setText("SEDE:");

        jLabel18.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel18.setText("Color");

        jLabel20.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel20.setText("Nº Serie: ");

        NUMVIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMVINActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel11.setText("Placa Anterior ");

        COMBOSEDE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tumbes", "Piura", "Lambayeque", "Cajamarca", "La Libertad", "Lima", "Junin", "Cerro de Pasco", "Huanuco", "Huancavelica", "Ayacucho", "Ica", "Arequipa", "Moquegua", "Tacna", "Cusco", "Madre de Dios", "Apurimac" }));
        COMBOSEDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBOSEDEActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel5.setText("Descripcion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(51, 51, 51))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel16))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTDESCRIPCION, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTPLACAV, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTPLACAA, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUMVIN, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COMBOSEDE, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUMSERIE, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTPLACAA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TXTPLACAV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(NUMVIN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COMBOSEDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(TXTCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(NUMSERIE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(TXTDESCRIPCION, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        Tabla_vehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_vehiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_vehiculo);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " HORA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel12.setText("Ingreso");

        jLabel13.setText("Fecha");

        Midate.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(Midate, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel13))
                    .addComponent(Midate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO DE VEHICULO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 153))); // NOI18N

        combotipov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motocicletas", "Motocarro", "Mototriciclo", "Automovil", "Camioneta", "Bus", "Bicicleta", "Moto electrica" }));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Imagen1.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/coche1.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bicycle_icon_160403-removebg-preview.png"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/rickshaw-tuk-icon-image-260nw-736553407-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(29, 29, 29)
                .addComponent(combotipov, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel24)))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(combotipov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        B_REGISTRAR.setBackground(new java.awt.Color(0, 204, 51));
        B_REGISTRAR.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        B_REGISTRAR.setText("REGISTRAR");
        B_REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_REGISTRARActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton6.setText("SALIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(58, 58, 58)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblcodigoQR, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_REGISTRAR))))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(B_REGISTRAR)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(46, 46, 46)
                        .addComponent(lblcodigoQR, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
       
   
    private void RBNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBNOActionPerformed

    private void TXTCONDUCTORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCONDUCTORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCONDUCTORActionPerformed

    private void NUMVINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMVINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUMVINActionPerformed

    private void COMBOSEDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOSEDEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMBOSEDEActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Salio del Formulario Registrar Equipos de Computo ");
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void B_REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_REGISTRARActionPerformed
        // TODO add your handling code here:
        conexion = new ConexioMySQL();
        conexion.ConectarBasedeDatos();

        String id = txtcodigo.getText();
        String pro = TXTPROPIETARIO.getText();
        String dnipro= DNIPROPIETARIO.getText();
        String conductor = TXTCONDUCTOR.getText();
        String dnicon = TXTDNICONDUCTOR.getText();
        String correocon = TXTCORREOCONDUCTOR.getText();
        String telefonocon = TXTTELEFONOCONDUCTOR.getText();
        String licencia = RBNO.isSelected() ? "NO" : "SI";

        String tipodevehiculo = combotipov.getSelectedItem().toString();
        String marca = TXTMARCA.getText();
        String placaan = TXTPLACAA.getText();
        String placavigente= TXTPLACAV.getText();
        String numerovin= NUMVIN.getText();
        String sede = COMBOSEDE.getSelectedItem().toString();
        String color= TXTCOLOR.getText();
        String serie= NUMSERIE.getText();
        String des= TXTDESCRIPCION.getText();
        JComponent fecha = Midate.getDateEditor().getUiComponent();

        try {
            // Insertar datos en la base de datos
            String conSql = "INSERT INTO tabla_vehiculos(Id_vehiculos,propietario_vehiculo,dni_propietario,conductor,dni_conductor,correo,telefono,licencia,tipo_vehiculo,marca,placa_anterior,placa_vigente,Num_vin,sede,color,serie, descripcion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conexion.getConnection().prepareStatement(conSql);

            pst.setString(1, id);
            pst.setString(2, pro);
            pst.setString(3, dnipro);
            pst.setString(4, conductor);
            pst.setString(5, dnicon);
            pst.setString(6, correocon);
            pst.setString(7, telefonocon);
            pst.setString(8, licencia);
            pst.setString(9, tipodevehiculo);
            pst.setString(10, marca);
            pst.setString(11, placaan);
            pst.setString(12, placavigente);
            pst.setString(13, numerovin);
            pst.setString(14, sede);
            pst.setString(15, color);
            pst.setString(16, serie);
            pst.setString(17, des);
          
            pst.execute();

            JOptionPane.showMessageDialog(this, "Datos guardado exitosamente.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Error al Registrar Datos");
//            limpiarCajas();
        }
        
    }//GEN-LAST:event_B_REGISTRARActionPerformed
public  void GenerarCodigoQR()
{
	ByteArrayOutputStream out=QRCode.from(this.txtcodigo.getText()).to(ImageType.PNG).stream();
	ImageIcon imageIcon=new ImageIcon(out.toByteArray());
	this.lblcodigoQR.setIcon(imageIcon);
}
    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
        GenerarCodigoQR();
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void Tabla_vehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_vehiculoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabla_vehiculoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_REGISTRAR;
    private javax.swing.JComboBox<String> COMBOSEDE;
    private javax.swing.JTextField DNIPROPIETARIO;
    private com.toedter.calendar.JDateChooser Midate;
    private javax.swing.JTextField NUMSERIE;
    private javax.swing.JTextField NUMVIN;
    private javax.swing.JRadioButton RBNO;
    private javax.swing.JRadioButton RBSI;
    private javax.swing.JTextField TXTCOLOR;
    private javax.swing.JTextField TXTCONDUCTOR;
    private javax.swing.JTextField TXTCORREOCONDUCTOR;
    private javax.swing.JTextField TXTDESCRIPCION;
    private javax.swing.JTextField TXTDNICONDUCTOR;
    private javax.swing.JTextField TXTMARCA;
    private javax.swing.JTextField TXTPLACAA;
    private javax.swing.JTextField TXTPLACAV;
    private javax.swing.JTextField TXTPROPIETARIO;
    private javax.swing.JTextField TXTTELEFONOCONDUCTOR;
    private javax.swing.JTable Tabla_vehiculo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combotipov;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcodigoQR;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables

    
}
