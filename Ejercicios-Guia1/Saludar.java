import java.util.Scanner;

public class Saludar {

    /*programa que toma por consola el nombre de la persona 
    y devuelve un saludo 
    */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String nombre;
        System.out.println("Ingrese su nombre: ");

        nombre = scan.nextLine();

        System.out.println("Hola " + nombre + "!");

        scan.close();
        // definicion de clase scanner
    }
}