/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import Clases.*;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.*;
import java.time.*;
import javax.swing.*;
/**
 * JFrame que permite visualizar todos los usuarios del sistema
 * @author Pc
 */
public class ConsultaUsuarios extends javax.swing.JFrame {

    private String tipo = "";
    private JFrame principal;
    static ArrayList listaClientes = new ArrayList<>();

    /**
     * Creates new form Registro
     */
    public ConsultaUsuarios(JFrame ventana) {
        initComponents();
        Metodos.cargarDatosUsuarios();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);

    }

    public ConsultaUsuarios() {
        initComponents();
    }
/**
 * Recibe la lista de clientes
    */
    public static void recibirListaClientes(ArrayList<Persona> clientes) {
        listaClientes = clientes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        Siguiente = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        TarjetaCreditoNombre = new javax.swing.JLabel();
        CorreoAntes = new javax.swing.JLabel();
        txtTarjetaCreditoNombre = new javax.swing.JTextField();
        Anterior = new javax.swing.JButton();
        TarjetaCreditoNumero = new javax.swing.JLabel();
        TarjetaFechaCaducidad = new javax.swing.JLabel();
        txtNumeroTarjeta = new javax.swing.JFormattedTextField();
        txtCaducidadTarjeta = new javax.swing.JSpinner();
        Logo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        Siguiente.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Nombre.setBackground(new java.awt.Color(51, 51, 51));
        Nombre.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Nombre.setText("Nombre");

        Telefono.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Telefono.setText("Telefono");

        Correo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Correo.setText("Correo");

        TarjetaCreditoNombre.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        TarjetaCreditoNombre.setText("Nombre Tarjeta Crédito");

        Anterior.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        TarjetaCreditoNumero.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        TarjetaCreditoNumero.setText("Número Tarjeta Crédito");

        TarjetaFechaCaducidad.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        TarjetaFechaCaducidad.setText("Fecha Caducidad");

        try {
            txtNumeroTarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNumeroTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTarjetaActionPerformed(evt);
            }
        });

        txtCaducidadTarjeta.setModel(new javax.swing.SpinnerDateModel());
        txtCaducidadTarjeta.setEditor(new javax.swing.JSpinner.DateEditor(txtCaducidadTarjeta, "dd/MM/yyyy"));

        Logo1.setFont(new java.awt.Font("Goudy Stout", 1, 20)); // NOI18N
        Logo1.setText("JavaBnB");
        Logo1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Logo1.setIconTextGap(6);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(CorreoAntes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(TarjetaFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(TarjetaCreditoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                                .addGap(0, 50, Short.MAX_VALUE)
                                                .addComponent(Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(TarjetaCreditoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(FondoLayout.createSequentialGroup()
                                            .addComponent(txtCorreo)
                                            .addGap(1, 1, 1)))
                                    .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTarjetaCreditoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCaducidadTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(94, 94, 94))))
            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1)
                    .addContainerGap(1233, Short.MAX_VALUE)))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(CorreoAntes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTarjetaCreditoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TarjetaCreditoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TarjetaCreditoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TarjetaFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaducidadTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1)
                    .addContainerGap(559, Short.MAX_VALUE)))
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

        setSize(new java.awt.Dimension(722, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed
/**
 * Boton que permite visualizar el siguiente usuario
 * @param evt 
 */
    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        // Antes de intentar acceder al elemento en la lista, verifica si la lista no está vacía.
        ArrayList<Persona> usuarios = Metodos.getListaClientes();

// Verificar si la lista no está vacía
        if (!usuarios.isEmpty()) {
            // Decrementar el índice del usuario actual
            Metodos.usuarioActualIndex++;

            // Si el índice del usuario actual es menor que cero, ir al último usuario
            if (Metodos.usuarioActualIndex < 0) {
                Metodos.usuarioActualIndex = usuarios.size() - 1;
            }

            // Si el índice es mayor o igual al tamaño de la lista, volver al primer usuario
            if (Metodos.usuarioActualIndex >= usuarios.size()) {
                Metodos.usuarioActualIndex = 0;
            }

            // Obtener el usuario actual
            Persona usuario = usuarios.get(Metodos.usuarioActualIndex);

            // Mostrar la información del usuario actual
            txtNombre.setText(usuario.getNombre());
            txtCorreo.setText(usuario.getCorreo());
            txtTelefono.setText(usuario.getTelefono());

            // Resto del código para mostrar información específica del usuario (como tarjeta de crédito)
            if (usuario instanceof Particular) {
                Particular clienteParticular = (Particular) usuario;
                txtTarjetaCreditoNombre.setText(clienteParticular.getTarjetaCreditoNombre());
                txtNumeroTarjeta.setText(Long.toString(clienteParticular.getTarjetaCreditoNumero()));
                if (clienteParticular.getTarjetaCreditoNumero() != 0) {
                    txtTarjetaCreditoNombre.setText(clienteParticular.getTarjetaCreditoNombre());
                    txtNumeroTarjeta.setText(Long.toString(clienteParticular.getTarjetaCreditoNumero()));
                    // Convertir la fecha de caducidad de la tarjeta de crédito a Date
                    Date fechaCaducidad = java.sql.Date.valueOf(clienteParticular.getTarjetaCreditoFechaCaducidad());

                    // Mostrar la fecha de caducidad de la tarjeta de crédito en el JSpinner
                    txtCaducidadTarjeta.setValue(fechaCaducidad);
                } else {
                    txtTarjetaCreditoNombre.setText("No tiene tarjeta de crédito");
                    txtNumeroTarjeta.setText("");
                    txtCaducidadTarjeta.setValue(new Date());
                }
            } else {
                txtTarjetaCreditoNombre.setText("");
                txtNumeroTarjeta.setText("");
                txtCaducidadTarjeta.setValue(new Date());
            }
        } else {
            // Manejar el caso donde la lista de usuarios está vacía
            // Por ejemplo, puedes mostrar un mensaje de error o limpiar los campos de texto.
            txtNombre.setText("");
            txtCorreo.setText("");
            txtTelefono.setText("");
            txtTarjetaCreditoNombre.setText("");
            txtNumeroTarjeta.setText("");
            txtCaducidadTarjeta.setValue(new Date());
        }
    }//GEN-LAST:event_SiguienteActionPerformed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed

    }//GEN-LAST:event_txtCorreoMousePressed
/**
 * Boton para volver a la ventana anterior
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Administrador v = new Administrador();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * Boton para visualizar el inmueble anterior
 * @param evt 
 */
    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        // Antes de intentar acceder al elemento en la lista, verifica si la lista no está vacía.
        ArrayList<Persona> usuarios = Metodos.getListaClientes();

// Verificar si la lista no está vacía
        if (!usuarios.isEmpty()) {
            // Decrementar el índice del usuario actual
            Metodos.usuarioActualIndex--;

            // Si el índice del usuario actual es menor que cero, ir al último usuario
            if (Metodos.usuarioActualIndex < 0) {
                Metodos.usuarioActualIndex = usuarios.size() - 1;
            }

            // Si el índice es mayor o igual al tamaño de la lista, volver al primer usuario
            if (Metodos.usuarioActualIndex >= usuarios.size()) {
                Metodos.usuarioActualIndex = 0;
            }

            // Obtener el usuario actual
            Persona usuario = usuarios.get(Metodos.usuarioActualIndex);

            // Mostrar la información del usuario actual
            txtNombre.setText(usuario.getNombre());
            txtCorreo.setText(usuario.getCorreo());
            txtTelefono.setText(usuario.getTelefono());

            // Resto del código para mostrar información específica del usuario (como tarjeta de crédito)
            if (usuario instanceof Particular) {
                Particular clienteParticular = (Particular) usuario;
                txtTarjetaCreditoNombre.setText(clienteParticular.getTarjetaCreditoNombre());
                txtNumeroTarjeta.setText(Long.toString(clienteParticular.getTarjetaCreditoNumero()));
                if (clienteParticular.getTarjetaCreditoNumero() != 0) {
                    txtTarjetaCreditoNombre.setText(clienteParticular.getTarjetaCreditoNombre());
                    txtNumeroTarjeta.setText(Long.toString(clienteParticular.getTarjetaCreditoNumero()));
                    // Convertir la fecha de caducidad de la tarjeta de crédito a Date
                    Date fechaCaducidad = java.sql.Date.valueOf(clienteParticular.getTarjetaCreditoFechaCaducidad());

                    // Mostrar la fecha de caducidad de la tarjeta de crédito en el JSpinner
                    txtCaducidadTarjeta.setValue(fechaCaducidad);
                } else {
                    txtTarjetaCreditoNombre.setText("No tiene tarjeta de crédito");
                    txtNumeroTarjeta.setText("");
                    txtCaducidadTarjeta.setValue(new Date());
                }
            } else {
                txtTarjetaCreditoNombre.setText("");
                txtNumeroTarjeta.setText("");
                txtCaducidadTarjeta.setValue(new Date());
            }
        } else {
            // Manejar el caso donde la lista de usuarios está vacía
            // Por ejemplo, puedes mostrar un mensaje de error o limpiar los campos de texto.
            txtNombre.setText("");
            txtCorreo.setText("");
            txtTelefono.setText("");
            txtTarjetaCreditoNombre.setText("");
            txtNumeroTarjeta.setText("");
            txtCaducidadTarjeta.setValue(new Date());
        }
    }//GEN-LAST:event_AnteriorActionPerformed

    private void txtNumeroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroTarjetaActionPerformed

    }//GEN-LAST:event_txtNumeroTarjetaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel CorreoAntes;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Siguiente;
    private javax.swing.JLabel TarjetaCreditoNombre;
    private javax.swing.JLabel TarjetaCreditoNumero;
    private javax.swing.JLabel TarjetaFechaCaducidad;
    private javax.swing.JLabel Telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JSpinner txtCaducidadTarjeta;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtNumeroTarjeta;
    private javax.swing.JTextField txtTarjetaCreditoNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
