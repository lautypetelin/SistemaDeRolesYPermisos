package com.devcoder.login.igu;

import com.devcoder.login.logica.Controladora;
import com.devcoder.login.logica.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalUser extends javax.swing.JFrame {

    Controladora control = null;
    int xMouse, yMouse;
    
    public PrincipalUser(Controladora control, Usuario encontrado) {
        this.control = control;
        
        initComponents();
        
        jtfUsuario.setText("Bienvenido/a: " + encontrado.getUsuario());
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraUser = new javax.swing.JPanel();
        panelUser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jtfUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        barraUser.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        barraUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraUserMouseDragged(evt);
            }
        });
        barraUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraUserMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraUserLayout = new javax.swing.GroupLayout(barraUser);
        barraUser.setLayout(barraUserLayout);
        barraUserLayout.setHorizontalGroup(
            barraUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraUserLayout.setVerticalGroup(
            barraUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Sistema Administrador de Usuarios");

        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaUsuarios);

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

        javax.swing.GroupLayout panelUserLayout = new javax.swing.GroupLayout(panelUser);
        panelUser.setLayout(panelUserLayout);
        panelUserLayout.setHorizontalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelUserLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(panelUserLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(80, 80, 80)
                        .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        panelUserLayout.setVerticalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserLayout.createSequentialGroup()
                .addGroup(panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelUserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUserLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barraUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(barraUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUserMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_barraUserMousePressed

    private void barraUserMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUserMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_barraUserMouseDragged

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        
        this.dispose();
        
        LoginInicial princ = new LoginInicial();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JPanel barraUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JPanel panelUser;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
        TablaUsuarios.getTableHeader().setReorderingAllowed(false);
        
        DefaultTableModel modeloTabla = new DefaultTableModel(){
        
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        Object columnas[] = {"ID", "Usuario", "Rol", "Descripción"};
        modeloTabla.setColumnIdentifiers(columnas);      
        
        List<Usuario> listaUsuarios = control.traerUsuarios();
        
        if(listaUsuarios != null){
            for(Usuario user: listaUsuarios){
                Object registro[] = {user.getId(), user.getUsuario(), user.getRol().getNombreRol(), user.getRol().getDescripcion()};
                modeloTabla.addRow(registro);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningún registro en la tabla.", "Información", 0);
        }

        TablaUsuarios.setModel(modeloTabla);
    }
}