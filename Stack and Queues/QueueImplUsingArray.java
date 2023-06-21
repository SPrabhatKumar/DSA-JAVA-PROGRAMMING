 

/**
 * QueueImplUsingArray
 */
public class QueueImplUsingArray {

    static class queue{
        public static int arr[];
        public static int rear=0;
        public static int size;
        queue(int size){
            this.size=size;
            arr=new int [size];
        }
        public boolean isEmpty(){
            return rear==0;
        }
        public boolean isFull(){
            return rear==arr.length;
        }
        public void add(int val){
            if(isFull()){
                System.out.println("queue is Full Enque Operation cannot be Performed!");
                return;
            }
             
            arr[rear++]=val;
            return;
        }
        // Deque Operation :O(n)
        public int remove(){
            if(isEmpty()){
                return rear;
            }
            int val=arr[0];
            for(int i=0;i<rear-1;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return val;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty !");
                return rear;
            }
            return arr[0];
        }
         
        public void display(){
            if(isEmpty()){
                System.out.println("Queue is Empty !");
            }
            for(int i=0;i<rear;i++){
                System.out.print(arr[i]+"-->");
            }
            System.out.println("End");
        }
    }
    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(42);
        q.add(43);
        q.add(44);
        q.add(45);
        q.add(46);
        // q.add(47);
        System.out.println("Performing Peek Operation ");
        System.out.println(q.peek());
        System.out.println("Displaying Before Remove Operation ");
        q.display();
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println("Displaying element after Remove Operation");
        // System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
