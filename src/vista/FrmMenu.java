
package vista;

import controlador.Reportes;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

/**
 *
 * @author HP
 */
public class FrmMenu extends javax.swing.JFrame {
    
    public static JDesktopPane jDesktopPane_menu;
   

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Notas y Recordatorios");
        
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0,0,ancho, (alto - 110));
        this.add(jDesktopPane_menu);
        
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_nuevo_colaborador = new javax.swing.JMenuItem();
        jMenuItem_gedtionar_colaborador = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nueva_nota = new javax.swing.JMenuItem();
        jMenuItem_gestionar_nota = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestionar_categorias = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_reporte_notas = new javax.swing.JMenuItem();
        jMenuItem_reporte_colaborador = new javax.swing.JMenuItem();
        jMenuItem_reporte_categoria = new javax.swing.JMenuItem();
        jMenuItem_reporte_usuario = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem_ver_recordatorio = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_cerarr_sesion = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(180, 30));

        jMenuItem_nuevo_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_nuevo_usuario);

        jMenuItem_gestionar_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gestionar_usuario.setText("Gestionar Usuarios");
        jMenuItem_gestionar_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu2.setText("Colaborador");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(200, 30));

        jMenuItem_nuevo_colaborador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_colaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem_nuevo_colaborador.setText("Nuevo Colaborador");
        jMenuItem_nuevo_colaborador.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nuevo_colaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_colaboradorActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_nuevo_colaborador);

        jMenuItem_gedtionar_colaborador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gedtionar_colaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenuItem_gedtionar_colaborador.setText("Gestionar Colaborador");
        jMenuItem_gedtionar_colaborador.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gedtionar_colaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gedtionar_colaboradorActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gedtionar_colaborador);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/notas.png"))); // NOI18N
        jMenu3.setText("Notas");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nueva_nota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nueva_nota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/notas-adhesivas.png"))); // NOI18N
        jMenuItem_nueva_nota.setText("Nueva Nota");
        jMenuItem_nueva_nota.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_nueva_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_notaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_nueva_nota);

        jMenuItem_gestionar_nota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_nota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/notas.png"))); // NOI18N
        jMenuItem_gestionar_nota.setText("Gestionar Notas");
        jMenuItem_gestionar_nota.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionar_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_notaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_gestionar_nota);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu4.setText("Categoria");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nueva_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_nueva_categoria.setText("Nueva Categoria");
        jMenuItem_nueva_categoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_nueva_categoria);

        jMenuItem_gestionar_categorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenuItem_gestionar_categorias.setText("Gestionar Categorias");
        jMenuItem_gestionar_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_categoriasActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_gestionar_categorias);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jMenu6.setText("Reporte");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_reporte_notas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reporte_notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte_1.png"))); // NOI18N
        jMenuItem_reporte_notas.setText("Reportes Notas");
        jMenuItem_reporte_notas.setPreferredSize(new java.awt.Dimension(230, 30));
        jMenuItem_reporte_notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reporte_notasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reporte_notas);

        jMenuItem_reporte_colaborador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reporte_colaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte_1.png"))); // NOI18N
        jMenuItem_reporte_colaborador.setText("Reportes Colaboradores");
        jMenuItem_reporte_colaborador.setPreferredSize(new java.awt.Dimension(230, 30));
        jMenuItem_reporte_colaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reporte_colaboradorActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reporte_colaborador);

        jMenuItem_reporte_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reporte_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte_1.png"))); // NOI18N
        jMenuItem_reporte_categoria.setText("Reporte Categoria");
        jMenuItem_reporte_categoria.setPreferredSize(new java.awt.Dimension(230, 30));
        jMenuItem_reporte_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reporte_categoriaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reporte_categoria);

        jMenuItem_reporte_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reporte_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte_1.png"))); // NOI18N
        jMenuItem_reporte_usuario.setText("Reporte Usuarios");
        jMenuItem_reporte_usuario.setPreferredSize(new java.awt.Dimension(230, 30));
        jMenuItem_reporte_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reporte_usuarioActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reporte_usuario);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/notificaciones.png"))); // NOI18N
        jMenu7.setText("Recordatorio");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_ver_recordatorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_ver_recordatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recordatorio.png"))); // NOI18N
        jMenuItem_ver_recordatorio.setText("Ver Recordatorio");
        jMenuItem_ver_recordatorio.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_ver_recordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ver_recordatorioActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_ver_recordatorio);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesion");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_cerarr_sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_cerarr_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem_cerarr_sesion.setText("Cerrar Sesion");
        jMenuItem_cerarr_sesion.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_cerarr_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerarr_sesionActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem_cerarr_sesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
       InterUsuario interUsuario =new InterUsuario();
       jDesktopPane_menu.add(interUsuario);
       interUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

    private void jMenuItem_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_categoriaActionPerformed
       InterCategoria interCategoria = new  InterCategoria();
       jDesktopPane_menu.add(interCategoria);
       interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_categoriaActionPerformed

    private void jMenuItem_gestionar_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_categoriasActionPerformed
       
        InterGestionarCategoria interGestionarCategoria =  new InterGestionarCategoria();
        jDesktopPane_menu.add(interGestionarCategoria);
        interGestionarCategoria .setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_categoriasActionPerformed

    private void jMenuItem_nueva_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_notaActionPerformed
       
        InterNota interNota =  new InterNota();
        jDesktopPane_menu.add(interNota);
        interNota .setVisible(true);
        
    }//GEN-LAST:event_jMenuItem_nueva_notaActionPerformed

    private void jMenuItem_nuevo_colaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_colaboradorActionPerformed
        InterColaborador interColaborador = new  InterColaborador();
       jDesktopPane_menu.add(interColaborador);
       interColaborador.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_colaboradorActionPerformed

    private void jMenuItem_cerarr_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerarr_sesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_cerarr_sesionActionPerformed

    private void jMenuItem_gedtionar_colaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gedtionar_colaboradorActionPerformed
        InterGestionarColaborador interGestionarColaborador =  new InterGestionarColaborador();
        jDesktopPane_menu.add(interGestionarColaborador);
        interGestionarColaborador .setVisible(true);
    }//GEN-LAST:event_jMenuItem_gedtionar_colaboradorActionPerformed

    private void jMenuItem_gestionar_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_notaActionPerformed
       InterGestionarNota interGestionarNota =  new InterGestionarNota();
        jDesktopPane_menu.add(interGestionarNota);
         interGestionarNota.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem_gestionar_notaActionPerformed

    private void jMenuItem_gestionar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_usuarioActionPerformed
        InterGestionarUsuario gestionarUsuario =  new InterGestionarUsuario();
        jDesktopPane_menu.add(gestionarUsuario);
         gestionarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_usuarioActionPerformed

    private void jMenuItem_reporte_notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reporte_notasActionPerformed
        Reportes reportes = new Reportes();
        reportes.ReportesNotas();
    }//GEN-LAST:event_jMenuItem_reporte_notasActionPerformed

    private void jMenuItem_reporte_colaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reporte_colaboradorActionPerformed
        Reportes reportes = new Reportes();
        reportes.ReportesColaboradores();
        
        
    }//GEN-LAST:event_jMenuItem_reporte_colaboradorActionPerformed

    private void jMenuItem_reporte_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reporte_categoriaActionPerformed
         Reportes reportes = new Reportes();
         reportes.ReportesCategorias();
    }//GEN-LAST:event_jMenuItem_reporte_categoriaActionPerformed

    private void jMenuItem_reporte_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reporte_usuarioActionPerformed
        Reportes reportes = new Reportes();
        reportes.ReportesUsuarios();
    }//GEN-LAST:event_jMenuItem_reporte_usuarioActionPerformed

    private void jMenuItem_ver_recordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ver_recordatorioActionPerformed
        InterRecordatorio interRecordatorio=new InterRecordatorio();
        jDesktopPane_menu.add(interRecordatorio);
         interRecordatorio.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ver_recordatorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem_cerarr_sesion;
    private javax.swing.JMenuItem jMenuItem_gedtionar_colaborador;
    private javax.swing.JMenuItem jMenuItem_gestionar_categorias;
    private javax.swing.JMenuItem jMenuItem_gestionar_nota;
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem_nueva_nota;
    private javax.swing.JMenuItem jMenuItem_nuevo_colaborador;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reporte_categoria;
    private javax.swing.JMenuItem jMenuItem_reporte_colaborador;
    private javax.swing.JMenuItem jMenuItem_reporte_notas;
    private javax.swing.JMenuItem jMenuItem_reporte_usuario;
    private javax.swing.JMenuItem jMenuItem_ver_recordatorio;
    // End of variables declaration//GEN-END:variables
}
