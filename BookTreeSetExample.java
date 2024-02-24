import java.util.* ;
public class BookTreeSetExample {
    
    public static void main(String[] args) {
        
          Set<BookExample> set=new TreeSet<BookExample>();   
             BookExample b1=new BookExample(121,"Let us C","Yashwant Kanetkar","BPB",8);    
             BookExample b2=new BookExample(233,"Operating System","Galvin","Wiley",6);    
             BookExample b3=new BookExample(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
             
             set.add(b1);    
             set.add(b2);    
             set.add(b3);    
             
             
             
             for(BookExample b:set){    
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);    
    }    
        
    }
}
