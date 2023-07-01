import java.util.Scanner;

public class Hundred_numbers 
{
    public static void main(String[] args) 
    {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("                         Hundred numbers                                          ");
        System.out.println("----------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to analyze? :   ");
        int total_numbers = scanner.nextInt();
        int[] nums=new int[total_numbers];
        //get the numbers from the user.
        for(int i=0; i<nums.length; i++)
        {
            System.out.println("Enter the "+ (i+1) +"  number:  ");
            nums[i] = scanner.nextInt();

        }
        double largest=0.0;
        // Find the largest number
        for(int i=0; i<total_numbers; i++)
        {
            if (nums[i] > largest) 
            {
                largest = nums[i];


                
            }
        }
        System.out.println("The largest number is: " + largest);

        scanner.close();


        
        
    }
    
}
