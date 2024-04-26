package EjDocumentacion;
/**
 * Esta clase define atributos de Persona
 */
public class Persona {

    /** 
     * Declara las variables de la clase
     * La variable nombre admite el tipo de dato String
     * La variable edad admite el tipo de dato int
    */
    private String nombre;
    private int edad;

    /**
     * Constuctor de la clase Persona
     * @param nombre define el valor de la variable nombre
     * @param edad define el valor de la variable edad
     */

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    /** 
     * Método que devuelve el valor de la variable nombre
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que define un string para la variable nombre
     * @param nombre el parametro nombre define el valor de la variable
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el valor de la variable edad
     * @return Int edad
     */

    public int getEdad() {
        return edad;
    }

    /**
     *  Método que define un valor de tipo Int para la variable edad
     * @param edad define el valor de la variable
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que imprime las 2 variables acompañadas de un texto
     * que las identifica
     */

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
