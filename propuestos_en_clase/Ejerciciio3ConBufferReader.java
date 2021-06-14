import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Ejerciciio3ConBufferReader {
    

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\larch\\Documents\\java-info-2020\\propuestos_en_clase\\alumnos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { 

            String line = br.readLine();
            StringBuilder sb = new StringBuilder();


            while(line != null) {

                sb.append(line).append("\n");
                line = br.readLine();


            }
            String fileAsString = sb.toString();
            System.out.println(fileAsString);
        }
    }
}
