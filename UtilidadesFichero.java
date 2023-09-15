// UtilidadesFicheros.java
import java.io.*;
import java.util.List;

public class UtilidadesFichero {

    public static long obtenerSumaDeArchivo(String filename) throws IOException {
        long total = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                total += Long.parseLong(line.trim());
            }
        }
        return total;
    }

    public static long obtenerSumaDeArchivos(List<String> archivos) throws IOException {
        long sumaTotal = 0;
        for (String archivo : archivos) {
            sumaTotal += obtenerSumaDeArchivo(archivo);
        }
        return sumaTotal;
    }
}

