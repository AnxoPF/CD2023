package CreacionObjetos;

public class Perrito {
         
    String raza;
    String color;
    String nome;
    boolean chip;
    int NumeroChip;

    public void ladrar() {
        System.out.println("Guau Guau");
    }

    public void durmir() {
        System.out.println("Vou durmir");
    }

    public void pedirDeComer() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("Guau Guau");
        }
    }
}