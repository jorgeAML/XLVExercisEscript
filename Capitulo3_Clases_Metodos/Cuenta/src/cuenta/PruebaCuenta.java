/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class PruebaCuenta {
    public static void main(String ... args) {
                
                String nombre = JOptionPane.showInputDialog("Cual es su nombre: ");
                String mensaje = String.format("Bienvenido %s, a la programacion en Java!", nombre);
                JOptionPane.showMessageDialog(null, mensaje);
                Scanner entrada = new Scanner(System.in);
		
		Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
                Cuenta cuenta2 = new Cuenta("Jorge Martinez", -7.56);
                
		
		System.out.println("Nombre: " + cuenta1.obtenerNombre()); //Vacio
                //System.out.printf("Nombre: " + cuenta2.obtenerNombre()); //Vacio
		//DEPOSITANDO
                System.out.println("Escriba el monto a depositar para la cuenta de " + cuenta1.obtenerNombre() + ": ");
		double montoADepositar = entrada.nextDouble();
                System.out.println("Saldo de la cuenta: " + montoADepositar);
                
                //Agregar al metodo y sumarlo
                cuenta1.depositar(montoADepositar);
                System.out.println("Saldo de la cuenta1: " + cuenta1.obtenerNombre() + " " + cuenta1.obtenerSaldo());
                
                //Retirando saldo
                System.out.println("Escriba el monto a retirar: ");
                double montoARetirar = entrada.nextDouble();
                //Agregando metodo y restandolo
                cuenta1.retirar(montoARetirar);
		System.out.println("Saldo de la cuenta: " + cuenta1.obtenerRetiro());
		System.out.println("-----------------------------------------");
		
    }
}
