package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Colaborador;

/**
 *
 * @author HP
 */
public class Ctrl_Colaborador {

    //metodo para guardar un nuevo colaborador
    public boolean guardar(Colaborador objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_colaborador values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setDouble(4, objeto.getNota());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getId_categoria());
            consulta.setInt(7, objeto.getId_nota());
            consulta.setInt(8, objeto.getId_usuario());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar el colaborador: " + e);
        }

        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si el colaborador ya existe
     * ********************************************************************
     */
    public boolean existeColaborador(String colaborador) {
        boolean respuesta = false;
        String sql = "select apellido from tb_colaborador where apellido = '" + colaborador + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar colaborador: " + e);
        }
        return respuesta;
    }

    /*
     * **************************************************
     * metodo para actualizar un colaborador
     * **************************************************
     */
    public boolean actualizar(Colaborador objeto, int id_colaborador) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_colaborador set nombre=?, apellido = ?, nota = ?, descripcion= ?, id_categoria = ? where id_colaborador ='" + id_colaborador + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setDouble(3, objeto.getNota());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getId_categoria());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar colaborador: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar un producto
     * **************************************************
     */
    public boolean eliminar(int id_colaborador) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_colaborador where id_colaborador ='" + id_colaborador + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el colaborador: " + e);
        }
        return respuesta;
    }

}
