/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.*;
import java.time.*;
import java.io.Serializable;
/**
 * Clase Anfitrion 
 * @author Pc
 */
public class Anfitrion extends Persona implements Serializable {

    public Anfitrion(LocalDate fechaRegistroApp, String DNI, String Nombre, String correo, String clave, String telefono) {
        super(DNI, Nombre, correo, clave, telefono);
        this.fechaRegistroApp = fechaRegistroApp;
    }
/**
 * constructor vacío de Anfitrion
 */
    public Anfitrion() {
    }

    private LocalDate fechaRegistroApp;
    public boolean superAnfitrion;
/**
 * metodo en el que se actualiza el atributo superanfitrion
 * @param inmuebles 
 */
    public void actualizarSuperAnfitrion(List<Inmueble> inmuebles) {
        if (inmuebles == null || inmuebles.isEmpty()) {
            this.superAnfitrion = false;
            return;
        }

        double sumaCalificaciones = 0;
        int count = 0;

        for (Inmueble inmueble : inmuebles) {
            if (inmueble.getCalificacion() >= 0) { // Asumiendo que una calificación de 0 significa que no ha sido calificado
                sumaCalificaciones += inmueble.getCalificacion();
                count++;
            }
        }

        if (count == 0) {
            this.superAnfitrion = false;
        } else {
            double media = sumaCalificaciones / count;
            this.superAnfitrion = media >= 4;
        }
    }
/**
 * recoge el estado de superanfitrion
 * @return true o false
 */
    public boolean isSuperAnfitrion() {
        return superAnfitrion;
    }
/**
 * Setea el superanfitrion
 * @param superAnfitrion 
 */
    public void setSuperAnfitrion(boolean superAnfitrion) {
        this.superAnfitrion = superAnfitrion;
    }
/**
 * consigue la fecha de registro en la App
 * @return true o false
 */
    
    public LocalDate getFechaRegistroApp() {
        return fechaRegistroApp;
    }

    public void setFechaRegistroApp(LocalDate fechaRegistroApp) {
        this.fechaRegistroApp = fechaRegistroApp;
    }

    @Override
    public String toString() {
        return "Anfitrion{" + "fechaRegistroApp=" + fechaRegistroApp + ", superAnfitrion= " + superAnfitrion + "DNI: " + DNI + " Nombre: " + Nombre + " Correo: " + correo + " telefono: " + telefono + '}';
    }

}
