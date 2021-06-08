import java.util.Scanner;

import java.util.Scanner;


public class Ejercicio8 {
    
    /*Crear una aplicación que solicite de entrada los datos de una persona en este orden:
    Nombre y Apellido
    Edad
    Dirección
    Ciudad
    Luego imprimirá el siguiente mensaje:
    {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese su nombre y apellido: ");
        String nombreYApellido = scan.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();
        System.out.println("Ingrese su dirección: ");
        String direccion = scan.nextLine();
        System.out.print("Ingrese su ciudad: ");
        String ciudad = scan.nextLine();

        scan.close();

        Persona person = new Persona(nombreYApellido, edad, direccion, ciudad);

        System.out.println(person);

    }

   
    class Persona{
        String nombreYApell;
        int edad;
        String ciudad;
        String direccion;

        public Persona(String nombreYApellido, int edad, String direccion, String ciudad){

            this.nombreYApell = nombreYApellido;
            this.edad = edad;
            this.direccion = direccion;
            this.ciudad = ciudad;
        

        }

        @Override
        public String toString(){
            return "{" + this.ciudad +"} - {" + direccion + "} - {"+ edad +"} - {" + nombreYApell +"}";

        }
    }
}
