import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args){

        //Creamos el objeto scanner para que nos tome un valor por consola.

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        int resultado = 0;
        for(int i = 1; i <= 10; i++){

            resultado = num * i ;
            System.out.println("El numero es: " + resultado);
            
        }
    }
}
