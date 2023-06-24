import java.util.Scanner;

public class Exercise_one 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("               Welcome to the students score analizer!                    ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Enter the number of students:   ");
        int number_of_students=scanner.nextInt();

        //declare an array to store the data of students

        int[] students = new int[number_of_students];

        //now we can create an loop for get the data of students

        //so this is the loop for that

        for(int i=0; i<students.length; i++)
        {
            System.out.println("Enter the score for student "+(i+1)+"  : ");
            students[i]=scanner.nextInt();
        }



        
    }
    
}
