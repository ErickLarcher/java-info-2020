import java.util.ArrayList;
import java.util.List;


public class Ejerrcicio2 {
    
    /*Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista 
    y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de 
    agregar a en la primera y última posición).
    */

    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(3);
        nums.add(0);
        nums.add(2222);
        nums.add(500);

        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }

        System.out.println("Tamaño de la lista: " + nums.size());

        //se agregará un numero al principio y al final de la lista

        nums.add(0, 222222);
        nums.add(3773733);

        //mostrando nueva lista

        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));

        }

        System.out.print("El tamaño actual de la lista es: "+nums.size());
    }
}
