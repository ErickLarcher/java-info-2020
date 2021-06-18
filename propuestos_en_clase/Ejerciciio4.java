import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;
import java.io.BufferedWriter;


//ejercicio propuesto en clase 
public class Ejerciciio4 {
    

    private static String path = "empleados.txt"; //ruta donde se encuentre el archivo
    private static BufferedWriter escribir;

    public static void main(String[] args) {
        
        List<Employee> empleados = new LinkedList<Employee>();
        Employee empleado1 = new Employee(39939044, "Robert", 40.00f);
        Employee empleado2 = new Employee(32000555, "Noelia", 500.000f);
        Employee empleado3 = new Employee(44512355, "Root", 120.4444f);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);

        try {

            escribir =  new BufferedWriter(new FileWriter(path));

            for (Employee empleado: empleados) {
                escribir.write(empleado.toString());
                escribir.newLine();
            }
            escribir.close();
        }catch (FileNotFoundException e) { 
            System.out.println("Archivo no encontrado: " + e.getMessage());

        }catch (Exception e) { 
            System.out.println("Error!" + e.getMessage());
        }


    }
}

class Employee {

    private int id;
    private String nombre;
    private float salario;

    public Employee(int id, String nombre, float salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "DNI: " + id + " - Nombre: "+ nombre +"- Salario: "+ salario;

    }
}
