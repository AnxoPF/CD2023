# RAMAS GIT

1. Crea una nueva rama bibliografia y muestra las ramas del respositorio.

```
$ git branch bibliografia
$ git branch
    * master
    bibliografia
```

2. Cambia a la rama bibliografía y crea el fichero bibliografía.txt y añade la siguiente referencia:

```
$ git checkout bibliografia 
    Cambiado a rama 'bibliografia'
$ nano bibliografia.txt
```
3. Comitea los cambios con el mensaje “Añadida primera referencia bibliográfica”.

```
$ git add .
$ git commit -m "Añadida primera referencia bibliográfica"
    [bibliografia c07e748] Añadida primera referencia bibliográfica
     1 file changed, 1 insertion(+)
     create mode 100644 bibliografia.txt
```

4. Fusionar la rama bibliografía con la rama master y eliminar la rama bibliografía.

```
$ git checkout master
    Cambiado a rama 'master'
$ git merge bibliografia 
    Actualizando 97bf4dc..c07e748
    Fast-forward
     bibliografia.txt | 1 +
     1 file changed, 1 insertion(+)
     create mode 100644 bibliografia.txt
$ git branch -d bibliografia 
    Eliminada la rama bibliografia (era c07e748).
```

5. Crea la rama harrypotter. En esta rama modifica el fichero bibliografía.txt para que contenga las siguientes referencias:

```
$ git branch harrypotter
$ git checkout harrypotter 
    Cambiado a rama 'harrypotter'
$ nano bibliografia.txt 

```

6. Comitea los cambios con el mensaje “Añadida bibliografía de harry potter”.

```
$ git add .
$ git commit -m "Añadida bibliografía de Harry Potter"
    [harrypotter a0d757c] Añadida bibliografía de Harry Potter
     1 file changed, 2 insertions(+), 1 deletion(-)

```

7. En la rama master modifica el fichero bibliografía.txt y añadie la siguiente línea:

```
$ git checkout master 
    Cambiado a rama 'master'
$ nano bibliografia.txt 
```

8. Fusiona la rama harrypotter con la rama master. Resuelve el conflicto y comitea los cambios.

Aquí he tenido varios problemas hasta entender como era el funcionamiento de fusión de los dos archivos y fui experimentando. Al final lo conseguí aunque haciendo un par de pasos innecesarios

```
$ git merge harrypotter 
Actualizando c07e748..a0d757c
    error: Los cambios locales de los siguientes archivos serán sobrescritos al fusionar:
	    bibliografia.txt
    Por favor, confirma tus cambios o aguárdalos antes de fusionar.
    Abortando
$ git status
    En la rama master
    Cambios no rastreados para el commit:
    (usa "git add <archivo>..." para actualizar lo que será confirmado)
    (usa "git restore <archivo>..." para descartar los cambios en el directorio de trabajo)
        modificados:     bibliografia.txt

    sin cambios agregados al commit (usa "git add" y/o "git commit -a")
$ mv bibliografia.txt bibliografia2.txt
$ git merge harrypotter 
    Actualizando c07e748..a0d757c
    error: Los cambios locales de los siguientes archivos serán sobrescritos al fusionar:
        bibliografia.txt
    Por favor, confirma tus cambios o aguárdalos antes de fusionar.
    Abortando
$ git add .
$ git commit -m "prueba"
    [master e152ad9] prueba
    1 file changed, 2 insertions(+)
    rename bibliografia.txt => bibliografia2.txt (56%)
$ git checkout harrypotter 
    Cambiado a rama 'harrypotter'
$ git checkout master 
    Cambiado a rama 'master'
$ git merge harrypotter 
    Auto-fusionando bibliografia2.txt
    CONFLICTO (contenido): Conflicto de fusión en bibliografia2.txt
    Fusión automática falló; arregle los conflictos y luego realice un commit con el resultado.
$ git checkout harrypotter 
    bibliografia2.txt: needs merge
    error: necesitas resolver tu índice actual primero
$ nano bibliografia2.txt 
$ git merge harrypotter 
    error: No es posible hacer merge porque tienes archivos sin fusionar.
    ayuda: Corrígelos en el árbol de trabajo y entonces usa 'git add/rm <archivo>',
    ayuda: como sea apropiado, para marcar la resolución y realizar un commit.
    fatal: Saliendo porque existe un conflicto sin resolver.
$ git add .
$ git merge harrypotter
$ git commit -m "cambios de fusion"
    [master bd4752b] cambios de fusion
$ git merge harrypotter 
    Ya está actualizado.
```
He dejado todo el código para que se entienda los problemas que he tenido con el conflicto y las pruebas que he ido haciendo para intentar arreglarlo.