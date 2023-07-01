import java.util.Scanner;

public class Exercise_one
{
    public static void main(String[] args) 
    {

        System.out.println("----------------------------------------------------");
        System.out.println("         Welcome to Test score Analyzer!            ");
        System.out.println("----------------------------------------------------");
        System.out.println();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of students:  ");
        int num_students=input.nextInt();
        int[] stuent_marks_array=new int[num_students];

        //get the scores from user .

        for(int i=0; i<num_students;i++)
        {

            System.out.print("Enter the mark for student "+(i+1)+"  :");
            stuent_marks_array[i]=input.nextInt();

        }

        System.out.println("___________________________________________________");

        System.out.println();

        input.close();

        //display the all values of the students

         int pass_mark=40;

        System.out.println("___________________________________________________");
        int numFailed=0; 

        for(int i=0;i<num_students;i++)
        {
            System.out.println("Student  "+(i+1) + "  mark is : "+stuent_marks_array[i]);
            if(stuent_marks_array[i]<pass_mark)
            {

                System.out.println("Student "+(i+1)+" fail the exam.you have to attempt the eaxam again");
                numFailed++;

            }
            else
            {

                System.out.println("Student "+(i+1)+" pass the exam.Congratulations!");

            }

        }

        int sum=0;
        int average=0;

        for (int i = 0; i < stuent_marks_array.length; i++) 
        {

            sum+=stuent_marks_array[i];
            average=sum/num_students;
            
        }

        System.out.println("___________________________________________________");
        System.out.println();

        System.out.println("Sum of all marks is:  "+sum);
        System.out.println("Average of all marks is:  "+average);
        System.out.println("Number of students who failed: " + numFailed);


        System.out.println("___________________________________________________");

        
    }

}