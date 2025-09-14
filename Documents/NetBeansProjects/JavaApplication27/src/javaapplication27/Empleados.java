package javaapplication27;

public class Empleados {

    public static void main(String[] args) {
        
        System.out.println("--- Instanciando empleados ---");
        Empleado empleado1 = new Empleado(1, "Ana Garcia", "Desarrolladora", 250000.0);
        Empleado empleado2 = new Empleado("Juan Perez", "Gerente de Proyectos");
        Empleado empleado3 = new Empleado("Maria Lopez", "Analista de Datos");
        Empleado empleado4 = new Empleado(4, "Carlos Rodriguez", "Técnico de Soporte", 180000.0);

        
        System.out.println("\n--- Información inicial de los empleados ---");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());

        
        System.out.println("\n--- Aplicando aumentos salariales ---");
        empleado1.actualizarSalario(15); 
        System.out.println("Salario de Ana después de un aumento del 15%: " + empleado1.getSalario());

        empleado2.actualizarSalario(50000); 
        System.out.println("Salario de Juan después de un aumento fijo de $50000: " + empleado2.getSalario());

      
        System.out.println("\n--- Información actualizada de los empleados ---");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());

       
        System.out.println("\n--- Contador global de empleados ---");
        System.out.println("Total de empleados creados hasta el momento: " + Empleado.mostrarTotalEmpleados());
    }
}


class Empleado {
   
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    
    private static int totalEmpleados = 0;

    
    public Empleado(int id, String nombre, String puesto, double salario) {
        
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        
        totalEmpleados++;
    }

    
    public Empleado(String nombre, String puesto) {
        
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 150000.0;
    }

    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100);
    }

    
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

   
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    
    @Override
    public String toString() {
        return "Empleado{" +
               "id=" + this.id +
               ", nombre='" + this.nombre + '\'' +
               ", puesto='" + this.puesto + '\'' +
               ", salario=" + this.salario +
               '}';
    }
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}