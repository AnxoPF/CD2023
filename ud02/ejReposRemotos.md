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


