import java.util.*;



public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
            int a;
            int b;
            int c;
            int seguir = 1;

            while(seguir == 1) { 
                System.out.println("Ingrese un numero: ");
                a = scan.nextInt();
                System.out.println("El primer nro ingresado es: " + a);
                
                System.out.println("Ingrese el segundo numero:");
                b = scan.nextInt();
                System.out.println("El segundo nro ingresado es: " + b);


                System.out.println("Ingrese el tercer numero: ");
                c = scan.nextInt();
                System.out.println("El tercer nro ingresado es: " + c);
            }
=======
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println("El primer nro ingresado es: " + a);
            System.out.println("El segundo nro ingresado es: " + b);
            System.out.println("El tercer nro ingresado es: " + c);
            
>>>>>>> 5760fc22ba332b60deaf906dc6f2c923bb59dc50
            scan.close();
            
    }
}
