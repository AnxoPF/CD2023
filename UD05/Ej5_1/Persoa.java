package ud5.Ej5_1;

/**
 * Class Persoa
 */
public class Persoa {

  //
  // Fields
  //

  private Nif nif;
  private Nome nome;
  private Data dataNacemento;
  
  //
  // Constructors
  //
  public Persoa () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nif
   * @param newVar the new value of nif
   */
  public void setNif (Nif newVar) {
    nif = newVar;
  }

  /**
   * Get the value of nif
   * @return the value of nif
   */
  public Nif getNif () {
    return nif;
  }

  /**
   * Set the value of nome
   * @param newVar the new value of nome
   */
  public void setNome (Nome newVar) {
    nome = newVar;
  }

  /**
   * Get the value of nome
   * @return the value of nome
   */
  public Nome getNome () {
    return nome;
  }

  /**
   * Set the value of dataNacemento
   * @param newVar the new value of dataNacemento
   */
  public void setDataNacemento (Data newVar) {
    dataNacemento = newVar;
  }

  /**
   * Get the value of dataNacemento
   * @return the value of dataNacemento
   */
  public Data getDataNacemento () {
    return dataNacemento;
  }

  //
  // Other methods
  //

}
