package vista;

import conexion.Conexion;
import java.sql.Connection;
import controlador.Ctrl_Categoria;
import controlador.Ctrl_Colaborador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
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
import modelo.Categoria;
import modelo.Colaborador;

/**
 *
 * @author ediso
 */
public class InterGestionarColaborador extends javax.swing.JInternalFrame {

    private int id_colaborador;
    int obtenerId_categoriaCombo = 0;

    public InterGestionarColaborador() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Colaboradores");
        //Cargar tabla
        this.CargarTablaColaboradores();
        this.CargarComboCategoria();

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
        jTable_colaborador = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_nota = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Colaboradores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_colaborador.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_colaborador);

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
        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nota:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Descripcion:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Categoria:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, -1));

        txt_nota.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_notaActionPerformed(evt);
            }
        });
        jPanel3.add(txt_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, -1));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionActionPerformed(evt);
            }
        });
        jPanel3.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 170, -1));

        jComboBox_categoria.setBackground(new java.awt.Color(0, 204, 204));
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selccionar Categoria", "Item 2", "Item 3", "Item 4" }));
        jComboBox_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_categoriaActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 100));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        Colaborador colaborador = new Colaborador();
        Ctrl_Colaborador ctrl_Colaborador = new Ctrl_Colaborador();
        String categoria = "";
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();
        //validar los campos 
        if (txt_nombre.getText().isEmpty()|| txt_apellido.getText().isEmpty()|| txt_nota.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "complete todos los campos");
        } else {
            //colsunta para ver si el colaborador ya existe
                if (categoria.equalsIgnoreCase("Selecione categoria:")) {
                    JOptionPane.showMessageDialog(null, "Selcione categoria");
                } else {
                    try {
                        colaborador.setNombre(txt_nombre.getText().trim());
                        colaborador.setApellido(txt_apellido.getText().trim());
                        String notaTXT = "";
                        double nota = 0.0;
                        notaTXT = txt_nota.getText().trim();
                        boolean aux = false;
                        
                        //si el usuario ingres con coma lo convertimos a punto
                        for(int i=0; i < notaTXT.length(); i++){
                            
                            if(notaTXT.charAt(i)== ','){
                                String notaNuevo = notaTXT.replace(",", ".");
                                nota = Double.parseDouble(notaNuevo);
                                aux = true;
                            }
                        }
                        //evaluar la condicion
                        if(aux == true){
                            colaborador.setNota(nota);
                        }else{
                            nota = Double.parseDouble(notaTXT);
                            colaborador.setNota(nota);    
                        }
                        colaborador.setDescripcion(txt_descripcion.getText().trim());
                        //id_categoria  cargar metodo que obtiene el id de categoria
                        this.Idcategoria();
                        colaborador.setId_categoria(obtenerId_categoriaCombo);
                        
                        if (ctrl_Colaborador.actualizar(colaborador, id_colaborador)) {
                            JOptionPane.showMessageDialog(null, "Registro Actualizado");
                            this.CargarComboCategoria();
                            this.CargarTablaColaboradores();
                            this.Limpiar();
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Actualizar");
                        }
                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.println("Erro en: " + e);
                    }
                }
          
        }
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        Ctrl_Colaborador ctrl_Colaborador = new Ctrl_Colaborador();
        if(id_colaborador == 0){
            JOptionPane.showMessageDialog(null, "Seleccione un  Colaborador");  
        }else{
            if (!ctrl_Colaborador.eliminar(id_colaborador)) {
                JOptionPane.showMessageDialog(null, " Colaborador Eliminado");
                this.CargarTablaColaboradores();
                this.CargarComboCategoria();
                this.Limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, " Error al Eliminar Colaborador ");
            }
        }
        
        
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_notaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaActionPerformed

    private void txt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionActionPerformed

    private void jComboBox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_categoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
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
    public static javax.swing.JTable jTable_colaborador;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nota;
    // End of variables declaration//GEN-END:variables
    
    /*
     * *****************************************************
     * metodo para limpiar
     * *****************************************************
     */
    private void Limpiar() {
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_nota.setText("");
        txt_descripcion.setText("");
        jComboBox_categoria.setSelectedItem("Seleccione categoria:");
    }
    
    
    /*
     * *****************************************************
     * metodo para cargar las categorias en el Jcombox
     * *****************************************************
     */
    private void CargarComboCategoria() {
        Connection cn = Conexion.conectar();
        String sql = "select *from tb_categoria";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Seleccione categoria:");
            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descripcion"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("¡Error al cargar categorias!");
        }

    }

    /*
     * *****************************************************
     * metodo para mostrar todos los colaboradores registrados
     * *****************************************************
     */
    String descripcionCategoria = "";
    double  nota = 0.0;
    
    private void CargarTablaColaboradores() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select tb_colaborador.id_colaborador, tb_colaborador.nombre, tb_colaborador.apellido, tb_colaborador.nota, tb_colaborador.descripcion,tb_categoria.descripcion from tb_colaborador As tb_colaborador, tb_categoria As tb_categoria where tb_colaborador.id_categoria = tb_categoria.id_categoria;";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarColaborador.jTable_colaborador = new JTable(model);
            InterGestionarColaborador.jScrollPane1.setViewportView(InterGestionarColaborador.jTable_colaborador);

            model.addColumn("N°");//ID
            model.addColumn("nombre");
            model.addColumn("apellido");
            model.addColumn("nota");
            model.addColumn("descripcion");
            model.addColumn("categoria");

            while (rs.next()) {
                
                nota = rs.getDouble("nota");
                
                Object fila[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla  de colaboradores: " + e);
        }
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        jTable_colaborador.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_colaborador.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    id_colaborador = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosColaboradorSeleccionada(id_colaborador);
                }
            }
        });

    }

    /*
     * **************************************************
     * Metodo que envia datos seleccionados
     * **************************************************
     */
    private void EnviarDatosColaboradorSeleccionada(int id_colaborador) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from tb_colaborador where id_colaborador = '" + id_colaborador + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_nombre.setText(rs.getString("nombre"));
                txt_apellido.setText(rs.getString("apellido"));
                txt_nota.setText(rs.getString("nota"));
                txt_descripcion.setText(rs.getString("descripcion"));
                int id_cate = rs.getInt("id_categoria");
                jComboBox_categoria.setSelectedItem(relacionarCategoria(id_cate));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar colaborador: " + e);
        }
    }
    
    
     /*
     * **************************************************
     * Metodo para relacionar categorias
     * **************************************************
     */
    private String relacionarCategoria(int id_categoria) {

        String sql = "select descripcion from tb_categoria where id_categoria = '" + id_categoria + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                descripcionCategoria = rs.getString("descripcion");
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("¡Error al obtener el id de la categoria!");
        }
        return descripcionCategoria;
    }
    //metodo para obtener el id categoria
    
        private int Idcategoria(){
            String sql = "select * from tb_categoria where descripcion = '"+ this.jComboBox_categoria.getSelectedItem() +"'";
            Statement st;
            try {
                Connection cn = Conexion.conectar();
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    obtenerId_categoriaCombo = rs.getInt("id_categoria");
                    
                }
            } catch (SQLException e) {
                System.out.println("Erro al obtener el id categoria" );
            }
            return obtenerId_categoriaCombo;
        }
}
