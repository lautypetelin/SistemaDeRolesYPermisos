package com.devcoder.login.igu;

import com.devcoder.login.logica.Controladora;
import com.devcoder.login.logica.Rol;
import com.devcoder.login.logica.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

public class ModificarUsuario extends javax.swing.JFrame {

    Controladora control = null;
    int idUsuario;
    int xMouse, yMouse;
    
    public ModificarUsuario(Controladora control, int idUsuarios) {
        this.control = control;
        this.idUsuario = idUsuarios;
        
        initComponents();
        cargarCombo();  
        
        //Buscar el usuario.
        Usuario encontrado = control.traerUsuario(idUsuarios);
        
        //Cargando datos en la interfaz.
        jtfNombre.setText(encontrado.getUsuario());
        jpfContrasenia.setText(encontrado.getContrasenia());
        jcbRoles.setSelectedItem(encontrado.getRol().getNombreRol());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraAltaUsuario = new javax.swing.JPanel();
        jbSalir = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        panelAltaUsuario = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlContrasenia = new javax.swing.JLabel();
        jpfContrasenia = new javax.swing.JPasswordField();
        jlRol = new javax.swing.JLabel();
        jcbRoles = new javax.swing.JComboBox<>();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        barraAltaUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barraAltaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        barraAltaUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraAltaUsuarioMouseDragged(evt);
            }
        });
        barraAltaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraAltaUsuarioMousePressed(evt);
            }
        });

        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("X");
        jbSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Editar Usuario");

        javax.swing.GroupLayout barraAltaUsuarioLayout = new javax.swing.GroupLayout(barraAltaUsuario);
        barraAltaUsuario.setLayout(barraAltaUsuarioLayout);
        barraAltaUsuarioLayout.setHorizontalGroup(
            barraAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraAltaUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlTitulo)
                .addGap(54, 54, 54)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraAltaUsuarioLayout.setVerticalGroup(
            barraAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraAltaUsuarioLayout.createSequentialGroup()
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(barraAltaUsuarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAltaUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNombre.setText("Nombre:");

        jtfNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlContrasenia.setText("Contraseña:");

        jpfContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlRol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlRol.setText("Rol:");

        jcbRoles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jbLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbGuardar.setText("Guardar cambios");
        jbGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAltaUsuarioLayout = new javax.swing.GroupLayout(panelAltaUsuario);
        panelAltaUsuario.setLayout(panelAltaUsuarioLayout);
        panelAltaUsuarioLayout.setHorizontalGroup(
            panelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAltaUsuarioLayout.createSequentialGroup()
                .addGroup(panelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAltaUsuarioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jbGuardar))
                    .addGroup(panelAltaUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombre)
                            .addComponent(jlContrasenia)
                            .addComponent(jlRol))
                        .addGap(18, 18, 18)
                        .addGroup(panelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNombre)
                            .addComponent(jpfContrasenia)
                            .addComponent(jcbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        panelAltaUsuarioLayout.setVerticalGroup(
            panelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAltaUsuarioLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(panelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlContrasenia)
                    .addComponent(jpfContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRol)
                    .addComponent(jcbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbGuardar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraAltaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelAltaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraAltaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAltaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraAltaUsuarioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraAltaUsuarioMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_barraAltaUsuarioMouseDragged

    private void barraAltaUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraAltaUsuarioMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_barraAltaUsuarioMousePressed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

        jtfNombre.setText(null);
        jpfContrasenia.setText(null);
        jcbRoles.setSelectedIndex(0);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        if(jtfNombre.getText().equalsIgnoreCase("") && jpfContrasenia.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Los campos no deben estar vacíos.", "Información", 0);
            return;
        }else if(jtfNombre.getText().equalsIgnoreCase("") && !jpfContrasenia.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "El campo \"Nombre\" no debe estar vacío.", "Información", 0);
            return;
        }else if(!jtfNombre.getText().equalsIgnoreCase("") && jpfContrasenia.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "El campo \"Contraseña\" no debe estar vacío.", "Información", 0);
            return;
        }

        Usuario user = control.traerUsuario(idUsuario);
        
        int id = user.getId();
        String nombre = jtfNombre.getText();
        String contrasenia = jpfContrasenia.getText();
        String rol = (String)jcbRoles.getSelectedItem();
        control.editarUsuario(user, id, nombre, contrasenia, rol);
        
        JOptionPane.showMessageDialog(this, "Usuario modificado correctamente.", "Información", 1);
        
        this.dispose();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraAltaUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbRoles;
    private javax.swing.JLabel jlContrasenia;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlRol;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPasswordField jpfContrasenia;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JPanel panelAltaUsuario;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        
        List<Rol> listaRoles = control.traerRoles();
        
        if(listaRoles != null){
            for(Rol rol: listaRoles){
                jcbRoles.addItem(rol.getNombreRol());
            }
        }
    }
}