/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.io.Serializable;
/**
 * Clase en el que se consultan los usuarios, inmuebles y reservas completas
 * @author Pc
 */
public class Admin implements Serializable{
    
    private static final String CORREO_ADMIN = "admin@javabnb.com";
    private static final String CLAVE_ADMIN = "admin";
/**
 * //Static porque esa variable pertenece a la clase en lugar de las instancias individuales de la clase compartido por todas las instancias de
 * la clase y se puede acceder mediante el nombre de la clase.
 * //Final para que el valor no se pueda cambiar mas adelante una vez inicializado...
 
 */
    /**
     * metodo para verificar las creedenciales
     * @param correo
     * @param clave
     * @return 
     */
    public static boolean verificarCredenciales(String correo, String clave) {
        return correo.equals(CORREO_ADMIN) && clave.equals(CLAVE_ADMIN);
    } //Si objeto corre admin es igual a la entrada e igual con la clave.
    
    
    //Ahora se añadirían dos metodos para gestinar usuarios e inmuebles
    public void gestionarUsuarios() {
        // Código para gestionar usuarios
    }

    public void gestionarInmuebles() {
        // Código para gestionar inmuebles
    }
    
    /**
     * Getclaveadmin
     * @return 
     */
    public static String getCLAVE_ADMIN() {
        return CLAVE_ADMIN;
    }
/**
 * get correo admin
 * @return 
 */
    public static String getCORREO_ADMIN() {
        return CORREO_ADMIN;
    }

}
