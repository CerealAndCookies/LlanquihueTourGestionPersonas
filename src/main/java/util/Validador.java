package util;

/**
 * Clase utilitaria encargada de validar atributos de texto y numéricos antes de asignarlos.
 * <p>
 * Proporciona métodos estáticos sobrecargados que verifican que los valores no sean nulos,
 * vacíos, cero o negativos. En caso de invalidez, muestra un mensaje de error en consola y
 * devuelve un valor por defecto seguro.
 * </p>
 */
public class Validador {

    /**
     * Constructor privado para evitar la instanciación de esta clase utilitaria.
     */
    private Validador() {
    }

    /**
     * Valida que una cadena de texto no sea {@code null} ni esté vacía o compuesta solo por espacios.
     *
     * @param variableString                 valor de texto a validar.
     * @param nombreVariablePrimeraMayuscula nombre descriptivo del campo con la primera letra en mayúscula,
     *                                       utilizado para construir mensajes de error y el valor por defecto.
     * @return el texto sin espacios iniciales ni finales si es válido; de lo contrario,
     *         {@code "Sin <nombreVariable>"} en minúsculas.
     */
    public static String validador(String variableString, String nombreVariablePrimeraMayuscula) {
        // Validación de texto
        try {
            if (variableString == null || variableString.trim().isEmpty()) {
                throw new IllegalArgumentException(
                        "%s no puede estar vacío.".formatted(nombreVariablePrimeraMayuscula)
                );
            }
            return variableString.trim();

        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Error al asignar %s: ".formatted(nombreVariablePrimeraMayuscula.toLowerCase()) + e.getMessage()
            );
            // Valor por defecto para evitar null
            return "Sin %s".formatted(nombreVariablePrimeraMayuscula.toLowerCase());
        }
    }

    /**
     * Valida que un número entero ({@code int}) sea estrictamente mayor que cero.
     *
     * @param variableInt                    valor entero a validar.
     * @param nombreVariablePrimeraMayuscula nombre descriptivo del campo con la primera letra en mayúscula,
     *                                       utilizado en los mensajes de error.
     * @return el valor entero original si es mayor que cero; de lo contrario, {@code 1}.
     */
    public static int validador(int variableInt, String nombreVariablePrimeraMayuscula) {
        // Validación de int
        try {
            if (variableInt == 0) {
                throw new IllegalArgumentException(
                        "%s no puede estar vacío.".formatted(nombreVariablePrimeraMayuscula)
                );
            } else if (variableInt < 0) {
                throw new IllegalArgumentException(
                        "%s no puede ser menor a 0.".formatted(nombreVariablePrimeraMayuscula)
                );
            }
            return variableInt;
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Error al asignar %s: ".formatted(nombreVariablePrimeraMayuscula.toLowerCase()) + e.getMessage()
            );
            // Valor por defecto para evitar valores inválidos
            return 1;
        }
    }

    /**
     * Valida que un número entero largo ({@code long}) sea estrictamente mayor que cero.
     *
     * @param variableLong                   valor {@code long} a validar.
     * @param nombreVariablePrimeraMayuscula nombre descriptivo del campo con la primera letra en mayúscula,
     *                                       utilizado en los mensajes de error.
     * @return el valor {@code long} original si es mayor que cero; de lo contrario, {@code 1L}.
     */
    public static long validador(long variableLong, String nombreVariablePrimeraMayuscula) {
        // Validación de long
        try {
            if (variableLong == 0) {
                throw new IllegalArgumentException(
                        "%s no puede estar vacío.".formatted(nombreVariablePrimeraMayuscula)
                );
            } else if (variableLong < 0) {
                throw new IllegalArgumentException(
                        "%s no puede ser menor a 0.".formatted(nombreVariablePrimeraMayuscula)
                );
            }
            return variableLong;
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Error al asignar %s: ".formatted(nombreVariablePrimeraMayuscula.toLowerCase()) + e.getMessage()
            );
            // Valor por defecto para evitar valores inválidos
            return 1L;
        }
    }

    /**
     * Valida que un número decimal ({@code double}) sea estrictamente mayor que cero.
     *
     * @param variableDouble                 valor {@code double} a validar.
     * @param nombreVariablePrimeraMayuscula nombre descriptivo del campo con la primera letra en mayúscula,
     *                                       utilizado en los mensajes de error.
     * @return el valor {@code double} original si es mayor que cero; de lo contrario, {@code 1d}.
     */
    public static double validador(double variableDouble, String nombreVariablePrimeraMayuscula) {
        // Validación de double
        try {
            if (variableDouble == 0) {
                throw new IllegalArgumentException(
                        "%s no puede estar vacío.".formatted(nombreVariablePrimeraMayuscula)
                );
            } else if (variableDouble < 0) {
                throw new IllegalArgumentException(
                        "%s no puede ser menor a 0.".formatted(nombreVariablePrimeraMayuscula)
                );
            }
            return variableDouble;
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Error al asignar %s: ".formatted(nombreVariablePrimeraMayuscula.toLowerCase()) + e.getMessage()
            );
            // Valor por defecto para evitar valores inválidos
            return 1d;
        }
    }
}
