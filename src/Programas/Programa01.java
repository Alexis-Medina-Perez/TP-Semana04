package Programas;
import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args){
        
        //Declarar variables
        Double num1, num2, resultado;
        int opeMate;
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.err.print("Ingresar numero 1: ");
        num1 = lectura.nextDouble();
        System.err.print("Ingresar numero 2: ");
        num2 = lectura.nextDouble();
        System.err.print("Ingresar la opción (1 = suma, 2 = resta, 3 = mult, 4 = división): ");
        opeMate = lectura.nextInt();
        
        //Inicializar varibales requeridas
        resultado = 0.0;
                
        //Procesar datos
        switch (opeMate) {
            case 1: resultado = num1 + num2; break;
            case 2: resultado = num1 - num2; break;
            case 3: resultado = num1 * num2; break;
            case 4: resultado = num1 / num2; break;
        }
        
        //Salida de datos
        System.out.println("El resultado es: " + resultado);
    }
}
