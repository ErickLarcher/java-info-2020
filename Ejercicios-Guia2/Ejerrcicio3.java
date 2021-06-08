import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;




public class Ejerrcicio3 {

    /*Crear una lista que contenga como elementos la numeración de cartas
     de una baraja francesa (solo los valores, no figuras). Se deberá cargar el 
     ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar 
    (mezclar) el arrayList y volver a imprimir.*/

    public static void main(String[] args) {

        ArrayList<String> carts = new ArrayList<>();

        for(int i= 0 ; i < 13; i++){
            carts.add("cartas" + (i+1));

        }

        System.out.println("Se mostrará el orden natural");
        for (String cards : carts) {

            System.out.println(cards);
            
        }

        Collections.reverse(carts);
        System.out.println("Se mostrará el orden inverso");
        for (String cards : carts) {

            System.out.println(cards);

        }


        Collections.shuffle(carts);
        System.out.println("Orden mezclado");
        for (String cartas : carts) {
            System.out.println(cartas);

        }        


    }
    
}
