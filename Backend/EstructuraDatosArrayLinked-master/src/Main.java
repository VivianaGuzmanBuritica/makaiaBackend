public class Main {
    public static void main(String[] args) {
        LinkedList linkedList =  new LinkedList();
        linkedList.agregarValorAlInicio(61);
        linkedList.agregarFinal(30);
        linkedList.agregarPorPosicion(1, 14);
        linkedList.agregarPorPosicion(2, 18);
        linkedList.eliminarValorAlIncio();
        linkedList.eliminarValorAlFinal();
        //linkedList.agregarPorPosicion(100, 18);
        //[61]->[30]
        //head   tail

        //[61]->[14]->[30]
        //head   tail

    }
}