package model;

import util.Validador;

/**
 * Representa a una persona con sus datos personales y de contacto básicos.
 * <p>
 * Utiliza composición con la clase {@link Direccion} para almacenar calle,
 * comuna y región, y delega la validación de sus campos a {@link Validador}.
 * </p>
 */
public class Persona {

    private String nombreCompleto; // Nombre completo de la persona
    private String rut; // Rut de la persona
    private int edad; // Edad de la persona
    private model.Direccion direccion; // Direccion de la persona
    private String correo; // Correo de la persona
    private long numeroTelefono; // Número de teléfono de la persona

    /**
     * Obtiene el nombre completo de la persona.
     *
     * @return el nombre completo.
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Establece el nombre completo de la persona tras validarlo con {@link Validador}.
     *
     * @param nombreCompleto el nuevo nombre completo.
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = Validador.validador(nombreCompleto, "Nombre");
    }

    /**
     * Obtiene el RUT de la persona.
     *
     * @return el RUT.
     */
    public String getRut() {
        return rut;
    }

    /**
     * Establece el RUT de la persona tras validarlo con {@link Validador}.
     *
     * @param rut el nuevo RUT.
     */
    public void setRut(String rut) {
        this.rut = Validador.validador(rut, "Rut");
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return la edad en años.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona tras validarla con {@link Validador}.
     *
     * @param edad la nueva edad.
     */
    public void setEdad(int edad) {
        this.edad = Validador.validador(edad, "Edad");
    }

    /**
     * Obtiene la dirección asociada a la persona.
     *
     * @return el objeto {@link Direccion} de la persona.
     */
    public model.Direccion getDireccion() {
        return direccion;
    }

    /**
     * Crea y asigna una nueva {@link Direccion} para la persona.
     *
     * @param calle  nombre de la calle.
     * @param comuna nombre de la comuna.
     * @param region nombre de la región.
     */
    public void setDireccion(String calle, String comuna, String region) {
        this.direccion = new model.Direccion(calle, comuna, region);
    }

    /**
     * Obtiene el correo electrónico de la persona.
     *
     * @return el correo electrónico.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico de la persona tras validarlo con {@link Validador}.
     *
     * @param correo el nuevo correo electrónico.
     */
    public void setCorreo(String correo) {
        this.correo = Validador.validador(correo, "Correo");
    }

    /**
     * Obtiene el número de teléfono de la persona.
     *
     * @return el número de teléfono.
     */
    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * Establece el número de teléfono de la persona tras validarlo con {@link Validador}.
     *
     * @param numeroTelefono el nuevo número de teléfono.
     */
    public void setNumeroTelefono(long numeroTelefono) {
        this.numeroTelefono = Validador.validador(numeroTelefono, "Teléfono");
    }

    /**
     * Construye una nueva instancia de {@code Persona} validando todos sus campos.
     *
     * @param nombreCompleto nombre completo de la persona.
     * @param rut            RUT de la persona.
     * @param edad           edad de la persona.
     * @param calle          calle de la dirección.
     * @param comuna         comuna de la dirección.
     * @param region         región de la dirección.
     * @param correo         correo electrónico de la persona.
     * @param numeroTelefono número de teléfono de la persona.
     */
    public Persona(String nombreCompleto, String rut, int edad, String calle, String comuna, String region,
                   String correo, long numeroTelefono) {
        this.nombreCompleto = Validador.validador(nombreCompleto, "Nombre");
        this.rut = Validador.validador(rut, "Rut");
        this.edad = Validador.validador(edad, "Edad");
        this.direccion = new model.Direccion(calle, comuna, region);
        this.correo = Validador.validador(correo, "Correo");
        this.numeroTelefono = Validador.validador(numeroTelefono, "Teléfono");
    }

    /**
     * Devuelve una representación en formato de columnas de los datos de la persona.
     *
     * @return cadena formateada con nombre, RUT, edad, dirección, correo y teléfono.
     */
    @Override
    public String toString() {
        String string = " %-28.28s | %10.10s | %4d | %-68.68s | %40.40s | %-18d |".formatted(
                nombreCompleto, rut, edad, direccion, correo, numeroTelefono);
        return string;
    }
}
