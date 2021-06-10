import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class LecturaWeb {
    public static void main(String[] args) throws IOException {
        URL molamazo= new URL("http://www.cristiangarcia.org/cristian.txt");
        Scanner webLectura=new Scanner(molamazo.openStream());

        String linea=webLectura.nextLine();
        webLectura.close();
        System.out.println(linea);

    }
}
