package model;

import util.Validador;

/**
 * Representa una dirección postal compuesta por calle, comuna y región.
 * <p>
 * Todos sus atributos son validados mediante la clase utilitaria {@link Validador}.
 * </p>
 */
public class Direccion {

    // Atributos de clase
    private String calle;
    private String comuna;
    private String region;

    /**
     * Obtiene la calle de la dirección.
     *
     * @return el nombre y número de la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece la calle de la dirección tras validarla con {@link Validador}.
     *
     * @param calle la nueva calle.
     */
    public void setCalle(String calle) {
        this.calle = Validador.validador(calle, "Calle");
    }

    /**
     * Obtiene la comuna de la dirección.
     *
     * @return el nombre de la comuna.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Establece la comuna de la dirección tras validarla con {@link Validador}.
     *
     * @param comuna la nueva comuna.
     */
    public void setComuna(String comuna) {
        this.comuna = Validador.validador(comuna, "Comuna");
    }

    /**
     * Obtiene la región de la dirección.
     *
     * @return el nombre de la región.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Establece la región de la dirección tras validarla con {@link Validador}.
     *
     * @param region la nueva región.
     */
    public void setRegion(String region) {
        this.region = Validador.validador(region, "Región");
    }

    /**
     * Construye una nueva instancia de {@code Direccion} validando sus campos.
     *
     * @param calle  calle de la dirección.
     * @param comuna comuna de la dirección.
     * @param region región de la dirección.
     */
    public Direccion(String calle, String comuna, String region) {
        this.calle = Validador.validador(calle, "Calle");
        this.comuna = Validador.validador(comuna, "Comuna");
        this.region = Validador.validador(region, "Región");
    }

    /**
     * Devuelve la dirección formateada en una sola línea separada por comas.
     *
     * @return cadena con el formato {@code "calle, comuna, region"}.
     */
    @Override
    public String toString() {
        return calle + ", " + comuna + ", " + region;
    }
}
