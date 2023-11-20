package ud5;

public class AnimalTest {

    public static void probarImpresion(Imprimible imp){
        imp.print();
    }
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.animalSound();
        gato.sleep();

        System.out.println(gato);

        gato.print();

        Can can = new Can();
        can.animalSound();
    }
    
}
