
import java.util.Scanner;

public class Sequence_of_integers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of scores: ");
        int count = scanner.nextInt();
        int[] scores = new int[count];
        //get the scores from user and store it in the scores array
        for (int i = 0; i < scores.length; i++)
        {
            System.out.println("Enter the score for student :  "+(i+1));
            scores[i] = scanner.nextInt();

        }

        int temp=scores[count-1];

        for (int i = count-1; i>0; i--)
        {
            
            scores[i]=scores[scores.length-1];

        }
        scores[0]=temp;
        


        //below code block will do the swap operation

        System.out.println("Results after swap operation");
        for (int num:scores)
        {
            System.out.print(num+"  ,");
        }

        scanner.close();








        
    }
    
}
