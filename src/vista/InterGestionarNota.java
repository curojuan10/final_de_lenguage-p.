package vista;

import conexion.Conexion;
import controlador.Ctrl_Nota;
import java.sql.Connection;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Nota;

/**
 *
 * @author ediso
 */
public class InterGestionarNota extends javax.swing.JInternalFrame {

    private int id_nota;

    public InterGestionarNota() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Notas");
        //Cargar tabla
        this.CargarTablaNotas();

        //insertat tabla en nuestra jlabel
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(900, 500, WIDTH));
        jLabel_wallpaper.setIcon(icono);
        this.repaint();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_nota = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_contenido = new javax.swing.JTextField();
        txt_fechaCreacion = new javax.swing.JTextField();
        txt_prioridad = new javax.swing.JTextField();
        txt_fechaModificacion = new javax.swing.JTextField();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Notas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_nota.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_nota);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 720, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_actualizar.setBackground(new java.awt.Color(51, 204, 0));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 130, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Título:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        txt_titulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tituloActionPerformed(evt);
            }
        });
        jPanel3.add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Contenido:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("FechaCreacion:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("FechaModificación:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Prioridad:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        txt_contenido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_contenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contenidoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, -1));

        txt_fechaCreacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_fechaCreacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaCreacionActionPerformed(evt);
            }
        });
        jPanel3.add(txt_fechaCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 170, -1));

        txt_prioridad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_prioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prioridadActionPerformed(evt);
            }
        });
        jPanel3.add(txt_prioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 170, -1));

        txt_fechaModificacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_fechaModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaModificacionActionPerformed(evt);
            }
        });
        jPanel3.add(txt_fechaModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 100));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

        if (txt_titulo.getText().isEmpty() && txt_contenido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "!Complete los campos vacios¡");

        } else {
            Nota nota = new Nota();
            Ctrl_Nota ctrl_Nota = new Ctrl_Nota();
            nota.setTitulo(txt_titulo.getText().trim());
            nota.setContenido(txt_contenido.getText().trim());
            nota.setFechaCreacion(txt_fechaCreacion.getText().trim());
            nota.setFechaModificacion(txt_fechaModificacion.getText().trim());
            nota.setPrioridad(txt_prioridad.getText().trim());

            if (ctrl_Nota.actualizar(nota, id_nota)) {
                JOptionPane.showMessageDialog(null, "!Datos de la nota actualizado¡");
                this.CargarTablaNotas();
                this.Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "!Error al actualizar¡");
                
            }
        }


    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed

        Ctrl_Nota ctrl_Nota = new Ctrl_Nota();
        if (id_nota == 0) {
            JOptionPane.showMessageDialog(null, "!Seleccione una  fila de nota¡");
        } else {
            if (!ctrl_Nota.eliminar(id_nota)) {
                JOptionPane.showMessageDialog(null, "!Nota Eliminado¡");
                this.CargarTablaNotas();
                this.Limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "!Error al eliminar la nota¡");
                this.Limpiar();
            }
        }

    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void txt_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tituloActionPerformed

    private void txt_contenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contenidoActionPerformed

    private void txt_fechaCreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaCreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaCreacionActionPerformed

    private void txt_prioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prioridadActionPerformed

    private void txt_fechaModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaModificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaModificacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_nota;
    private javax.swing.JTextField txt_contenido;
    private javax.swing.JTextField txt_fechaCreacion;
    private javax.swing.JTextField txt_fechaModificacion;
    private javax.swing.JTextField txt_prioridad;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables

    /*
     * *****************************************************
     * metodo para limpiar
     * *****************************************************
     */
    private void Limpiar() {
        txt_titulo.setText("");
        txt_contenido.setText("");
        txt_fechaCreacion.setText("");
        txt_fechaModificacion.setText("");
        txt_prioridad.setText("");

    }

    /*
     * *****************************************************
     * metodo para mostrar toda las Notas registrados
     * *****************************************************
     */
    private void CargarTablaNotas() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from tb_nota";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarNota.jTable_nota = new JTable(model);
            InterGestionarNota.jScrollPane1.setViewportView(InterGestionarNota.jTable_nota);

            model.addColumn("N°");//ID
            model.addColumn("titulo");
            model.addColumn("contenido");
            model.addColumn("fechaCreacion");
            model.addColumn("fechaModificacion");
            model.addColumn("prioridad");

            while (rs.next()) {
                Object fila[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla  de Notas: " + e);
        }
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        jTable_nota.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_nota.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    id_nota = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosNotaSeleccionada(id_nota);
                }
            }
        });

    }

    /*
     * **************************************************
     * Metodo que envia datos seleccionados
     * **************************************************
     */
    private void EnviarDatosNotaSeleccionada(int id_nota) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from tb_nota where id_nota = '" + id_nota + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_titulo.setText(rs.getString("titulo"));
                txt_contenido.setText(rs.getString("contenido"));
                txt_fechaCreacion.setText(rs.getString("fechaCreacion"));
                txt_fechaModificacion.setText(rs.getString("fechaModificacion"));
                txt_prioridad.setText(rs.getString("prioridad"));

            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar Nota: " + e);
        }
    }

}