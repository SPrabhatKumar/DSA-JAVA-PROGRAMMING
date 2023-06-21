import java.util.Stack;

public class StackInBuild {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        // Push and Pop Return what element you push or pop
        System.out.println(s.push(7));
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        
    }
}
