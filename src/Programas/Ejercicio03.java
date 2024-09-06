package Programas;
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        
        //Declarar variables
        int numero;
        String numIngles;
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese un numero del 1 al 6: ");
        numero = lectura.nextInt();
        
        //Operación de datos
        switch (numero) {
            case 1:
                numIngles = "one";
                break;
            case 2:
                numIngles = "two";
                break;
            case 3:
                numIngles = "three";
                break;
            case 4:
                numIngles = "four";
                break;
            case 5:
                numIngles = "five";
                break;
            case 6:
                numIngles = "six";
                break;
            default:
                numIngles = "Ingrese un número válido";
                break;
        }
        
        //Salida de datos
        System.out.println("El numero ingresado en ingles es: " + numIngles);
    }
}
