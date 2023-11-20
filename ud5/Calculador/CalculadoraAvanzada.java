package ud5.Calculador;

public class CalculadoraAvanzada extends Calculadora{
    
    private double resultadoAnterior = 0;        
    
    public void cadrado() {
        double nuevoValor = (getResultado()*getResultado());
        resultadoAnterior = getResultado();
        setResultado(nuevoValor);
    }

    public void raiz() {
        resultadoAnterior = getResultado();
        setResultado(Math.sqrt(getResultado()));
    }

    public void desfacer() {
        setResultado(resultadoAnterior);
    }
    
}
