import java.util.Scanner;
public class ArrayObjetos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Persona[] persona = new Persona[3];

        for(int i = 0; i < persona.length; i++){

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            Persona tipo = new Persona(nombre, edad);
            persona[i] = tipo;
        }
        for(int i = 0; i < persona.length; i++){
            System.out.println("Nombre: " + persona[i].getNombre());
            System.out.println("Edad: " + persona[i].getEdad());
            System.out.println();
        }
    }
}
