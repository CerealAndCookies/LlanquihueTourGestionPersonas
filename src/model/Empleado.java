package model;
/**
 * Representa a un empleado.
 * Tiene los atributos "cargo", "fechaTermino", "sueldo", y "empresa".
 * Hereda los atributos de Persona "nombreCompleto", "rut", "edad", "direccion", "correo", y "numeroTelefono".
 * Composición: atributos de Dirección "calle", "comuna", y "region".
 */
public class Empleado extends Persona {

    // Atributos de clase
    private String cargo;
    private String fechaTermino; // Fecha del término de contrato
    private double sueldo;
    private String empresa; // Empresa para la que trabaja

    // Getter y Setter del atributo "fechaTermino"
    public String getFechaTermino() {
        return fechaTermino;
    }
    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    // Getter y Setter del atributo "sueldo"
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Constructor de la clase "Empleado"
    public Empleado(String nombreCompleto, String rut, int edad, String calle, String comuna, String region,
                    String correo, long numeroTelefono, String cargo, String fechaTermino, double sueldo, String empresa) {
        super(nombreCompleto, rut, edad, calle, comuna, region, correo, numeroTelefono); // Hereda de la clase Persona
        this.cargo = cargo;
        this.fechaTermino = fechaTermino;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    // Override del metodo toString
    @Override
    public String toString() {
        return "Empleado{" +
                "cargo='" + cargo + '\'' +
                ", fechaTermino='" + fechaTermino + '\'' +
                ", sueldo=" + sueldo +
                ", empresa=" + empresa +
                "} " + super.toString();
    }
}
