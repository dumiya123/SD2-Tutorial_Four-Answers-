public class Linear_search
{
    public static void main(String[] args) 
    {
        int[] num_array = {10, 5, 15, 25, 0, 1, 45, 30};
        int num_to_find=25;
       // boolean not_found=true;
        int i=0;
        while(i<num_array.length)
        {
            if(num_array[i]==num_to_find)
            {
                System.out.println("Found index at: "+ i);
            }

            i++;
        }



        
    }
}
