import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Suma2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Elige el fichero deseado: ");
        Scanner teclado=new Scanner(System.in);
        String entrada=teclado.nextLine();
        FileReader archivo=new FileReader("/home/administrador/Escritorio/Lector/"+entrada);
        try {
            BufferedReader br= new BufferedReader(archivo);
            String linea = br.readLine();
            String linea1= br.readLine();
            String linea2=br.readLine();
            int suma= Integer.parseInt(linea)+Integer.parseInt(linea1)+Integer.parseInt(linea2);
            System.out.println(linea+"+"+linea1+"+"+linea2 + "="+suma);

        }catch (Exception e){

        }
    }
}
