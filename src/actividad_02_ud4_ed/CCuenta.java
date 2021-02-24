/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;


public class CCuenta {


  
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
 * Constructor de la clase Ccuenta
 * @param nom Nombre del cliente de la cuenta
 * @param cue Estado de la cuenta
 * @param sal saldo ac de la cuenta
 * @param tipo tipo de interes de la cuenta 
 */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom nombre del titular seleccionado
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
    * 
    * @return <code>nombre</code> devuelve el nombre
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * 
     * @return <code>saldo</code> saldo disponible
     */
     public double estado ()
    {
        return saldo;
    }
/**
 * 
 * @param cantidad dinero a ingresar
 * @throws Exception controlamos que introduzcan una cantidad positiva
 */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }
/**
 * 
 * @param cantidad dinero a sacar 
 * @throws Exception controlamos que se retiren cantidades negativas
 */
   
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * 
     * @return  <code>cuenta</code>
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * 
   * @param cuenta numero de cuenta del cliente
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * 
   * @param saldo introduce el saldo acual
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * 
  * @return  <code>tipoInterés</code> porcentaje a palicar
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * 
   * @param tipoInterés  porcenteaje a actuar
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
