/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

/**
 * Clase Factura Reserva para generar la factura
 * @author Pc
 */
public class FacturaReserva {
    
    private LocalDate fechaReserva;
    private double importe;
    private Inmueble inmueble;
    private Particular cliente;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
/**
 * constructor de la clase factura reserva
 * @param fechaReserva
 * @param importe
 * @param inmueble
 * @param cliente
 * @param fechaEntrada
 * @param fechaSalida 
 */
    public FacturaReserva(LocalDate fechaReserva, double importe, Inmueble inmueble, Particular cliente, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.fechaReserva = fechaReserva;
        this.importe = importe;
        this.inmueble = inmueble;
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    public static String nombreArchivo = "factura_reserva.txt";
    public FacturaReserva() {
    }
/**
 * Método para generar la factura de la reserva
 * @param reserva 
 */
    public void generarFacturaReserva(Reserva reserva) {
    try {
        
        File archivo = new File(nombreArchivo);

        // Crear el archivo si no existe
        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        // Abrir el archivo en modo de escritura (con opción de adjuntar)
        FileWriter fw = new FileWriter(archivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        // Escribir la información de la factura
        pw.println("Fecha de reserva: " + reserva.getFechaReserva());
        pw.println("Importe: " + reserva.getImporte());
        pw.println("Datos del inmueble: " + reserva.getDatosInmueble().toString());
        pw.println("Datos del cliente: " + reserva.getDatosParticular().toString());
        pw.println("Fecha de entrada prevista: " + reserva.getFechaEntrada());
        pw.println("Fecha de salida prevista: " + reserva.getFechaSalida());
        pw.println(); // Línea en blanco para separar las facturas

        // Cerrar el PrintWriter
        pw.close();
        System.out.println("Factura generada con éxito.");

    } catch (IOException e) {
        System.out.println("Error al generar la factura: " + e.getMessage());
    }
}
    
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }


    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }


    public Particular getCliente() {
        return cliente;
    }

    public void setCliente(Particular cliente) {
        this.cliente = cliente;
    }


    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }


    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }


    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

}
