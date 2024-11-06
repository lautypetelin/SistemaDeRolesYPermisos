package com.devcoder.login.igu;

import com.devcoder.login.logica.Controladora;
import com.devcoder.login.logica.Rol;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class CrearUsuarioLogin extends javax.swing.JFrame {

    private Controladora control = null;
    
    public CrearUsuarioLogin(Controladora control) {
        this.control = control;
        initComponents();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        campos = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jlApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jlCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jlContrasenia1 = new javax.swing.JLabel();
        txtContrasenia1 = new javax.swing.JPasswordField();
        jlContrasenia2 = new javax.swing.JLabel();
        txtContrasenia2 = new javax.swing.JPasswordField();
        jlRol = new javax.swing.JLabel();
        cmbRoles = new javax.swing.JComboBox<>();
        logo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        botones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo.setText("Alta de usuarios");

        jlNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jlApellido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlApellido.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jlCorreo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCorreo.setText("Correo:");

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jlContrasenia1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlContrasenia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlContrasenia1.setText("Contraseña:");

        txtContrasenia1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jlContrasenia2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlContrasenia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlContrasenia2.setText("Repita la contraseña:");

        txtContrasenia2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jlRol.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlRol.setText("Rol:");

        cmbRoles.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout camposLayout = new javax.swing.GroupLayout(campos);
        campos.setLayout(camposLayout);
        camposLayout.setHorizontalGroup(
            camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, camposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(camposLayout.createSequentialGroup()
                        .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlContrasenia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlContrasenia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(camposLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtContrasenia2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtContrasenia1))))))
                    .addGroup(camposLayout.createSequentialGroup()
                        .addComponent(jlRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        camposLayout.setVerticalGroup(
            camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlContrasenia1)
                    .addComponent(txtContrasenia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlContrasenia2)
                    .addComponent(txtContrasenia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRol)
                    .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/createUser256x256.png"))); // NOI18N

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(105, 105, 105)
                .addComponent(btnVolver)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        LoginInicial princ = new LoginInicial();
        princ.setTitle("Login by Lautaro Petelin");
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if(validar()){
            return;
        }

        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String correo = txtCorreo.getText();
        String contrasenia1 = "";
        for(char character: txtContrasenia1.getPassword()){
            contrasenia1 += character;
        }
        String contrasenia2 = "";
        for(char character: txtContrasenia2.getPassword()){
            contrasenia2 += character;
        }
        if(!contrasenia1.equals(contrasenia2)){

            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error al registrar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Rol rol = (Rol)cmbRoles.getSelectedItem();

        control.crearUsuario(nombre, apellido, correo, contrasenia1, rol);

        JOptionPane.showMessageDialog(this, "Usuario registrado correctamente.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

        // Volvemos a la mostrar la ventana de login
        LoginInicial princ = new LoginInicial();
        princ.setTitle("Login by Lautaro Petelin");
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
        dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtNombre.setText(null);
        txtApellido.setText(null);
        txtCorreo.setText(null);
        txtContrasenia1.setText(null);
        txtContrasenia2.setText(null);
        cmbRoles.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel campos;
    private javax.swing.JComboBox<String> cmbRoles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlContrasenia1;
    private javax.swing.JLabel jlContrasenia2;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlRol;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContrasenia1;
    private javax.swing.JPasswordField txtContrasenia2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        List<Rol> listaRoles = control.traerRoles();
        
        model.addElement("Seleccione un rol");
        
        if(!listaRoles.isEmpty()){
            for(Rol rol: listaRoles){
                model.addElement(rol);
            }
        }
        
        cmbRoles.setModel(model);
    }
    
    private boolean validar(){
    
        if(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCorreo.getText().isEmpty() || txtContrasenia1.getPassword().length == 0 || txtContrasenia2.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos para registrar", "Error al registrar", JOptionPane.ERROR_MESSAGE);
            return true;
            
        }else if(String.valueOf(cmbRoles.getSelectedItem()).equals("Seleccione un rol")){
            
            JOptionPane.showMessageDialog(this, "Debe seleccionar un rol de la lista desplegable", "Error al registrar", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        
        return false;
    }
}