import java.util.Queue;
import java.util.Stack;


public class HtmlValidator {

    public static Stack<HtmlTag> isValidHtml(Queue<HtmlTag> tags) {

        Stack<HtmlTag> stack = new Stack<>();

		System.out.println("####################################################");

        while (!tags.isEmpty()) {
            System.out.println("____________________________________________");
            System.out.println("test: " + tags);
            System.out.println("test en el indice " + tags.size());
            System.out.println("head " + tags.peek());

            if (tags.peek().isOpenTag()) {
                System.out.println((stack.push(tags.poll())));
                System.out.println(" push pila isOpenTag: " + stack);
            } else {
                if (tags.peek().isSelfClosing()) {
                    System.out.println(tags.poll());
                    System.out.println(" push pila isSelfClosing: " + stack);
                } else {
                    if (stack.empty()) {
                        System.out.println(" ************** pila empty: " + stack);
                        return null;
                    } else {
                        if (tags.peek().matches(stack.peek())) {
                            stack.pop();
                            tags.poll();
                            System.out.println(" ************** POP pila matches: " + stack);
                        } else {
                            System.out.println(" ************** POP pila no matches: " + stack);
                            return stack;
                        }
                    }
                }
            }

            System.out.println("pila" + stack);

        }
        return stack; // this line is here only so this code will compile if you don't modify it
    }
}
