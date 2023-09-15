// Lanzador.java
import java.io.*;
import java.util.List;

public class Lanzador {

    public void lanzarProcesos(List<String> archivos) throws IOException, InterruptedException {
        for (String archivo : archivos) {
            ProcessBuilder pb = new ProcessBuilder(
                "java",
                "-cp",
                System.getProperty("java.class.path"),
                "ProcesadorContabilidad",
                archivo
            );
            Process p = pb.start();
            p.waitFor();
        }
    }

    public void guardarSumaTotal(List<String> archivosRes) throws IOException {
        long sumaTotal = UtilidadesFichero.obtenerSumaDeArchivos(archivosRes);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Resultado_global.txt"))) {
            bw.write(String.valueOf(sumaTotal));
        }
    }
}
