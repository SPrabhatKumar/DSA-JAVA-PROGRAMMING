public class StringImmutability {
    public static void main(String[] args) {
        String name="Prabhat";
        System.out.println(name);
        name="Kumar";//it doesnot change the value of name but it rather created a new object for name and now it points to that object 
        System.out.println(name);
    }
}
