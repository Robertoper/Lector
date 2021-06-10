import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class sobre {
    public static void main(String[] args) throws IOException {
        FileWriter fichero= new FileWriter("/home/administrador/Escritorio/Lector/sobre.txt");
        PrintWriter escritor= new PrintWriter(fichero);

        escritor.println("");
        escritor.println("|--------------------------------|");
        escritor.println("|                                |");
        escritor.println("|              Para Santa Claus  |");
        escritor.println("|              Polo Norte        |");
        escritor.println("|              Planeta Tierra    |");
        escritor.println("|              Galaxia Via Lactia|");
        escritor.println("|--------------------------------|");


        escritor.close();
    }
}
