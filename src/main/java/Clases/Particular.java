/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import javax.swing.JFormattedTextField;

/**
 * Clase Particular que define un tipo de usuario
 * @author Pc
 */
public class Particular extends Persona implements Serializable{

    private JFormattedTextField txtNumeroTarjeta;

  /**
   * Constructor de la clase Particular
   * @param tarjetaCreditoNombre
   * @param tarjetaCreditoNumero
   * @param tarjetaCreditoFechaCaducidad
   * @param VIP
   * @param DNI
   * @param Nombre
   * @param correo
   * @param clave
   * @param telefono 
   */

    public Particular(String tarjetaCreditoNombre, long tarjetaCreditoNumero, LocalDate tarjetaCreditoFechaCaducidad, boolean VIP, String DNI, String Nombre, String correo, String clave, String telefono) {
        super(DNI, Nombre, correo, clave, telefono);
        this.tarjetaCreditoNombre = tarjetaCreditoNombre;
        this.tarjetaCreditoNumero = tarjetaCreditoNumero;
        this.tarjetaCreditoFechaCaducidad = tarjetaCreditoFechaCaducidad;
        this.VIP = VIP;
    }
/**
 * COnstructor vacío
 */
    public Particular() {
    }

    private String tarjetaCreditoNombre;
    private long tarjetaCreditoNumero;
    private LocalDate tarjetaCreditoFechaCaducidad;
    private boolean VIP;

    public long getTarjetaCreditoNumero() {
        return tarjetaCreditoNumero;
    }

    public void setTarjetaCreditoNumero(long tarjetaCreditoNumero) {
        this.tarjetaCreditoNumero = tarjetaCreditoNumero;
    }

    
    
    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }


    public void setTarjetaCreditoFechaCaducidad(LocalDate tarjetaCreditoFechaCaducidad) {
        this.tarjetaCreditoFechaCaducidad = tarjetaCreditoFechaCaducidad;
    }

    public LocalDate getTarjetaCreditoFechaCaducidad() {
        return tarjetaCreditoFechaCaducidad;
    }


    public String getTarjetaCreditoNombre() {
        return tarjetaCreditoNombre;
    }

    public void setTarjetaCreditoNombre(String tarjetaCreditoNombre) {
        this.tarjetaCreditoNombre = tarjetaCreditoNombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +"clave:" +clave + "DNI: " + DNI + " Nombre: " + Nombre + " Correo: " + correo + " telefono: " + telefono + " tarjetaCreditoNombre: " + tarjetaCreditoNombre + ", tarjetaCreditoNumero: " + tarjetaCreditoNumero + ", tarjetaCreditoFechaCaducidad: " + tarjetaCreditoFechaCaducidad + ", VIP: " + VIP + '}';
    }

        public void setjFormattedTextFieldNumeroTarjeta(long numerotarjeta) {
        this.txtNumeroTarjeta.setValue(numerotarjeta);
    }

}
