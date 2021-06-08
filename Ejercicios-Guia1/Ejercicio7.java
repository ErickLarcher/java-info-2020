import java.util.Scanner;


public class Ejercicio7 {
    

    /*Realizar un Programa que dado un String de entrada en minúsculas lo convierta
     por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().*/
     public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String txt;
        System.out.print("Ingrese el texto: ");
        txt = scan.nextLine();
        String txtnuevo = "";
        scan.close();

        for(int i = 0; i < txt.length(); i++){

            if((txt.charAt(i)) >= 97 && (txt.charAt(i)) <= 122){

                char var = (char) ((txt.charAt(i))-32);
                txtnuevo += var;


            }else if((txt.charAt(i))== " "){

                txtnuevo += "";

            }

        }   
        System.out.println(txtnuevo);

     }
}
