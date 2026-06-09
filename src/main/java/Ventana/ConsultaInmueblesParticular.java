/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import Clases.Inmueble;
import Clases.*;
import java.awt.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import javax.swing.*;
import Clases.Reserva;

/**
 * JFrame que permite visualizar y alquilar el inmueble por un particular
 * @author Pc
 */
public class ConsultaInmueblesParticular extends javax.swing.JFrame {

    private String tipo = "";
    private JFrame principal;
    static ArrayList<Inmueble> listaInmueble = new ArrayList<>();
    private byte[] fotografia;
    private ImageIcon imagenIcono;
    private Inmueble inmueble = null;

    /**
     * Creates new form Registro
     */
    private static String tituloInmueble;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
/**
 * Constructor del JFrame
 * @param titulo
 * @param fechaEntrada
 * @param fechaSalida
 * @param listaReservas 
 */
    public ConsultaInmueblesParticular(String titulo, LocalDate fechaEntrada, LocalDate fechaSalida, ArrayList<Reserva> listaReservas) {
        initComponents();
        Metodos.cargarDatosUsuarios();
        Metodos.cargarDatosInmuebles();
        Metodos.cargarDatosReservas();
        this.setVisible(true);
        this.tituloInmueble = titulo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        mostrar();
    }

    public ConsultaInmueblesParticular() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        Fondo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        Capacidad = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Camas = new javax.swing.JLabel();
        Habitaciones = new javax.swing.JLabel();
        Servicios = new javax.swing.JLabel();
        Banos = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        PrecioNoche = new javax.swing.JLabel();
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
        txtServicios = new javax.swing.JTextField();
        Alquilar = new javax.swing.JButton();
        Logo1 = new javax.swing.JLabel();

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

        txtTitulo.setEditable(false);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
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

        txtTipo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Apartamento", " " }));
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        Calle.setBackground(new java.awt.Color(51, 51, 51));
        Calle.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Calle.setText("Calle");

        MediaRseñas2.setBackground(new java.awt.Color(51, 51, 51));
        MediaRseñas2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        MediaRseñas2.setText("Número");

        txtCalle.setEditable(false);
        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });

        txtNumero.setEditable(false);
        txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtCodigoPostal.setEditable(false);
        txtCodigoPostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        CodigoPostal.setBackground(new java.awt.Color(51, 51, 51));
        CodigoPostal.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        CodigoPostal.setText("Código Postal");

        Ciudad.setBackground(new java.awt.Color(51, 51, 51));
        Ciudad.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Ciudad.setText("Ciudad");

        txtCiudad.setEditable(false);
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

        txtCapacidad.setEditable(false);
        txtCapacidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        txtHabitaciones.setEditable(false);
        txtHabitaciones.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        txtCamas.setEditable(false);
        txtCamas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        txtBanos.setEditable(false);
        txtBanos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        txtPrecioNoche.setEditable(false);
        txtPrecioNoche.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        txtServicios.setEditable(false);
        txtServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiciosActionPerformed(evt);
            }
        });

        Alquilar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        Alquilar.setText("Alquilar");
        Alquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlquilarActionPerformed(evt);
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
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Habitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Camas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Alquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
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
                        .addGap(47, 47, 47)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(37, 37, 37)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
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
                            .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Alquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(766, 658));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metodo para mostrar los datos del inmueble seleccionado
     */
    public void mostrar() {
        Inmueble inmuebles = Metodos.obtenerInmueblePorTitulo(tituloInmueble);
        // Mostrar la información del inmueble actual
        txtTitulo.setText(inmuebles.getTitulo());
        txtCapacidad.setValue(inmuebles.getCapacidad());
        txtHabitaciones.setValue(inmuebles.getHabitaciones());
        txtCamas.setValue(inmuebles.getCamas());
        txtBanos.setValue(inmuebles.getBanos());
        txtTipo.setSelectedItem(inmuebles.getTipo());
        txtPrecioNoche.setValue(inmuebles.getPrecioNoche());


        // Convertir el array de servicios en una cadena
        StringBuilder serviciosAsString = new StringBuilder();
        for (String servicio : inmuebles.getServicios()) {
            serviciosAsString.append(servicio).append(", ");
        }
        // Eliminar la última coma y espacio
        if (serviciosAsString.length() > 0) {
            serviciosAsString.setLength(serviciosAsString.length() - 2);
        }
        txtServicios.setText(serviciosAsString.toString());

        txtCalle.setText(inmuebles.getCalle());
        txtNumero.setValue(inmuebles.getNumero());
        txtCodigoPostal.setValue(inmuebles.getCodigoPostal());
        txtCiudad.setText(inmuebles.getCiudad());

        // Obtener la imagen del inmueble
        byte[] imagenBytes = inmuebles.getFoto();
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
    }
    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * Metodo para cargar la imagen como bytearray
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
 * metodo para cargar la imagen
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
 * Boton que permite reservar el inmueble seleccioando
 * @param evt 
 */
    private void AlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlquilarActionPerformed
      String seleccionado = txtTitulo.getText(); // Obtener el título del inmueble seleccionado

    // Obtener el inmueble seleccionado
    Inmueble inmuebleSeleccionado = Metodos.obtenerInmueblePorTitulo(seleccionado);

    // Verificar si el inmueble ya ha sido reservado
    if (!inmuebleSeleccionado.estaDisponibleEnFecha(fechaEntrada, fechaSalida)) {
        // El inmueble no está disponible para estas fechas
        JOptionPane.showMessageDialog(this, "El inmueble no está disponible para estas fechas", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        long diasReserva = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
        Particular datosParticular = Metodos.obtenerParticularPorNombre(Metodos.usuarioActual);
        
        if (datosParticular == null) {
            JOptionPane.showMessageDialog(this, "No se encontró el usuario actual en la lista de particulares", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        LocalDate fechaReserva = LocalDate.now();
        if (!datosParticular.isVIP()) {
            double importe = inmuebleSeleccionado.getPrecioNoche() * diasReserva;
            Reserva reserva = new Reserva(fechaReserva, fechaEntrada, fechaSalida, importe, inmuebleSeleccionado, datosParticular);

            // Agregar la reserva a la lista de reservas
            Metodos.agregarReserva(reserva);
            inmuebleSeleccionado.agregarReserva(reserva);

            // Marcar el inmueble como reservado para las fechas de la reserva
            inmuebleSeleccionado.marcarComoReservado(inmuebleSeleccionado, fechaEntrada, fechaSalida);

            Metodos.guardarDatosReservas();
            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "¡Reserva realizada con éxito por: " + importe, "Éxito", JOptionPane.INFORMATION_MESSAGE);

            FacturaReserva factura = new FacturaReserva();
            factura.setFechaReserva(fechaReserva);
            factura.setFechaEntrada(fechaEntrada);
            factura.setFechaSalida(fechaSalida);
            factura.setCliente(datosParticular);
            factura.setImporte(importe);
            factura.setInmueble(inmuebleSeleccionado);
            factura.generarFacturaReserva(reserva);

        } else {
            double importe = (inmuebleSeleccionado.getPrecioNoche() * diasReserva) * 0.9; // Crear una nueva reserva
            Reserva reserva = new Reserva(fechaReserva, fechaEntrada, fechaSalida, importe, inmuebleSeleccionado, datosParticular);

            // Agregar la reserva a la lista de reservas
            Metodos.agregarReserva(reserva);
            inmuebleSeleccionado.agregarReserva(reserva);

            // Marcar el inmueble como reservado para las fechas de la reserva
            inmuebleSeleccionado.marcarComoReservado(inmuebleSeleccionado, fechaEntrada, fechaSalida);

            Metodos.guardarDatosReservas();
            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "¡Reserva realizada con éxito por: " + importe, "Éxito", JOptionPane.INFORMATION_MESSAGE);
            FacturaReserva factura = new FacturaReserva();
            factura.setFechaReserva(fechaReserva);
            factura.setFechaEntrada(fechaEntrada);
            factura.setFechaSalida(fechaSalida);
            factura.setCliente(datosParticular);
            factura.setImporte(importe);
            factura.setInmueble(inmuebleSeleccionado);
            factura.generarFacturaReserva(reserva);
        }
    }


    }//GEN-LAST:event_AlquilarActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alquilar;
    private javax.swing.JLabel Banos;
    private javax.swing.JLabel Calle;
    private javax.swing.JLabel Camas;
    private javax.swing.JLabel Capacidad;
    private javax.swing.JLabel Ciudad;
    private javax.swing.JLabel CodigoPostal;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Fotografia;
    private javax.swing.JLabel Habitaciones;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel MediaRseñas2;
    private javax.swing.JLabel PrecioNoche;
    private javax.swing.JLabel Servicios;
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
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JFormattedTextField txtPrecioNoche;
    private javax.swing.JTextField txtServicios;
    private javax.swing.JComboBox<String> txtTipo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
