import java.util.ArrayList;
import java.util.List;


public class Ejerrcicio5 {
    

    /*Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2)
     del resumen de carga de horas semanal de un empleado. Se debe generar otra lista que 
     contenga los totales y luego imprimir el total final a cobrar.*/

     public static void main(String[] args) {

        /*Ambas listas pueden ser cargadas de forma iterativa con un ciclo for o while o usando su 
        respectivo metodo "add" */

        List<Integer> horasT = new ArrayList<>() {{ add(8); add(8); add(6); add(4); add(6);}};

        List<Integer> valorPHora = new ArrayList<>() {{ add(200); add(457); add(154); add(364); add(333);}};

        List<Integer> salario = new ArrayList<>();
        int total = 0;


        for(int i = 0 ; i < horasT.size(); i++){
            salario.add((horasT.get(i) * valorPHora.get(i)));
            total += salario.get(i);

        }

        System.out.println("Salario por semana: " + salario);
        System.out.print("Total del salario: "+ total);
        


     }
}
