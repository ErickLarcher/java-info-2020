import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el valor del exponente: ");
        int b = scan.nextInt();

        System.out.print("La potencia dio el siguiente resultado: " + potencia(a , b));

        scan.close();

    }

    public static int potencia(int num1, int num2){
            int pot = 1; 
        for ( int i = 1 ; i <= num2; i ++) {
            pot *= num1;
        }
        return pot;
    }
}