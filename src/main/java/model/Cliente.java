package model;

import util.Validador;

/**
 * Representa a un cliente que contrata servicios turísticos.
 * <p>
 * Extiende de {@link Persona} y añade la nacionalidad del cliente junto con
 * el tour contratado. Mantiene composición con {@link Direccion} mediante su superclase.
 * </p>
 */
public class Cliente extends model.Persona {

    // Atributos de clase
    private String nacionalidad;
    private String tourContratado;

    /**
     * Obtiene la nacionalidad del cliente.
     *
     * @return la nacionalidad del cliente.
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Establece la nacionalidad del cliente tras validarla con {@link Validador}.
     *
     * @param nacionalidad la nueva nacionalidad.
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = Validador.validador(nacionalidad, "Nacionalidad");
    }

    /**
     * Obtiene el tour contratado por el cliente.
     *
     * @return el nombre del tour contratado.
     */
    public String getTourContratado() {
        return tourContratado;
    }

    /**
     * Establece el tour contratado por el cliente tras validarlo con {@link Validador}.
     *
     * @param tourContratado el nuevo tour contratado.
     */
    public void setTourContratado(String tourContratado) {
        this.tourContratado = Validador.validador(tourContratado, "Tour Contratado");
    }

    /**
     * Construye una nueva instancia de {@code Cliente} validando todos sus atributos.
     *
     * @param nombreCompleto nombre completo del cliente.
     * @param rut            RUT o identificador del cliente.
     * @param edad           edad del cliente.
     * @param calle          calle de la dirección del cliente.
     * @param comuna         comuna de la dirección del cliente.
     * @param region         región de la dirección del cliente.
     * @param correo         correo electrónico del cliente.
     * @param numeroTelefono número de teléfono del cliente.
     * @param nacionalidad   nacionalidad del cliente.
     * @param tourContratado nombre del tour contratado por el cliente.
     */
    public Cliente(String nombreCompleto, String rut, int edad, String calle, String comuna, String region,
                   String correo, long numeroTelefono, String nacionalidad, String tourContratado) {
        // Validación de nombreCompleto
        super(nombreCompleto, rut, edad, calle, comuna, region, correo, numeroTelefono); // Hereda de la clase Persona
        this.nacionalidad = Validador.validador(nacionalidad, "Nacionalidad");
        this.tourContratado = Validador.validador(tourContratado, "Tour Contratado");
    }

    /**
     * Devuelve una representación en texto del cliente, incluyendo sus atributos
     * propios y los heredados de {@link Persona}.
     *
     * @return cadena descriptiva con los datos del cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nacionalidad='" + nacionalidad + '\'' +
                ", tourContratado='" + tourContratado + '\'' +
                "} " + super.toString();
    }
}