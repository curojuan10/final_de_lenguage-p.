/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Nota;

/**
 *
 * @author HP
 */
public class Ctrl_Nota {
    
   //metodo para guardar una nueva Nota
   public boolean guardar(Nota objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_nota values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getTitulo());
            consulta.setString(3, objeto.getContenido());
            consulta.setString(4, objeto.getFechaCreacion());
            consulta.setString(5, objeto.getFechaModificacion());
            consulta.setString(6, objeto.getPrioridad());
            consulta.setInt(7, 1);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar la Nota: " + e);
        }

        return respuesta;
    }
    /**
     * ********************************************************************
     * metodo para consultar si la  Nota registrado ya existe
     * ********************************************************************
     */
        public boolean existeNota(String titulo) {
        boolean respuesta = false;
        String sql = "select titulo from tb_nota where titulo = '" + titulo + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar la Nota: " + e);
        }
        return respuesta;
    }
    /*
     * **************************************************
     * metodo para actualizar un cliente
     * **************************************************
     */
    public boolean actualizar(Nota objeto, int id_nota) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_nota set titulo=?, contenido = ?, fechaCreacion = ?, fechaModificacion= ?, prioridad = ? where id_nota ='" + id_nota + "'");
            consulta.setString(1, objeto.getTitulo());
            consulta.setString(2, objeto.getContenido());
            consulta.setString(3, objeto.getFechaCreacion());
            consulta.setString(4, objeto.getFechaModificacion());
            consulta.setString(5, objeto.getPrioridad());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar Nota: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar una nota
     * **************************************************
     */
    public boolean eliminar(int id_nota) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_nota where id_nota ='" + id_nota + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar la Nota: " + e);
        }
        return respuesta;
    }
}
