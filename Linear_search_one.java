public class Linear_search_one 
{
    public static void main(String[] args)
    {
        int[] num_array={5,6,7,8,9,10,11};
        int num_to_find_out=8;
        int i=0;
        while (i<num_array.length)
        {
            if (num_array[i]==num_to_find_out) 
            {
                System.out.println("Element found at index number : " + i);
            }

            i++;
            
        }
        
    }
    
}
