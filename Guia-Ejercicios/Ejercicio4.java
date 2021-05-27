import java.util.Scanner;;

public class Ejercicio4 {
    

    public static void main(String[] args) {
        //creamos un objeto scanner que toma los valores de entrada por consola
        Scanner scan = new Scanner(System.in);

        int diaNum = scan.nextInt();// escanea el siguiente entero que se ingresa
        scan.close(); //es necesario cerrar el scanner si no se utiliza mas.


        if (diaNum == 1 ) {
            System.out.println("Domingo");
        }else if (diaNum == 2) {
            System.out.println("Lunes");
        }else if (diaNum == 3 ) {
        	System.out.println("Martes");
        	
        }else if (diaNum == 4) {
        	System.out.println("Miercoles");
        }else if (diaNum == 5) {
        	System.out.println("Jueves");
        }else if(diaNum == 6) {
        	System.out.println("Viernes");
        }else if(diaNum == 7) {
        	System.out.println("Sabado");
        }


    }
}
