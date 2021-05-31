import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
        int nota;
        int continuar = 1;

        while(continuar == 1){   
                
                System.out.println("Ingrese la nota: ");
                nota = scan.nextInt();

                if(nota > 92) {
                    System.out.println("Excelente!!!");
                } else if (nota > 84) {
                    System.out.println("Sobresaliente!!!");
                }else if (nota > 74){
                    System.out.println("Distinguido!!!!!!!!!");

                }else if(nota > 59) {
                    System.out.println("Bueno");
                }else {
                    System.out.println("Desaprobado:C");
                }
            System.out.println("Si quiere continuar las operaciones, digite 1, caso contrario, ingrese cualquier otro  numero.");

        } 
                scan.close();
=======
        int nota = scan.nextInt();
        scan.close();


        if(nota > 92) {
            System.out.println("Excelente!!!");
        } else if (nota > 84) {
            System.out.println("Sobresaliente!!!");
        }else if (nota > 74){
            System.out.println("Distinguido!!!!!!!!!");

        }else if(nota > 59) {
            System.out.println("Bueno");
        }else {
            System.out.println("Desaprobado:C");
        }
>>>>>>> 5760fc22ba332b60deaf906dc6f2c923bb59dc50
    }
    
}
