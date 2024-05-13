package mesi;
/**
 * Esta clase define atributos de Estudiante
 */
public class Estudiante {

    /** 
     * Declara las variables de la clase
     * La variable nombre admite el tipo de dato String
     * La variable edad admite el tipo de dato int
     * La variable calificacion admite el tipo de dato double
    */
    private String nombre;
    private int edad;
    private double calificacion;

    /**
     * Constructor de la clase Estudiante
     * @param nombre define el valor de la variable nombre
     * @param edad define el valor de la variable edad
     * calificación directamente como 0.0
     */

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Método que define un double para la variable calificacion
     * @param calificacion el parametro calificacion define el 
     * valor de la variable
     */

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Método que devuelve el valor de la variable nombre
     * @return String nombre
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Método que define un String para la variable nombre
     * @param nombre el parámetro nombre define el valor de la variable
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el valor de la variable edad
     * @return int edad
     */

    public int getEdad() {
        return edad;
    }

    /**
     * Método que define un int para la variable edad
     * @param edad el parámetro edad define el valor de la variable
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que devuelve el valor de la variable calificación
     * @return double calificación
     */

    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Comprueba si el estudiante aprobó con calificación igual o superior a 5.0
     * @return ture si el estudiante aprobó, false si es al contrario.
     */

    public boolean aprobo() {
        return calificacion >= 5.0;
    }

    /**
     * Calcula la edad escolar del estudiante dividiendo su edad por 12.
     * @return La edad escolar del estudiante.
     */

    public int edadEscolar() {
        return edad / 12;
    }

    /**
     * Comprueba si el estudiante es mayor de 18.
     * @return true si el estudiante es mayor de edad, de no serlo.
     */
    public boolean esUniversitario() {
        return edad >= 18;
    }

    /**
     * Imprime toda la información del estudiante.
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}