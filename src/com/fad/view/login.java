package com.fad.view;

import com.fad.dao.usuarioDAO;
import com.fad.entities.Categoria;
import com.fad.view.movimiento.movimientos;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import rojerusan.RSNotifyFade;

public class login extends javax.swing.JFrame {

    public usuarioDAO usuarioI = new usuarioDAO();

    public login() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        getCmbCategoria(cmbCategoria);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JLabel();
        btnHome2 = new javax.swing.JLabel();
        btnHome3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Iniciar Sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        txtUser.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 141, -1));

        btnIngresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        btnHome.setBackground(new java.awt.Color(24, 45, 49));
        btnHome.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        btnHome.setText("Inicio");
        btnHome.setOpaque(true);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 410, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 260, 410));

        btnHome2.setBackground(new java.awt.Color(255, 255, 255));
        btnHome2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnHome2.setForeground(new java.awt.Color(255, 255, 255));
        btnHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/key-32 (1).png"))); // NOI18N
        btnHome2.setOpaque(true);
        btnHome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome2MouseClicked(evt);
            }
        });
        jPanel1.add(btnHome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 40, 40));

        btnHome3.setBackground(new java.awt.Color(255, 255, 255));
        btnHome3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnHome3.setForeground(new java.awt.Color(255, 255, 255));
        btnHome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/administrator-32 (1).png"))); // NOI18N
        btnHome3.setOpaque(true);
        btnHome3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome3MouseClicked(evt);
            }
        });
        jPanel1.add(btnHome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 40, 40));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 140, -1));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize-window-24.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 30, 30));

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close-window-24 (1).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setText("Rol");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        if (txtUser.getText().equals("") || txtPassword.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Los Campos estan vacíos");

        } else {

            Boolean valor = usuarioI.login(txtUser.getText(), txtPassword.getText());
            if (valor == true) {

                JOptionPane.showMessageDialog(null, "Bienvenido " + txtUser.getText());
                inicio ini = new inicio();
                ini.setVisible(true);
                this.dispose();

            } else {

                JOptionPane.showMessageDialog(null, "Usuario u contraseña Incorrectos");

            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked

    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnHome2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome2MouseClicked

    private void btnHome3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome3MouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked

    }//GEN-LAST:event_btnIngresarMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void getCmbCategoria(JComboBox cmbCategoria) {
        usuarioI.getRolCmb(cmbCategoria);
    }

    public static void main(String args[]) {

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnHome2;
    private javax.swing.JLabel btnHome3;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<Categoria> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
