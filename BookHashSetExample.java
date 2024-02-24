import java.util.* ;
public class BookHashSetExample {
    
    public static void main(String[] args) {
         HashSet<BookExample> set=new HashSet<BookExample>(); 
         BookExample b1=new BookExample(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    BookExample b2=new BookExample(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    BookExample b3=new BookExample(103,"Operating System","Galvin","Wiley",6);  
         
    set.add(b1);  
    set.add(b2);  
    set.add(b3);
    System.out.println(set);
    
      for(BookExample b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}}
  
    
