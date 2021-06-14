import java.util.HashMap;
import java.util.HashSet;


public class Ejerrcicio6 {


    public static void main(String[] args) {

        HashSet<Empleado> empleadosHashSet = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();

        empleadosHashSet.add(new Empleado("Ramon", 39939044, 5, 4532678));
        empleadosHashSet.add(new Empleado("Silvia", 44392444, 6, 6675489));
        empleadosHashSet.add(new Empleado("Juan", 23392444, 2, 6222489));



        for (Empleado em : empleadosHashSet) {
            salario.put(em.getDni(), em.getSalario());
        }

        salario.forEach((dni, salarios) -> System.out.println("DNI: " + dni + "- Sueldo: " + salarios));
       
    }



    public static class Empleado {
        String nombre; 
        int dni;
        float horasT;
        float valorXhora;
    
    
        public Empleado(String nombre, int dni, float horasT, float valorXhora){
    
            this.nombre = nombre;
            this.dni = dni;
            this.horasT = horasT;
            this.valorXhora = valorXhora;
    
        }
    
        public int getDni(){
            return dni;
    
        }
    
        public float getSalario(){
            return this.horasT * this.valorXhora;
        }
    }
    
}
