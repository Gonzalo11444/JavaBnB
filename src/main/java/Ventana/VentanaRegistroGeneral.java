/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import Clases.*;
import java.awt.Color;
import java.util.*;
import java.time.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *JFrame que permite seleccionar si registra un anfitrion o particular
 * @author Pc
 */
public class VentanaRegistroGeneral extends javax.swing.JFrame {
    private String tipo = "";
      private JFrame principal;
    static ArrayList listaClientes = new ArrayList<>();

    /**
     * Creates new form Registro
     */
    /**
     * Constructor
     */
    public VentanaRegistroGeneral() {
        initComponents();
        Metodos.cargarDatosUsuarios();
    }

    public static void recibirListaClientes(ArrayList<Particular> clientes) {
        listaClientes = clientes;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Registrate = new javax.swing.JButton();
        elegirtipo = new javax.swing.JComboBox<>();
        Logo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(204, 255, 255));

        Registrate.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        Registrate.setText("Registrarse");
        Registrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrateActionPerformed(evt);
            }
        });

        elegirtipo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        elegirtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anfitrion", "Particular" }));
        elegirtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirtipoActionPerformed(evt);
            }
        });

        Logo1.setFont(new java.awt.Font("Goudy Stout", 1, 14)); // NOI18N
        Logo1.setText("JavaBnB");
        Logo1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Logo1.setIconTextGap(6);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(Registrate, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(elegirtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(elegirtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168)
                .addComponent(Registrate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(672, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Boton para habilitar la ventana de registro dependiendo si elige anfitrion o particular
 * @param evt 
 */
    private void RegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrateActionPerformed
        try {
            if (tipo.equals("Anfitrion")) {
                RegistroAnfitrion a = new RegistroAnfitrion(this);
            } else {
                RegistroParticular p = new RegistroParticular(this);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Excepción", "Excepción", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_RegistrateActionPerformed

    private void elegirtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirtipoActionPerformed
      tipo = (String) elegirtipo.getSelectedItem();
    }//GEN-LAST:event_elegirtipoActionPerformed
    
             
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JButton Registrate;
    private javax.swing.JComboBox<String> elegirtipo;
    // End of variables declaration//GEN-END:variables
}
