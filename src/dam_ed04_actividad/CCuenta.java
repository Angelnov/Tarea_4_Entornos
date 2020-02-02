/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 *
 * @author Angelau
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * @return devuelve el numero de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     * Modifica el numero de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     * Devuelve el saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     * Modifico el saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Constructor
     */
    public CCuenta()
    {
    }

    /**
     *
     * @param nom  Nombre  del titular
     * @param cue  Numero de cuenta
     * @param sal  Saldo de la cuenta
     * @param tipo Tipo de interes de la cuenta
     * Constructor con parametros
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @param nom Modifico el nombre de cuenta
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     *
     * @return Devielve el nombre de la cuenta
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     *
     * @return Devuelve el saldo de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     *
     * @param cantidad Cantidad a inggresar
     * @throws Exception Excepcion si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *
     * @param cantidad Cantidad para retirar de la cuenta
     * @throws Exception Excepcion si no hay saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     *
     * @return Devuelve el numero de cuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     *
     * @return Devuelve el nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre Modifica el nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return Devuelve el tipo de interes de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInterés
     * 
     * Modifica el tipo de interes
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
