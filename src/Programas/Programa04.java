package Programas;
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) {
        
        //Declarar variables
        int numero;
        String estacion;
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese un numero del 1 al 12: ");
        numero = lectura.nextInt();
        
        //Operación de datos
        switch (numero) {
            case 1, 2, 3:
                estacion = "Verano";
                break;
            case 4, 5, 6:
                estacion = "Otoño";
                break;
            case 7, 8, 9:
                estacion = "Invierno";
                break;
            case 10, 11, 12:
                estacion = "Primavera";
                break;
            default:
                estacion = "Ingrese un número válido";
                break;
        }
        
        //Salida de datos
        System.out.println("El mes ingresado es: " + estacion);
    }
}
