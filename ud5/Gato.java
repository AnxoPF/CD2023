package ud5;

public class Gato extends Animal implements Imprimible {

    @Override
    public String toString() {
        return toString();
    }

    @Override
    public void animalSound() {
        System.out.println("Miau");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("rrrrr");
    }

    @Override
    public void print() {
        
    }
    
}
