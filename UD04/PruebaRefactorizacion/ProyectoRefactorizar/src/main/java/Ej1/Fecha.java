package Ej1;

 public class Fecha {

    /**
     * Se especifican las variables de la clase
     */
    private int dia;
    private int mes;
    private int anio;

    /**
     * El constructor del objeto Fecha
     * @param dia define el valor de la variable dia
     * @param mes define el valor de la variable mes
     * @param anio define el valor de la variable anio
     */
    public Fecha(int dia, int mes, int anio) {
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;
    }
    
    
    
    /** 
     * Método que devolvera True/False en función de los 
     * valores de dia, mes y anio.
     * La respuesta irá en funcion de si es coherente
     * la combinación de los 3 datos
     * @return boolean True si tiene sentido, False si
     * debe ser descartado
     */
    public boolean validacionDiaMes () {
        if (dia < 1 || dia > 31)
            return false;
        if (mes < 1 || mes > 12)   
            return false;
    
    int diasMes = 0;
    switch (mes) {
    case 1,3,5,7,8,10,12:
        diasMes = 31; 
        break;
    case 4,6,9,11:
        diasMes = 30; 
        break;
    case 2 :
        if ( esBisiesto() )
            diasMes = 29;
        else diasMes = 28;
            break;
        }
    
    if (dia > diasMes)
        return false;
    else 
        return true;
    }

    /**
     * Comprueba si el año es bisiesto
     * @return true si es bisiesto, false de no serlo
     */
    private boolean esBisiesto(){
        return (anio % 400 == 0) || 
                ((anio % 4 == 0) && (anio % 100 != 0));
    
    }
}