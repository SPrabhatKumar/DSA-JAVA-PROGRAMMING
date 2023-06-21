/**
 * StackArrayImplementation
 */
public class StackArrayImplementation {

    private int[] arr;
    protected static final int DEFAULT_VALUE=10;
    int ptr=-1;
    public StackArrayImplementation(){
        this(DEFAULT_VALUE);
    }
    public StackArrayImplementation(int size){
        this.arr=new int[size];
    }
    public boolean isFull(){
        return ptr==arr.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public boolean addElement(int ele){
        if(isFull()){
            System.out.println("Stack is full !");
            return false;
        }
        arr[++ptr]=ele;
        return true;

    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty ! Pop Operation Cannot be Performed");    
        }
        return arr[ptr--];

    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot Peek From a Empty Stack!");
        }
        return arr[ptr];
    }
    public static void main(String[] args) throws Exception {
        StackArrayImplementation s=new StackArrayImplementation(20);
        System.out.println(s.isEmpty());
        s.addElement(10);
        s.addElement(20);
        s.addElement(30);
        s.addElement(40);
        s.addElement(50);
        // System.out.println(s.peek());
        // System.out.println(s.peek());
        // System.out.println(s.peek());
        // System.out.println(s.peek());
        // System.out.println(s.peek());
        // System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}