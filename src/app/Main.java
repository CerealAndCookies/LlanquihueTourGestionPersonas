package app;

import model.Cliente;
import model.Direccion;
import model.Empleado;
import model.Persona;
/**
 * Metodo principal que ejecuta el programa
 */
public class Main {
    static void main() {

        // Creamos una instancia de la clase Persona
        Persona persona1 = new Persona(
                "Andrea Arenas",
                "20.212.748-9",
                34,
                "Av. Francisco Bilbao 1383",
                "Iquique",
                "Tarapacá",
                "andrea.arenas92@gmail.com",
                56977801566L);
        System.out.println(persona1); // Imprimimos persona1 en la consola


        // Creamos una instancia de la clase Direccion
        Direccion direccion1 = new Direccion(
                "Portoalegre 498",
                "Quilicura",
                "Región Metropolitana");
        System.out.println(direccion1); // Imprimimos direccion1 en la consola


        // Creamos una instancia de la clase Empleado, que hereda de la clase Persona
        Empleado empleado1 = new Empleado(
                "Carolina Muñoz Vera",
                "16789432-5",
                34,
                "Av. Vicente Pérez Rosales 450",
                "Llanquihue",
                "Región de Los Lagos",
                "carolina.munoz@llanquihuetour.cl",
                56987654321L,
                "Guía turística",
                "31-12-2027",
                850000,
                "Llanquihue Tour"
        );
        System.out.println(empleado1); // Imprimimos empleado1 en la consola

        // Creamos una instancia de la clase Cliente, que hereda de la clase Persona
        Cliente cliente1 = new Cliente(
                "Martín Rojas Fuentes",
                "18234567-2",
                28,
                "Los Aromos 1280",
                "Puerto Montt",
                "Región de Los Lagos",
                "martin.rojas@correo.cl",
                56976543210L,
                "Chilena",
                "Paseo lacustre"
        );

        System.out.println(cliente1); // Imprimimos cliente1 en la consola

        // Creamos otra instancia de la clase Empleado, esta vez de otra empresa
        Empleado proveedor1 = new Empleado(
                "Rodrigo Paredes Oyarzún",
                "15432876-1",
                45,
                "Ruta 5 Sur Km 1015",
                "Puerto Varas",
                "Región de Los Lagos",
                "rodrigo.paredes@transporteslagosur.cl",
                56965432198L,
                "Proveedor de transporte",
                "30-06-2027",
                1200000,
                "Transportes Lago Sur"
        );

        System.out.println(proveedor1); // Imprimimos proveedor1 en la consola
    }
}
