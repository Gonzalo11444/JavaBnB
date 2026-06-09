/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import Clases.*;
import java.awt.Color;
import java.util.*;
import java.time.*;
import Ventana.*;

/**
 * JFrame en el que se observan las opciones como anfitrion
 * @author Pc
 */
public class AnfitrionV extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public AnfitrionV() {
        initComponents();
        Metodos.cargarDatosUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConsultaReservas = new javax.swing.JButton();
        CrearInmueble = new javax.swing.JButton();
        ModDatosPersonales = new javax.swing.JButton();
        Inmuebles = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
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

        CrearInmueble.setBackground(new java.awt.Color(51, 51, 51));
        CrearInmueble.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        CrearInmueble.setForeground(new java.awt.Color(255, 255, 255));
        CrearInmueble.setText("Crear Inmueble");
        CrearInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearInmuebleActionPerformed(evt);
            }
        });

        ModDatosPersonales.setBackground(new java.awt.Color(51, 51, 51));
        ModDatosPersonales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        ModDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        ModDatosPersonales.setText("Modificar Datos Personales");
        ModDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModDatosPersonalesActionPerformed(evt);
            }
        });

        Inmuebles.setBackground(new java.awt.Color(51, 51, 51));
        Inmuebles.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        Inmuebles.setForeground(new java.awt.Color(255, 255, 255));
        Inmuebles.setText("Inmuebles");
        Inmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InmueblesActionPerformed(evt);
            }
        });

        Logo.setFont(new java.awt.Font("Goudy Stout", 1, 20)); // NOI18N
        Logo.setText("JavaBnB");
        Logo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Logo.setIconTextGap(6);

        Logo1.setFont(new java.awt.Font("Goudy Stout", 1, 20)); // NOI18N
        Logo1.setText("ANFITRION");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addComponent(ConsultaReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrearInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Inmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                            .addComponent(ModDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Logo1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(712, 712, 712)
                        .addComponent(CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(CrearInmueble)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Inmuebles)
                .addGap(17, 17, 17)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(ConsultaReservas)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ModDatosPersonales)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(CerrarSesion)
                .addGap(46, 46, 46)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(971, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Boton para habilitar las consultas de las reservas de sus inmuebles
 * @param evt 
 */
    private void ConsultaReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaReservasActionPerformed
        this.setVisible(false);
        ArrayList<Inmueble> inmueblesAnfitrion = Metodos.obtenerInmueblesPorAnfitrion(Metodos.usuarioActual);
        ReservasAnfitrionFrame v = new ReservasAnfitrionFrame(FacturaReserva.nombreArchivo,Metodos.usuarioActual,inmueblesAnfitrion,this);
        v.setVisible(true);
    }//GEN-LAST:event_ConsultaReservasActionPerformed
/**
 * Boton que habilita la ventana para crear los inmuebles
 * @param evt 
 */
    private void CrearInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearInmuebleActionPerformed
        this.setVisible(false);
        RegistroInmueble inmueble = new RegistroInmueble();
        inmueble.setVisible(true);

    }//GEN-LAST:event_CrearInmuebleActionPerformed
/**
 * Boton que habilita la ventana para modificar los datos personales
 * @param evt 
 */
    private void ModDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModDatosPersonalesActionPerformed
        this.setVisible(false);
        ModificarDatosAnfitrion datos = new ModificarDatosAnfitrion();
        datos.setVisible(true);
    }//GEN-LAST:event_ModDatosPersonalesActionPerformed
/**
 * Boton para consultar los inmuebles del anfitrion
 * @param evt 
 */
    private void InmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InmueblesActionPerformed
        //MODIFICAR DATOS Y DAR DE BAJA
        this.setVisible(false);
        ConsultaInmueblesAnfitrion ventana = new ConsultaInmueblesAnfitrion();
        ventana.setVisible(true);
    }//GEN-LAST:event_InmueblesActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        this.setVisible(false);
        Ventana v = new Ventana();
        v.setVisible(true);
    }//GEN-LAST:event_CerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton ConsultaReservas;
    private javax.swing.JButton CrearInmueble;
    private javax.swing.JButton Inmuebles;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JButton ModDatosPersonales;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
