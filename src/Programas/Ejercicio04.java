package Programas;
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        
        //Declarar variables
        int numero;
        String periodo;
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese uno de estos numeros (1 - 2 - 3 - 4 - 6 - 12): ");
        numero = lectura.nextInt();
        
        //Operación de datos
        switch (numero) {
            case 1:
                periodo = "mensual";
                break;
            case 2:
                periodo = "bimestral";
                break;
            case 3:
                periodo = "trimestral";
                break;
            case 4:
                periodo = "cuatrimestral";
                break;
            case 6:
                periodo = "semestral";
                break;
            case 12:
                periodo = "anual";
                break;
            default:
                periodo = "Ingrese un número válido";
                break;
        }
        
        //Salida de datos
        System.out.println("El periodo es: " + periodo);
    }
}
