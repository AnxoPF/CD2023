package ud5.Calculador;

public class Calculadora {

    
    private double resultado = 0;
    
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double valor) {
        if (valor > 10000){
            this.resultado = 9999;
        }else{
            this.resultado = valor;
        }
    }

    public Calculadora(){
        this.resultado = 0;
    }

    public Calculadora(double x){
        this.resultado = x;
    }

    public void sumar(double x) {
        this.resultado = this.resultado + x;
    }

    public void restar(double x) {
        this.resultado = this.resultado - x;
    }

    public void multiplicar(double x) {
        this.resultado = this.resultado * x;
    }

    public void dividir(double x) {
        this.resultado = this.resultado / x;
    }

    public void reset() {
        this.resultado = 0;
    }

    public void imprimir() {
        System.out.println("Valor actual calculadora: " + this.resultado);
    }
}