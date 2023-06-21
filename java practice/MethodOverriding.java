public class MethodOverriding {
    public static void main(String[] args) {
        Bike b1=new Bike( 1000, "Prabhat kumar ",3932);
        b1.displayInfo();
        Vehicle v1=new Vehicle( "Prabhat Kumar", 4053);
        v1.displayInfo();
    }
}
class Vehicle{
    String name;
    int number;
    Vehicle(String name,int number){
        this.name=name;
        this.number=number;
    }
    void displayInfo(){
        System.out.println(name);
        System.out.println(number);
    }
}
class Bike extends Vehicle{
    int amount;
    Bike(int amount,String name,int number){
        super(name, amount);
        this.amount=amount;
    }
    void displayInfo(){
        System.out.println("Name:" +name);
        System.out.println("Amount :"+amount);
        System.out.println("Number :"+number);
    }
    
}
