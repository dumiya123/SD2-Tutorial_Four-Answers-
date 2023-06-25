import java.util.ArrayList;
import java.util.ListIterator;

public class learn_Arraylist 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("saman");
        list.add("nimal");
        list.add("kamal");   //we use add keyword to add some data to the arraylist
        System.out.println("List size: " + list.size());
        System.out.println("List size: " + list.size());
        System.out.println("First item: "+ list.get(0));
        System.out.println("last item: "+ list.get(list.size()-1));
        ListIterator<String> iterator=list.listIterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next());

        }


       




        
        

        
    }
    
}
