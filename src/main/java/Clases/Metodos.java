/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Ventana.*;
import java.awt.BorderLayout;
import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Clase Metodos que almacena la mayoría de los metodos necesarios para el sistema
 * @author Gonzalo
 */

public class Metodos {

    public static ArrayList<Persona> listaClientes = new ArrayList<>();
    private static final String ARCHIVO_CLIENTES = "clientes.dat";
    private static ArrayList<Inmueble> listaInmuebles = new ArrayList<>();
    private static final String ARCHIVO_INMUEBLES = "Inmuebles.dat";
    private static Persona per;
    public static String usuarioActual;
    public static int usuarioActualIndex = 0;
    public static int inmuebleActualIndex = 0;
    private static Inmueble inmueble;
    private static final String ARCHIVO_RESERVAS = "Reservas.dat";
    private static ArrayList<Reserva> listaReservas = new ArrayList<>();


    /**
     * Metodo para guardar los datos de los usuarios
     */
    public static void guardarDatosUsuarios() {
        try {
            File archivo = new File(ARCHIVO_CLIENTES);

            //Si no existe el archivo se creará
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            //Si hay datos los guardamos...
            if (!listaClientes.isEmpty()) {
                //Serialización de las personas
                FileOutputStream ostreamUser = new FileOutputStream(archivo);
                ObjectOutputStream oosUser = new ObjectOutputStream(ostreamUser);
                //guardamos el array de personas
                oosUser.writeObject(listaClientes);
                ostreamUser.close();
            } else {
                System.out.println("Error: No hay datos.");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos
/**
 * Metodo que da de alta a los usuarios y los guarda en el arraylist listaclientes,
 * empleando el metodo guardardatosusuarios() para serializarlos
 * @param per
 * @return 
 */
    public static boolean altaUsuario(Persona per) {
        // Verificar si ya existe un usuario con el mismo DNI

        for (Persona clienteExistente : listaClientes) {
            if (clienteExistente.getDNI().equals(per.getDNI())) {
                return false;
            }
        }
        // Si no existe un usuario con el mismo DNI, lo agrega a la lista

        listaClientes.add(per);
        guardarDatosUsuarios();
        return true;
    }

    /**
     * Carga los datos de usuarios del fichero
     */
    public static void cargarDatosUsuarios() {
        try {
            //Lectura de los objetos de tipo usuario
            FileInputStream istreamUser = new FileInputStream(ARCHIVO_CLIENTES);
            ObjectInputStream oisUser = new ObjectInputStream(istreamUser);
            listaClientes = (ArrayList) oisUser.readObject();
            istreamUser.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos
/**
 * metodo para conseguir la lista de clientes
 * @return ArrayList listaClientes
 */
    public static ArrayList<Persona> getListaClientes() {
        return listaClientes;
    }

    /**
     * abre la ventana de administrador
     */
    private static void abrirVentanaAdmin() {
        JFrame ventanaAdmin = new Administrador();
        ventanaAdmin.setVisible(true);
    }
/**
 * Abre la ventana de anfitrion
 */
    private static void abrirVentanaAnfitrion() {
        JFrame ventanaAnfitrion = new AnfitrionV();
        ventanaAnfitrion.setVisible(true);
    }
/**
 * Abre la ventana particular
 */
    private static void abrirVentanaParticular() {
        JFrame ventanaParticular = new ParticularV();
        ventanaParticular.setVisible(true);
    }

    /**
     * Metodo que emplea el jframe iniciosesion para verificar los datos del usuario e iniciar sesión
     * @param correo
     * @param clave
     * @param ventana 
     */
    public static void verificar(String correo, String clave, InicioSesion ventana) {
        cargarDatosUsuarios();
        boolean encontrado = false;
        boolean esParticular = false;
        // verificamos si las credenciales son del administrador
        if (correo.equals("admin@javabnb.com") && clave.equals("admin")) {
            JOptionPane.showMessageDialog(null, "Bienvenido administrador", "Información", JOptionPane.INFORMATION_MESSAGE);
            // si las credenciales son del administrador, abrir ventana de administrador
            abrirVentanaAdmin();
            ventana.dispose();
            return;
        }
        // si las credenciales no son de administrador, buscamos en la lista de usuarios
        for (Persona cliente : listaClientes) {
            if (cliente.getCorreo().equals(correo) && cliente.getClave().equals(clave)) {
                // se ha verificado que coinciden
                encontrado = true;
                usuarioActual = cliente.getNombre();
                // se verifica si el usuario es particular (tiene número de tarjeta de crédito)
                if (cliente instanceof Particular && ((Particular) cliente).getTarjetaCreditoNumero() != 0) {
                    esParticular = true;

                }
                break;

            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso", "Información", JOptionPane.INFORMATION_MESSAGE);
            if (esParticular) {
                // se abre la ventana para usuario particular
                abrirVentanaParticular();
            } else {
                // se abre la ventana para usuario anfitrión
                abrirVentanaAnfitrion();
            }
            // se cierra la ventana de InicioSesion tras iniciar sesión
            ventana.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Inicio de sesión fallido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
/**
 * Consulta el usuario mediante el nombre y devuelve el objeto persona obtenido
 * @param nombre
 * @return 
 */
    public static Persona consultaUsuarioPorNombre(String nombre) {
        // llamamos a un comparador para ordenar a los usuarios por su nombre
        Comparator NomUserComp = new Comparator() {

            public int compare(Object o1, Object o2) {
                Persona u1 = (Persona) o1;
                Persona u2 = (Persona) o2;
                return u1.getNombre().compareTo(u2.getNombre());
            }
        };

        // se ordena el array
        Collections.sort(listaClientes, NomUserComp);
        // se crea un nuevo usuario con el nombre a buscar
        Persona u = new Persona();
        u.setNombre(nombre);
        int pos = Collections.binarySearch(listaClientes, u, NomUserComp);
        if (pos >= 0) {
            per = listaClientes.get(pos);
        } else {
            per = null;
        }

        return per;
    }
/**
 * Modifica los datos del particular con los nuevos paramteros establecidos
 * @param correo
 * @param nuevoNombre
 * @param nuevoCorreo
 * @param nuevaClave
 * @param nuevoTelefono
 * @param nuevoTarjetaCreditoNombre
 * @param nuevoTarjetaCreditoNumero
 * @param nuevaFechaCaducidad
 * @return true o falsesi se ha podido encontrar al usuario o no
 */
    public static boolean modificarDatosParticular(String correo, String nuevoNombre, String nuevoCorreo, String nuevaClave, String nuevoTelefono, String nuevoTarjetaCreditoNombre, long nuevoTarjetaCreditoNumero, LocalDate nuevaFechaCaducidad) {
        // Buscar al usuario en la lista de clientes
        for (Persona cliente : listaClientes) {
            if (cliente.getCorreo().equals(correo) && cliente instanceof Particular) {
                // Si se encuentra al usuario y es de tipo Particular, se modifican sus datos
                cliente.setNombre(nuevoNombre);
                cliente.setCorreo(nuevoCorreo);
                cliente.setClave(nuevaClave);
                cliente.setTelefono(nuevoTelefono);

                // Modificar los datos específicos de Particular
                Particular clienteParticular = (Particular) cliente;
                clienteParticular.setTarjetaCreditoNombre(nuevoTarjetaCreditoNombre);
                clienteParticular.setTarjetaCreditoNumero(nuevoTarjetaCreditoNumero);
                clienteParticular.setTarjetaCreditoFechaCaducidad(nuevaFechaCaducidad);

                // Guardar los datos modificados
                guardarDatosUsuarios();
                return true;
            }
        }
        // Si no se encuentra al usuario, se retorna false
        return false;
    }
/**
 * Metodo que modifica los datos del usuario
 * @param correo
 * @param nuevoNombre
 * @param nuevoCorreo
 * @param nuevaClave
 * @param nuevoTelefono
 * @return true si consigue encontrar al usuario, false si no.
 */
    public static boolean modificarDatosUsuario(String correo, String nuevoNombre, String nuevoCorreo, String nuevaClave, String nuevoTelefono) {
        // Buscar al usuario en la lista de clientes
        for (Persona cliente : listaClientes) {
            if (cliente.getCorreo().equals(correo)) {
                // Si se encuentra al usuario, se modifican sus datos
                cliente.setNombre(nuevoNombre);
                cliente.setCorreo(nuevoCorreo);
                cliente.setClave(nuevaClave);
                cliente.setTelefono(nuevoTelefono);

                // Guardar los datos modificados
                guardarDatosUsuarios();
                return true;
            }
        }
        // Si no se encuentra al usuario, se retorna false
        return false;
    }
/**
 * Metodo que consulta al usuario mediante el DNI
 * @param dni
 * @return el objeto tipo usuario completo
 */
    public static Persona consultaUsuarioPorDni(String dni) {
        //Comparador para ordenar los usuarios por su dni
        Comparator DniUserComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Persona u1 = (Persona) o1;
                Persona u2 = (Persona) o2;
                return u1.getDNI().compareTo(u2.getDNI());
            }
        };
        //Ordenamos el array
        Collections.sort(listaClientes, DniUserComp);
        //creamos un usuario con el dni a buscar
        Persona u = new Persona();
        u.setDNI(dni);
        int pos = Collections.binarySearch(listaClientes, u, DniUserComp);
        if (pos >= 0) {
            per = listaClientes.get(pos);
        } else {
            per = null;
        }
        return per;
    }
/**
 * Metodo que carga los datos de los inmubeles
 */
    public static void cargarDatosInmuebles() {
        try {
            //Lectura de los objetos de tipo usuario
            FileInputStream istreamInmu = new FileInputStream(ARCHIVO_INMUEBLES);
            ObjectInputStream oisInmu = new ObjectInputStream(istreamInmu);
            listaInmuebles = (ArrayList) oisInmu.readObject();
            istreamInmu.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos
/**
 * metodo que devuelve la lista de los inmuebles
 * @return 
 */
    public static ArrayList<Inmueble> getListaInmuebles() {
        return listaInmuebles;
    }

    /**
     * Metodo que guarda los datos de los inmuebles en el archivo.dat
     */
    public static void guardarDatosInmuebles() {
        try {
            File archivo = new File(ARCHIVO_INMUEBLES);

            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            if (!listaInmuebles.isEmpty()) {
                //Serialización de las personas
                FileOutputStream ostreamInmu = new FileOutputStream(archivo);
                ObjectOutputStream oosInmu = new ObjectOutputStream(ostreamInmu);
                oosInmu.writeObject(listaInmuebles);
                ostreamInmu.close();
            } else {
                System.out.println("Error: No hay datos.");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    //fin guardarDatos
/**
 * Metodo para dar alta a los inmuebles y guardar los datos
 * @param inmueble
 * @return true si ha conseguido guardarlos
 */
    public static boolean altaInmuebles(Inmueble inmueble) {
        listaInmuebles.add(inmueble);
        guardarDatosInmuebles();
        return true;
    }
    //Si boolean removed es true, entonces pasamos a .remove y guardamos la lista, además de retornar el true
    //remove devuelve true si lo ha encontrado y eliminado
    public static boolean bajaInmueble(Inmueble inmueble) {
        boolean removed = listaInmuebles.remove(inmueble);
        guardarDatosInmuebles();
        return removed;
    }
/**
 * Metodo que obtiene el inmueble mediante el id del anfitrion
 * @param idAnfitrion
 * @return objeto de tipo anfitrion
 */
    public static ArrayList<Inmueble> obtenerInmueblesPorAnfitrion(String idAnfitrion) {
        ArrayList<Inmueble> inmueblesAnfitrion = new ArrayList<>();
        ArrayList<Inmueble> listaCompletaInmuebles = getListaInmuebles();
        
        for (Inmueble inmueble : listaCompletaInmuebles) {

            // Asegúrate de que el idAnfitrion del inmueble coincida con el usuarioActual
            if (inmueble.getIdAnfitrion() != null && inmueble.getIdAnfitrion().equals(usuarioActual)) {
                inmueblesAnfitrion.add(inmueble);
            }
        }

        return inmueblesAnfitrion;
    }
/**
 * Metodo que permite modificar el inmueble
 * @param inmueble
 * @param titulo
 * @param capacidad
 * @param habitaciones
 * @param camas
 * @param banos
 * @param tipo
 * @param precioNoche
 * @param servicios
 * @param foto
 * @param calificacion
 * @param numero
 * @param codigoPostal
 * @param calle
 * @param ciudad 
 */
    public static void modificarInmueble(Inmueble inmueble, String titulo, int capacidad, int habitaciones, int camas, int banos, String tipo, double precioNoche, String[] servicios, byte[] foto, double calificacion, int numero, int codigoPostal, String calle, String ciudad) {
        // Actualizar los datos del inmueble con los valores proporcionados
        inmueble.setTitulo(titulo);
        inmueble.setCapacidad(capacidad);
        inmueble.setHabitaciones(habitaciones);
        inmueble.setCamas(camas);
        inmueble.setBanos(banos);
        inmueble.setTipo(tipo);
        inmueble.setPrecioNoche(precioNoche);
        inmueble.setServicios(servicios);
        inmueble.setFoto(foto);
        inmueble.setCalificacion(calificacion);
        inmueble.setNumero(numero);
        inmueble.setCodigoPostal(codigoPostal);
        inmueble.setCalle(calle);
        inmueble.setCiudad(ciudad);

    }
    /**
     * Metodo para modificar el estado de superanfitrion
     */
 public static void actualizarSuperAnfitriones() {
        for (Persona usuario : listaClientes) {
            if (usuario instanceof Anfitrion) {
                Anfitrion anfitrion = (Anfitrion) usuario;
                List<Inmueble> inmueblesAnfitrion = obtenerInmueblesPorAnfitrion(anfitrion.getNombre());
                anfitrion.actualizarSuperAnfitrion(inmueblesAnfitrion);
                System.out.println(usuarioActual);
            }
        }
    }
 /**
  * Metodo que permite obtener al anfitrion mediante el idanfitrion del inmueble
  * @param inmueble
  * @return el objeto de inmueble
  */
 public static Anfitrion obtenerAnfitrionPorInmueble(Inmueble inmueble) {
    for (Persona persona : listaClientes) {
        if (persona instanceof Anfitrion && ((Anfitrion) persona).getNombre().equals(inmueble.getIdAnfitrion())) {
            return (Anfitrion) persona;
        }
    }
    return null;
}
 /**
  * Obtiene el anfitiron mediante el nombre
  * @param nombre
  * @return objeto tipo anfitrion
  */
 public static Anfitrion obtenerAnfitrionPorId(String nombre) {
    if (listaClientes == null) {
        System.out.println("La lista de clientes es null");
        return null;
    }

    for (Persona persona : listaClientes) {
        if (persona instanceof Anfitrion && persona.getNombre().equalsIgnoreCase(nombre)) {
            return (Anfitrion) persona;
        }
    }
    System.out.println("No se encontró el particular con nombre: " + nombre);
    return null; // Devuelve null si no se encuentra el particular
}
 
/**
 * Actualiza el estado de superanfitrion
 * @param idAnfitrion 
 */
 public static void actualizarSuperAnfitrion(String idAnfitrion) {
    Anfitrion anfitrion = obtenerAnfitrionPorId(idAnfitrion);
    if (listaClientes == null) {
        System.out.println("Anfitrión no encontrado.");
        return;
    }

    ArrayList<Inmueble> inmuebles = obtenerInmueblesPorAnfitrion(idAnfitrion);
    if (inmuebles.isEmpty()) {
        anfitrion.setSuperAnfitrion(true);
        return;
    }

    double sumaCalificaciones = 0;
    int cantidadCalificaciones = 0;

    for (Inmueble inmueble : inmuebles) {
        if (inmueble.getCalificacion() > 0) { // Consider only rated properties
            sumaCalificaciones += inmueble.getCalificacion();
            cantidadCalificaciones++;
        }
    }

    if (cantidadCalificaciones == 0) {
        anfitrion.setSuperAnfitrion(false);
        return;
    }

    double mediaCalificaciones = sumaCalificaciones / cantidadCalificaciones;
    anfitrion.setSuperAnfitrion(mediaCalificaciones > 4);
    
    guardarDatosUsuarios(); // Make sure to save the changes
}
/**
 * Metodo que obtiene el inmueble mediante su título
 * @param titulo
 * @return el inmueble si ha podido encontrarlo
 */
    public static Inmueble obtenerInmueblePorTitulo(String titulo) {
        ArrayList<Inmueble> listaInmuebles = Metodos.getListaInmuebles();
        for (Inmueble inmueble : listaInmuebles) {
            if (inmueble.getTitulo().equals(titulo)) {
                return inmueble;
            }
        }
        return null;
    }
/**
 *Metodo para guardar los datos de la reserva empleando serialización 
 */
    //Guardar datos de los inmuebles en el arraylist
    public static void guardarDatosReservas() {
        try {
            File archivo = new File(ARCHIVO_RESERVAS);

            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            if (!listaReservas.isEmpty()) {
                // Serialización de las reservas
                FileOutputStream ostreamReservas = new FileOutputStream(archivo);
                ObjectOutputStream oosReservas = new ObjectOutputStream(ostreamReservas);
                oosReservas.writeObject(listaReservas);
                ostreamReservas.close();
            } else {
                System.out.println("Error: No hay datos de reservas para guardar.");
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    //fin guardarDatos
/**
 * Metodo para obtener la listad e las reservas
 * @return ArrayList reservas
 */
    public static ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }
/**
 * Metodo para cargar los datos de las reservas
 */
    public static void cargarDatosReservas() {
        try {
            // Lectura de los objetos de tipo reserva
            FileInputStream istreamReservas = new FileInputStream(ARCHIVO_RESERVAS);
            ObjectInputStream oisReservas = new ObjectInputStream(istreamReservas);
            listaReservas = (ArrayList<Reserva>) oisReservas.readObject();
            istreamReservas.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }//fin cargarDatos
    /**
     * Metodo para obtener el particular mediante su nombre
     * @param nombre
     * @return null si no lo encuentra, objeto particular si lo encuentra
     */
public static Particular obtenerParticularPorNombre(String nombre) {
    if (listaClientes == null) {
        System.out.println("La lista de clientes es null");
        return null;
    }

    for (Persona persona : listaClientes) {
        if (persona instanceof Particular && persona.getNombre().equalsIgnoreCase(nombre)) {
            return (Particular) persona;
        }
    }
    System.out.println("No se encontró el particular con nombre: " + nombre);
    return null; // Devuelve null si no se encuentra el particular
}/**
 * Verifica si el inmueble está dosponible esas fechas
 * @param inmueble
 * @param fechaEntrada
 * @param fechaSalida
 * @param listaReservas
 * @return 
 */

    public static boolean inmuebleDisponibleEnFechas(Inmueble inmueble, LocalDate fechaEntrada, LocalDate fechaSalida, ArrayList<Reserva> listaReservas) {
        long diasReserva = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);

        for (Reserva reserva : listaReservas) {
            LocalDate reservaFechaEntrada = reserva.getFechaEntrada();
            LocalDate reservaFechaSalida = reserva.getFechaSalida();

            long diasReservaExistente = ChronoUnit.DAYS.between(reservaFechaEntrada, reservaFechaSalida);

            // Verificar si el rango de fechas de la reserva se solapa con el rango de fechas deseado
            if (reservaFechaEntrada.isBefore(fechaSalida) && reservaFechaSalida.isAfter(fechaEntrada)) {
                // El inmueble está reservado para al menos una reserva en este rango de fechas
                return false;
            }
        }
        // El inmueble está disponible para todas las fechas en el rango especificado
        return true;
    }
/**
 * Metodo para agregar la reserva a la lista de reservas
 * @param reserva 
 */
    public static void agregarReserva(Reserva reserva) {
        // Agregar la reserva a la lista de reservas
        listaReservas.add(reserva);

        // Marcar el inmueble como reservado para las fechas de la reserva
        Inmueble inmuebleReservado = reserva.getDatosInmueble();
        LocalDate fechaEntrada = reserva.getFechaEntrada();
        LocalDate fechaSalida = reserva.getFechaSalida();

        // Iterar sobre la lista de inmuebles para encontrar el inmueble correspondiente
        for (Inmueble inmueble : listaInmuebles) {
            if (inmueble.equals(inmuebleReservado)) {
                // Marcar el inmueble como reservado para las fechas de la reserva
                inmueble.marcarComoReservado(inmueble, fechaEntrada, fechaSalida);
                break; // Salir del bucle una vez que se haya encontrado y actualizado el inmueble
            }
        }

        // Guardar los datos actualizados de las reservas
        guardarDatosReservas();
        // Guardar los datos actualizados de los inmuebles (para reflejar los cambios en el estado de reserva)
        guardarDatosInmuebles();
    }
/**
 * Metodo para obtener el inmueble reservados por el particular
 * @param nombreParticular
 * @return arraylist inmueblesreservasporelparticualr
 */
    public static ArrayList<Inmueble> obtenerInmueblesReservadosPorParticular(String nombreParticular) {
        ArrayList<Inmueble> inmueblesReservados = new ArrayList<>();

        // Obtener todas las reservas
        ArrayList<Reserva> listaReservas = Metodos.getListaReservas();

        // Iterar sobre cada reserva para verificar si pertenece al particular
        for (Reserva reserva : listaReservas) {
            // Obtener el particular asociado a la reserva
            Particular particular = reserva.getDatosParticular();

            // Verificar si el nombre del particular coincide
            if (particular.getNombre().equalsIgnoreCase(nombreParticular)) {
                // Obtener el inmueble asociado a la reserva
                Inmueble inmuebleReservado = reserva.getDatosInmueble();

                // Agregar el inmueble reservado a la lista
                inmueblesReservados.add(inmuebleReservado);
            }
        }
        return inmueblesReservados;
    }
}
