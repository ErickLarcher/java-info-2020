import java.util.ArrayList;
import java.util.Scanner; 

public class Ejercicio1 {
    
    
    /*Crear un ArrayList y cargarlo con tus ciudades favoritas de 
    Argentina, luego imprimir por pantalla el ranking
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<>();
        int continuar = 1;
        boolean cont = true;
        do {
            System.out.print("Si quiere agregar una ciudad ingrese s/n: ");

            switch(scan.nextLine().charAt(0)){

                case 's': 

                    System.out.print("Ingrese el nombre de la ciudad: ");
                    ciudades.add(scan.nextLine());
                    break;

                case 'n':
                    cont = false;
                    
                    break;

                default:
                    System.out.println("La opción registrada no es válida");
                    break;

            }

        }while(cont);

        scan.close();

        System.out.println("Las ciudades favoritas que agrego son: ");
        for(int i = 0; i < ciudades.size(); i++){
            System.out.println("#" + (i+1) + " - " + ciudades.get(i));
        }
        
    }
}
