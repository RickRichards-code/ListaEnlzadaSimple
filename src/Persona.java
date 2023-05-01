import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    public void leer(){
        System.out.println("---- ingrese los dadtos ----");
        Scanner sc = new Scanner(System.in);
        System.out.print("nombre: ");nombre = sc.next();
        System.out.print("edad: ");edad=sc.nextInt();
    }
    public void mostrar(){
        System.out.println("nombre: "+nombre+", edad: "+edad);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
