
/* Una clase abstracta es aquella que no se instancia, pero se usa para 
heredarla a los hijos. 
Para hacer la clase abstracta, se pone detras de class --> abstract*/

public abstract class  Empleado {
    private int dni ;
    private String nombre;
    private String apellido;
    
    public Empleado(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
     
    public abstract int calcularSueldo();
    //getters y setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return String.valueOf(this.dni) +
            " - " + this.nombre +
            " - " + this.apellido;
    }
    
}