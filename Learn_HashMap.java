import java.util.HashMap;

public class Learn_HashMap 
{
    public static void main(String[] args) 
    {
        HashMap<String,Integer> marks= new HashMap<String,Integer>();
        marks.put("Alex",80);
        marks.put("Charlie",70);
        marks.put("Jesse",60);
        System.out.println("Alex's mark is "+marks.get("Alex"));

        
    }
    
}
