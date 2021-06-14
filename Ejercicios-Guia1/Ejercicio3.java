import java.util.Scanner;

public class Ejercicio3 {
    
    /* Programa  que dado un número entero como dato de entrada imprima la secuencia de números */
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);

  
        //pide las entradas 
        System.out.println("Ingrese un numero entero: ");
        int num = n.nextInt(); 
        n.close();

        System.out.println(num / 10000);
        System.out.println(num / 1000);
        System.out.println(num / 100);
        System.out.println(num / 10);

    }

}
