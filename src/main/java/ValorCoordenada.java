public class ValorCoordenada {
    public static final int TAM_VALOR = 3 ; //Contiene el número de dígitos almacenados en la propiedad valor.
    private int fila;
    private char columna;
    private String valor;

    public ValorCoordenada(int fila, char columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }

    public int getFila() {
        return fila;
    }

    public char getColumna() {
        return columna;
    }

    public String getValor() {
        return valor;
    }
}
