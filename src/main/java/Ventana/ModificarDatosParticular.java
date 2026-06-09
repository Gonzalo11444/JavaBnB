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
 * JFrame que permite cambiar los datos del propio particular
 * @author Pc
 */
public class ModificarDatosParticular extends javax.swing.JFrame {
    private String tipo = "";
    private JFrame principal;
    static ArrayList listaClientes = new ArrayList<>();

    /**
     * Creates new form Registro
     */
    /**
     * Constructor del jframe
     * @param ventana 
     */
    public ModificarDatosParticular(JFrame ventana) {
        initComponents();
        Metodos.cargarDatosUsuarios();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);

    }

    public ModificarDatosParticular()  {
        initComponents();
    }

    public static void recibirListaClientes(ArrayList<Persona> clientes) {
        listaClientes = clientes;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtClave = new javax.swing.JPasswordField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        CambiarDatos = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        Clave = new javax.swing.JLabel();
        CorreoAntes = new javax.swing.JLabel();
        TitularTarjeta = new javax.swing.JLabel();
        NumeroTarjeta = new javax.swing.JLabel();
        txtNumeroTarjeta = new javax.swing.JFormattedTextField();
        txtCaducidadTarjeta = new javax.swing.JSpinner();
        txtTitularTarjeta = new javax.swing.JTextField();
        FechaCaducidad = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JButton();
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

        CambiarDatos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        CambiarDatos.setText("Cambiar Datos");
        CambiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarDatosActionPerformed(evt);
            }
        });

        Nombre.setBackground(new java.awt.Color(51, 51, 51));
        Nombre.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Nombre.setText("Nuevo Nombre");

        Telefono.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Telefono.setText("Nuevo Telefono");

        Correo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Correo.setText("Nuevo Correo");

        Clave.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Clave.setText("Nueva Clave");

        TitularTarjeta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        TitularTarjeta.setText("Nuevo Titular Tarjeta");

        NumeroTarjeta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        NumeroTarjeta.setText("Nuevo Número Tarjeta");

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

        txtTitularTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTitularTarjetaMousePressed(evt);
            }
        });

        FechaCaducidad.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        FechaCaducidad.setText("Nueva Fecha caducidad");

        CerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        CerrarSesion.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
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
                .addGap(99, 99, 99)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(TitularTarjeta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaCaducidad)
                            .addComponent(NumeroTarjeta))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroTarjeta)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTitularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCaducidadTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(CambiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 181, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(CorreoAntes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CerrarSesion))
                            .addComponent(Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1)
                    .addContainerGap(1233, Short.MAX_VALUE)))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CorreoAntes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaducidadTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(CambiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        setSize(new java.awt.Dimension(672, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed
/**
 * Metodo para obtener la fecha tipo date y cambiarlo a localdate
 * @return LocalDate fechacaducidad
 */
     public LocalDate getjSpinnerCaducidadTarjeta() {
        Date fecha = (Date) txtCaducidadTarjeta.getValue();
        Instant instant = Instant.ofEpochMilli(fecha.getTime());
        LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
        return localDate;
    }
     /**
      * Metodo para borrar las lineas entre medias del numero de la tarjeta
      * @return 
      */
    public String getjFormattedTextFieldNumeroTarjeta() {
        // Obtener el texto del campo de texto formateado
        String numeroTarjetaStr = txtNumeroTarjeta.getText();
        // Eliminar caracteres no numéricos
        String numeroTarjetaClean = numeroTarjetaStr.replaceAll("[^0-9]", "");
        // Devolver el número de tarjeta limpio como un String
        return numeroTarjetaClean;
    }
    /**
     * Boton para cambiar los datos del usuario
     * @param evt 
     */
    private void CambiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarDatosActionPerformed

        
        String nuevoNombre = txtNombre.getText();
        String nuevoCorreo = txtCorreo.getText();
        String nuevaClave = txtClave.getText();
        String nuevoTelefono = txtTelefono.getText();
        LocalDate nuevaFechaCaducidad = getjSpinnerCaducidadTarjeta();
        String nuevoTarjetaCreditoNombre = txtTitularTarjeta.getText();
        String numeroTarjetaStr = getjFormattedTextFieldNumeroTarjeta();
        // Convertir el número de tarjeta a long y asignarlo al cliente
        long nuevoTarjetaCreditoNumero = Long.parseLong(numeroTarjetaStr);
        

//FALTA LO DE CLIENTE VIP Y DEMÁS????
        boolean resultado = Metodos.modificarDatosParticular( Metodos.usuarioActual,nuevoNombre,nuevoCorreo, nuevaClave,nuevoTelefono,nuevoTarjetaCreditoNombre,nuevoTarjetaCreditoNumero,nuevaFechaCaducidad);
         if (resultado) {
            JOptionPane.showMessageDialog(null, "Datos modificados con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos");
        }
         System.out.println(listaClientes);
    }//GEN-LAST:event_CambiarDatosActionPerformed
    
    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed

    }//GEN-LAST:event_txtCorreoMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ParticularV v = new ParticularV();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNumeroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroTarjetaActionPerformed

    }//GEN-LAST:event_txtNumeroTarjetaActionPerformed

    private void txtTitularTarjetaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTitularTarjetaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitularTarjetaMousePressed
/**
 * Boton que redirige a la ventana principal
 * @param evt 
 */
    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        this.setVisible(false);
        Ventana v = new Ventana();
        v.setVisible(true);
    }//GEN-LAST:event_CerrarSesionActionPerformed

             
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarDatos;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JLabel Clave;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel CorreoAntes;
    private javax.swing.JLabel FechaCaducidad;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NumeroTarjeta;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel TitularTarjeta;
    private javax.swing.JButton jButton1;
    private javax.swing.JSpinner txtCaducidadTarjeta;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtNumeroTarjeta;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTitularTarjeta;
    // End of variables declaration//GEN-END:variables
}
