package ud5.Ej5_1;

/**
 * Class Socio
 */
public class Socio {

  //
  // Fields
  //

  private Data dataAlta;
  private String codigo;
  private Persoa persoa;
  
  //
  // Constructors
  //
  public Socio () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of dataAlta
   * @param newVar the new value of dataAlta
   */
  public void setDataAlta (Data newVar) {
    dataAlta = newVar;
  }

  /**
   * Get the value of dataAlta
   * @return the value of dataAlta
   */
  public Data getDataAlta () {
    return dataAlta;
  }

  /**
   * Set the value of codigo
   * @param newVar the new value of codigo
   */
  public void setCodigo (String newVar) {
    codigo = newVar;
  }

  /**
   * Get the value of codigo
   * @return the value of codigo
   */
  public String getCodigo () {
    return codigo;
  }

  /**
   * Set the value of persoa
   * @param newVar the new value of persoa
   */
  public void setPersoa (Persoa newVar) {
    persoa = newVar;
  }

  /**
   * Get the value of persoa
   * @return the value of persoa
   */
  public Persoa getPersoa () {
    return persoa;
  }

  //
  // Other methods
  //

}
