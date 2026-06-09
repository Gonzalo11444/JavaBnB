/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
/**
 * Clase reserva
 * @author Pc
 */
public class Reserva implements Serializable {

    public Reserva(LocalDate FechaReserva, LocalDate FechaEntrada, LocalDate FechaSalida, Double Importe, Inmueble DatosInmueble, Particular DatosParticular) {
        this.FechaReserva = FechaReserva;
        this.Importe = Importe;
        this.DatosInmueble = DatosInmueble;
        this.DatosParticular = DatosParticular;
        this.FechaEntrada = FechaEntrada;
        this.FechaSalida = FechaSalida;
    }

    public Reserva() {
    }

    private LocalDate FechaReserva;
    private Double Importe;
    private Inmueble DatosInmueble;
    private Particular DatosParticular;
    private LocalDate FechaEntrada;
    private LocalDate FechaSalida;

    

    public LocalDate getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(LocalDate FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public LocalDate getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(LocalDate FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public Particular getDatosParticular() {
        return DatosParticular;
    }

    public void setDatosParticular(Particular DatosParticular) {
        this.DatosParticular = DatosParticular;
    }

    public Inmueble getDatosInmueble() {
        return DatosInmueble;
    }

    public void setDatosInmueble(Inmueble DatosInmueble) {
        this.DatosInmueble = DatosInmueble;
    }

    public Double getImporte() {
        return Importe;
    }

    public void setImporte(Double Importe) {
        this.Importe = Importe;
    }

    public LocalDate getFechaReserva() {
        return FechaReserva;
    }

    public void setFechaReserva(LocalDate FechaReserva) {
        this.FechaReserva = FechaReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" + "FechaReserva=" + FechaReserva + ", Importe=" + Importe + ", DatosInmueble=" + DatosInmueble + ", DatosParticular=" + DatosParticular + ", FechaEntrada=" + FechaEntrada + ", FechaSalida=" + FechaSalida + '}';
    }


}
