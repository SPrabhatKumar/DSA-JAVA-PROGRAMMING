/**
 * QueueUsingStacks
 */
import java.util.Stack;
public class QueueUsingStacks {

    private Stack <Integer> first;
    private Stack <Integer> second;
    public QueueUsingStacks(){
        first=new Stack<>();
        second=new Stack<>();
    }
    public boolean isEmpty(){
        return first.empty();
    }
    public void addElement(int ele){
        first.add(ele);
    }
    public int remove(){
        while (!first.empty()) {
            second.push(first.pop());
        }
        int val=second.pop();
        while(!second.empty()){
            first.push(second.pop());
        }
        return val;

    }
    public int peek(){
        if(first.empty()){
            return -1;
        }
        while(!first.empty()){
            second.push(first.pop());
        }
        int peekval=second.peek();
        while(!second.empty()){
            first.push(second.pop());
        }
        return peekval;
    }
    public static void main(String[] args) {
        QueueUsingStacks q=new QueueUsingStacks();
        q.addElement(1);
        q.addElement(2);
        q.addElement(3);
        q.addElement(4);
        q.addElement(5);
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
    
}