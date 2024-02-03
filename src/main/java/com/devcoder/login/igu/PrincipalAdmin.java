package com.devcoder.login.igu;

import com.devcoder.login.logica.Controladora;
import com.devcoder.login.logica.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalAdmin extends javax.swing.JFrame {

    Controladora control = null;
    Usuario encontrado = null;
    int xMouse, yMouse;
    
    public PrincipalAdmin(Controladora control, Usuario encontrado) {
        this.control = control;
        this.encontrado = encontrado;
        initComponents();
        
        jtfUsuario.setText("Bienvenido/a: " + encontrado.getUsuario());
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraAdmin = new javax.swing.JPanel();
        panelAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jbCrearUsuario = new javax.swing.JButton();
        jbEditarUsuario = new javax.swing.JButton();
        jbBorrarUsuario = new javax.swing.JButton();
        jbRecargarTabla = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtfUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        barraAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        barraAdmin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraAdminMouseDragged(evt);
            }
        });
        barraAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraAdminMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraAdminLayout = new javax.swing.GroupLayout(barraAdmin);
        barraAdmin.setLayout(barraAdminLayout);
        barraAdminLayout.setHorizontalGroup(
            barraAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraAdminLayout.setVerticalGroup(
            barraAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Sistema Administrador de Usuarios");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        jbCrearUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbCrearUsuario.setText("Crear nuevo usuario");
        jbCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearUsuarioActionPerformed(evt);
            }
        });

        jbEditarUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbEditarUsuario.setText("Editar usuario");
        jbEditarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarUsuarioActionPerformed(evt);
            }
        });

        jbBorrarUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbBorrarUsuario.setText("Borrar usuario");
        jbBorrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarUsuarioActionPerformed(evt);
            }
        });

        jbRecargarTabla.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbRecargarTabla.setText("Recargar tabla");
        jbRecargarTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRecargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRecargarTablaActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbSalir.setText("Cerrar sesión");
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtfUsuario.setEditable(false);
        jtfUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfUsuario.setBorder(null);

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbBorrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbEditarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbRecargarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(80, 80, 80)
                        .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addComponent(jbCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barraAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(barraAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraAdminMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraAdminMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_barraAdminMouseDragged

    private void barraAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraAdminMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_barraAdminMousePressed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        LoginInicial princ = new LoginInicial();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarUsuarioActionPerformed
        
        //Validar que la tabla contenga algún registro.
        if(tablaUsuarios.getRowCount() > 0){
            //Validar que se haya seleccionado un registro.
            if(tablaUsuarios.getSelectedRow() != -1){
                //Obtener la ID del elemento a eliminar.
                int idUsuario = (int)tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0);
                //Llamar al método borrar.
                control.eliminarUsuario(idUsuario);
                //Notificamos al usuario.
                JOptionPane.showMessageDialog(this, "El usuario se ha eliminado correctamente.", "Información", 1);
                //Actualizar la tabla.
                cargarTabla();
            }else{
                JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro.", "Información", 0);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La tabla no contiene ningún registro.", "Información", 0);
        }
    }//GEN-LAST:event_jbBorrarUsuarioActionPerformed

    private void jbCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearUsuarioActionPerformed
    
        AltaUsuario altaUser = new AltaUsuario(control, encontrado);
        altaUser.setVisible(true);
        altaUser.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jbCrearUsuarioActionPerformed

    private void jbRecargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRecargarTablaActionPerformed
        this.cargarTabla();
    }//GEN-LAST:event_jbRecargarTablaActionPerformed

    private void jbEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarUsuarioActionPerformed
        
        //Validar que la tabla contenga algún registro.
        if(tablaUsuarios.getRowCount() > 0){
            //Validar que se haya seleccionado un registro.
            if(tablaUsuarios.getSelectedRow() != -1){
                //Obtener la ID del elemento a eliminar.
                int idUsuario = (int)tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0);
                //Llamar a la ventana de edición.                
                ModificarUsuario modifUser = new ModificarUsuario(control, idUsuario);
                modifUser.setVisible(true);
                modifUser.setLocationRelativeTo(null);
                
                //Actualizar la tabla.
                cargarTabla();
            }else{
                JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro.", "Información", 0);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La tabla no contiene ningún registro.", "Información", 0);
        }
    }//GEN-LAST:event_jbEditarUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrarUsuario;
    private javax.swing.JButton jbCrearUsuario;
    private javax.swing.JButton jbEditarUsuario;
    private javax.swing.JButton jbRecargarTabla;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        
        tablaUsuarios.getTableHeader().setReorderingAllowed(false);
        
        DefaultTableModel modeloTabla = new DefaultTableModel(){
        
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        Object columnas[] = {"ID", "Usuario", "Contraseña", "Rol"};
        modeloTabla.setColumnIdentifiers(columnas);
        
        List<Usuario> listaUsuarios = control.traerUsuarios();
        
        if(listaUsuarios != null){
            for(Usuario user: listaUsuarios){
                Object registro[] = {user.getId(), user.getUsuario(), user.getContrasenia(), user.getRol().getNombreRol()};
                modeloTabla.addRow(registro);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningún registro en la tabla.", "Información", 0);
        }
        
        tablaUsuarios.setModel(modeloTabla);
    }

}