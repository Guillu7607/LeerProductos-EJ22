import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerProductos {

    public static void main(String[] args) {

        String archivo = "productos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(",");

                String nombre = partes[0];
                double precio = Double.parseDouble(partes[1]);

                System.out.println("Producto: " + nombre + " | Precio: " + precio);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
