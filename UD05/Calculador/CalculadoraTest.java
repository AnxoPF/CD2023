package ud5.Calculador;

public class CalculadoraTest {

    public static void main(String[] args) {
        
    

    Calculadora calc = new Calculadora();
    double valor = calc.getResultado();
    calc.setResultado(1000000);

    calc.sumar(5);
    calc.sumar(7);
    calc.multiplicar(2);
    calc.imprimir();

    Calculadora calc2 = new Calculadora(1000);
    calc.sumar(5);
    calc.sumar(7);
    calc.multiplicar(2);
    calc.imprimir();
    }
}
