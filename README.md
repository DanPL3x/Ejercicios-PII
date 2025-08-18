# Ejercicios de programación II

Este repositorio contiene los ejercicios de programación y las preguntas del taller en Java de nivelación.

## Contenido

- Calculadora Básica 
- Contador de Vocales y Consonantes 
- Invertir una Cadena

## 🚀 Propósito del proyecto
Practicar programación básica en Java utilizando condicionales, bucles y manipulación de cadenas.

## 📋 Requisitos
- Java JDK 17 o superior.
- Git (opcional, para clonar el repositorio).

## Autor: Daniel Campo Chaguendo

## Repuestas del taller

### GIT

1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

R//Un repositorio en Git es un espacio donde se almacena un proyecto con todos sus archivos, código y el historial de cambios o versiones de esos archivos. Es la unidad básica de almacenamiento en Git, un sistema de control de versiones distribuido que permite a los desarrolladores gestionar y colaborar en el desarrollo de software de manera eficiente. En un repositorio, los desarrolladores pueden guardar distintas versiones del código, trabajar en paralelo en diferentes ramas sin afectar la versión principal y fusionar cambios cuando estén listos. Además, los repositorios pueden ser locales en la máquina de cada desarrollador o remotos, alojados en plataformas en la nube como GitHub, lo que facilita la colaboración a distancia.

La diferencia principal entre un repositorio en Git y un proyecto “normal” (es decir, un proyecto sin control de versiones) radica en la capacidad de control y administración del código y de los cambios realizados. Un proyecto normal puede ser simplemente una carpeta con archivos donde se guarda el código, pero sin un historial de versiones ni herramientas para coordinar el trabajo en equipo. En cambio, un repositorio de Git guarda cada cambio realizado, quién lo hizo y cuándo, permitiendo revertir versiones anteriores, trabajar de manera simultánea sin conflictos y colaborar eficazmente con otros desarrolladores.

2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?

•
R//Working Directory (Directorio de trabajo): Es el espacio donde tienes los archivos de tu proyecto tal como los estás modificando actualmente. Aquí puedes crear, editar y eliminar archivos. Los cambios en esta área aún no están versionados ni preparados para ser confirmados (commits). Es como tu "área de trabajo" o "borrador" donde haces tus cambios antes de decirle a Git qué guardar.
•
Staging Area o Index (Área de preparación o índice): Esta área actúa como un espacio intermedio donde preparas los cambios que quieres incluir en tu próximo commit. Aquí seleccionas y organizas específicamente qué modificaciones serán parte del siguiente snapshot
(instantánea) del proyecto. Esto te permite consolidar varios cambios lógicos antes de confirmarlos y mantener un historial de commits limpio y organizado.
•
Repository (Repositorio): Es el almacenamiento permanente donde Git guarda los commits realizados, es decir, las instantáneas confirmadas de tu proyecto con su historial. El repositorio almacena toda la metadata y versiones anteriores, permitiendo que puedas revertir cambios, comparar versiones, y colaborar con otros mediante ramas y fusiones.
3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).

•
R// Blob (Binary Large Object): Un objeto blob almacena el contenido de un archivo, sin ninguna metadata adicional como el nombre o permisos. Cada archivo en un commit tiene su contenido guardado en un blob. Los blobs son identificados por un hash SHA-1 único basado en el contenido, lo que significa que archivos idénticos comparten el mismo blob, optimizando el almacenamiento.
•
Tree: Un objeto tree representa la estructura de directorios de un proyecto en un punto en el tiempo. Contiene referencias a blobs (archivos) y a otros objetos tree (subdirectorios), junto con nombres de archivo, permisos y tipos de objeto (blob o tree). Así, un tree es como una instantánea de una carpeta, permitiendo que Git guarde no solo archivos individuales, sino la jerarquía completa del proyecto.
•
Commit: Un objeto commit apunta a un objeto tree que representa el estado completo del proyecto en el momento del commit. Además, contiene metadata importante como el autor, el committer, la fecha, el mensaje del commit y referencias a commits padres (previos), estableciendo la historia y la relación entre commits. Un commit representa una captura completa del proyecto en un punto en el tiempo.
•
Tag: Un objeto tag es una referencia anotada y permanente a otro objeto (generalmente un commit). Contiene un nombre de tag, información del creador, un mensaje opcional y puede incluir una firma criptográfica. Los tags suelen usarse para marcar versiones específicas o hitos importantes en la historia del proyecto.
4. ¿Cómo se crea un commit y qué información almacena un objeto commit?

R// Se crea después de guardar todos los cambios.
git add archivo.txt
git commit -m "Mensaje descriptivo del cambio"
Un commit en Git almacena una serie de datos importantes:
•
Una referencia al objeto tree que representa la estructura del proyecto en ese momento (archivos y carpetas).
•
Referencias a los commits padres inmediatos (el historial previo).
•
Metadata del commit, como el autor, la fecha y el committer.
•
El mensaje descriptivo del commit, que explica los cambios realizados.
5. ¿Cuál es la diferencia entre git pull y git fetch?

R// La diferencia es que git fetch lo utilizas cuando quieras ver y controlar qué cambios integrar, y git pull cuando necesites actualizar tu rama local de forma rápida y estés seguro de que no habrá conflictos o que puedes resolverlos de inmediato.

6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?

R// Un branch (rama) en Git es un puntero móvil que apunta a un commit específico dentro del historial de commits. Representa una línea independiente de desarrollo donde puedes crear nuevos commits sin afectar la rama principal ni otras ramas. Esto permite trabajar en funcionalidades nuevas, correcciones o experimentos de manera aislada y segura. Cuando haces nuevos commits en una rama, el puntero de esa rama avanza automáticamente hacia el último commit creado, reflejando el progreso de esa línea de desarrollo.
Git gestiona las ramas mediante estos punteros a commits. Cada rama simplemente referencia el commit más reciente en esa línea de desarrollo (el último commit o "HEAD" de esa rama). Cuando creas un commit nuevo en una rama, Git crea un nuevo objeto commit que apunta al commit anterior, y luego mueve el puntero de esa rama al nuevo commit. Esto forma una estructura de
cadenas enlazadas (cada commit referencia uno o más commits padres) que modela el historial del proyecto.
7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

R// Para realizar un merge en Git, primero debes posicionarte en la rama receptora donde quieres integrar los cambios usando
git checkout nombre-rama-receptora
Luego ejecutas el comando de fusión indicando la rama que quieres fusionar:
git merge nombre-rama-para-fusionar
Git detecta un ancestro común entre ambas ramas y crea una nueva confirmación de fusión que combina los cambios de las dos ramas. Si los cambios no se superponen, la fusión se hace automáticamente y se crea un commit de merge.
Conflictos que pueden surgir:
•
Los conflictos ocurren cuando se han modificado las mismas líneas de un archivo en ambas ramas y Git no puede determinar automáticamente cuál versión conservar.
•
También pueden surgir conflictos si un archivo ha sido eliminado en una rama pero modificado en la otra.
•
Estos conflictos detienen el merge automático y requieren resolución manual.
Resolución de conflictos:
•
Git marca los archivos conflictivos y dentro de ellos señala las partes en conflicto usando indicadores como <<<<<<<, ======= y >>>>>>>.
•
Debes abrir cada archivo en conflicto y decidir manualmente qué contenido mantener o combinar.
•
Después de resolver los conflictos, añades los archivos con git add para marcar que están resueltos.
•
Finalmente, terminas el merge haciendo un commit (usualmente Git crea el commit de merge cuando todos los conflictos se resuelven).

8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

R// El área de staging en Git es una zona intermedia donde se colocan los cambios que deseas incluir en el próximo commit. El comando git add mueve explícitamente los archivos o cambios seleccionados desde el directorio de trabajo (working directory) a esta área de preparación (staging area). Esto te permite seleccionar de forma precisa qué modificaciones quieres que formen parte de la siguiente instantánea guardada (commit), facilitando un control granular y organizado de los cambios.
Si omites el paso de usar git add para incluir tus cambios en el área de staging, cuando ejecutes git commit esos cambios no serán incluidos en el commit y por lo tanto no formarán parte del historial del repositorio. Solo se confirmarán los cambios que previamente agregaste al staging con git add. Esto es útil para dividir el trabajo en cambios lógicos y evitar confirmar accidentalmente modificaciones incompletas o no deseadas.

9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

R// El archivo .gitignore es un archivo de texto especial que le indica a Git qué archivos o carpetas debe ignorar y no incluir en el seguimiento ni en los commits del repositorio. En otras palabras, los archivos o directorios listados en .gitignore no serán monitoreados por Git, por lo que no aparecerán como cambios pendientes para agregar o confirmar.
Este archivo se suele colocar en la raíz del proyecto y cada línea contiene un patrón que puede corresponder a un nombre de archivo, extensión, carpeta o ruta relativa que Git debe omitir. Por ejemplo, puede usarse para ignorar archivos temporales, de configuración local, de dependencias (como la carpeta node_modules) o archivos generados automáticamente que no deben compartirse en el repositorio.
En cuanto a su influencia en el seguimiento de archivos, los archivos que coinciden con las reglas en .gitignore:
•
No se mostrarán como archivos sin seguimiento.
•
No serán añadidos al área de staging con git add de forma automática.
•
No se incluirán en los commits futuros mientras sigan listados ahí.
Si un archivo ya fue agregado y confirmado en el repositorio, agregarlo a .gitignore no lo elimina del seguimiento, para eso habría que quitarlo del índice con comandos específicos (git rm --cached nombre-archivo).

10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?

R//
•
git commit --amend modifica el commit más reciente, creando un nuevo commit que lo reemplaza completamente. Puedes usarlo para corregir el mensaje del último commit o para agregar cambios que olvidaste incluir en ese commit. No añade un commit nuevo al historial, sino que reescribe el último, haciendo que el commit anterior desaparezca del historial actual y sea reemplazado por otro con un nuevo identificador (hash).
•
Un nuevo commit simplemente crea una nueva instantánea del proyecto, añadiendo un commit más al historial sin alterar los commits anteriores.
En concreto, git commit --amend es útil para corregir errores pequeños o agregar cambios al último commit antes de compartirlo con otros. Sin embargo, hay que evitar usarlo si el commit ya fue empujado (push) y usado por otros desarrolladores, porque reescribir el historial puede generar conflictos y confusión.

11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

R// El comando git stash se utiliza para guardar temporalmente los cambios que has realizado en tu área de trabajo (modificaciones no confirmadas) para poder limpiar tu directorio trabajando sin perder esos cambios y retomarlos luego. Esto es útil cuando necesitas cambiar rápidamente de contexto, por ejemplo, cambiar de rama para trabajar en otra cosa sin tener que hacer un commit incompleto o desordenado.
Escenarios en los que es útil git stash
Cuando estás trabajando en una característica o arreglo, pero necesitas cambiar rápidamente a otra rama para revisar algo o atender un problema urgente.
Cuando tienes cambios en tu directorio de trabajo que no están listos para commit, pero quieres hacer un pull o cambiar de rama.
Para evitar commits parciales o sucios cuando no tienes un cambio completo pero necesitas guardar tu progreso.
Para guardar rápidamente un estado temporal sin alterar la rama actual.

12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?

R//
•
git reset: Restablece el historial y el estado del proyecto a un commit previo. Puede actuar en diferentes niveles (solo mover el puntero HEAD, también cambiar el área de staging y/o el directorio de trabajo), dependiendo de la opción usada (--soft, --mixed, --hard). Es útil para deshacer commits recientes en ramas locales privadas o eliminar cambios en staging, pero modifica el historial y puede ser peligroso si se usa en repositorios compartidos, pues elimina commits del historial visible localmente.
•
git revert: Crea un nuevo commit que invierte los cambios de un commit anterior. No elimina el commit original ni cambia el historial previo, sino que añade historia para deshacer los efectos del commit revertido. Es la forma segura de deshacer cambios ya publicados en repositorios remotos porque no modifica el historial compartido, sino que agrega un nuevo commit de reversión.
•
git checkout: Tiene dos usos principales. A nivel de rama, cambia el puntero HEAD a otra rama o commit, permitiendo moverse entre distintas versiones. A nivel de archivo, restaura el contenido de un archivo específico a como estaba en un commit determinado, descartando cambios en el directorio de trabajo para ese archivo. No modifica el historial de commits, solo cambia el estado de archivos o referencia HEAD.
13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?

R//
origin: Es el nombre predeterminado que Git asigna al repositorio remoto desde donde clonas un proyecto. Generalmente, "origin" apunta a tu propio repositorio (fork o repositorio original) donde haces push y pull por defecto.
upstream: Es un nombre común para referirse al repositorio original desde el que hiciste un fork. Se utiliza para sincronizar los cambios del repositorio original con tu fork.
Cómo se configuran y usan estos remotos
Ver remotos configurados:
git remote -v
Esto muestra URLs para fetch y push de cada remoto configurado.
Agregar un remoto (por ejemplo, agregar el repositorio original como
upstream):
git remote add upstream https://github.com/ORIGINAL-OWNER/ORIGINAL-REPOSITORY.git
Mientras que el remoto origin ya está apuntando a tu fork (ejemplo: https://github.com/TU-USUARIO/TU-FORK.git), el
remoto upstream apunta al repositorio original para que puedas sincronizar
cambios.
Comandos básicos para gestión de forks
Actualizar tu fork con cambios del repositorio original (upstream):
git fetch upstream
git checkout main
git merge upstream/main
Esto trae los últimos cambios del repositorio original y los integra en tu rama
principal local.
Enviar tus cambios al fork remoto (origin):
git push origin main
Subir una nueva rama a tu fork remoto:
git push -u origin nombre-rama

14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?

R//
•
git log
Muestra la lista de commits en orden cronológico inverso (más recientes primero) con información como el hash, autor, fecha y mensaje del commit. Tiene muchas opciones para personalizar la vista, por ejemplo:
git log --oneline muestra cada commit en una sola línea (compacto).
git log --stat muestra qué archivos cambiaron y cuántas líneas se modificaron.
git log -p muestra las diferencias exactas introducidas en cada commit.
git log --graph --decorate --oneline presenta una vista gráfica de las ramas y commits.
Además, permite filtrar por autor, mensaje, rango de fechas, archivos afectados, etc.
•
git diff
Muestra las diferencias entre estados del repositorio. Puede usarse para ver:
Cambios sin staged (git diff)
Cambios staged pero no commiteados (git diff --staged)
Diferencias entre commits específicos (git diff commit1 commit2)
Cambios respecto a una rama o archivo
•
git show
Muestra detalles de un commit específico, incluyendo metadata y diferencias. Por defecto muestra el último commit, pero puedes pasar un hash para ver otro:
git show <commit_hash>
Esto es útil para inspeccionar un commit en detalle. También puede mostrar tags o objetos.
•
git reflog (comando adicional importante)
Muestra el registro de todas las posiciones que ha tenido HEAD, útil para recuperar commits perdidos o ver cambios recientes en la referencia. Incluye commits descartados o de rebases.

#### RESPUESTAS PROGRAMACIÓN
15. ¿Cuáles son los tipos de datos primitivos en Java?

R// Los tipos de datos primitivos en Java son ocho y representan los valores básicos y simples que maneja el lenguaje, no son objetos y tienen un tamaño fijo y un rango de valores definido. Estos tipos son:
•
byte: entero de 8 bits con signo, rango de -128 a 127.
•
short: entero de 16 bits con signo, rango de -32,768 a 32,767.
•
int: entero de 32 bits con signo, rango de -2,147,483,648 a 2,147,483,647.
•
long: entero de 64 bits con signo, rango muy amplio (de aproximadamente -9.22×10^18 a 9.22×10^18).
•
float: número en coma flotante de precisión simple de 32 bits.
•
double: número en coma flotante de doble precisión de 64 bits.
•
boolean: valor lógico que solo puede ser true o false, ocupa 1 bit.
•
char: carácter Unicode simple de 16 bits, que representa un solo carácter.

16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?

R//
a- if y else
Permiten ejecutar bloques de código según se cumpla o no una condición booleana.
java
if (condición) {
// Código que se ejecuta si la condición es verdadera
} else {
// Código que se ejecuta si la condición es falsa
}
La condición debe evaluarse a true o false.
Puedes encadenar varios bloques con else if para múltiples evaluaciones.
b- switch
Es una estructura que evalúa una expresión y ejecuta el bloque de código correspondiente a un caso particular.
java
switch (expresión) {
case valor1:
// Código para valor1
break;
case valor2:
// Código para valor2
break;
default:
// Código si ningún case coincide
}
La expresión puede ser un int, char, String (desde Java 7) o tipos enumerados (enum).
Los break evitan que la ejecución "caiga" en los siguientes casos.
default es opcional y se ejecuta si ningún case coincide.
II Bucles (estructuras repetitivas)
Permiten repetir bloques de código mientras se cumpla una condición.
a- for
Repite un bloque un número conocido o controlado de veces, usando una variable contadora.
java
for (inicialización; condición; actualización) {
// Código a repetir
}
17.
¿Por qué es importante usar nombres significativos para variables y
métodos?
R//
•
Claridad y legibilidad:
Los nombres bien elegidos comunican claramente el propósito o el contenido de la variable o función, lo que hace que el código sea más fácil de leer y entender sin necesidad de muchos comentarios. Por ejemplo, edadUsuario es mucho más claro que x o dato1.
•
Mantenimiento:
Al mantener el código en el futuro, ya sea por ti u otros desarrolladores, los nombres significativos permiten entender rápidamente qué hace cada parte del código, facilitando la actualización, corrección de errores o ampliación.
•
Autodocumentación:
El código con buenos nombres funciona casi como documentación, reduciendo la necesidad de explicaciones adicionales y disminuyendo la posibilidad de malentendidos.
•
Evitar errores:
Nombres claros ayudan a prevenir confusiones y errores a la hora de usar variables o llamar métodos, ya que es menos probable que se use mal un nombre cuando su propósito es explícito.
•
Facilita la colaboración:
En equipos de desarrollo, un código con nombres sencillos y descriptivos ayuda a que todos comprendan el software rápidamente, mejorando la comunicación y la productividad.
•
Buenas prácticas y estándares:
Usar nombres significativos suele ser recomendado en las guías de estilo y buenas prácticas de programación, lo que contribuye a un código profesional y consistente.
18. ¿Qué es la Programación Orientada a Objetos (POO)?

R//La Programación Orientada a Objetos (POO) es un paradigma o modelo de programación que organiza el software en torno a "objetos", que son entidades que representan tanto datos como comportamientos relacionados. En vez de centrarse en funciones o procedimientos, la POO modela elementos del mundo real mediante objetos que contienen atributos (datos) y métodos (funciones o acciones que los objetos pueden realizar). Esto facilita crear programas modulares, reutilizables y más fáciles de mantener.

19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?

R//
1.
Abstracción: Consiste en identificar y modelar las características esenciales de un objeto, ocultando los detalles internos irrelevantes para simplificar la interacción. Facilita centrarse en qué hace un objeto en lugar de cómo lo hace.
2.
Encapsulamiento: Protege los datos y la implementación interna de un objeto, exponiendo solo lo necesario a través de interfaces públicas. Esto previene modificaciones no autorizadas y mantiene la integridad del objeto.
3.
Herencia: Permite crear nuevas clases basadas en clases existentes, heredando atributos y métodos, y facilitando la reutilización de código y la extensión de funcionalidades.
4.
Polimorfismo: Permite que diferentes objetos respondan a la misma operación o método de distintas formas, ofreciendo flexibilidad y la capacidad de usar una interfaz común para objetos de diferentes clases.

20. ¿Qué es la herencia en POO y cómo se utiliza en Java?

R//La herencia en Programación Orientada a Objetos (POO) es un mecanismo que permite crear nuevas clases basadas en otras ya existentes, llamadas clases padre, base o superclases. La clase derivada o subclase hereda los atributos (variables) y métodos (funciones) de la clase base, lo que facilita la reutilización de código y la extensión de funcionalidades sin necesidad de reescribir código que ya está probado y funcional. Esto también establece una relación jerárquica entre clases, donde las subclases pueden añadir o modificar comportamientos propios además de los heredados
La herencia en Java permite:
•
Reutilizar código evitando duplicación.
•
Extender funcionalidades de clases existentes.
•
Modelar relaciones jerárquicas como “es un tipo de” (un coche es un tipo de vehículo).
•
Facilitar el polimorfismo, ya que un objeto de una subclase puede ser tratado como una instancia de la superclase.

21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?

R//Los modificadores de acceso en Java son palabras clave que determinan la visibilidad y accesibilidad de las variables, métodos y clases dentro de un programa. Controlan desde dónde se pueden acceder y modificar estos miembros, permitiendo proteger datos y definir el nivel de acceso correcto para mantener la integridad y seguridad del código.
Los modificadores de acceso más comunes en Java son:
•
public: El miembro o clase es accesible desde cualquier otra clase, sin importar el paquete o jerarquía de herencia. Es el modificador más permisivo.
•
private: El miembro solo es accesible dentro de la propia clase donde se define. Ni siquiera las subclases o clases del mismo paquete pueden acceder directamente. Es el modificador que más restringe el acceso, utilizado para encapsular datos.
•
protected: Permite el acceso desde la propia clase, sus subclases (incluso en otros paquetes) y cualquier clase dentro del mismo paquete. Ofrece una visibilidad intermedia, permitiendo que las subclases hereden y usen miembros protegidos sin exponerlos públicamente.
•
(default) o package-private: Cuando no se especifica ningún modificador, Java asigna este acceso por defecto. Los miembros con acceso default son visibles para todas las clases dentro del mismo paquete, pero no para clases fuera de ese paquete. No es explícito y puede causar confusiones si se olvida declarar el nivel.

22. ¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general?

R//Una variable de entorno es un valor dinámico asignado a una clave con nombre que forma parte del entorno en el que se ejecutan los procesos o programas en un sistema operativo. Estas variables afectan el comportamiento de los programas en tiempo de ejecución, permitiendo configurar aspectos como rutas de archivos, configuraciones específicas, credenciales, y otros parámetros sin modificar el código fuente. Por ejemplo, una variable puede indicar dónde almacenar archivos temporales o qué configuración usar según el entorno (desarrollo, producción, etc.).
Son importantes para Java y la programación en general porque:
•
Permiten separar la configuración del código, facilitando que el mismo programa se ejecute en diferentes entornos sin necesidad de cambios en el código.
•
Ayudan a proteger información sensible (como claves de API o contraseñas) al no incluirlas directamente en el código fuente.
•
Facilitan la portabilidad y mantenibilidad de las aplicaciones al centralizar los parámetros que pueden variar entre entornos.
•
Permiten que múltiples desarrolladores usen configuraciones locales distintas sin afectar la base común del código, mejorando la colaboración.
•
En Java, se pueden acceder desde el programa para adaptar su comportamiento en función de la configuración del entorno donde se ejecuta.