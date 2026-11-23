# Llanquihue Tour: Gestión de Personas

## Autor del proyecto
- **Nombre completo:** Frederico Toranzo
- **Sección:** N/a
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus Online

## Descripción
Sistema básico en Java para representar a las personas vinculadas a la agencia de turismo Llanquihue Tour. Aplica
encapsulamiento, composición, herencia y organización en paquetes para evitar información duplicada y diferenciar roles.

Contiene características como mostrar en una tabla a todos los datos de los empleados y colaboradores, o también puede filtrarlos
por empresa.

Utiliza composición, encapsulamiento, herencia, overriding, validación y manejo de colecciones en archivos .txt.

## Estructura del proyecto
```
LlanquihueTourGestionPersonas/
├── src/
│   └── main/
│       ├── java/
│       │   ├── app/
│       │   │   └── Main.java                         # Punto de entrada; carga, lista y filtra empleados
│       │   ├── model/
│       │   │   ├── Persona.java                      # Clase base; contiene una Direccion (composición)
│       │   │   ├── Direccion.java                    # Representa calle, comuna y región
│       │   │   ├── Empleado.java                     # Hereda de Persona; añade datos laborales
│       │   │   └── Cliente.java                      # Hereda de Persona; añade nacionalidad y tour
│       │   ├── service/
│       │   │   └── GestorEmpleados.java              # Carga datos desde .txt, lista y filtra por empresa
│       │   └── util/
│       │       └── Validador.java                    # Validación centralizada de atributos
│       └── resources/
│           ├── clientes.txt                          # Archivo de recursos de clientes
│           ├── direcciones.txt                       # Archivo de recursos de direcciones
│           └── empleados_y_colaboradores.txt         # Datos cargados por GestorEmpleados
├── pom.xml                                           # Configuración del proyecto Maven
└── README.md                                         # Documentación del proyecto

```
## Cómo compilar y ejecutar
1. Clona el repositorio:
   ```
   git clone https://github.com/CerealAndCookies/LlanquihueTourGestionPersonas.git
   ```
2. Abre el proyecto en IntelliJ IDEA.
3. Compílalo con **Build > Build Project**.
4. Abre `src/main/java/app/Main.java` y ejecútalo con **Run**.
5. Revisa los resultados en la consola.

**Repositorio:** https://github.com/CerealAndCookies/LlanquihueTourGestionPersonas