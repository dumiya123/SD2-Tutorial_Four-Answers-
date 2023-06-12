public class Sum_of_array 
{
    public static void main(String[] args)
    {
        int[] array={1,2,3};
        int sum=0;
        for(int i=0; i<array.length; i++)
        {
            sum += array[i];
        }
        System.out.println("The sum of these elements is " + sum);
        
    }
    
}
