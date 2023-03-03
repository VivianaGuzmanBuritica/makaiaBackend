import java.util.Stack;

public class Pilas { //la cadena "[{()}]" " {[}]()"
    public boolean estaBalanceado(String cadena) {
        Stack<Character> stack = new Stack<>();
        // recorre la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            // comprueba que sea de apertura
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
                // comprueba  que sea de cierre
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.empty()) {
                    return false;
                }
                //  comprueba que la de inicio y cierre conincidad
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    //saca de la pila si esta bien
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Pilas pila = new Pilas();
        //String cadena1 = "[{()}]";
        String cadena1 = " {[}]()";

        boolean estaValenceado = pila.estaBalanceado(cadena1);
        if (estaValenceado) {
            System.out.println("la cadena esta " + cadena1 + " valenceada");
        } else {
            System.out.println("la cadena NO esta " + cadena1 + " valenceada");
        }
    }
}
