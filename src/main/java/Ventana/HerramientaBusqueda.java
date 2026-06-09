/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import Clases.Inmueble;
import Clases.*;
import java.awt.Color;
import java.util.*;
import java.time.*;
import javax.swing.JOptionPane;

/**
 * JFrame que permite realizar una búsqueda de todos los inmuebles como particular
 * @author Pc
 */
public class HerramientaBusqueda extends javax.swing.JFrame {

    String tipo = "";

    /**
     * Creates new form Registro
     */
    public HerramientaBusqueda() {
        initComponents();
        Metodos.cargarDatosUsuarios();
        Metodos.cargarDatosInmuebles();
        Metodos.cargarDatosReservas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        FechaSalida = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        OrdenPrecio = new javax.swing.JCheckBox();
        OrdenTipo = new javax.swing.JCheckBox();
        OrdenRelevancia = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        CiudadAloj = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FechaEntrada = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Mostrar = new javax.swing.JButton();
        Logo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FechaSalida.setModel(new javax.swing.SpinnerDateModel());
        FechaSalida.setEditor(new javax.swing.JSpinner.DateEditor(FechaSalida, "dd/MM/yyyy"));

        jLabel4.setText("Ordenar inmueble por:");

        OrdenPrecio.setText("Precio");

        OrdenTipo.setText("Tipo");
        OrdenTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenTipoActionPerformed(evt);
            }
        });

        OrdenRelevancia.setText("Relevancia");

        jLabel5.setText("Herramienta de busqueda");

        CiudadAloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadAlojActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Inserte la ciudad:");

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        jLabel2.setText("Inserte la fecha de entrada:");

        FechaEntrada.setModel(new javax.swing.SpinnerDateModel());
        FechaEntrada.setEditor(new javax.swing.JSpinner.DateEditor(FechaEntrada, "dd/MM/yyyy"));
        FechaEntrada.setRequestFocusEnabled(false);

        jLabel3.setText("Inserte la fecha de salida:");

        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        Logo1.setFont(new java.awt.Font("Goudy Stout", 1, 20)); // NOI18N
        Logo1.setText("JavaBnB");
        Logo1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Logo1.setIconTextGap(6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                                .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(429, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(286, 286, 286)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CiudadAloj, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(FechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(OrdenPrecio)
                                                    .addComponent(OrdenTipo)
                                                    .addComponent(OrdenRelevancia)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(FechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Atras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(101, 101, 101)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(96, 96, 96)))
                    .addGap(286, 286, 286)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(52, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addComponent(Atras))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CiudadAloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(FechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(OrdenPrecio))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(OrdenTipo)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(OrdenRelevancia)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Buscar)
                    .addGap(122, 122, 122)))
        );

        setSize(new java.awt.Dimension(971, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OrdenTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrdenTipoActionPerformed

    private void CiudadAlojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadAlojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CiudadAlojActionPerformed
/**
 * Metodo que permite buscar los inmuebles en la lista completa
 * @param ciudad
 * @param ordenarPorPrecio
 * @param ordenarPorTipo
 * @param ordenarPorRelevancia
 * @return 
 */
    private ArrayList<Inmueble> buscarInmuebles(String ciudad, boolean ordenarPorPrecio, boolean ordenarPorTipo, boolean ordenarPorRelevancia) {
        ArrayList<Inmueble> inmueblesEncontrados = new ArrayList<>();

        // Verificar si la ciudad está vacía
        if (ciudad.isEmpty()) {
            // Agregar todos los inmuebles si la ciudad está vacía
            inmueblesEncontrados.addAll(Metodos.getListaInmuebles());
        } else {
            // Filtrar inmuebles por ciudad
            for (Inmueble inmueble : Metodos.getListaInmuebles()) {
                if (inmueble.getCiudad().equalsIgnoreCase(ciudad)) {
                    inmueblesEncontrados.add(inmueble);
                }
            }
        }
        

        // Ordenar los inmuebles según los criterios seleccionados
        if (ordenarPorPrecio) {
            Collections.sort(inmueblesEncontrados, new Comparator<Inmueble>() {
                @Override
                public int compare(Inmueble inmueble1, Inmueble inmueble2) {
                    return Double.compare(inmueble1.getPrecioNoche(), inmueble2.getPrecioNoche());
                }
            });
        } else if (ordenarPorTipo) {
            Collections.sort(inmueblesEncontrados, new Comparator<Inmueble>() {
                @Override
                public int compare(Inmueble inmueble1, Inmueble inmueble2) {
                    return inmueble1.getTipo().compareToIgnoreCase(inmueble2.getTipo());
                }
            });
        } else if (ordenarPorRelevancia) {
            // Ordenar por relevancia (calificación)
            Collections.sort(inmueblesEncontrados, new Comparator<Inmueble>() {
                @Override
                public int compare(Inmueble inmueble1, Inmueble inmueble2) {
                    // Compare las calificaciones en orden descendente
                    return Double.compare(inmueble2.getCalificacion(), inmueble1.getCalificacion());
                }
            });
        }

        return inmueblesEncontrados;
    }

/**
 * Boton que realiza la busqueda
 * @param evt 
 */
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        boolean ordenarPorPrecio = OrdenPrecio.isSelected();
        boolean ordenarPorTipo = OrdenTipo.isSelected();
        boolean ordenarPorRelevancia = OrdenRelevancia.isSelected();
        String ciudad = CiudadAloj.getText();

        // Buscar inmuebles por ciudad y ordenarlos según las preferencias del usuario
        ArrayList<Inmueble> inmueblesOrdenados = buscarInmuebles(ciudad, ordenarPorPrecio, ordenarPorTipo, ordenarPorRelevancia);

        String[] datosInmuebles = new String[inmueblesOrdenados.size()];
        // Llenar el array con la información de los inmuebles
        for (int i = 0; i < inmueblesOrdenados.size(); i++) {
            datosInmuebles[i] = inmueblesOrdenados.get(i).getTitulo();
        }
        jList1.setListData(datosInmuebles);
    }//GEN-LAST:event_BuscarActionPerformed
/**
 * Boton para volver atrás
    */
    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ParticularV v = new ParticularV();
        v.setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed

    }//GEN-LAST:event_jList1KeyPressed


    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged

    }//GEN-LAST:event_jList1ValueChanged
/**
 * Boton para mostrar la información del inmueble
 * @param evt 
 */
    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        String seleccionado = jList1.getSelectedValue();
        if (seleccionado == null) {
            // No se ha seleccionado ningún inmueble de la lista
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un inmueble de la lista", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener las fechas de entrada y salida de los JSpinner
        LocalDate fechaEntrada = ((java.util.Date) FechaEntrada.getValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaSalida = ((java.util.Date) FechaSalida.getValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Verificar si las fechas son válidas (no están en el pasado)
        LocalDate fechaActual = LocalDate.now();
        if (fechaEntrada.isBefore(fechaActual) || fechaSalida.isBefore(fechaActual)) {
            JOptionPane.showMessageDialog(this, "Las fechas de entrada y salida deben ser posteriores a la fecha actual", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Metodos.cargarDatosReservas();
        ArrayList<Reserva> listaReservas = Metodos.getListaReservas();
        Inmueble inmuebleSeleccionado = Metodos.obtenerInmueblePorTitulo(seleccionado);

        // Verificar si el inmueble está disponible entre las fechas de entrada y salida
        // El inmueble está disponible, proceder con la reserva
        ConsultaInmueblesParticular v = new ConsultaInmueblesParticular(seleccionado, fechaEntrada, fechaSalida, listaReservas);
        v.setVisible(true);

    }//GEN-LAST:event_MostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField CiudadAloj;
    private javax.swing.JSpinner FechaEntrada;
    private javax.swing.JSpinner FechaSalida;
    private javax.swing.JLabel Logo1;
    private javax.swing.JButton Mostrar;
    private javax.swing.JCheckBox OrdenPrecio;
    private javax.swing.JCheckBox OrdenRelevancia;
    private javax.swing.JCheckBox OrdenTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
