package com.devcoder.login.igu;

import com.devcoder.login.logica.Controladora;
import com.devcoder.login.logica.Usuario;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PerfilAdmin extends javax.swing.JPanel {

    private Controladora control = null;
    
    public PerfilAdmin(Controladora control) {
        this.control = control;
        initComponents();
        setearPrivilegios();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.JPanel();
        btnCrearUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnBorrarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();

        btnCrearUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/createUser24x24.png"))); // NOI18N
        btnCrearUsuario.setText("Crear nuevo");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editUser24x24.png"))); // NOI18N
        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnBorrarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBorrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deleteUser24x24.png"))); // NOI18N
        btnBorrarUsuario.setText("Borrar");
        btnBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        
        CrearUsuario crearUsuario = new CrearUsuario(control);
        crearUsuario.setSize(1068, 579);
        crearUsuario.setLocation(0,0);

        this.removeAll();
        this.add(crearUsuario, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        
        // Verificar que la tabla tenga algun registro
        if(tblUsuarios.getRowCount() > 0){

            // Verificar que se haya seleccionado algún registro
            if(tblUsuarios.getSelectedRow() != -1){

                int idUsuario = Integer.parseInt(String.valueOf(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0)));
                
                EditarUsuario editarUsuario = new EditarUsuario(control, idUsuario);
                editarUsuario.setSize(1068,579);
                editarUsuario.setLocation(0, 0);
                
                this.removeAll();
                this.add(editarUsuario, BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
                
            }else{
                JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro para editar", "Error al editar", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La tabla no cuenta con ningún registro para editar", "Error al editar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUsuarioActionPerformed
        
        // Verificar que la tabla tenga algun registro
        if(tblUsuarios.getRowCount() > 0){

            // Verificar que se haya seleccionado algún registro
            if(tblUsuarios.getSelectedRow() != -1){

                int idUsuario = Integer.parseInt(String.valueOf(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0)));

                // Confirmar si desea eliminar dicho registro
                if(JOptionPane.showConfirmDialog(this, "¿Desea realmente eliminar este usuario?", "Confirmación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){

                    control.eliminarUsuario(idUsuario);
                    JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    cargarTabla();
                }
            }else{
                JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro para eliminar", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La tabla no cuenta con ningún registro para eliminar", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.JButton btnBorrarUsuario;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables

    private void setearPrivilegios() {

        btnCrearUsuario.setEnabled(true);
        btnEditarUsuario.setEnabled(true);
        btnBorrarUsuario.setEnabled(true);
    }

    private void cargarTabla() {
        
        // Setear que no se pueda cambiar de lugar las columnas
        tblUsuarios.getTableHeader().setReorderingAllowed(false);
        
        DefaultTableModel model = new DefaultTableModel(){
        
            // Setear que las celdas no sean editables
            @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        
        // Asignamos el nombre a las columnas
        String titulos[] = {"ID", "Nombre completo", "Correo electrónico", "Contraseña", "Rol"};  
        model.setColumnIdentifiers(titulos);
        
        // Obtenemos la lista de usuarios registrados
        List<Usuario> listaUsuarios = control.traerUsuarios();

        // Si la lista no está vacía...
        if(!listaUsuarios.isEmpty()){
            
            // Recorrer lista y cargar datos de cada objeto
            for(Usuario usuario: listaUsuarios){
                Object registro[] = {usuario.getId(), usuario.toString(), usuario.getCorreoElectronico(), usuario.getContrasenia(), usuario.getRol().getNombreRol()};
                model.addRow(registro);
            }
        }

        // Asignar el modelo a la tabla
        tblUsuarios.setModel(model);
    }
}