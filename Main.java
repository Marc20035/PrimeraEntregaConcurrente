// Main.java
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Lanzador lanzador = new Lanzador();

        List<String> archivos = Arrays.asList("informatica.txt", "gerencia.txt", "contabilidad.txt");
        lanzador.lanzarProcesos(archivos);

        List<String> archivosRes = Arrays.asList("informatica.txt.res", "gerencia.txt.res", "contabilidad.txt.res");
        lanzador.guardarSumaTotal(archivosRes);
    }
}
