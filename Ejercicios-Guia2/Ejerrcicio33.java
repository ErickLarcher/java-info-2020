import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


class Ejerrcicio33 {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> entrada = new ArrayList<>();
        
        for(int i = 0; i < 4; i++){
            System.out.println("Ingrese el string: ");
            entrada.add(scan.nextLine());
        }

        scan.close();
       
        
        Collections.reverse(entrada);
        for(String inputt : entrada){
            System.out.println(inputt);
            
        }
        
    }
}
