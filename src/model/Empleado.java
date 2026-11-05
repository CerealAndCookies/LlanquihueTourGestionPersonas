package model;

public class Empleado extends Persona {
    private String cargo;
    private String fechaTermino;
    private double sueldo;
    //TODO agregar empresa
    public String getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String nombreCompleto, String rut, int edad, String calle, String comuna, String region,
                    String correo, long numeroTelefono, String cargo, String fechaTermino, double sueldo) {
        super(nombreCompleto, rut, edad, calle, comuna, region, correo, numeroTelefono);
        this.cargo = cargo;
        this.fechaTermino = fechaTermino;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cargo='" + cargo + '\'' +
                ", fechaTermino='" + fechaTermino + '\'' +
                ", sueldo=" + sueldo +
                "} " + super.toString();
    }
}
