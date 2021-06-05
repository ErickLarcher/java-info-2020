import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int b = scan.nextInt();

        System.out.println("La multiplicación por sumas sucesivas dio el resultado de: " + sumasuce(a , b));

        scan.close();

    }

    public static int sumasuce(int num1, int num2){
            int sum = 0; 
        for ( int i = 1 ; i <= num2; i ++) {
            sum = sum + num1;
        }
        return sum;
    }
}