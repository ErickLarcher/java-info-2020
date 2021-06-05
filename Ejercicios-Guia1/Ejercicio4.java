
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");

        int n = scan.nextInt();

        int fact = obtenerFact(n);

        System.out.println("El factorial del número que ingreso es: " + fact);

        scan.close();
    }

    public static int obtenerFact(int num){
        int resultado = num;
        if(resultado != 1) {  
            resultado = resultado * obtenerFact(num - 1);
        }     
        return resultado;
    }
}
