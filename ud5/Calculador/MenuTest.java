package ud5.Calculador;

public class MenuTest {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.getSeleccionValida();
        System.out.println("Opción " + menu.getSeleccion());
    }
    
}
