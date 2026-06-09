/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.*;
import java.io.*;
import java.time.LocalDate;

/**
 * Clase Inmueble
 *
 * @author Pc
 */
public class Inmueble implements Serializable {

    private Map<LocalDate, Boolean> disponibilidad;

    /**
     * Constructor de la clase inmueble
     *
     * @param titulo
     * @param capacidad
     * @param habitaciones
     * @param camas
     * @param banos
     * @param tipo
     * @param precioNoche
     * @param servicios
     * @param foto
     * @param numero
     * @param codigoPostal
     * @param calle
     * @param ciudad
     * @param idAnfitrion
     */
    public Inmueble(String titulo, int capacidad, int habitaciones, int camas, int banos, String tipo, double precioNoche, String[] servicios, byte[] foto, int numero, int codigoPostal, String calle, String ciudad, String idAnfitrion) {
        this.titulo = titulo;
        this.capacidad = capacidad;
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.banos = banos;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.servicios = servicios;
        this.foto = foto;
        this.calificacion = calificacion;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.idAnfitrion = idAnfitrion;
        this.disponibilidad = new HashMap<>();

    }

    /**
     * constructor vacío
     */
    public Inmueble() {
        this.disponibilidad = new HashMap<>();
        // Inicializar la disponibilidad para un rango predeterminado de fechas, por ejemplo, un año
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaFin = fechaActual.plusYears(1); // Suponiendo que el rango sea de un año
        for (LocalDate fecha = fechaActual; fecha.isBefore(fechaFin); fecha = fecha.plusDays(1)) {
            this.disponibilidad.put(fecha, true); // Inicialmente, el inmueble está disponible para todas las fechas
        }
        Metodos.cargarDatosUsuarios();
        Metodos.cargarDatosInmuebles();
        Metodos.cargarDatosReservas();
        reiniciarDisponibilidad();
    }

    /**
     * metodo para reiniciar la disponibilidad del inmueble
     */
    public void reiniciarDisponibilidad() {
        // Reiniciar todas las fechas como disponibles
        LocalDate fechaActual = LocalDate.now();
        for (int i = 0; i < 365; i++) {
            disponibilidad.put(fechaActual.plusDays(i), true);
        }
    }

    /**
     * metod para marcar como reservado
     *
     * @param inmueble
     * @param fechaEntrada
     * @param fechaSalida
     */
    public void marcarComoReservado(Inmueble inmueble, LocalDate fechaEntrada, LocalDate fechaSalida) {
        // Iterar sobre las fechas entre la fecha de entrada y la fecha de salida
        for (LocalDate fecha = fechaEntrada; fecha.isBefore(fechaSalida); fecha = fecha.plusDays(1)) {
            // Marcar el estado de reserva en la lista de disponibilidad del inmueble para cada fecha
            inmueble.disponibilidad.put(fecha, false); // Suponiendo que disponibilidad es un Map<LocalDate, Boolean>
        }
    }

    /**
     * metodo para Confirmar si está disponible en esa fecha cogiendo el rango
     * de esos dias
     *
     * @param fechaEntrada
     * @param fechaSalida
     * @return true o false dependiendo de si está disponible o no
     */
    public boolean estaDisponibleEnFecha(LocalDate fechaEntrada, LocalDate fechaSalida) {
        // Iterar sobre las fechas entre la fecha de entrada y la fecha de salida
        for (LocalDate fecha = fechaEntrada; fecha.isBefore(fechaSalida); fecha = fecha.plusDays(1)) {
            // Verificar si alguna de las fechas no está disponible
            if (!disponibilidad.getOrDefault(fecha, true)) {
                return false; // El inmueble no está disponible para al menos una fecha en el rango
            }
        }
        return true; // El inmueble está disponible para todas las fechas en el rango
    }

    //METODO AGREGAR RESERVAS
    public void setReservas(boolean reservas) {
        this.reservas = reservas;
    }

    public boolean isReservas() {
        return reservas;
    }

    public void agregarReserva(Reserva reserva) {
        if (listaReservasInmueble == null) {
            listaReservasInmueble = new ArrayList<>();
        }
        listaReservasInmueble.add(reserva);
    }

    public ArrayList<Reserva> getListaReservasInmueble() {
        return listaReservasInmueble;
    }

    public void setListaReservasInmueble(ArrayList<Reserva> listaReservasInmueble) {
        this.listaReservasInmueble = listaReservasInmueble;
    }

    public ArrayList<Reserva> listaReservasInmueble;
    private String titulo;
    private int capacidad;
    private int habitaciones;
    private int camas;
    private int banos;
    private String tipo;
    private double precioNoche;
    private String[] servicios;
    private byte[] foto; //TIPO FILE... O BYTE... VAMOS VIENDO.       Mejor byte
    private double calificacion; //Del uno al 5.. poner condicion
    private boolean reservas;
    private String calle;
    private int numero;
    private int codigoPostal;
    private String ciudad;
    public String idAnfitrion;

    public String getIdAnfitrion() {
        return idAnfitrion;
    }

    public void setIdAnfitrion(String idAnfitrion) {
        this.idAnfitrion = idAnfitrion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String[] getServicios() {
        return servicios;
    }

    public void setServicios(String[] servicios) {
        this.servicios = servicios;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "titulo=" + titulo + ", capacidad=" + capacidad + ", habitaciones=" + habitaciones + ", camas=" + camas + ", banos=" + banos + ", tipo=" + tipo + ", precioNoche=" + precioNoche + ", servicios=" + Arrays.toString(servicios) + ", foto=" + Arrays.toString(foto) + ", calificacion=" + calificacion + ", reservas=" + reservas + ", calle=" + calle + ", numero=" + numero + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + "idanfi" + idAnfitrion + '}';
    }

}
