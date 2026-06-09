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
 * JFrame que muestra todas las opciones para un particular 
 * @author Pc
 */
public class ParticularV extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    /**
     * constructor vacio
     */
    public ParticularV() {
        initComponents();
        Metodos.cargarDatosUsuarios();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReseñasInmuebles = new javax.swing.JButton();
        BusquedaInmueble = new javax.swing.JButton();
        ModDatosPersonales = new javax.swing.JButton();
        ReservaConsultaInmuebles = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Logo1 = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ReseñasInmuebles.setBackground(new java.awt.Color(51, 51, 51));
        ReseñasInmuebles.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        ReseñasInmuebles.setForeground(new java.awt.Color(255, 255, 255));
        ReseñasInmuebles.setText("Reseñas Inmuebles");
        ReseñasInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReseñasInmueblesActionPerformed(evt);
            }
        });

        BusquedaInmueble.setBackground(new java.awt.Color(51, 51, 51));
        BusquedaInmueble.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        BusquedaInmueble.setForeground(new java.awt.Color(255, 255, 255));
        BusquedaInmueble.setText("Búsqueda inmuebles");
        BusquedaInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaInmuebleActionPerformed(evt);
            }
        });

        ModDatosPersonales.setBackground(new java.awt.Color(51, 51, 51));
        ModDatosPersonales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        ModDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        ModDatosPersonales.setText("Mod. Datos Personales");
        ModDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModDatosPersonalesActionPerformed(evt);
            }
        });

        ReservaConsultaInmuebles.setBackground(new java.awt.Color(51, 51, 51));
        ReservaConsultaInmuebles.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        ReservaConsultaInmuebles.setForeground(new java.awt.Color(255, 255, 255));
        ReservaConsultaInmuebles.setText("Reservas");
        ReservaConsultaInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservaConsultaInmueblesActionPerformed(evt);
            }
        });

        Logo.setFont(new java.awt.Font("Goudy Stout", 1, 20)); // NOI18N
        Logo.setText("JavaBnB");
        Logo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Logo.setIconTextGap(6);

        Logo1.setFont(new java.awt.Font("Goudy Stout", 1, 20)); // NOI18N
        Logo1.setText("Particular");
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
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3)
                    .addComponent(ReseñasInmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BusquedaInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReservaConsultaInmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4))
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logo1))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(BusquedaInmueble)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(ReservaConsultaInmuebles)
                .addGap(17, 17, 17)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(ReseñasInmuebles)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ModDatosPersonales)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CerrarSesion)
                .addGap(44, 44, 44)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(971, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Boton que muestra la ventana para calificar los inmuebles
 * @param evt 
 */
    private void ReseñasInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReseñasInmueblesActionPerformed
         // Obtener la lista de inmuebles reservados por el particular
         this.setVisible(false);
        ArrayList<Inmueble> inmueblesReservados = Metodos.obtenerInmueblesReservadosPorParticular(Metodos.usuarioActual);

        // Crear una instancia del JFrame CalificarInmueblesFrame y pasarlo a la lista de inmuebles reservados
        CalificarInmuebleFrame calificarInmueblesFrame = new CalificarInmuebleFrame(inmueblesReservados, this);

        // Hacer visible el CalificarInmueblesFrame
        calificarInmueblesFrame.setVisible(true);
    }//GEN-LAST:event_ReseñasInmueblesActionPerformed

    
    /**
     * BOton que habilita la ventana de la busqueda de inmuebles
     * @param evt 
     */
    private void BusquedaInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaInmuebleActionPerformed
        this.setVisible(false);
        HerramientaBusqueda datos = new HerramientaBusqueda();
        datos.setVisible(true);
    }//GEN-LAST:event_BusquedaInmuebleActionPerformed
/**
 * Boton que habilita la ventana para modificar los datos del particular
 * @param evt 
 */
    private void ModDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModDatosPersonalesActionPerformed
        this.setVisible(false);
        ModificarDatosParticular datos = new ModificarDatosParticular();
        datos.setVisible(true);
    }//GEN-LAST:event_ModDatosPersonalesActionPerformed

    private void ReservaConsultaInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservaConsultaInmueblesActionPerformed
        this.setVisible(false);
        ConsultaReservasParticular v = new ConsultaReservasParticular(FacturaReserva.nombreArchivo, Metodos.usuarioActual);
        v.setVisible(true);
    }//GEN-LAST:event_ReservaConsultaInmueblesActionPerformed
/**
 * Boton para cerrar sesion
 * @param evt 
 */
    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        this.setVisible(false);
        Ventana v = new Ventana();
        v.setVisible(true);
    }//GEN-LAST:event_CerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BusquedaInmueble;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JButton ModDatosPersonales;
    private javax.swing.JButton ReservaConsultaInmuebles;
    private javax.swing.JButton ReseñasInmuebles;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
