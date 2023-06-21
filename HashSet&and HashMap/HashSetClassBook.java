import java.util.HashSet;

class Book{
    int cost;
    String name;
    int pages;
    String author;
    Book(int cost,String name,int pages,String author){
        this.cost=cost;
        this.name=name;
        this.pages=pages;
        this.author=author;
    }
}
public class HashSetClassBook {
     public static void main(String[] args) {
        HashSet<Book> set=new HashSet<>();
        Book b1=new Book(100, "Lets c", 400, "Robert Linton");
        Book b2=new Book(200, "code With Java", 700, "George Abraham");
        Book b3=new Book(300, "Python Amzing", 390, "Mitchel Marsh");
        Book b4=new Book(300, "Python Amzing", 390, "Mitchel Marsh");
        set.add(b1);
        set.add(b2);
        set.add(b3); 
        set.add(b4);
        for(Book b:set){
            System.out.println(b.name+" "+b.author+" "+b.cost+" "+b.pages);
        }
    }
}
