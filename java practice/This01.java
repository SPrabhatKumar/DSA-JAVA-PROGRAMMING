class Student{
    int rollno;
    String course,name;
    float fee;
    Student(int rollno,String course,String name){
        this.rollno=rollno;
        this.course=course;
        this.name=name;
    }
    Student(int rollno,String course,String name,float fee){
        this(rollno,course,name);
        this.fee=fee;
    }
    public void display(){
        System.out.println(name+" "+rollno+" "+course+" "+fee);
    }
}
public class This01 {
    public static void main(String[] args) {
        Student s1=new Student(100, "csm", "Prabhat");
        Student s2=new Student(101, "csd", "Jaswanth",1000f);
        s1.display();
        s2.display();
        
    }
}
