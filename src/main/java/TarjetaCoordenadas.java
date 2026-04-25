import java.io.*;

public class TarjetaCoordenadas {

    private static final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public ValorCoordenada getCoordenada(File archivoTarjeta, int fila, char columna) throws Exception {
        String valor = "";
        int indiceColumna = LETRAS.indexOf(columna);

        try (DataInputStream dis = new DataInputStream(new FileInputStream(archivoTarjeta))) {
            int numFilas = dis.readInt();
            int numColumnas = dis.readInt();
            for (int i=1; i<=numFilas; i++) {
                for (int j=0; j<numColumnas; j++) {
                    int valorLeido = dis.readInt();
                    if (i == fila && j == indiceColumna) {
                        valor = String.format("%03d", valorLeido);
                    }
                }
            }
        } catch (IOException ioe) {
            throw new Exception("Error de lectura.");
        }
        if (valor.isEmpty()) {
            throw new Exception("Coordenada no encontrada.");
        }
        return new ValorCoordenada(fila, columna, valor);
    }
}
