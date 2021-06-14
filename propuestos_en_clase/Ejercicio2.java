import java.util.ResourceBundle;

public class Ejercicio2 {
    
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial(int a){
        int resultado = a;

        if (resultado != 1) {
            resultado = resultado * factorial(a - 1);
        }

        return resultado;
    }
}
