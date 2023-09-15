// ProcesadorContabilidad.java
import java.io.*;

public class ProcesadorContabilidad {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("No se proporcionó un nombre de archivo.");
            System.exit(1);
        }

        String filename = args[0];
        try {
            long suma = UtilidadesFichero.obtenerSumaDeArchivo(filename);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename + ".res"))) {
                bw.write(String.valueOf(suma));
            }
        } catch (IOException e) {
            System.err.println("Error procesando el archivo: " + filename);
            e.printStackTrace();
        }
    }
}
