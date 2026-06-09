package Clases;
import java.io.Serializable;

    /**
     * Clase Persona que define los carácteres generales de los dos Tipos de usuario
     * @author Pc
     */

public class Persona implements Serializable{

    public Persona(String DNI, String Nombre, String correo, String clave, String telefono) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.correo = correo;
        this.clave = clave;
        this.telefono = telefono;
    }

    public Persona() {
    }
    
    
    public String DNI;
    public String Nombre;
    public String correo;
    public String clave;
    public String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", Nombre=" + Nombre + ", correo=" + correo + ", clave=" + clave + ", telefono=" + telefono + '}';
    }

  
}
