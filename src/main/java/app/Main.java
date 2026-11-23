package app;

import model.Empleado;
import service.GestorEmpleados;

import java.util.List;

/**
 * Clase principal del programa.
 * <p>
 * Carga los datos de empleados y colaboradores en una tabla formateada y luego
 * los filtra según la empresa definida en {@code filtroEmpresa} ("Llanquihue Tour").
 * </p>
 */
public class Main {

    /**
     * Punto de entrada de la aplicación.
     * <p>
     * Instancia {@link GestorEmpleados} para cargar los registros desde
     * {@code empleados_y_colaboradores.txt}, imprime el listado completo y
     * posteriormente muestra los registros filtrados por la empresa especificada.
     * </p>
     */
    static void main() {
        //Carga
        GestorEmpleados listaEmpleados = new GestorEmpleados();
        GestorEmpleados.mostrarTitulo("Lista de empleados y colaboradores");
        listaEmpleados.listarTodos();
        String filtroEmpresa = "Llanquihue Tour";
        GestorEmpleados.mostrarTitulo("""
                Filtrado por empresa "%s" """.formatted(filtroEmpresa));
        GestorEmpleados.mostrarTituloTabla();
        List<Empleado> listaFiltrada = listaEmpleados.buscarPorEmpresa(filtroEmpresa);
        for (Empleado i : listaFiltrada) {
            System.out.println(i);
        }
    }
}