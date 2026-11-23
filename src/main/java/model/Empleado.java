package model;

import util.Validador;

/**
 * Representa a un empleado o colaborador dentro del sistema.
 * <p>
 * Extiende de {@link Persona} e incorpora información laboral específica como
 * cargo, fecha de término de contrato, sueldo y empresa asociada. Mantiene
 * composición con {@link Direccion} a través de su superclase.
 * </p>
 */
public class Empleado extends model.Persona {

    // Atributos de clase
    private String cargo;
    private String fechaTermino; // Fecha del término de contrato
    private double sueldo;
    private String empresa; // Empresa para la que trabaja

    /**
     * Obtiene la fecha de término del contrato del empleado.
     *
     * @return la fecha de término de contrato.
     */
    public String getFechaTermino() {
        return fechaTermino;
    }

    /**
     * Establece la fecha de término del contrato tras validarla con {@link Validador}.
     *
     * @param fechaTermino la nueva fecha de término de contrato.
     */
    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = Validador.validador(fechaTermino, "Fecha de término");
    }

    /**
     * Obtiene el sueldo del empleado.
     *
     * @return el sueldo asignado.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Establece el sueldo del empleado tras validarlo con {@link Validador}.
     *
     * @param sueldo el nuevo sueldo del empleado.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = Validador.validador(sueldo, "Sueldo");
    }

    /**
     * Obtiene el cargo del empleado.
     *
     * @return el cargo desempeñado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo del empleado.
     *
     * @param cargo el nuevo cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = Validador.validador(cargo, "Cargo");
    }

    /**
     * Obtiene el nombre de la empresa para la que trabaja el empleado.
     *
     * @return el nombre de la empresa.
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Establece el nombre de la empresa para la que trabaja el empleado.
     *
     * @param empresa el nuevo nombre de la empresa.
     */
    public void setEmpresa(String empresa) {
        this.empresa = Validador.validador(empresa, "Empresa");
    }

    /**
     * Construye una nueva instancia de {@code Empleado} validando todos sus atributos.
     *
     * @param nombreCompleto nombre completo del empleado.
     * @param rut            RUT del empleado.
     * @param edad           edad del empleado.
     * @param calle          calle de la dirección del empleado.
     * @param comuna         comuna de la dirección del empleado.
     * @param region         región de la dirección del empleado.
     * @param correo         correo electrónico del empleado.
     * @param numeroTelefono número de teléfono del empleado.
     * @param cargo          cargo que desempeña el empleado.
     * @param fechaTermino   fecha de término de contrato.
     * @param sueldo         sueldo del empleado.
     * @param empresa        empresa a la que pertenece el empleado.
     */
    public Empleado(String nombreCompleto, String rut, int edad, String calle, String comuna, String region,
                    String correo, long numeroTelefono, String cargo, String fechaTermino, double sueldo, String empresa) {
        super(nombreCompleto, rut, edad, calle, comuna, region, correo, numeroTelefono); // Hereda de la clase Persona
        this.cargo = Validador.validador(cargo, "Cargo");
        this.fechaTermino = Validador.validador(fechaTermino, "Fecha de término");
        this.sueldo = Validador.validador(sueldo, "Sueldo");
        this.empresa = Validador.validador(empresa, "Empresa");
    }

    /**
     * Devuelve una representación en formato de fila de tabla del empleado,
     * combinando sus datos laborales con los datos heredados de {@link Persona}.
     *
     * @return cadena formateada con los atributos del empleado y de la persona.
     */
    @Override
    public String toString() {
        String string = "%-35.35s | %-13.13s | %7.0f | %-30.30s |".formatted(cargo, fechaTermino, sueldo, empresa) + super.toString();
        return string;
    }
}
