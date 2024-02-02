package conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ConexioMySQL {
   public Connection conexion;
   public ResultSet resultado;
   public Statement sentencia;
   
    Connection enlazarjd = null;
    
    
    public Connection getConexion() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            enlazarjd = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_vehicular", "root", "");

        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null,"ERROR" + e, "No es Posible establecer Conexión", JOptionPane.ERROR_MESSAGE);
        }

        return enlazarjd;

    }
    
    public void ConectarBasedeDatos() {
        try {
            final String Controlador = "com.mysql.jdbc.Driver";
            Class.forName(Controlador);
            final String url_bd = "jdbc:mysql://localhost:3306/sistema_vehicular";
            conexion = DriverManager.getConnection(url_bd, "root", "");
            sentencia = conexion.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void DesconectarBasedeDatos() {
        try {
            if (conexion != null) {
                if (sentencia != null) {
                    sentencia.close();
                }
                conexion.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    public Connection getConnection() {
        return conexion;
    }
     public void RellenaLaTablaConDatosMySQL(String tabla, JTable visor)
    {
        String sql = "Select * from " + tabla;
        Statement st;
        ConexioMySQL con = new ConexioMySQL();
        com.mysql.jdbc.Connection conexion = (com.mysql.jdbc.Connection) con.getConexion();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_Usuarios");
        model.addColumn("Usuario");
        model.addColumn("Contraseña");
        
        
        visor.setModel(model);
        String [] dato = new String[3];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {      
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
               
                model.addRow(dato);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param nombre
     */
     public void ActualizarUser( JTextField codigo, JTextField Usuario, JTextField Contraseña1, String id)
    {
        String sql = "UPDATE `tabla_usuarios` SET Id_Usuarios= '" + codigo.getText() +"', Usuario = '" + Usuario.getText()+"', Contraseña = '" + Contraseña1.getText()+ "' where Id_Usuarios = " + id;
        Statement st;
        com.mysql.jdbc.Connection conexion = (com.mysql.jdbc.Connection) getConexion();
        try
        {
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Usuario Actualizado");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }

    public void ActualizarUser(JTextField TXTID, JTextField TXTNOMBRE, JTextField TXTCONTRASEÑA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Date getDate(String fecha_venta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}