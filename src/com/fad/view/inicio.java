/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fad.view;

import com.fad.dao.usuarioDAO;
import com.fad.view.categoria.*;
import com.fad.view.existencia.*;
import com.fad.view.inicio;
import com.fad.view.movimiento.movimientos;
import com.fad.view.producto.productos;
import com.fad.view.reporte.reportes;
import com.fad.view.user.usuarios;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;

/**
 *
 * @author edist
 */
public class inicio extends javax.swing.JFrame {

    usuarioDAO usuarioI = new usuarioDAO();
    
    public inicio() {

        initComponents();
        txtUserSession1.setText(usuarioI.getUsuarioSession().getNombreUser().toUpperCase());
        txtRolSession.setText(usuarioI.categoria(usuarioI.getUsuarioSession().getRolUser()));
        rsscalelabel.RSScaleLabel.setScaleLabel(lblResultadosUsuarios, "src/images/usuarios.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblResultadosExistencias, "src/images/existencias.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblResultadosMovimientos, "src/images/movimientos.png");
        setLocationRelativeTo(null);
        System.out.println("este es el usuario que se logeo: " + usuarioI.getUsuarioSession().getNombreUser());
        
        this.setResizable(false);

        
    }

    public void setColor(JLabel j) {

        j.setBackground(new Color(2, 183, 243));
    }

    public void resetColor(JLabel jl) {

        jl.setBackground(new Color(0, 154, 251));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblExistencia = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblMovimiento = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblReporte = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblResultadosUsuarios = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblResultadosExistencias = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblResultadosMovimientos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnHome4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtRolSession = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUserSession1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(26, 120, 174));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA DE GESTIÓN DE INVENTARIOS \"FAD\"");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 870, 50));

        btnHome.setBackground(new java.awt.Color(24, 45, 49));
        btnHome.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.png"))); // NOI18N
        btnHome.setMaximumSize(new java.awt.Dimension(700, 313));
        btnHome.setOpaque(true);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 61));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1270, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 154, 251));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        lblInicio.setBackground(new java.awt.Color(0, 154, 251));
        lblInicio.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("Inicio");
        lblInicio.setOpaque(true);
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicioMouseExited(evt);
            }
        });
        jPanel4.add(lblInicio);

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel4.add(jLabel15);

        lblProducto.setBackground(new java.awt.Color(0, 154, 251));
        lblProducto.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto.setText("Productos");
        lblProducto.setOpaque(true);
        lblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblProductoMouseExited(evt);
            }
        });
        jPanel4.add(lblProducto);

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel4.add(jLabel16);

        lblExistencia.setBackground(new java.awt.Color(0, 154, 251));
        lblExistencia.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        lblExistencia.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencia.setText("Existencias");
        lblExistencia.setOpaque(true);
        lblExistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExistenciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExistenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExistenciaMouseExited(evt);
            }
        });
        jPanel4.add(lblExistencia);

        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel4.add(jLabel17);

        lblMovimiento.setBackground(new java.awt.Color(0, 154, 251));
        lblMovimiento.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        lblMovimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblMovimiento.setText("Movimientos");
        lblMovimiento.setOpaque(true);
        lblMovimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovimientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMovimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMovimientoMouseExited(evt);
            }
        });
        jPanel4.add(lblMovimiento);

        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel4.add(jLabel18);

        lblUsuario.setBackground(new java.awt.Color(0, 154, 251));
        lblUsuario.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuarios");
        lblUsuario.setOpaque(true);
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseExited(evt);
            }
        });
        jPanel4.add(lblUsuario);

        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel4.add(jLabel21);

        lblCategoria.setBackground(new java.awt.Color(0, 154, 251));
        lblCategoria.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Categorías");
        lblCategoria.setOpaque(true);
        lblCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCategoriaMouseExited(evt);
            }
        });
        jPanel4.add(lblCategoria);

        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel4.add(jLabel19);

        lblReporte.setBackground(new java.awt.Color(0, 154, 251));
        lblReporte.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        lblReporte.setForeground(new java.awt.Color(255, 255, 255));
        lblReporte.setText("Reportes");
        lblReporte.setOpaque(true);
        lblReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReporteMouseExited(evt);
            }
        });
        jPanel4.add(lblReporte);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1210, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(250, 203, 69));

        lblResultadosUsuarios.setText("jLabel2");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblResultadosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblResultadosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(156, 100, 240));

        lblResultadosExistencias.setBackground(new java.awt.Color(0, 0, 0));
        lblResultadosExistencias.setText("jLabel2");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblResultadosExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblResultadosExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(74, 189, 62));

        lblResultadosMovimientos.setText("jLabel2");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblResultadosMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblResultadosMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(26, 120, 174));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(65, 168, 54));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Movimientos");

        jLabel3.setBackground(new java.awt.Color(26, 120, 174));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(215, 173, 4));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuarios");

        jLabel4.setBackground(new java.awt.Color(118, 62, 203));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(118, 62, 203));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Existencias");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 101, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1220, 520));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1260, 590));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome4.setBackground(new java.awt.Color(255, 255, 255));
        btnHome4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnHome4.setForeground(new java.awt.Color(255, 255, 255));
        btnHome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/administrator-32 (1).png"))); // NOI18N
        btnHome4.setOpaque(true);
        btnHome4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome4MouseClicked(evt);
            }
        });
        jPanel5.add(btnHome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 40, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gear-2-16.png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout-16.png"))); // NOI18N
        jLabel9.setText("Cerrar Sesión");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, -1, 40));

        txtRolSession.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtRolSession.setForeground(new java.awt.Color(102, 102, 102));
        txtRolSession.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtRolSession.setText("Rol");
        jPanel5.add(txtRolSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 160, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/group-16.png"))); // NOI18N
        jLabel11.setText("Rol:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, 40));

        txtUserSession1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUserSession1.setForeground(new java.awt.Color(102, 102, 102));
        txtUserSession1.setText("Nombre");
        jPanel5.add(txtUserSession1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 110, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user-16.png"))); // NOI18N
        jLabel22.setText("Bienvenido:");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1260, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductoMouseClicked
        productos pro = new productos();
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProductoMouseClicked

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked

    }//GEN-LAST:event_lblInicioMouseClicked

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        if (usuarioI.getUsuarioSession().getIdUsuario() == 1) {
            usuarios user = new usuarios();
            user.setVisible(true);
            this.dispose();
        } else {
            mensajeError("No tiene los permisos para ingresar a esta interfaz");
        }
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void lblExistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExistenciaMouseClicked
        existencias ex = new existencias();
        ex.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblExistenciaMouseClicked

    private void lblMovimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovimientoMouseClicked
        movimientos mov = new movimientos();
        mov.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMovimientoMouseClicked

    private void lblReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReporteMouseClicked
        reportes report = new reportes();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblReporteMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked

    }//GEN-LAST:event_btnHomeMouseClicked

    private void lblCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoriaMouseClicked
        if (usuarioI.getUsuarioSession().getIdUsuario() == 1) {
            categorias cat = new categorias();
            cat.setVisible(true);
            this.dispose();
        } else {
            mensajeError("No tiene los permisos para ingresar a esta interfaz");
        }
    }//GEN-LAST:event_lblCategoriaMouseClicked

    private void lblInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseEntered
        setColor(lblInicio);
    }//GEN-LAST:event_lblInicioMouseEntered

    private void lblInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseExited
        resetColor(lblInicio);
    }//GEN-LAST:event_lblInicioMouseExited

    private void lblProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductoMouseEntered
        setColor(lblProducto);
    }//GEN-LAST:event_lblProductoMouseEntered

    private void lblProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductoMouseExited
        resetColor(lblProducto);
    }//GEN-LAST:event_lblProductoMouseExited

    private void lblExistenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExistenciaMouseEntered
        setColor(lblExistencia);  
    }//GEN-LAST:event_lblExistenciaMouseEntered

    private void lblExistenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExistenciaMouseExited
        resetColor(lblExistencia);
    }//GEN-LAST:event_lblExistenciaMouseExited

    private void lblMovimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovimientoMouseEntered
        setColor(lblMovimiento);     
    }//GEN-LAST:event_lblMovimientoMouseEntered

    private void lblMovimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovimientoMouseExited
        resetColor(lblMovimiento);
    }//GEN-LAST:event_lblMovimientoMouseExited

    private void lblUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseEntered
        setColor(lblUsuario);
    }//GEN-LAST:event_lblUsuarioMouseEntered

    private void lblUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseExited
        resetColor(lblUsuario);        
    }//GEN-LAST:event_lblUsuarioMouseExited

    private void lblCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoriaMouseEntered
        setColor(lblCategoria);        
    }//GEN-LAST:event_lblCategoriaMouseEntered

    private void lblCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoriaMouseExited
        resetColor(lblCategoria);         
    }//GEN-LAST:event_lblCategoriaMouseExited

    private void lblReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReporteMouseEntered
        setColor(lblReporte);      
    }//GEN-LAST:event_lblReporteMouseEntered

    private void lblReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReporteMouseExited
        resetColor(lblReporte);      
    }//GEN-LAST:event_lblReporteMouseExited

    private void btnHome4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int option = JOptionPane.showConfirmDialog(null, "¿Desea Cerrar su Sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        System.out.println("opcion:" + option);
        if (option == 0) {
            login log = new login();
            log.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    /**
     * Metodos*
     */
    private void mensajeInfo(String mensaje) {
        new rojerusan.RSNotifyFade("Información", mensaje, 5, RSNotifyFade.PositionNotify.TopRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
    }

    private void mensajeError(String mensaje) {
        new rojerusan.RSNotifyFade("Error", mensaje, 5, RSNotifyFade.PositionNotify.TopRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnHome4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblMovimiento;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblReporte;
    private javax.swing.JLabel lblResultadosExistencias;
    private javax.swing.JLabel lblResultadosMovimientos;
    private javax.swing.JLabel lblResultadosUsuarios;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel txtRolSession;
    private javax.swing.JLabel txtUserSession1;
    // End of variables declaration//GEN-END:variables

}
