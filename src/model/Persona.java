package model;
/**
 * Representa a una persona.
 * Tiene los atributos "nombreCompleto", "rut", "edad", "direccion", "correo", y "numeroTelefono".
 * Composición: atributos de Dirección "calle", "comuna", y "region".
 */
public class Persona {

    private String nombreCompleto; // Nombre completo de la persona
    private String rut; // Rut de la persona
    private int edad; // Edad de la persona
    private Direccion direccion; // Direccion de la persona
    private String correo;// Correo de la persona
    private long numeroTelefono;// Número de teléfono de la persona

    // Getter y Setter del atributo "nombreCompleto"
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    // Getter y Setter del atributo "rut"
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }

    // Getter y Setter del atributo "edad"
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter y Setter del atributo "direccion"
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    // Getter y Setter del atributo "correo"
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Getter y Setter del atributo "numeroTelefono"
    public long getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    // Constructor de la clase Persona
    public Persona(String nombreCompleto, String rut, int edad, String calle, String comuna, String region,
                   String correo, long numeroTelefono) {
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
        this.edad = edad;
        this.direccion = new Direccion(calle, comuna, region);
        this.correo = correo;
        this.numeroTelefono = numeroTelefono;
    }

    // Override del metodo toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", rut='" + rut + '\'' +
                ", edad=" + edad +
                ", direccion=" + direccion +
                ", correo='" + correo + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                '}';
    }
}
