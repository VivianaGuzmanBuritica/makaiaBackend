import java.util.NoSuchElementException;

public class LinkedList {

    class Node {
        int value;
        Node next = null;
        Node(int value){
            this.value = value;
        }
    }

    protected Node head = null;
    protected Node tail = null;

    public void agregarValorAlInicio(int valor){
        Node nuevoNodo = new Node(valor);
        nuevoNodo.next = head;
        head = nuevoNodo;
        if(nuevoNodo.next == null) {
            tail = nuevoNodo;
        }
    }

    public void eliminarValorAlIncio(){
        Node siguiente = head.next;
        System.out.println("head inicial "+head);

        if(head == null){
            throw  new NoSuchElementException();
        }else{
            head = null;
            System.out.println(head);
            head = siguiente;
            System.out.println("head nuevo "+head);
        }
    }

    public void eliminarValorAlFinal(){

        Node anterior = tail;
        System.out.println("tail inicial "+tail);

        if(tail == null){
            throw  new NoSuchElementException();
        }else{

            tail = null;
            System.out.println(tail);
            tail = anterior;
            System.out.println("tail  nuevo "+tail);
        }
    }


    public void agregarFinal(int valor) {
        Node nuevoNodo = new Node(valor);
        if(tail == null){
            head = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            tail = nuevoNodo;
        }
    }

    public void agregarPorPosicion(int posicion, int valor){
        if(posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if(posicion == 0){
            agregarValorAlInicio(valor);
        } else{
            Node nuevoNodo = new Node(valor);
            Node actual = head;
            for (int i = 0; i < posicion-1; i++) {
                if(actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            if(actual.next == null){
                agregarFinal(valor);
            } else {
                nuevoNodo.next = actual.next;
                actual.next = nuevoNodo;
            }
        }

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
