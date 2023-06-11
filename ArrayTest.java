import java.util.Scanner;

public class ArrayTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int num_of_students = scanner.nextInt();
        scanner.nextLine();
        double[] scores_of_students =new double[num_of_students];
        String[] students_names = new String[num_of_students];
        double totalScore = 0.0;

        for(int i = 0; i < num_of_students; i++)
        {

            System.out.println("Enter name of the student: ");
            students_names[i] = scanner.nextLine();
            System.out.println("Enter the score for "+students_names[i]+" : ");
            scores_of_students[i]=scanner.nextDouble();

            totalScore += scores_of_students[i];


        }

        //calculate the average score students.

        double averageScore =









        
        
        
    }
    
}
