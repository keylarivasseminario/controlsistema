
package conexion;

//import com.sun.net.httpserver.Authenticator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import com.mysql.jdbc.PreparedStatement;




public class SqlUsuarios extends ConexioMySQL {
    public boolean registrar(usuarios usr)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO tabla_usuarios (Id_Usuarios, Nombre, Apellidos, DNI, Telefono, Contraseña) VALUES(?,?,?,?,?,?)";
        
        try {
            ps =con.prepareStatement(sql);
            ps.setString(1, usr.getId());
            ps.setString(2, usr.getUsuario());
            ps.setString(6, usr.getContraseña());
            ps.execute();
            return true;

            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
              
    }
    public int existeUsuario(String usuarios){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql ="SELECT count(Id_Usuarios) FROM tabla_usuarios WHERE Usuario = ?";
        
        try {
            ps =con.prepareStatement(sql);
            
            ps.setString(1, usuarios);
            rs = ps.executeQuery();
            
         
            if(rs.next())
            {
                return rs.getInt(1);
            }   
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            
            return 1;
        }
        
        
        
    }
    
    
    public boolean login(usuarios usr){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql ="SELECT Id_Usuarios, Usuario,Contraseña FROM tabla_usuarios WHERE Usuario = ?";
        
        try {
            ps =con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();
            
         
            if(rs.next())
            {
                if(usr.getContraseña().equals(rs.getString(4))){
                 
                    usr.setId(rs.getString(1));
                    usr.setUsuario(rs.getString(2));
                    usr.setContraseña(rs.getString(6));
                    return true; 
                }else {
                return false;
                }
            }   
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
        
        
    }
    
}
