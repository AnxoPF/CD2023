# Probar Prolog

```bash
docker pull wipl
docker run -it swipl
```
Así entramos de forma interactiva.

```bash
docker run -it swipl bash
```

Entramos con un terminal interactivo

```bash
update nano
apt install nano
```

Actualizamos el repositorio e installamos nano

```bash
nano programaprolog.pl
```

Aquí editamos el programa

```bash
swipl
```

Cargamos el programa en Prolog

```bash
consult('programaprolog.pl')
```

Entramos al modo de consulta