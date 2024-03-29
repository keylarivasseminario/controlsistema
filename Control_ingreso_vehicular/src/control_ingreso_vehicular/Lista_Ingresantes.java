/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_ingreso_vehicular;

import conexion.ConexioMySQL;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sheyla Maria
 */
public class Lista_Ingresantes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Lista_Ingresantes
     */
    public Lista_Ingresantes() {
        initComponents();
        mostraringresantes_vehiculos();
    }

    public void mostraringresantes_vehiculos() {
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
        String[] dato = new String[17];

        try {
            ConexioMySQL Con = new ConexioMySQL();
            Con.ConectarBasedeDatos();

            String SQL = "SELECT * FROM tabla_vehiculos";
            Con.resultado = Con.sentencia.executeQuery(SQL);

            while (Con.resultado.next()) {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_vehiculo = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(Tabla_vehiculo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_vehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
