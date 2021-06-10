import java.io.*;
import java.nio.CharBuffer;

public class MensajeCifrado {
    public static void main(String[] args) throws IOException {
        FileReader archivo=new FileReader("/home/administrador/Escritorio/Lector/Mensajecifrado");

        for (int i=0;i<=47;i++){
            try {
                int caract;
                archivo = new FileReader("nombre_fichero.txt");
                caract = archivo.read();
                while(caract != -1) {
                    caract = archivo.read();
                    System.out.println(caract);
                }
            }catch (Exception e){

            }
        }

    }

}
