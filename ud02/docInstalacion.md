# Instalación de un IDE documentado.

Escogemos el IDE "NetBeans" porque es un IDE de código 
abierto, con apoyo activo de la comunidad, enfocado 
principalmente para el desarrollo de Java. Se puede 
utilizar para crear aplicaciones de escritorio.

Procedemos a la instalación mediante comandos, deberíamos
introducir la siguiente secuencia.

Actualizamos los paquetes apt del sistema 

```java
sudo apt update
```

Instalamos Java JDK versión 11

```java
sudo apt install default-jdk
```
Procedemos a la instalación mediante la aplicación Snap
Primero comprobamos la versión de snap instalada

```java
snap version
```

Y con el siguiente comando lo instalamos

```
sudo snap install netbeans --classic
```

La interpretación de un programa simple

------------------------< com.mycompany:prueba >------------------------
Building prueba 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- resources:3.3.1:resources (default-resources) @ prueba ---
skip non existing resourceDirectory /home/vagrant/NetBeansProjects/prueba/src/main/resources

--- compiler:3.11.0:compile (default-compile) @ prueba ---
Changes detected - recompiling the module! :source
Compiling 2 source files with javac [debug target 17] to target/classes

--- exec:3.1.0:exec (default-cli) @ prueba ---
Hello World!
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  2.507 s
Finished at: 2024-01-12T11:37:56+01:00
------------------------------------------------------------------------