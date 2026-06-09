/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import Clases.Inmueble;
import Clases.*;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.*;
import java.util.*;
import java.time.*;
import javax.swing.*;

/**
 * JFrame que permite consultar los inmuebles propios del anfitrion
 * @author Pc
 */
public class ConsultaInmueblesAnfitrion extends javax.swing.JFrame {

    private String tipo = "";
    private JFrame principal;
    static ArrayList<Inmueble> listaInmueble = new ArrayList<>();
    private byte[] fotografia;
    private ImageIcon imagenIcono;
    private Inmueble inmueble = null;
    private byte[] nuevaFoto = null;

    /**
     * Creates new form Registro
     */
    public ConsultaInmueblesAnfitrion(JFrame ventana) {
        initComponents();
        Metodos.cargarDatosInmuebles();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }

    public ConsultaInmueblesAnfitrion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        Fondo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        Siguiente = new javax.swing.JButton();
        Capacidad = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Camas = new javax.swing.JLabel();
        Habitaciones = new javax.swing.JLabel();
        Servicios = new javax.swing.JLabel();
        Banos = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        PrecioNoche = new javax.swing.JLabel();
        Reseña = new javax.swing.JLabel();
        txtTipo = new javax.swing.JComboBox<>();
        Calle = new javax.swing.JLabel();
        MediaRseñas2 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtNumero = new javax.swing.JFormattedTextField();
        txtCodigoPostal = new javax.swing.JFormattedTextField();
        CodigoPostal = new javax.swing.JLabel();
        Ciudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        Fotografia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JFormattedTextField();
        txtHabitaciones = new javax.swing.JFormattedTextField();
        txtCamas = new javax.swing.JFormattedTextField();
        txtBanos = new javax.swing.JFormattedTextField();
        txtPrecioNoche = new javax.swing.JFormattedTextField();
        txtMediaResenas = new javax.swing.JFormattedTextField();
        txtServicios = new javax.swing.JTextField();
        Anterior = new javax.swing.JButton();
        ModificarDatos = new javax.swing.JButton();
        BorrarInmueble = new javax.swing.JButton();
        Logo1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        Siguiente.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Capacidad.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Capacidad.setText("Capacidad");

        Titulo.setBackground(new java.awt.Color(51, 51, 51));
        Titulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Titulo.setText("Titulo");

        Camas.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Camas.setText("Camas");

        Habitaciones.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Habitaciones.setText("Habitaciones");

        Servicios.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Servicios.setText("Servicios");

        Banos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Banos.setText("Baños");

        Tipo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Tipo.setText("Tipo");

        PrecioNoche.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        PrecioNoche.setText("Precio/Noche");

        Reseña.setBackground(new java.awt.Color(51, 51, 51));
        Reseña.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Reseña.setText("Reseña");

        txtTipo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Apartamento" }));

        Calle.setBackground(new java.awt.Color(51, 51, 51));
        Calle.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Calle.setText("Calle");

        MediaRseñas2.setBackground(new java.awt.Color(51, 51, 51));
        MediaRseñas2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        MediaRseñas2.setText("Número");

        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });

        txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtCodigoPostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        CodigoPostal.setBackground(new java.awt.Color(51, 51, 51));
        CodigoPostal.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        CodigoPostal.setText("Código Postal");

        Ciudad.setBackground(new java.awt.Color(51, 51, 51));
        Ciudad.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Ciudad.setText("Ciudad");

        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });

        Fotografia.setBackground(new java.awt.Color(51, 51, 51));
        Fotografia.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Fotografia.setText("Fotografia");

        jLabel1.setText("Inserta una imagen");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        txtCapacidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        txtHabitaciones.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        txtCamas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        txtBanos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        txtPrecioNoche.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        txtMediaResenas.setEditable(false);
        txtMediaResenas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        txtMediaResenas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMediaResenasActionPerformed(evt);
            }
        });

        txtServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiciosActionPerformed(evt);
            }
        });

        Anterior.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        ModificarDatos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        ModificarDatos.setText("Modificar Datos");
        ModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarDatosActionPerformed(evt);
            }
        });

        BorrarInmueble.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        BorrarInmueble.setText("Borrar Inmueble");
        BorrarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarInmuebleActionPerformed(evt);
            }
        });

        Logo1.setFont(new java.awt.Font("Goudy Stout", 1, 20)); // NOI18N
        Logo1.setText("JavaBnB");
        Logo1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Logo1.setIconTextGap(6);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Banos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PrecioNoche)
                                            .addComponent(Servicios))
                                        .addGap(18, 18, 18)
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(35, 35, 35)
                                .addComponent(Fotografia, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(FondoLayout.createSequentialGroup()
                                    .addComponent(Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)
                                    .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63)
                                    .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(FondoLayout.createSequentialGroup()
                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Habitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Camas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(24, 24, 24)
                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(FondoLayout.createSequentialGroup()
                                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(172, 172, 172)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(FondoLayout.createSequentialGroup()
                                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtBanos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(FondoLayout.createSequentialGroup()
                                                    .addGap(166, 166, 166)
                                                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(FondoLayout.createSequentialGroup()
                                                    .addGap(43, 43, 43)
                                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(FondoLayout.createSequentialGroup()
                                                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(Calle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(MediaRseñas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                            .addGap(69, 69, 69)
                                                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(CodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(FondoLayout.createSequentialGroup()
                                                            .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(FondoLayout.createSequentialGroup()
                                                            .addComponent(Reseña)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txtMediaResenas, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(ModificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BorrarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1)
                    .addContainerGap(1233, Short.MAX_VALUE)))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMediaResenas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Habitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MediaRseñas2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Camas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Banos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBanos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(Fotografia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1)
                    .addContainerGap(559, Short.MAX_VALUE)))
        );

        Logo.setFont(new java.awt.Font("Goudy Stout", 1, 20)); // NOI18N
        Logo.setText("JavaBnB");
        Logo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Logo.setIconTextGap(6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(284, 284, 284)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(285, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(288, 288, 288)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(288, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(766, 658));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed
/**
 * Boton que permite visualizar el siguientei nmueble
 * @param evt 
 */

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        // Obtener el ID del anfitrión actual
        Metodos.cargarDatosInmuebles();
        String idAnfitrionActual = Metodos.usuarioActual;

// Obtener la lista de inmuebles asociados al anfitrión actual
        ArrayList<Inmueble> listaInmueblesAnfitrion = Metodos.obtenerInmueblesPorAnfitrion(idAnfitrionActual);

// Verificar si la lista de inmuebles del anfitrión no está vacía
        if (!listaInmueblesAnfitrion.isEmpty()) {
            // Incrementar el índice del inmueble actual
            Metodos.inmuebleActualIndex++;

            // Si el índice del inmueble actual es menor que cero, ir al último inmueble
            if (Metodos.inmuebleActualIndex < 0) {
                Metodos.inmuebleActualIndex = listaInmueblesAnfitrion.size() - 1;
            }

            // Si el índice es mayor o igual al tamaño de la lista, volver al primer inmueble
            if (Metodos.inmuebleActualIndex >= listaInmueblesAnfitrion.size()) {
                Metodos.inmuebleActualIndex = 0;
            }

            // Obtener el inmueble actual
            Inmueble inmueble = listaInmueblesAnfitrion.get(Metodos.inmuebleActualIndex);

            // Mostrar la información del inmueble actual
            txtTitulo.setText(inmueble.getTitulo());
            txtCapacidad.setValue(inmueble.getCapacidad());
            txtHabitaciones.setValue(inmueble.getHabitaciones());
            txtCamas.setValue(inmueble.getCamas());
            txtBanos.setValue(inmueble.getBanos());
            txtTipo.setSelectedItem(inmueble.getTipo());
            txtPrecioNoche.setValue(inmueble.getPrecioNoche());
            txtMediaResenas.setValue(inmueble.getCalificacion());
            

            // Convertir el array de servicios en una cadena
            StringBuilder serviciosAsString = new StringBuilder();
            for (String servicio : inmueble.getServicios()) {
                serviciosAsString.append(servicio).append(", ");
            }
            // Eliminar la última coma y espacio
            if (serviciosAsString.length() > 0) {
                serviciosAsString.setLength(serviciosAsString.length() - 2);
            }
            txtServicios.setText(serviciosAsString.toString());

            txtCalle.setText(inmueble.getCalle());
            txtNumero.setValue(inmueble.getNumero());
            txtCodigoPostal.setValue(inmueble.getCodigoPostal());
            txtCiudad.setText(inmueble.getCiudad());

            // Obtener la imagen del inmueble
            byte[] imagenBytes = inmueble.getFoto();
            if (imagenBytes != null && imagenBytes.length > 0) {
                // Convertir los bytes de la imagen en un ImageIcon
                ImageIcon imagenIcono = new ImageIcon(imagenBytes);
                // Escalar la imagen para que se ajuste al tamaño del JLabel
                Image imagenEscalada = imagenIcono.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
                // Crear un nuevo ImageIcon con la imagen escalada
                ImageIcon imagenEscaladaIcono = new ImageIcon(imagenEscalada);
                // Establecer el icono en el JLabel
                jLabel1.setIcon(imagenEscaladaIcono);
            } else {
                // Si no hay imagen, establecer el icono en null para borrar cualquier imagen anterior
                jLabel1.setIcon(null);
            }
        } else {
            // Manejar el caso donde la lista de inmuebles del anfitrión está vacía
            // Por ejemplo, puedes mostrar un mensaje de error o limpiar los campos de texto y el JLabel de la imagen.
            txtTitulo.setText("");
            txtCapacidad.setValue(0);
            txtHabitaciones.setValue(0);
            txtCamas.setValue(0);
            txtBanos.setValue(0);
            txtTipo.setSelectedIndex(0);
            txtPrecioNoche.setValue(0);
            txtServicios.setText("");
            txtCalle.setText("");
            txtNumero.setValue(0);
            txtCodigoPostal.setValue(0);
            txtCiudad.setText("");

            jLabel1.setIcon(null);
        }


    }//GEN-LAST:event_SiguienteActionPerformed
/**
 * Boton para retroceder a la anterior ventana
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AnfitrionV v = new AnfitrionV();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * Metodo que carga la imagen como bytearray
 * @param file
 * @return
 * @throws IOException 
 */
    private byte[] cargarImagenComoByteArray(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        fis.close();
        bos.close();
        return bos.toByteArray();
    }
/**
 * Metodo para cargar la imagen como imageicon
 */
    private void cargarImagen() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();

                fotografia = cargarImagenComoByteArray(selectedFile);

                ImageIcon imagenIcono = new ImageIcon(fotografia);
                jLabel1.setText("");
                jLabel1.setIcon(imagenIcono);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al cargar la imagen.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void txtMediaResenasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMediaResenasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMediaResenasActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        cargarImagen();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServiciosActionPerformed
/**
 * Boton para retroceder en la visualizacion de los inmuebles
 * @param evt 
 */
    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        // Obtener el ID del anfitrión actual
        Metodos.cargarDatosInmuebles();
        String idAnfitrionActual = Metodos.usuarioActual;

// Obtener la lista de inmuebles asociados al anfitrión actual
        ArrayList<Inmueble> listaInmueblesAnfitrion = Metodos.obtenerInmueblesPorAnfitrion(idAnfitrionActual);

// Verificar si la lista de inmuebles del anfitrión no está vacía
        if (!listaInmueblesAnfitrion.isEmpty()) {
            // Decrementar el índice del inmueble actual
            Metodos.inmuebleActualIndex--;

            // Si el índice del inmueble actual es menor que cero, ir al último inmueble
            if (Metodos.inmuebleActualIndex < 0) {
                Metodos.inmuebleActualIndex = listaInmueblesAnfitrion.size() - 1;
            }

            // Si el índice es mayor o igual al tamaño de la lista, volver al primer inmueble
            if (Metodos.inmuebleActualIndex >= listaInmueblesAnfitrion.size()) {
                Metodos.inmuebleActualIndex = 0;
            }

            // Obtener el inmueble actual
            Inmueble inmueble = listaInmueblesAnfitrion.get(Metodos.inmuebleActualIndex);

            // Mostrar la información del inmueble actual
            txtTitulo.setText(inmueble.getTitulo());
            txtCapacidad.setValue(inmueble.getCapacidad());
            txtHabitaciones.setValue(inmueble.getHabitaciones());
            txtCamas.setValue(inmueble.getCamas());
            txtBanos.setValue(inmueble.getBanos());
            txtTipo.setSelectedItem(inmueble.getTipo());
            txtPrecioNoche.setValue(inmueble.getPrecioNoche());
            txtMediaResenas.setValue(inmueble.getCalificacion());
            // Convertir el array de servicios en una cadena
            StringBuilder serviciosAsString = new StringBuilder();
            for (String servicio : inmueble.getServicios()) {
                serviciosAsString.append(servicio).append(", ");
            }
            // Eliminar la última coma y espacio
            if (serviciosAsString.length() > 0) {
                serviciosAsString.setLength(serviciosAsString.length() - 2);
            }
            txtServicios.setText(serviciosAsString.toString());

            txtCalle.setText(inmueble.getCalle());
            txtNumero.setValue(inmueble.getNumero());
            txtCodigoPostal.setValue(inmueble.getCodigoPostal());
            txtCiudad.setText(inmueble.getCiudad());

            // Obtener la imagen del inmueble
            byte[] imagenBytes = inmueble.getFoto();
            if (imagenBytes != null && imagenBytes.length > 0) {
                // Convertir los bytes de la imagen en un ImageIcon
                ImageIcon imagenIcono = new ImageIcon(imagenBytes);
                // Escalar la imagen para que se ajuste al tamaño del JLabel
                Image imagenEscalada = imagenIcono.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
                // Crear un nuevo ImageIcon con la imagen escalada
                ImageIcon imagenEscaladaIcono = new ImageIcon(imagenEscalada);
                // Establecer el icono en el JLabel
                jLabel1.setIcon(imagenEscaladaIcono);
            } else {
                // Si no hay imagen, establecer el icono en null para borrar cualquier imagen anterior
                jLabel1.setIcon(null);
            }
        } else {
            // Manejar el caso donde la lista de inmuebles del anfitrión está vacía

            txtTitulo.setText("");
            txtCapacidad.setValue(0);
            txtHabitaciones.setValue(0);
            txtCamas.setValue(0);
            txtBanos.setValue(0);
            txtTipo.setSelectedIndex(0);
            txtPrecioNoche.setValue(0);
            txtServicios.setText("");
            txtCalle.setText("");
            txtNumero.setValue(0);
            txtCodigoPostal.setValue(0);
            txtCiudad.setText("");
            jLabel1.setIcon(null);
        }
    }//GEN-LAST:event_AnteriorActionPerformed

     private byte[] cargarNuevaFoto() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar imagen");
        
        // Mostrar el cuadro de diálogo para seleccionar un archivo
        int seleccion = fileChooser.showOpenDialog(null);
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File archivoSeleccionado = fileChooser.getSelectedFile();
                return Files.readAllBytes(Paths.get(archivoSeleccionado.getAbsolutePath()));
            } catch (IOException e) {
                e.printStackTrace();
                // Manejo del error
            }
        }
        
        return null;
    }
     /**
      * Boton para modificar los datos que han sido introducidos por el usuario
      * @param evt 
      */
    private void ModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarDatosActionPerformed
        // Obtener los nuevos valores desde los campos de texto u otros componentes de tu interfaz
        String nuevoTitulo = txtTitulo.getText();
        int nuevaCapacidad = ((Number) txtCapacidad.getValue()).intValue();
        int nuevasHabitaciones = ((Number) txtHabitaciones.getValue()).intValue();
        int nuevasCamas = ((Number) txtCamas.getValue()).intValue();
        int nuevosBanos = ((Number) txtBanos.getValue()).intValue();
        String nuevoTipo = (String) txtTipo.getSelectedItem();
        double nuevoPrecioNoche = ((Number) txtPrecioNoche.getValue()).intValue();
        String serviciosTexto = txtServicios.getText();
        String[] servicios = serviciosTexto.split(",");
        double nuevaCalificacion = ((Number) txtMediaResenas.getValue()).intValue();
        int nuevoNumero = ((Number) txtNumero.getValue()).intValue();
        int nuevoCodigoPostal = ((Number) txtCodigoPostal.getValue()).intValue();
        String nuevaCalle = txtCalle.getText();
        String nuevaCiudad = txtCiudad.getText();

        // Obtener el ID del anfitrión actual
        String idAnfitrionActual = Metodos.usuarioActual;

        // Obtener la lista de inmuebles asociados al anfitrión actual
        ArrayList<Inmueble> listaInmueblesAnfitrion = Metodos.obtenerInmueblesPorAnfitrion(idAnfitrionActual);
        // Obtener el inmueble actual
        Inmueble inmueble = listaInmueblesAnfitrion.get(Metodos.inmuebleActualIndex);

        // Llamar al método para modificar el inmueble
        Metodos.modificarInmueble(inmueble, nuevoTitulo, nuevaCapacidad, nuevasHabitaciones, nuevasCamas, nuevosBanos, nuevoTipo, nuevoPrecioNoche, servicios, fotografia, nuevaCalificacion, nuevoNumero, nuevoCodigoPostal, nuevaCalle, nuevaCiudad);
        Metodos.guardarDatosInmuebles();

        // Actualizar la imagen en el JLabel
        if (fotografia != null && fotografia.length > 0) {
            ImageIcon imagenIcono = new ImageIcon(fotografia);
            Image imagenEscalada = imagenIcono.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imagenEscaladaIcono = new ImageIcon(imagenEscalada);
            jLabel1.setIcon(imagenEscaladaIcono);
        } else {
            // Si no hay nueva imagen, establecer el icono en null para borrar cualquier imagen anterior
            jLabel1.setIcon(null);
        }
     }//GEN-LAST:event_ModificarDatosActionPerformed
/**
 * Boton para borrar el inmueble(Se necesita minimo un inmueble registrado por anfitrion)
 * @param evt 
 */
    private void BorrarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarInmuebleActionPerformed
       // Cargar datos de los inmuebles
    Metodos.cargarDatosInmuebles();

    // Obtener el ID del anfitrión actual
    String idAnfitrionActual = Metodos.usuarioActual;
    if (idAnfitrionActual == null) {
        JOptionPane.showMessageDialog(this, "Error: Usuario no autenticado.");
        return;
    }

    // Obtener la lista de inmuebles asociados al anfitrión actual
    ArrayList<Inmueble> listaInmueblesAnfitrion = Metodos.obtenerInmueblesPorAnfitrion(idAnfitrionActual);
    if (listaInmueblesAnfitrion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay inmuebles asociados al anfitrión actual.");
        return;
    }

    // Verificar que el índice actual sea válido
    if (Metodos.inmuebleActualIndex < 0 || Metodos.inmuebleActualIndex >= listaInmueblesAnfitrion.size()) {
        JOptionPane.showMessageDialog(this, "Error: Índice de inmueble no válido.");
        return;
    }

    // Obtener el inmueble actual
    Inmueble inmueble = listaInmueblesAnfitrion.get(Metodos.inmuebleActualIndex);

    // Intentar dar de baja el inmueble
    if (Metodos.bajaInmueble(inmueble)) {
        JOptionPane.showMessageDialog(this, "Inmueble eliminado correctamente.");
        Metodos.cargarDatosInmuebles();
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar el inmueble.");
    }//Sólo se puede borrar todos los inmuebles, menos 1 que tiene que mantenerse.
    }//GEN-LAST:event_BorrarInmuebleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JLabel Banos;
    private javax.swing.JButton BorrarInmueble;
    private javax.swing.JLabel Calle;
    private javax.swing.JLabel Camas;
    private javax.swing.JLabel Capacidad;
    private javax.swing.JLabel Ciudad;
    private javax.swing.JLabel CodigoPostal;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Fotografia;
    private javax.swing.JLabel Habitaciones;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel MediaRseñas2;
    private javax.swing.JButton ModificarDatos;
    private javax.swing.JLabel PrecioNoche;
    private javax.swing.JLabel Reseña;
    private javax.swing.JLabel Servicios;
    private javax.swing.JButton Siguiente;
    private javax.swing.JLabel Tipo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JFormattedTextField txtBanos;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JFormattedTextField txtCamas;
    private javax.swing.JFormattedTextField txtCapacidad;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JFormattedTextField txtCodigoPostal;
    private javax.swing.JFormattedTextField txtHabitaciones;
    private javax.swing.JFormattedTextField txtMediaResenas;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JFormattedTextField txtPrecioNoche;
    private javax.swing.JTextField txtServicios;
    private javax.swing.JComboBox<String> txtTipo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
