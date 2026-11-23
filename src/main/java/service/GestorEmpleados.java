package service;

import model.Empleado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio encargado de gestionar la colección de empleados y colaboradores.
 * <p>
 * Carga automáticamente los registros desde {@code src/main/resources/empleados_y_colaboradores.txt}
 * y provee operaciones para agregar elementos, mostrarlos en formato tabular y
 * filtrarlos por empresa.
 * </p>
 */
public class GestorEmpleados {

    // ----- Atributo -----

    // Lista de empleados y colaboradores sin filtrar
    private List<Empleado> listaEmpleadosColaboradores = cargarDatos();

    // ----- Métodos -----

    /**
     * Agrega un nuevo empleado a la lista interna de empleados y colaboradores.
     *
     * @param empleado el objeto {@link Empleado} que se desea agregar.
     */
    public void agregar(Empleado empleado) {
        listaEmpleadosColaboradores.add(empleado);
    }

    /**
     * Imprime en consola un encabezado de sección enmarcado con barras de asteriscos.
     *
     * @param titulo texto del título que se mostrará.
     */
    public static void mostrarTitulo(String titulo) {
        System.out.println("*".repeat(282));
        System.out.println(titulo);
        System.out.println("*".repeat(282));
    }

    /**
     * Imprime en consola la fila de encabezados de columnas para la tabla de empleados,
     * seguida de una línea separadora horizontal.
     */
    public static void mostrarTituloTabla() {
        // Hacemos un String con formato de los títulos
        String string = "%-35.35s | %-13.13s | %-7.7s | %-30.30s | %-28.28s | %-10.10s | %-2s | %-68.68s | %-40.40s | %-10s |".formatted(
                "Cargo", "Fecha Término", "Sueldo", "Empresa", "Nombre Completo", "RUT", "Edad", "Dirección", "Correo Electrónico", "Número de Teléfono"
        );
        System.out.println(string); // Imprimimos el String en la consola
        System.out.println("-".repeat(282)); // Imprimimos el límite inferior en la consola
    }

    /**
     * Imprime en consola la tabla completa con todos los empleados y colaboradores cargados,
     * incluyendo los encabezados de columna.
     */
    public void listarTodos() {
        mostrarTituloTabla();
        for (Empleado empleado : listaEmpleadosColaboradores) {
            System.out.println(empleado);
        }
    }

    /**
     * Filtra la lista de empleados y colaboradores por el nombre de la empresa,
     * sin distinguir entre mayúsculas y minúsculas.
     *
     * @param empresa nombre de la empresa por la cual se desea filtrar.
     * @return una lista con los objetos {@link Empleado} que pertenecen a la empresa indicada,
     *         o una lista vacía si {@code empresa} es {@code null} o está en blanco.
     */
    public List<Empleado> buscarPorEmpresa(String empresa) {
        List<Empleado> resultado = new ArrayList<>();
        if (empresa == null || empresa.isBlank()) {
            return resultado;
        }

        String buscarEmpresa = empresa.trim();
        for (Empleado empleado : listaEmpleadosColaboradores) {
            if (buscarEmpresa.equalsIgnoreCase(empleado.getEmpresa())) {
                resultado.add(empleado);
            }
        }
        return resultado;
    }

    /**
     * Lee el archivo de texto {@code src/main/resources/empleados_y_colaboradores.txt},
     * interpreta cada línea separada por punto y coma ({@code ;}) y construye una lista
     * de instancias de {@link Empleado}.
     * <p>
     * Si ocurre un {@link IOException} al acceder o leer el archivo, el error se informa
     * por consola y se retorna la lista con los registros alcanzados hasta ese momento.
     * </p>
     *
     * @return un {@link ArrayList} con los empleados cargados desde el archivo.
     */
    public static ArrayList<Empleado> cargarDatos() {
        // Lista donde se guardan los empleados
        ArrayList<Empleado> datos = new ArrayList<>();

        // try-with-resources: cierra el archivo automáticamente al terminar
        try (BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/empleados_y_colaboradores.txt"))) {
            String linea;

            // Lee línea por línea hasta llegar al final del archivo (null)
            while ((linea = lector.readLine()) != null) {
                // Separa la línea en columnas usando ";" como separador
                String[] fila = linea.split(";");
                // Asigna cada columna a su variable
                String nombreEmpleado = fila[0];
                String rut = fila[1];
                int edad = Integer.parseInt(fila[2]);
                String calle = fila[3];
                String comuna = fila[4];
                String region = fila[5];
                String correo = fila[6];
                long numeroTelefono = Long.parseLong(fila[7]);
                String cargo = fila[8];
                String fechaTermino = fila[9];
                double sueldo = Double.parseDouble(fila[10]);
                String empresa = fila[11];
                // Crea el empleado con los datos de la línea
                Empleado empleado = new Empleado(
                        nombreEmpleado,
                        rut,
                        edad,
                        calle,
                        comuna,
                        region,
                        correo,
                        numeroTelefono,
                        cargo,
                        fechaTermino,
                        sueldo,
                        empresa
                );

                // Agrega el empleado a la lista
                datos.add(empleado);
            }
        } catch (IOException e) {
            // Se ejecuta si el archivo no existe o no se puede leer
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return datos;
    }

    /**
     * Constructor por defecto de {@code GestorEmpleados}.
     * Inicializa la lista de empleados cargando los datos desde el archivo de recursos.
     */
    public GestorEmpleados() {
    }
}
