package caso2;
import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad);
    }
}

public class EstudianteInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese edad del estudiante: ");
        int edad = sc.nextInt();

        Estudiante est = new Estudiante(nombre, edad);
        est.mostrarInfo();
        sc.close();
    }
}