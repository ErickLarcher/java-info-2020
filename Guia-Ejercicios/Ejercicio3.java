import java.util.Scanner;

public class Ejercicio3 {
    
    /*Programa que verifica la nota de un alumno y devuelve por pantalla su estado */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int nota = 0;
        int continuar = 1;

        
        while ( continuar == 1){ 
            System.out.print("Ingrese la nota del alumno: ");
            nota = scan.nextInt();
            imprimePorPantalla(nota);

            System.out.println("Si quiere continuar las operaciones, digite 1, caso contrario, ingrese cualquier otro  número ");
            continuar = scan.nextInt();
           
        }

        scan.close();
    }

    public static void imprimePorPantalla(int not){

            if(not > 92) {
                System.out.println("Excelente!!!");
            } else if (not > 84) {
                System.out.println("Sobresaliente!!!");
            }else if (not > 74){
                System.out.println("Distinguido!!!!!!!!!");

            }else if(not > 59) {
                System.out.println("Bueno");
            }else {
                System.out.println("Desaprobado:C");
            } 
    }
}
