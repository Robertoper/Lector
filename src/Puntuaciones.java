import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Puntuaciones {
    public static void main(String[] args) throws IOException {
        String nombre;
        int puntuación;
        FileWriter fichero= new FileWriter("/home/administrador/Escritorio/Lector/puntuaciones.txt");
        PrintWriter escritor =new PrintWriter(fichero);
        Scanner teclado=new Scanner(System.in);

        System.out.println("Por favor, introduce tu nombre: ");
        nombre=teclado.next();
        System.out.println("Por favor, introduce tu puntuación: ");
        puntuación=teclado.nextInt();

        escritor.println(nombre+"="+puntuación);
        escritor.close();
        System.out.println("La información se ha guardado en puntuaciones.txt");
    }
}
