import java.util.Scanner;;

public class Ejercicio4 {
    

    public static void main(String[] args) {
        //creamos un objeto scanner que toma los valores de entrada por consola
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el día con un número del 1 al 7:");
        int diaNum = scan.nextInt();// escanea el siguiente entero que se ingresa
        scan.close(); //es necesario cerrar el scanner si no se utiliza mas.


        imprimirDía(diaNum);
    }

    public static void imprimirDía(int día){

        switch(día) {
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Lunes!!!!!");
                break;
            case 3:
                System.out.print("Martes!!!");
                break;
            case 4:
                System.out.println("Miercoles!!!!!");
                break;
            case 5:
                System.out.println("Juevesssssss!!");
                break;
            case 6:
                System.out.println("Viernes!!!!");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }

    }
}
