# S1_03_Nivel_3
**Gestor de personas**
## 📌 Enunciado
En este nivel implementaremos una pequeña aplicación para gestionar y mostrar personas leídas desde un archivo. Practicaremos la lectura de archivos CSV la creación de menús interactivos y la ordenación dinámica de objetos según diferentes criterios (nombre, apellido y DNI). El objetivo es entender cómo estructurar una aplicación modular que permita leer, mostrar y ordenar datos de forma flexible.

Ejercicio 1 — Gestor de personas con ordenación
Crea una aplicación capaz de leer un archivo CSV. Este archivo tiene 3 campos: nombre, apellido y DNI, por cada registro. Se trata de ordenar a las personas leídas del fichero, mediante su nombre, apellido o DNI. Puedes utilizar la lista que creas más adecuada.

La clase Persona tiene 3 atributos:


nom  
cognom  
DNI  
La clase principal tiene el siguiente menú:


1. Introduir persona.
2. Mostrar les persones ordenades per nom (A-Z).
3. Mostrar les persones ordenades per nom (Z-A).
4. Mostrar les persones ordenades per cognoms (A-Z).
5. Mostrar les persones ordenades per cognoms (Z-A).
6. Mostrar les persones ordenades per DNI (1-9).
7. Mostrar les persones ordenades per DNI (9-1).
0. Sortir.
   El programa deberá listar a las personas como el siguiente ejemplo:


___Nom___       ____Cognoms______    ___NIF___  
Andreu          Ballestero Llenas    34835767J  
Miquel          Bayona Font          48743957B  
Guillem         Capdevila Riu        33957834J  
Albert          Carbonell Ferrer     77364986R  
Ferran          Casas Coderch        23047848P  
Maria           Casellas Fuste       47102244S  
Genis           Ciutat Vendrell      39718459N
