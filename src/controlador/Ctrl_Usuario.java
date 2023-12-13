package controlador;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import modelo.Usuario;
import conexion.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class Ctrl_Usuario {
    
    //metodo para guardar una nuevo usuario
   public boolean guardar(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_usuario values(?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getUsuario());
            consulta.setString(3, objeto.getPassword());
            consulta.setString(4, objeto.getCorreoElectronico());
            consulta.setString(5, objeto.getOtrosDatosUsuario());
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Usuario: " + e);
        }

        return respuesta;
    }
    /**
     * ********************************************************************
     * metodo para consultar si el usuario registrado ya existe
     * ********************************************************************
     */
        public boolean existeUsuario(String usuario) {
        boolean respuesta = false;
        String sql = "select usuario from tb_usuario where usuario = '" + usuario + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar el Usuario: " + e);
        }
        return respuesta;
    }

    //escribir metodo para iniciar sesion
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;

        Connection cn = Conexion.conectar();
        String sql = "select  usuario, password from tb_usuario where usuario= '" + objeto.getUsuario() + "'and	password='" + objeto.getPassword() + "'";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Erro al iniciar sesion");
            JOptionPane.showMessageDialog(null, "Erro al iniciar sesion");
        }
        return respuesta;
    }
    /*
     * **************************************************
     * metodo para actualizar un usuario
     * **************************************************
     */
    public boolean actualizar(Usuario objeto, int id_usuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_usuario set usuario=?, password = ?, correoElectronico = ?, otrosDatosUsuario= ? where id_usuario ='" + id_usuario + "'");
            consulta.setString(1, objeto.getUsuario());
            consulta.setString(2, objeto.getPassword());
            consulta.setString(3, objeto.getCorreoElectronico());
            consulta.setString(4, objeto.getOtrosDatosUsuario());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar Usuario: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar un usuario
     * **************************************************
     */
    public boolean eliminar(int id_usuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_usuario where id_usuario='" + id_usuario + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar El Usuario: " + e);
        }
        return respuesta;
    }
}
