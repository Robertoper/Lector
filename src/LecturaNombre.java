import java.io.*;

public class LecturaNombre {
    public static void main(String[] args) throws IOException {
        FileReader archivo=new FileReader("/home/administrador/Escritorio/Lector/Nombre.txt");
        try{
            BufferedReader br = new BufferedReader(archivo);
            String linea = br.readLine();
            System.out.println("Gracias a mis poderes magicos he adivinado tu nombre y es " + linea);
        }catch (IOException e){

        }
    }
}
