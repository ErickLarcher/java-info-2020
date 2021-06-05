public class ServicioSueldo {
    
    public static void main(String[] args) {
        Empleado emp1 = new EmpleadoEfectivo(1243, "Homero", "Simpson", 50000, 3);
        Empleado emp2 = new EmpleadoJornada(2345, "Robert", "Nelson", 400, 600);
        System.out.println(emp1.calcularSueldo());
        System.out.println(emp2.calcularSueldo());
    }
}
