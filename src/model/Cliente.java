package model;
/**
 * Representa a un cliente.
 * Tiene los atributos "nacionalidad", y "tourContratado".
 * Hereda los atributos de Persona "nombreCompleto", "rut", "edad", "direccion", "correo", y "numeroTelefono".
 * Composición: atributos de Dirección "calle", "comuna", y "region".
 */
public class Cliente extends Persona {

    // Atributos de clase
    private String nacionalidad;
    private String tourContratado;

    // Getter y Setter del atributo "nacionalidad"
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Getter y Setter del atributo "tourContratado"
    public String getTourContratado() {
        return tourContratado;
    }
    public void setTourContratado(String tourContratado) {
        this.tourContratado = tourContratado;
    }

    // Constructor de la clase "Cliente"
    public Cliente(String nombreCompleto, String rut, int edad, String calle, String comuna, String region,
                   String correo, long numeroTelefono, String nacionalidad, String tourContratado) {
        super(nombreCompleto, rut, edad, calle, comuna, region, correo, numeroTelefono); // Hereda de la clase Persona
        this.nacionalidad = nacionalidad;
        this.tourContratado = tourContratado;
    }

    // Override del metodo toString
    @Override
    public String toString() {
        return "Cliente{" +
                "nacionalidad='" + nacionalidad + '\'' +
                ", tourContratado='" + tourContratado + '\'' +
                "} " + super.toString();
    }
}
