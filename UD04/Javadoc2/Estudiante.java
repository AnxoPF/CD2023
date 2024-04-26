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
     * @param calificacion define el valor de la variable
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public boolean aprobo() {
        return calificacion >= 5.0;
    }

    public int edadEscolar() {
        return edad / 12;
    }

    public boolean esUniversitario() {
        return edad >= 18;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}