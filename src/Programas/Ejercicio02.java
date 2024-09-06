package Programas;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        
        //Declarar variables
        int numero;
        String numRomano;
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese un numero del 1 al 10: ");
        numero = lectura.nextInt();
        
        //Operación de datos
        switch (numero) {
            case 1:
                numRomano = "I";
                break;
            case 2:
                numRomano = "II";
                break;
            case 3:
                numRomano = "III";
                break;
            case 4:
                numRomano = "IV";
                break;
            case 5:
                numRomano = "V";
                break;
            case 6:
                numRomano = "VI";
                break;
            case 7:
                numRomano = "VII";
                break;
            case 8:
                numRomano = "VIII";
                break;
            case 9:
                numRomano = "IX";
                break;
            case 10:
                numRomano = "X";
                break;
            default:
                numRomano = "Ingrese un número válido";
                break;
        }
        
        //Salida de datos
        System.out.println("El numero ingresado en romano es: " + numRomano);
    }
}
