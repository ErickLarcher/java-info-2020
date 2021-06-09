import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


;public class Ejerrcicio4 {
    
    /*Cargar un arrayList con 12 nombres de estudiantes (String),
     luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
    */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> alumnos = new ArrayList<>();

        for(int i = 0 ; i < 12 ;  i++){
            System.out.print("Ingrese el nombre del alumno: ");
            alumnos.add(scan.nextLine());


        }

        scan.close();

        List<String> primerCurso = alumnos.subList(0, 4);
        List<String> segundoCurso = alumnos.subList(4, 8);
        List<String> tercerCurso =  alumnos.subList(8, alumnos.size());


        System.out.println("Alumnos del primer curso: ");
        for(String estudiante : primerCurso){
            System.out.println(estudiante);

        }

        System.out.println("Alumnos del segundo curso: ");
        for(String estudiante : segundoCurso){
            System.out.println(estudiante);
        }

        System.out.println("Alumnos del tercer curso: ");
        for(String estudiante : tercerCurso){
            System.out.println(estudiante);

        }
    }
}
