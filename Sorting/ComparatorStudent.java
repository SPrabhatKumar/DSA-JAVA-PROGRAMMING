import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorStudent {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(1, "Prabhat","Vijayawada", "cse"));
        list.add(new Student(2, "Prince","Vijayawada", "csd"));
        list.add(new Student(5, "Bhaskar","Vijayawada", "csm"));
        list.add(new Student(4, "Vijay","Vijayawada", "cse"));
        list.add(new Student(3, "Sonu","Vijayawada", "cse"));
        System.out.println("Printing Before Sorting ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list,new SortByRollNo());
        
        System.out.println("Printing All After Sorting The Student by Roll Number ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("After Sorting According Name :");
        Collections.sort(list,new SortByName());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        
    }
}
class Student{
    int rolln0;
    String name;
    String city;
    String department;
    Student(int rollno,String name,String city,String department){
        this.rolln0=rollno;
        this.name=name;
        this.city=city;
        this.department=department;
    }
    public String toString(){
        return this.rolln0+" "+this.name+" "+this.city+" "+this.department;
    }
}
class SortByRollNo implements Comparator<Student>{
    public int compare(Student a,Student b){
        return a.rolln0-b.rolln0;
    }
}
class SortByName implements Comparator<Student>{
    public int compare(Student a,Student b){
        return a.name.compareTo(b.name);
    }
}
