import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Suma {
    public static void main(String[] args) throws IOException {
        FileReader archivo=new FileReader("/home/administrador/Escritorio/Lector/3numeros.txt");
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
