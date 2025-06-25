# Sistema de Gestión de Restaurante - Patrones de Diseño

## Descripción del Sistema

Este sistema simula la gestión de un restaurante, aplicando varios patrones de diseño para organizar y optimizar las funcionalidades.

## Objetivos Principales

- Gestión de Reservas: Se utiliza un patrón Singleton para garantizar que solo exista una instancia del gestor de reservas.

- Personalización de Platos: Se utiliza el patrón Decorator para permitir que los platos sean personalizados dinámicamente con ingredientes adicionales como queso, salsa, etc.

- Aplicación de Descuentos: Se utiliza el patrón Strategy para aplicar diferentes tipos de descuentos, como descuento para estudiantes o para la tercera edad.

- Monitoreo de Estados: El patrón Observer se emplea para permitir la notificación de cambios en el sistema a diferentes componentes del restaurante (por ejemplo, actualizaciones en la 
 disponibilidad de mesas).

## Patrones de Diseño Utilizados
### Patrón Singleton:

Dónde: En la clase RestauranteManager.

Por qué: Garantiza que solo exista una instancia del gestor del restaurante, lo que facilita el manejo de reservas y otras operaciones.

Cómo: Se asegura que el constructor de RestauranteManager sea privado y se provea una única instancia a través del método getInstancia().

### Patrón Decorator:

Dónde: En las clases DecoradorPlato, PlatoBase, ConQueso, ConSalsa, etc.

Por qué: Permite agregar funcionalidades adicionales a los objetos Plato sin modificar su estructura interna, lo que facilita la extensión del sistema para nuevos ingredientes o personalizaciones.

Cómo: Se crea una clase base abstracta DecoradorPlato, que envuelve objetos Plato y agrega nuevas funcionalidades como la descripción o el precio de los platos.

### Patrón Strategy:

Dónde: En las clases relacionadas con los descuentos, como DescuentoEstudiante, DescuentoTerceraEdad, etc.

Por qué: Permite cambiar los algoritmos de descuento (por ejemplo, descuento para estudiantes o para la tercera edad) sin modificar las clases que los usan.

Cómo: Las diferentes estrategias de descuento implementan una interfaz común que se puede intercambiar dinámicamente en tiempo de ejecución.

### Patrón Observer:

Dónde: En la clase Observable y Observer.

Por qué: Permite que el sistema mantenga a varios componentes del restaurante (como meseros, cocina, etc.) actualizados cuando cambian ciertos estados, como la disponibilidad de mesas o cambios en el menú.

Cómo: Los objetos observadores se suscriben a los eventos generados por el objeto observable, recibiendo actualizaciones cuando hay cambios.

## Justificación de los Patrones

- Singleton: Es necesario para que el sistema de reservas del restaurante sea único y centralizado, evitando inconsistencias en las reservas de mesas.

- Decorator: Permite extender la funcionalidad de los platos sin necesidad de modificar su clase original, facilitando la adición de nuevas opciones como ingredientes adicionales.

- Strategy: Es una forma flexible y extensible de aplicar diferentes tipos de descuentos según el contexto (por ejemplo, descuentos para estudiantes o para personas de la tercera edad).

- Observer: Permite una comunicación eficiente y desacoplada entre diferentes partes del sistema, lo que facilita el mantenimiento y la ampliación del sistema.

## Instrucciones de Compilación y Ejecución

### Requisitos

- JDK 11 o superior.

- Apache Ant para la compilación (opcional).

### Compilación

Descargue o clone el repositorio.

Si tiene Apache Ant instalado, puede compilar el proyecto utilizando el siguiente comando en la raíz del proyecto:

```
git clone github.com/Pancho8000/eva3patronesdediseno,git
cd ./eva3patronesdediseno
ant build
```
Si no tiene Ant, puede compilar manualmente los archivos .java utilizando javac:

```
git clone github.com/Pancho8000/eva3patronesdediseno,git
cd ./eva3patronesdediseno
javac -d bin src/**/*.java
```
Ejecución
Navegue al directorio bin (o donde se haya generado la compilación).

Ejecute el programa con el siguiente comando:

```
java patronesdediseño.jar
```
Esto iniciará el sistema de gestión de restaurante, demostrando la aplicación de los patrones de diseño mencionados.
