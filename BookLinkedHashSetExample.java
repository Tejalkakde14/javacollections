import java.util.* ;
public class BookLinkedHashSetExample {
    
    public static void main(String[] args) {
     LinkedHashSet<BookExample> hs=new LinkedHashSet<BookExample>();
     BookExample b1=new BookExample(101,"Let us C","Yashwant Kanetkar","BPB",123);  
    BookExample b2=new BookExample(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    BookExample b3=new BookExample(103,"Operating System","Galvin","Wiley",6);  
    
    hs.add(b1);  
    hs.add(b2);  
    hs.add(b3);  
    
    for(BookExample b:hs){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}}
