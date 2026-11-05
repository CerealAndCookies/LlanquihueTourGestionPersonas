package model;
/**
 * Representa una direccion.
 * Tiene los atributos "calle", "comuna", y "region".
 */
public class Direccion {

    // Atributos de clase
    private String calle;
    private String comuna;
    private String region;

    // Getter y Setter del atributo "calle"
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }

    // Getter y Setter del atributo "comuna"
    public String getComuna() {
        return comuna;
    }
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    // Getter y Setter del atributo "region"
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    // Constructor de la clase "Direccion"
    public Direccion(String calle, String comuna, String region) {
        this.calle = calle;
        this.comuna = comuna;
        this.region = region;
    }

    // Override del metodo toString
    @Override
    public String toString() {
        return '\'' +calle + ", " + comuna + ", " + region + '\'';
    }
}
