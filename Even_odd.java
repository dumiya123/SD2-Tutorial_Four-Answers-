public class Even_odd 
{
    public static void main(String[] args) 
    {
        int[] numbers={2, 3, 4, 5, 6, 7, 8, 9};
        for (int i=0; i<numbers.length; i++)
        {
            if (numbers[i]%2==0)
            {
                System.out.println("Number " + numbers[i] + " is a even number. ");
                System.out.println();
                int newNumber = numbers[i]*2;
                System.out.println("the even number  "+ numbers[i] +" multiplied by 2 give a new number " +newNumber +  " is  number that is also an element of numbers. " );
                System.out.println();
            }
            else
            {
                System.out.println("number "+  numbers[i] + "  is a odd number.");
                System.out.println();
            }
        }
        
    }
    
}
