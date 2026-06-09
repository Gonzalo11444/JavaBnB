/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * JFrame en el que se pueden consultar las reservas que ha hecho el propio particular
 * @author Pc
 */
public class ConsultaReservasParticular extends javax.swing.JFrame {

    private JPanel panelReservas;

    public ConsultaReservasParticular(String reservasFilePath, String nombreParticular) {
        ArrayList<String> reservasParticular = filtrarReservasPorParticular(reservasFilePath, nombreParticular);
        initComponents(reservasParticular);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                volverAParticularV();
            }
        });
    }
/**
 * Metodo que filtra las reservas completas para obtener las del particular
 * @param reservasFilePath
 * @param nombreParticular
 * @return arraylist reservasdelparticular
 */
    private ArrayList<String> filtrarReservasPorParticular(String reservasFilePath, String nombreParticular) {
        ArrayList<String> reservasParticular = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(reservasFilePath));
            String linea;
            StringBuilder reservaActual = new StringBuilder();
            boolean reservaDelParticular = false;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(nombreParticular)) {
                    reservaDelParticular = true;
                }
                if (reservaDelParticular) {
                    reservaActual.append(linea).append("\n");
                }
                if (linea.isEmpty() && reservaDelParticular) {
                    // Se encontró una línea en blanco, lo que indica el final de una reserva
                    reservasParticular.add(reservaActual.toString());
                    reservaActual = new StringBuilder();
                    reservaDelParticular = false;
                }
            }
            // Agregar la última reserva si no hay una línea en blanco al final del archivo
            if (reservaDelParticular && reservaActual.length() > 0) {
                reservasParticular.add(reservaActual.toString());
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reservasParticular;
    }
/**
 * InitComponents que crea el jpanel
 * @param reservas 
 */
    
    private void initComponents(ArrayList<String> reservas) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Reservas del Particular");

        panelReservas = new JPanel();
        panelReservas.setLayout(new BoxLayout(panelReservas, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(panelReservas);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        for (String reserva : reservas) {
            JPanel reservaPanel = new JPanel();
            reservaPanel.setLayout(new GridLayout(0, 1));

            // Divide la reserva en líneas y agrega cada línea como un JLabel
            String[] lineasReserva = reserva.split("\n");
            for (String linea : lineasReserva) {
                JLabel label = new JLabel(linea);
                reservaPanel.add(label);
            }

            panelReservas.add(reservaPanel);
        }

        add(scrollPane);
        pack();
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }
/**
 * Metodo para volver atrás
 */
    private void volverAParticularV() {
        ParticularV particularV = new ParticularV();
        particularV.setVisible(true);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
