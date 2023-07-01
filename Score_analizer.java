import java.util.Scanner;

public class Score_analizer 
{
    public static void main(String[] args) 
    {

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("                                 Score analizer                                   ");
        System.out.println("----------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the students:  ");
        int students_number = scanner.nextInt();
        int[] scores=new int[students_number];

        //get data from user.

        for(int i=0;i<students_number;i++)
        {

            System.out.println("Enter the score for the student "+(i+1)+"  :");
            scores[i] = scanner.nextInt();


        }

        //lets reduce 10% from the number of students marks.
        
        //create a loop for reduce 10% from the students marks.

        for (int i=0;i<students_number;i++) 
        {

            scores[i] = (int) (scores[i]*0.9);
            
        }

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("               Marks are reduced because it was 24 hours late.                    ");
        System.out.println("                  So,this is the new marks for students.                          ");
        System.out.println("----------------------------------------------------------------------------------");

        //display the updated scores.

        for (int i = 0; i < students_number; i++) 
        {

            System.out.println("Student "+(i+1) + "  mark is:  "+ scores[i]);
            
        }

        scanner.close();


    

        
    }
    
}
