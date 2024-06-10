/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**
 *
 * @author jorge
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    private String nombre; //instancia creacion del objeto
    private double saldo;
    private double quitar; //instancia de retirar saldo
   //Creando un constructor
    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        
        if(saldo > 0.0) {
            this.saldo = saldo;
        }
    }
    //Metodo que suma el saldo con lo depositado
    public void depositar(double montoDeposito) {
        if(montoDeposito > 0.0) {
            saldo = saldo + montoDeposito;
        }
    }
    //Metodo que devuelve el saldo de la cuenta
    public double obtenerSaldo() {
        return saldo;
    }
    
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
	
    public String obtenerNombre(){
	return nombre;
    }
    
    //Metodo que retira el saldo depositado
    public void retirar(double retirarSaldo) {
        if (retirarSaldo > saldo) {
            System.out.println("El monto a retirar excede el saldo de la cuenta " + saldo);
            quitar = saldo;
        } else {
            quitar = saldo - retirarSaldo;
        }
    }
    //Metod que devuelve el saldo restado
    public double obtenerRetiro() {
        return quitar;
    }
    
    
    
}
