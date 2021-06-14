
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ejerciccio3 {
    
    public static void main(String[] args) {
        int i = 1 ;

        try{
            File fil = new File("C:\\Users\\larch\\Documents\\java-info-2020\\propuestos_en_clase\\alumnos.txt");
            Scanner scan = new Scanner(fil);

            while (scan.hasNextLine()) {

                System.out.print("Alumno #" +i + ":");
                String line = scan.nextLine();
                System.out.println(line);
                i += 1;

                
            }
            scan.close();
        }catch(FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        }
    }
}
