# S1_03_Nivel_1_Ejercicio_3
**Capital Game**
## 📌 Enunciado
En este ejercicio pondremos en práctica la lectura de archivos, el uso de colecciones como HashMap y la interacción con el usuario mediante un pequeño juego de preguntas.

A partir del archivo countries.txt, que contiene parejas de país y capital separadas por comas, el programa debe leer todos los datos y almacenarlos en un HashMap<String, String>, donde la clave es el nombre del país y el valor, su capital.

Una vez cargados los datos, el programa pedirá el nombre del usuario y empezará el juego.

El funcionamiento consiste en realizar 10 preguntas, escogiendo aleatoriamente 10 países diferentes del HashMap. En cada ronda, se mostrará el nombre de un país y el usuario deberá introducir el nombre de su capital. 
Si la respuesta es correcta (teniendo en cuenta mayúsculas y minúsculas si fuera necesario), se sumará un punto a su puntuación. Al término de las 10 preguntas, se mostrará la puntuación total obtenida.

Al finalizar las 10 preguntas, el programa guardará el nombre del usuario y su puntuación en un archivo llamado classificacio.txt.