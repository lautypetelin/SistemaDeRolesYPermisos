package com.devcoder.login.igu;

import com.devcoder.login.logica.Controladora;
import com.devcoder.login.logica.Usuario;

public class LoginInicial extends javax.swing.JFrame {

    Controladora control = null;
    int xMouse, yMouse;
    
    public LoginInicial() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraLogin = new javax.swing.JPanel();
        jbSalir = new javax.swing.JButton();
        panelLogin = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jlContrasenia = new javax.swing.JLabel();
        jpfContrasenia = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jbLogin = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaMensaje = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        barraLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        barraLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraLoginMouseDragged(evt);
            }
        });
        barraLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraLoginMousePressed(evt);
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

        javax.swing.GroupLayout barraLoginLayout = new javax.swing.GroupLayout(barraLogin);
        barraLogin.setLayout(barraLoginLayout);
        barraLoginLayout.setHorizontalGroup(
            barraLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLoginLayout.setVerticalGroup(
            barraLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jlTitulo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("LOGIN");

        jlUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlUsuario.setText("Usuario:");

        jtfUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlContrasenia.setText("Contraseña:");

        jpfContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jbLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbLogin.setText("Login");
        jbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jtaMensaje.setEditable(false);
        jtaMensaje.setColumns(20);
        jtaMensaje.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jtaMensaje.setRows(5);
        jScrollPane1.setViewportView(jtaMensaje);

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlUsuario)
                                    .addComponent(jlContrasenia))
                                .addGap(18, 18, 18)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jpfContrasenia)
                                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbLogin)
                .addGap(58, 58, 58)
                .addComponent(jbLimpiar)
                .addGap(67, 67, 67))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addComponent(jlTitulo)
                .addGap(24, 24, 24)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUsuario))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlContrasenia))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLogin)
                    .addComponent(jbLimpiar))
                .addGap(24, 24, 24)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barraLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(barraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        
        jtfUsuario.setText(null);
        jpfContrasenia.setText(null);
        jtaMensaje.setText(null);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed

        if(jtfUsuario.getText().equalsIgnoreCase("") && jpfContrasenia.getText().equalsIgnoreCase("")){
            jtaMensaje.setText("Los campos no deben estar vacíos.");
            return;
        }else if(jtfUsuario.getText().equalsIgnoreCase("") && !jpfContrasenia.getText().equalsIgnoreCase("")){
            jtaMensaje.setText("El campo \"Usuario\" no debe estar vacío.");
            return;
        }else if(!jtfUsuario.getText().equalsIgnoreCase("") && jpfContrasenia.getText().equalsIgnoreCase("")){
            jtaMensaje.setText("El campo \"Contraseña\" no debe estar vacío.");
            return;
        }
        
        String usuario = jtfUsuario.getText();
        String contrasenia = jpfContrasenia.getText();
        
        Usuario encontrado = control.validarUsuario(usuario, contrasenia);
        
        if(encontrado != null){
            
            String rol = encontrado.getRol().getNombreRol();
            
            if(rol.equalsIgnoreCase("admin")){
                
                PrincipalAdmin princAdmin = new PrincipalAdmin(control, encontrado);
                princAdmin.setVisible(true);
                princAdmin.setLocationRelativeTo(null);
                this.dispose();
                
            }else if(rol.equalsIgnoreCase("user")){
                
                PrincipalUser princUser = new PrincipalUser(control, encontrado);
                princUser.setVisible(true);
                princUser.setLocationRelativeTo(null);
                this.dispose();
                
            }
        }else{
            jtaMensaje.setText("Usuario y/o contraseña incorrectos.");
        }
    }//GEN-LAST:event_jbLoginActionPerformed

    private void barraLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraLoginMousePressed
                
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_barraLoginMousePressed

    private void barraLoginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraLoginMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraLoginMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraLogin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbLogin;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlContrasenia;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpfContrasenia;
    private javax.swing.JTextArea jtaMensaje;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JPanel panelLogin;
    // End of variables declaration//GEN-END:variables

}