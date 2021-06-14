import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;




public class Ejerciciio5 {
    
    public static void main(String[] args) {

        List<Empleado> listaEmpleados = new ArrayList<>();
        System.out.println("*********");
        empleadoNuevo(listaEmpleados);
        String letra = "s".toUpperCase();
        System.out.println("Apellido que comienza con : " + letra);
        empiezaConLetra(listaEmpleados, letra);
        System.out.println("*********");
        System.out.println("El más viejo es: " + getAntiguo(listaEmpleados));
        System.out.println("El más joven es: "+ getMasJoven(listaEmpleados));
        System.out.println("El que más gana es: "+ getMayorSalario(listaEmpleados));
        System.out.println("El que menos gana es: " + getMenorsalario(listaEmpleados));
        System.out.println("Por orden alfabetico");
        System.out.println(getOrden(listaEmpleados));


    }

    static class Empleado {
        private String nombre; 
        private String apellido;
        private LocalDate fechaDeNacimiento;
        private BigDecimal salario;

        public Empleado(String nombre, String apellido, String fechaDeNacimiento, String salario) {
             
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaDeNacimiento = toFecha(fechaDeNacimiento);
            this.salario = new BigDecimal(salario);

        }

        private LocalDate toFecha(String fechaDeNacimiento) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fecha = LocalDate.parse(fechaDeNacimiento, formato);
            return fecha;

        }

        private int edad () {
            int resultado = (int) ChronoUnit.DAYS.between(this.fechaDeNacimiento, LocalDate.now());
            return resultado/365;

        }

        @Override
        public String toString() {
            return this.nombre + " " + this.apellido + " " + ": $" + this.salario;

        }

    
    }  
    
    
    static void empleadoNuevo (List<Empleado> listaEmpleados ) {

        String archivo = "Ejerciciio5.txt";

        try (Stream<String> stream = Files.lines(Paths.get(archivo))) {

            stream.forEach( (e) -> {
                String[] lista = e.split(",");
                String nombre = lista[0];
                String apellido = lista[1];
                String fechaDeNacimiento = lista[2];
                String salario = lista[3];

                Empleado empleado = new Empleado(nombre, apellido, fechaDeNacimiento, salario);
                listaEmpleados.add(empleado);

            });

        } catch (Exception e ) {
            System.out.println("Error!" e.getMessage());

        }

    }

    static void empiezaConLetra(List<Empleado> listaEmpleados, String letra) {
        
        listaEmpleados.forEach( (e) -> {
            if (e.apellido.startsWith(letra)){
                System.out.println(e);
            }
        });

    }


    static Empleado getAntiguo(List<Empleado> listaEmpleados) {

        if (listaEmpleados.size() != 0) {
            int comp = 0;
            
            for (int i = 0; i < listaEmpleados.size(); i++) {
                
                if (comp < listaEmpleados.get(i).edad() ) {

                    comp = listaEmpleados.get(i).edad();

                }
            }    
            for (int i = 0 ; i < listaEmpleados.size(); i++) {
                if (listaEmpleados.get(i).edad() == comp) {
                    System.out.println(listaEmpleados.get(i).edad());
                    return listaEmpleados.get(i);
                }

            }

        } else {
            System.out.println("Archivo incorrecto");
        }
        return null;
        

    }


    static Empleado getMasJoven(List<Empleado> listaEmpleados) {

        if(listaEmpleados.size() != 0) {
            int comp = listaEmpleados.get(o).edad();
            for (int i = 0 ; i < listaEmpleados.size(); i++) {
                
                if (comp > listaEmpleados.get(i).edad()) {
                    comp = listaEmpleados.get(i).edad();

                } 
            }

            for (int i = 0 ; i < listaEmpleados.size(); i++) {

                if (listaEmpleados.get(i).edad() == comp) {
                    return listaEmpleados.get(i);
                }
            }

        }else {
            System.out.println("Error en archivo, está vacío");
        }

        return null;
    }


    static Empleado getMayorSalario(List<Empleado> listaEmpleados)  {
        if(listaEmpleados.size() != 0) {
            BigDecimal comp = listaEmpleados.get(0).edad();
            for(int i = 0; i < listaEmpleados.size(); i++ ) {

                if(comp.compareTo(listaEmpleados.get(i).salario) == -1) {
                    comp = listaEmpleados.get(i).salario;

                }

            }

            for(int i = 0; i < listaEmpleados.size(); i++) {
                if (listaEmpleados.get(i).salario == comp) {
                    return listaEmpleados.get(i);
                }

            }
        }else {
            System.out.println("Archivo vacio");
        }
    }

    static Empleado getMenorsalario(List<Empleado> listaEmpleados) {
        if (listaEmpleados.size() != 0) {
            BigDecimal comp = listaEmpleados.get(0).salario;
            for (int i = 0; i < listaEmpleados.size(); i++) {
                if (comp.compareTo(listaEmpleados.get(i).salario) == 1 ) {
                    comp = listaEmpleados.get(i).salario;
                }
            }
            for (int i = 0; i < listaEmpleados.size(); i++) {
                if (listaEmpleados.get(i).salario == comp) {
                    return listaEmpleados.get(i);
                }
            }
        }
        else {
            System.out.println("Archivo vacío.!!");
        }
        return null;
    }

    static List<Empleado> getOrden(List<Empleado> listaEmpleados) {
        // Collections.sort(lista);
        listaEmpleados.sort((o1, o2) -> o1.nombre.compareTo(o2.nombre));
        return listaEmpleados;
    }

}
