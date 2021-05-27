import java.util.Scanner;

public class Ejercicio6 {   
    

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nro;
        
        while(continuar == 1 ) {
            System.out.println("Ingrese un numero");
            nro  = scan.nextInt(); //toma el siguiente numero entero que ingresa
            System.out.println("El número ingresado es: " + nro);

            System.out.println("Si desea continuar con la operación ingrese 1, Si desea salir presione cualquier otro numero");
            continuar = scan.nextInt();
        }

        scan.close(); //cerramos el scanner
    }
}
