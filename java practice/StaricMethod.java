public class StaricMethod {
    public static void main(String[] args) {
        Static.changeStatic();
        Static s1=new Static(32, "Prabhat Kumar");
        Static s2=new Static(33, "Prince");
        s1.display();
        s2.display();
        // Method 2
        StaticMethod2.display();
        
    }
}
class Static{
    int rollno;
    String name;
    static String college="ITS";
    static void changeStatic(){
        college="BBDITS";
    }
    Static(int r,String name){
        rollno=r;
        this.name=name;
    }
    void display(){
        System.out.println(name+" "+rollno+" "+college);
    }
}
class StaticMethod2{
    static String name="Prabhat ";
    static void display(){
        // name="Prince";
        System.out.println(name);
    }
}