import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejerciciio7 {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese un valor entero: ");
        int n1 = scan.nextInt();

        System.out.print("Ingrese otro valor entero, este debe ser mayor al primero: ");
        int n2 = scan.nextInt();

        scan.close();

        fizzBuzz(n1, n2);


    }

     static Object[] fizzBuzz(int a, int b) {

        List<String> numeros = new ArrayList<>();

        for (int i = a; i < b; i++) { 

            if (i % 2 == 0 &&  i % 3 == 0 ) {

                numeros.add("FIzzBuzz");
            }else if ( i % 2 == 0) {
                numeros.add("Fizz");
            } else if (i % 3 == 0) {
                numeros.add("Buzz");
            }else {
                numeros.add(Integer.toString(i));
            }
        } 
        System.out.println(numeros);
        return numeros.toArray();

    }
}
