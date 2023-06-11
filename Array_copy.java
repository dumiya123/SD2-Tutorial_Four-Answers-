public class Array_copy 
{
    public static void main(String[] args) 
    {
        //declare some array
        int[] array={1,2,3};
        int[] values=array;

        //lets assign some values for this array
        values[0]=3;
        values[1]=5;
        values[2]=7;

        for (int each : values)
        {
            System.out.print(each+"  ,");
            
        }




        
    }
    
}
