# Hola Mundo en Java Documentado

Comprobar si tenemos java instalado
```java
javac -version
```

Actualizamos los repositorios

```java
sudo apt-get install
```
Instalamos java

```java
sudo apt install default-jdk
```

Creamos el archivo java con nano

```java
nano HelloWorld.java
```

Introducimos código dentro del programa

```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Compilamos el archivo

```java
javac HelloWorld.java
```

Ejecutamos el archivo para comprobar que va todo bien

```java
java HelloWorld
```
