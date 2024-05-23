package ud5.Calculador;

import java.util.Scanner;

public class Menu {

    private int seleccion = -1;

    public int getSeleccion() {
        return seleccion;
    }

    public void resetSeleccion() {
        
    }

    public void imprimir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opción");
        System.out.println("0 - Reset");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Elevar");
        System.out.println("6 - Raíz");

        int valorLeido = sc.nextInt();

        if (valorLeido >= 0 && valorLeido <= 4) {
            this.seleccion = valorLeido;
        } else {
            this.seleccion = -1;
        }

        sc.close();
        
    }

    public int getSeleccionValida() {
        while (seleccion == -1) {
            imprimir();
        }
        return seleccion;
    }

    public double getNumeroValido(){
        return 3.0;
    }
    
}
