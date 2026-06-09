package Ventana;

import Clases.Anfitrion;
import Clases.Inmueble;
import Clases.Metodos;
import Clases.Persona;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * CalificarInmuebleFrame es una clase que representa una ventana para calificar
 * inmuebles reservados.
 */
public class CalificarInmuebleFrame extends JFrame {

    private ParticularV ventanaAnterior; // Referencia a la ventana anterior
    private ArrayList<Inmueble> inmueblesReservados; // Lista de inmuebles reservados

    /**
     * Constructor para CalificarInmuebleFrame.
     *
     * @param inmueblesReservados Lista de inmuebles reservados.
     * @param ventanaAnterior Referencia a la ventana anterior.
     */
    public CalificarInmuebleFrame(ArrayList<Inmueble> inmueblesReservados, ParticularV ventanaAnterior) {
        this.inmueblesReservados = inmueblesReservados;
        this.ventanaAnterior = ventanaAnterior;
        initComponents(); // Inicializar componentes de la interfaz
    }

    /**
     * Inicializa los componentes de la interfaz gráfica.
     */
    private void initComponents() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Calificar Inmuebles Reservados");
        setPreferredSize(new Dimension(400, 300));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Agregar cada inmueble a la interfaz con sus botones de calificación
        for (Inmueble inmueble : inmueblesReservados) {
            JLabel label = new JLabel(inmueble.getTitulo());
            panel.add(label);

            JPanel ratingPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

            // Agregar botones de calificación del 1 al 5
            for (int i = 1; i <= 5; i++) {
                JButton ratingButton = new JButton(Integer.toString(i));
                ratingButton.addActionListener(new CalificacionListener(inmueble, i));
                ratingPanel.add(ratingButton);
            }

            panel.add(ratingPanel);
        }

        JScrollPane scrollPane = new JScrollPane(panel);
        add(scrollPane);

        pack();
        setLocationRelativeTo(null);

        // Agregar comportamiento para volver a la ventana anterior al cerrar
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                ventanaAnterior.setVisible(true);
            }
        });
    }

    /**
     * CalificacionListener es una clase interna que maneja la acción de
     * calificación de un inmueble.
     */
    private class CalificacionListener implements ActionListener {

        private Inmueble inmueble;
        private int calificacion;

        public CalificacionListener(Inmueble inmueble, int calificacion) {
            this.inmueble = inmueble;
            this.calificacion = calificacion;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            inmueble.setCalificacion(calificacion);
            JOptionPane.showMessageDialog(null, "Calificación guardada para " + inmueble.getTitulo());
            Metodos.guardarDatosInmuebles();

            // Obtener el Anfitrion asociado al inmueble y actualizar su estado de superAnfitrion
            Anfitrion anfitrion = Metodos.obtenerAnfitrionPorInmueble(inmueble);
            if (anfitrion != null) {
                Metodos.actualizarSuperAnfitrion(anfitrion.getNombre());
            } else {
                System.out.println("No se pudo encontrar el anfitrión asociado al inmueble.");
            }
        }

        /**
         * Maneja el evento de acción cuando se presiona un botón de
         * calificación.
         *
         * @param e Evento de acción.
         */
        /**
         *
         * @SuppressWarnings("unchecked")
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
*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
}
