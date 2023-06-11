import java.util.Scanner;

public class ArrayTest 
{
    public static void main(String[] args) 
    {   
        try 
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of students: ");
            int num_of_students = scanner.nextInt();
            scanner.nextLine();
            double[] scores_of_students =new double[num_of_students];   //declare this array to hold scores
            String[] students_names = new String[num_of_students];      //declare this array to hold names of students.
            double totalScore = 0.0;

           for(int i = 0; i < num_of_students; i++)                        //create a for loop for get information from teacher.
           {

            System.out.println("Enter name of the student: ");       //get the name 
            students_names[i] = scanner.nextLine();                   //store it in the array called students_names.
            System.out.println("Enter the score for "+students_names[i]+" : ");
            scores_of_students[i]=scanner.nextDouble();
            scanner.nextLine();   // Consume the newline character

            totalScore += scores_of_students[i];   //calculate total score  of the students


            }

        //calculate the average score students.
        

        double averageScore =totalScore/num_of_students;

        System.out.println("\nTest Analysis");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Name\t\tScore\tDeviation");
        System.out.println("---------------------------------------------------------------------------------");


        for(int i=0; i<num_of_students;i++)
        {
            double deviation=scores_of_students[i]-averageScore;
            System.out.printf("%-15s\t%.2f\t%.2f%n", students_names[i], scores_of_students[i],deviation);
            
        }

        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("Average score:\t%.2f%n", averageScore);
        System.out.println("---------------------------------------------------------------------------------");
        scanner.close();
        
        } 
        catch (Exception e)
        {
         System.out.println("Error occured: "+e);
        }
        






        
        
        
    }
    
}
