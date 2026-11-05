# Llanquihue Tour: Gestión de Personas

## Autor del proyecto
- **Nombre completo:** Frederico Toranzo
- **Sección:** N/a
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus Online

## Descripción
Sistema básico en Java para representar a las personas vinculadas a la agencia de turismo Llanquihue Tour. Aplica encapsulamiento, composición, herencia y organización en paquetes para evitar información duplicada y diferenciar roles.

## Estructura del proyecto
```
src/
├── app/
│   └── Main.java        # Ejecuta el sistema y muestra los objetos
└── model/
    ├── Persona.java     # Clase base; contiene una Direccion
    ├── Direccion.java   # Clase usada en la composición con Persona
    ├── Empleado.java    # Hereda de Persona
    └── Cliente.java     # Hereda de Persona
```
## Cómo compilar y ejecutar
1. Clona el repositorio:
   ```
   git clone https://github.com/CerealAndCookies/LlanquihueTourGestionPersonas.git
   ```
2. Abre el proyecto en IntelliJ IDEA.
3. Compílalo con **Build > Build Project**.
4. Abre `src/app/Main.java` y ejecútalo con **Run**.
5. Revisa los resultados en la consola.

**Repositorio:** https://github.com/CerealAndCookies/LlanquihueTourGestionPersonas