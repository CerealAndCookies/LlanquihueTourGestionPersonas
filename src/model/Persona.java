package model;

public class Persona {
    private String nombreCompleto;
    private String rut;
    private int edad;
    private Direccion direccion;
    private String correo;
    private long numeroTelefono;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Persona(String nombreCompleto, String rut, int edad, String calle, String comuna, String region,
                   String correo, long numeroTelefono) {
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
        this.edad = edad;
        this.direccion = new Direccion(calle, comuna, region);
        this.correo = correo;
        this.numeroTelefono = numeroTelefono;
    }

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
