# REPOSITORIOS REMOTOS GIT

1. Crea un repositorio en GitHub con el nombre libro-git. Añádelo como url remota en nuestro repositorio local de libro creado en el ejercicio anterior.

```
$ git remote add git-libro git@github.com:AnxoPF/libro-git.git

```

2. Añade todo lo que tenemos que el repositorio libro al repositorio remoto y comprueba que los cambios están subidos correctamente.

```
$ git push git-libro master
    Enumerando objetos: 40, listo.
    Contando objetos: 100% (40/40), listo.
    Comprimiendo objetos: 100% (31/31), listo.
    Escribiendo objetos: 100% (40/40), 3.62 KiB | 528.00 KiB/s, listo.
    Total 40 (delta 9), reusado 0 (delta 0)
    remote: Resolving deltas: 100% (9/9), done.
    To github.com:AnxoPF/libro-git.git
    * [new branch]      master -> master
```

3. Colabora en el repositorio remoto de otro compañero. Clona su repositorio. Añade el fichero autores.txt que contenga tu nombre y tu correo electrónico. Haz un commit y sube los cambios al repositorio remoto de tu compañero.

```
$ git clone git@github.com:a21dylanap/libro-git.git
    Clonando en 'libro-git'...
    remote: Enumerating objects: 33, done.
    remote: Counting objects: 100% (33/33), done.
    remote: Compressing objects: 100% (17/17), done.
    Recibiendo objetos: 100% (33/33), listo.
    Resolviendo deltas: 100% (6/6), listo.
    remote: Total 33 (delta 6), reused 33 (delta 6), pack-reused 0
$ nano autores.txt
$ git add .
$ git commit -m "Añadido autores"
    [master 2c411f0] Añadido autores
    1 file changed, 2 insertions(+)
    create mode 100644 autores.txt
$ git push origin master
    Enumerando objetos: 4, listo.
    Contando objetos: 100% (4/4), listo.
    Comprimiendo objetos: 100% (2/2), listo.
    Escribiendo objetos: 100% (3/3), 321 bytes | 107.00 KiB/s, listo.
    Total 3 (delta 1), reusado 0 (delta 0)
    remote: Resolving deltas: 100% (1/1), completed with 1 local object.
    To github.com:a21dylanap/libro-git.git
    b7b422e..2c411f0  master -> master
```

4. Cuando un compañero/a haya realizado el paso anterior en tu repositorio remoto, sincroníza tu repositorio en local. El resultado debe ser que en local debes tener ese fichero autores.txt.

```
$ git pull git-libro master
Desde github.com:AnxoPF/libro-git
 * branch            master     -> FETCH_HEAD
Actualizando bd4752b..50d6dad
Fast-forward
 autores.txt | 2 ++
 1 file changed, 2 insertions(+)
 create mode 100644 autores.txt

```

5. Modifica ese fichero, cambiando el nombre de tu compañero/a por el tuyo y añadiendo la fecha y la hora donde lo realizas. Sube los cambios al repositorio remoto.

```
$ nano autores.txt 
$ git add .
$ git commit -m "Cambiado autores"
    [master 7d4c0cf] Cambiado autores
    1 file changed, 2 insertions(+), 1 deletion(-)
$ git push git-libro master
    Enumerando objetos: 5, listo.
    Contando objetos: 100% (5/5), listo.
    Comprimiendo objetos: 100% (3/3), listo.
    Escribiendo objetos: 100% (3/3), 326 bytes | 81.00 KiB/s, listo.
    Total 3 (delta 1), reusado 0 (delta 0)
    remote: Resolving deltas: 100% (1/1), completed with 1 local object.
    To github.com:AnxoPF/libro-git.git
    50d6dad..7d4c0cf  master -> master
```


6. Al mismo tiempo, avisa a tu compañero/a para que, en su repositorio local, vuelva a modificar el fichero autores.txt añdiendo tu nombre en un línea nueva, la fecha y la hora así como el lugar donde se realiza el ejercicio. Una vez modificado, debe subir los cambios a remoto.

Hecho, resulta en conflicto por lo que primero tiene que hacer un pull, surgirá un conflicto de fusión con el archivo autores.txt, se corrige con nano. Se hace el commit y se sube sin problema.

