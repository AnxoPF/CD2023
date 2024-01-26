# Introducción GIT

## Ejercicio 1

1. Primer commit

Primero creamos el repositorio local

```
git init
```
Y después creamos los 2 ficheros txt donde introducimos lo solicitado.

```
nano sabela.txt
nano actividades.txt
```

Luego realizamos el commit, para ello primero tenemos que inicializar el repositorio, añadir los archivos al commit y ejecutarlo.

```
git init
git add .
git commit -m "commit 1"
```

2. Segundo commit

Modificamos el primer .txt con nano y hacemos otro commit

```
nano sabela.txt
git add sabela.txt
git commit -m “commit 2”
```

3. Paso intermedio

Creamos una carpeta con 2 ficheros

```
mkdir CarpetaSimple
cd CarpetaSimple
touch fichero1 fichero2
```

4. Commit 3

Realizamos otro commit con las modificaciones solicitadas.
Primero editamos el archivo que se nos pide con nano.

```
nano actividades.txt
```

Y despúes para ignorar la carpeta que acabamos de crear, generamos un archivo de nombre ".gitignore" que nos servirá para especificar que queremos que ignore el git.

```
nano .gitignore
```
 dentro introducimos "/CarpetaSimple" y así ignorará dicha carpeta. Después procedemos al commit.

 ```
git add .
git commit -m "commit 3"
```

5. Checkout

Para realizar un checkout y volver a las primeras versiones de los ficheros primero entramos al log y luego utilizamos el otro comando usando como referencia el codigo de la versión a la que queramos volver. Después podemos hacer otro checkout a master para volver a la versión actual.

```
git log
git checkout fcad7e392b
git checkout master
```
## Ejercicio 2

1. Inicio

Creamos un nuevo repositorio y mostramos su contenido

```
mkdir pagina_web
cd pagina_web
git init .
git status
```

2. Comprobación

“En la rama master.

No hay commits todavía.

No hay nada para confirmar”

3. Fichero

Creamos un fichero con dicho contenido

```
nano index.html
```

4. Primer commit

```
git add .
git commit -m "Primera página html."
```

5. Muestra

6. Cambio en la página

```
nano index.html
```

7. Segundo commit

```
git add .
Git commit -m “Añadidas 3 ciudades que visitar.”
```

8. Historial

Mostramos el historial de commits con el comando correspondiente

```
git log
```

9. Carpeta

Creamos una carpeta para cada ciudad y el fichero

```
mkdir Cangas Padrón Redondela
cd Cangas
nano index html
cd ..
cd Padrón
nano index html
cd ..
cd Redondela
nano index.html
```

10. Tercer commit

```
git add .
git commit -m "Añadida información sobre las ciudades a visitar."
```

11. Historial 2

Volvemos a mostrar el historial con git log

## Ejercicio 3

1. Repositorio

Creamos otro repostorio y mostramos su contenido

```
mkdir libro
cd libro
git init .
Git status
```

2. Indice

Creamos el indice

```
nano indice.txt
```

3. Primer commit

```
git add .
git commit -m "Añadido índice del libro."
```

4. Estado

5. Cambio

Cambiamos el indice con nano

6. Segundo commit

```
git add .
Git commit -m “Añadido 4: La bella y la bestia.”
```

7. Historial

Mostramos el historial del repositorio con git log

8. Carpeta capítulos

```
mkdir capitulos
cd capitulos
nano capitulo2.txt
```

9. Tercer commit

```
git add .
Git commit -m “Añadido capítulo 2”
```

10. Historial

Volvemos a mostrar el historial

11. Capitulo 3

```
nano capitulo3.txt
```

12. Estado

13. Modificacion

Modificamos indice con nano

14. Cuarto commit

Realizamos el commit ignorando el capitulo 3 con .gitignore

```
git status
cd ..
nano indice.txt
nano .gitignore
(capitulo3.txt)
git add .
Git commit -m “Punto 14”
```

15. Modificacion .gitignore

Cambiamos el contenido del archivo para que ignore lo solicitado

```
nano .gitignore
(*_
!_ayuda.txt)
```

16. Logs

```
nano _logs.txt
```

17. Ayuda

```
nano _ayuda.txt
```

18. Preparación

Al introducir "git add *" se ignorarán los 2 archivos recientemente creados porque empiezan por la instrucción que se mandó ignorar en el .gitignore

19. Quinto Commit

```
git commit .m “Añadido capitulo 2.”
```

Se ignorarán los archivos pertinentes

20. Modificado

Modificamos capitulo2.txt con nano

21. Explicación

Ha cambiado el archivo del capítulo 2 y aún no ha sido añadido al commit

22. Sexto commit

```
git add .
git commit -m "Capitulo 2 modificado."
```

23. Modificación de nuevo

24. Preparación

Realizamos el git add

25. Eliminado

Para eliminar el fichero solicitado realizamos el siguiente commando

```
rm _ayuda.txt
```

26. Cambio de nombre

Cambiamos el nombre del fichero

```
git mv indice.txt indice_libros.txt 
```

27. Cambio

Cambio del mensaje del último commit

```
git commit --amend -m "Último commit modificación"
```