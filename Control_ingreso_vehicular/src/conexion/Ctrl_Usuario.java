package conexion;

import conexion.ConexioMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import conexion.usuarios;

/**
 *
 * @author Edison Zambrano - © Programador Fantasma
 */
public class Ctrl_Usuario {
    
    
    /**
     * **************************************************
     * metodo para guardar un nuevo usuario
     * **************************************************
     */
    public boolean guardar(usuarios objeto) {
        boolean respuesta = false;
       //  PreparedStatement ps = null;
        Connection con = getConexion();
        try {
            PreparedStatement consulta = con.prepareStatement("insert into tabla_usuarios values(?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(1, objeto.getUsuario());
            consulta.setString(2, objeto.getContraseña());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si el producto ya esta registrado en la BBDD
     * ********************************************************************
     */
    public boolean existeUsuario(String usuario) {
        boolean respuesta = false;
        String sql = "select usuario from tabla_usuarios where Usuario = '" + usuario + "';";
        Statement st;
        try {
            Connection con = getConexion();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para Iniciar Sesion
     * **************************************************
     */
    public boolean loginUser(usuarios objeto) {
        boolean respuesta = false;
        Connection con = getConexion();
        String sql = "select  Usuario, Contraseña from tabla_usuarios where Usuario = '" + objeto.getUsuario() + "' and Contraseña = '" + objeto.getContraseña() + "'";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return respuesta;
    }
    
    /**
     * **************************************************
     * metodo para actualizar un usuario
     * **************************************************
     */
    public boolean actualizar(usuarios objeto, int idUsuario) {
        boolean respuesta = false;
       Connection con = getConexion();
        try {

            PreparedStatement consulta = con.prepareStatement("update tabla_usuarios set Usuario=?, Contraseña =? where Id_Usuarios ='" + idUsuario + "'");
            consulta.setString(1, objeto.getUsuario());
            consulta.setString(2, objeto.getContraseña());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar un usuario
     * **************************************************
     */
    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        Connection con = getConexion();
        try {
            PreparedStatement consulta = con.prepareStatement(
                    "delete from tabla_usuarios where Id_Usuario ='" + idUsuario + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e);
        }
        return respuesta;
    }

    private Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
