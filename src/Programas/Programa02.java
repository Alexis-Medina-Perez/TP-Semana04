package Programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        
        //Inicializar variables
        int numero;
        String diaSem;
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingresar un numero del 1 al 7: ");
        numero = lectura.nextInt();
        
        //Operacion de datos
        switch (numero) {
            case 1:
                diaSem = "Lunes";                
                break;
            case 2:
                diaSem = "Martes";                
                break;
            case 3:
                diaSem = "Miercoles";                
                break;
            case 4:
                diaSem = "Jueves";                
                break;
            case 5:
                diaSem = "Viernes";                
                break;
            case 6:
                diaSem = "Sabado";                
                break;
            case 7:
                diaSem = "Domingo";                
                break;
            default:
                diaSem = "Solo numeros del 1 al 7";
                break;
        }
        
        //Salida de datos
        System.err.println("El día de la semana es: " + diaSem);
    }
}
