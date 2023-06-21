/**
 * circularQueue
 */
public class circularQueue {

    public int []data;
    public static final int Default_value=5;
    public int front=-1;
    public int rear=-1;
    public int size;
    circularQueue(){
        this.size=Default_value;
        this.data=new int[Default_value];
    }
    circularQueue(int size){
        this.size=size;
        this.data=new int[size];
    }
    public boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public boolean isFull(){
        return (rear+1)%size==front;
    }
    public void addElement(int val){
        if(isFull()){
            System.out.println("Circular Queue is Full !");
            return;
        }
        // First Element Adding 
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        data[rear]=val;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Circular Queue is Empty !");
            return rear;
        }
        
        if(front==rear){
            front=rear=-1;
            return rear;
        }
        int val=data[front];
        front=(front+1)%size;
        return val;
    }
    public int peek(){
        if(isEmpty()){
            return rear;
        }
        return data[front];
    }
    public static void main(String[] args) {
        circularQueue cq=new circularQueue(5);
        cq.addElement(1);
        cq.addElement(2);
        cq.addElement(3);
        cq.addElement(4);
        cq.addElement(5);
        cq.addElement(6);
        cq.remove();
        cq.remove();
        cq.addElement(7);
        cq.addElement(8);
        // cq.addElement(7);
        // System.out.println(cq.remove());
        while(!cq.isEmpty()){
            System.out.println(cq.peek());
            cq.remove();
        }
        
    }
}