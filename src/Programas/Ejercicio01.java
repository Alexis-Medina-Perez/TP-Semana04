package Programas;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        
        //Declarar variables
        int numero;
        String nombreNum;
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese un numero del 1 al 5: ");
        numero = lectura.nextInt();
        
        //Operación de datos
        switch (numero) {
            case 1:
                nombreNum = "Uno";
                break;
            case 2:
                nombreNum = "Dos";
                break;
            case 3:
                nombreNum = "Tres";
                break;
            case 4:
                nombreNum = "Cuatro";
                break;
            case 5:
                nombreNum = "Cinco";
                break;
            default:
                nombreNum = "Ingrese un número válido";
                break;
        }
        
        //Salida de datos
        System.out.println("El nombre del numero ingresado es: " + nombreNum);
    }
}
