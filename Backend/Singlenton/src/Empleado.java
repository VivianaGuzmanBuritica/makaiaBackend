public class Empleado {
    private ImpresoraSingleton impresoraSingleton;
    private int contador;

    private String texto;

    public Empleado(ImpresoraSingleton impresoraSingleton, String texto) {
        this.impresoraSingleton = impresoraSingleton;
        this.texto = texto;

    }

    public int imprimir(){
       return  ++contador;
    }
}
