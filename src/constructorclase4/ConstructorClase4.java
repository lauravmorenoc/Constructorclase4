/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorclase4;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */


public class ConstructorClase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta MagdalenaSanchez=new Cuenta(1, 123, "l", 100);
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta: ");
        int numero= lectura.nextInt();
        System.out.println("Ingrese la clave: ");
        int clave= lectura.nextInt();
        System.out.println("Ingrese el dueño: ");
        String dueno=lectura.next();
        System.out.println("Ingrese saldo: ");
        double saldo=lectura.nextDouble();
        
        Cuenta c1=new Cuenta(numero, clave, dueno, saldo);
        c1.mostrarDatos();
    }
}

