/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorclase4;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int numero;
    private int clave;
    private String dueno;
    private double saldo;
    public static int global;
    public Cuenta(int numero, int clave, String dueno, double saldo){
        this.numero = numero;
        this.clave= clave;
        this.dueno= dueno;
        this.saldo = saldo;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int n){
        this.numero=n;
    }
    public int getClave() {
        return clave;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }
    public String getDueno() {
        return dueno;
    }
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void consignar(double n){
        if(n>0){
            this.saldo+=n;
            System.out.println("Valor consignado= $" + n);
        } else {
            System.out.println("No se pudo consignar el valor.");
        }
    }
    
    public void retirar(double n){
        if(n>0){
            this.saldo-=n;
            System.out.println("Se ha retirado el valor de $" + n);
        } else {
            System.out.println("No se pudo retirar el valor.");
        }
    }
    public void cambiarClave(int n){
        if (n>0){
            this.clave=n;
            System.out.println("La clave ha sido cambiada. ");
        } else {
            System.out.println("El valor introducido es ilogico.");
        }
    }
    public double consultarSaldo(){
        return this.saldo;
    }
    public void mostrarDatos(){
        System.out.println("Numero de cuenta: " + this.numero);
        System.out.println("Clave de cuenta: " + this.clave);
        System.out.println("Dueño de la cuenta: " + this.dueno);
        System.out.println("Saldo de la cuenta:" + this.saldo);
    }
}