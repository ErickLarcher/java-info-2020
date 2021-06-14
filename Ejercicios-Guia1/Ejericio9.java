import java.util.Scanner;


public class Ejericio9 {

        /*Dado un String de entrada (frase, texto, etc) calcular 
        la cantidad de veces que aparece una letra dada.
        */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el texto: ");
        String txt = scan.nextLine();

        System.out.print("Ingrese la letra que desea buscar: ");
        char carct = scan.nextLine().charAt(0);

        scan.close();
        
        System.out.println("La cantidad de ocurrencias de la letra que especifico es de: " + lectura(txt, carct) );


    }

    public static int lectura(String texto, char car) {
        int cant = 0;
        
        for(int i = 0; i < texto.length(); i++){

            if(texto.charAt(i) == car){

                cant += 1;

            }

        }

        
        return cant;
    }
}
