import java.util.Scanner;


public class Ejercicio3Modf {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Ingrese la nota del alumno: ");
        nota = scan.nextInt();


        switch(nota){
            case 93:
                System.out.println("Excelente!");
                break;
            case 83:
                System.out.println("Sobresaliente!!");
                break;
            case 75:
                System.out.println("Distinguido!!");
                break;
            case 60:
                System.out.println("Bueno!");
                break;

        }

        scan.close();

    }  

}
