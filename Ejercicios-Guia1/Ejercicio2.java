import java.util.Scanner;

public class Ejercicio2 {
    
    /*Programa que toma dos valores de la entrada y realiza operaciones
    aritmeticas devolviendo su resultado */

    private static String ejercicio2 = "Ejercicio 2";

    public static void main(String[] args){
        //Imprime por pantalla
        System.out.println(ejercicio2);    
        
        //Se instancia la clase Scanner
        Scanner scan = new Scanner(System.in);
        // Declaración de variables

        int a; 
        int b; 

       //invocación de la función 
       
        System.out.print("Ingrese un valor entero: ");
        a = scan.nextInt();
        System.out.print("Ingrese un segundo valor entero: ");
        b = scan.nextInt();  
        System.out.println(operacionesMath(a, b));
        scan.close();

    }   

    public static int operacionesMath(int c, int f ){
       System.out.println("Ingrese una opcion: \n1 -Suma\n2 -Resta\n3 -División\n4 -Multiplicación\n5 -Modulo");
       //declaración de variable a utilizar y del objeto Scanner
       Scanner n = new Scanner(System.in);
       int respuesta = n.nextInt();
       int total = 0;
        n.close();
        switch(respuesta) {
            case 1:
               total = c + f;
                break;
            case 2:
               total = c - f;
                break;
            case 3: 
                total = c / f;
                break;
            case 4:
                total = c * f;
                break;
            case 5:
                total = c % f;
                break;
        }
        System.out.print("El resultado es: ");
        return total;
    }


}
