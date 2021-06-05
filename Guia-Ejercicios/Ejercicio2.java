import java.util.*;

public class Ejercicio2 {
    
    /*programa que toma por pantalla 3 números y los imprime */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //definición de variables

        int a;
        int b;
        int c;
        int seguir = 1; 

        System.out.print("Ingrese un numero: ");
        a = scan.nextInt();

        System.out.print("Ingrese el segundo numero:");
        b = scan.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        c = scan.nextInt();

        scan.close();

        imprimirPorPantalla(a, b, c);
    }

    public static void imprimirPorPantalla( int c, int d, int f){
            System.out.println("El primer número ingresado es: " + c);
            System.out.println("El segundo número ingresado es: " + d);
            System.out.println("El tercer número ingresado es: " + f);
        }
        
    
}
