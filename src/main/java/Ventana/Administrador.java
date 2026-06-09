/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import Clases.*;
import java.awt.Color;
import java.util.*;
import java.time.*;

/**
 * JFrame Administrador que permite observar todos los usuarios, inmuebles y reservas del sistema
 * @author Pc
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Administrador() {
        initComponents();
        Metodos.cargarDatosUsuarios();
        Metodos.cargarDatosInmuebles();
        Metodos.cargarDatosReservas();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConsultaReservas = new javax.swing.JButton();
        ConsultaUsuarios = new javax.swing.JButton();
        ConsultaInmuebles = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Logo1 = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ConsultaReservas.setBackground(new java.awt.Color(51, 51, 51));
        ConsultaReservas.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        ConsultaReservas.setForeground(new java.awt.Color(255, 255, 255));
        ConsultaReservas.setText("Consulta Reservas");
        ConsultaReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaReservasActionPerformed(evt);
            }
        });

        ConsultaUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        ConsultaUsuarios.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        ConsultaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        ConsultaUsuarios.setText("Consulta Usuarios");
        ConsultaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaUsuariosActionPerformed(evt);
            }
        });

        ConsultaInmuebles.setBackground(new java.awt.Color(51, 51, 51));
        ConsultaInmuebles.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        ConsultaInmuebles.setForeground(new java.awt.Color(255, 255, 255));
        ConsultaInmuebles.setText("Consulta Inmuebles");
        ConsultaInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaInmueblesActionPerformed(evt);
            }
        });

        Logo.setFont(new java.awt.Font("Goudy Stout", 1, 20)); // NOI18N
        Logo.setText("JavaBnB");
        Logo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Logo.setIconTextGap(6);

        Logo1.setFont(new java.awt.Font("Goudy Stout", 1, 20)); // NOI18N
        Logo1.setText("Administrador");
        Logo1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Logo1.setIconTextGap(6);

        CerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        CerrarSesion.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addComponent(ConsultaReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConsultaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConsultaInmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Logo1)
                            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(CerrarSesion)
                .addGap(68, 68, 68)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(ConsultaUsuarios)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(ConsultaInmuebles)
                .addGap(17, 17, 17)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(ConsultaReservas)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        setSize(new java.awt.Dimension(971, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Boton que habilita el jframe de las facturas
 * @param evt 
 */
    private void ConsultaReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaReservasActionPerformed
        this.setVisible(false);
        FacturasAdmin frame = new FacturasAdmin(FacturaReserva.nombreArchivo);
        frame.setVisible(true);
    }//GEN-LAST:event_ConsultaReservasActionPerformed
/**
 * Boton que habilita el jframe de consultasusuarios
 * @param evt 
 */
    private void ConsultaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaUsuariosActionPerformed
        this.setVisible(false);
        ConsultaUsuarios datos = new ConsultaUsuarios();
        datos.setVisible(true);
    }//GEN-LAST:event_ConsultaUsuariosActionPerformed
/**
 * Boton que habilita la consulta de los inmuebles
 * @param evt 
 */
    private void ConsultaInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaInmueblesActionPerformed
        this.setVisible(false);
        ConsultaInmuebles inmuebles = new ConsultaInmuebles();
        inmuebles.setVisible(true);
    }//GEN-LAST:event_ConsultaInmueblesActionPerformed
/**
 * Boton que cierra la sesion en el sistema
 * @param evt 
 */
    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        this.setVisible(false);
        Ventana v = new Ventana();
        v.setVisible(true);
    }//GEN-LAST:event_CerrarSesionActionPerformed
    
             
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton ConsultaInmuebles;
    private javax.swing.JButton ConsultaReservas;
    private javax.swing.JButton ConsultaUsuarios;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
