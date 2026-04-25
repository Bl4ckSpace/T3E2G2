import java.io.File;

public class Principal {
    public static void main(String[] args) {
        TarjetaCoordenadas tarjetaCoordenadas = new TarjetaCoordenadas();
        try {
            tarjetaCoordenadas.getCoordenada(new File("archivoTarjeta.bin"), 3, 'C');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
