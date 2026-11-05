package model;

public class Cliente extends Persona {
    private String nacionalidad;
    private String tourContratado;

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTourContratado() {
        return tourContratado;
    }

    public void setTourContratado(String tourContratado) {
        this.tourContratado = tourContratado;
    }

    public Cliente(String nombreCompleto, String rut, int edad, String calle, String comuna, String region,
                   String correo, long numeroTelefono, String nacionalidad, String tourContratado) {
        super(nombreCompleto, rut, edad, calle, comuna, region, correo, numeroTelefono);
        this.nacionalidad = nacionalidad;
        this.tourContratado = tourContratado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nacionalidad='" + nacionalidad + '\'' +
                ", tourContratado='" + tourContratado + '\'' +
                "} " + super.toString();
    }
}
