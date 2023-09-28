
public class ComparisonOfString {
    public static void main(String[] args) {
        String a="Prabhat";
        String b="Prabhat";
        // == gives weather both are pointing to same object are not,Object is created in String pool and both a and b points to same object "Prabhat"
        System.out.println(a==b);
        String namea=new String("Prabhat Kumar");//different object will be created for both in string pool.
        String nameb=new String("Prabhat Kumar");
        System.out.println(namea==nameb);// it gives false because two different reference pointing to different objects 
        System.out.println(namea.equals(nameb));
    }
}
