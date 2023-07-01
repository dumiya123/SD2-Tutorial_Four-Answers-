import java.util.Scanner;

public class Multidimensional_array 
{
    public static void main(String[] args) 
    {
        try 
        {
            //get the number of students and number of subject sfrom the user.
            System.out.println("---------------------------------------------------------------");
            System.out.println("                       Marks analizer                          ");
            System.out.println("---------------------------------------------------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of students:  ");
            int students_number = scanner.nextInt();
            System.out.println("Enter the number of subjects:  ");
            int subjects_number = scanner.nextInt();
            System.out.println("---------------------------------------------------------------");

            //declare a two dimensional array to store the number of students and subjects scores

            int[][] students_array=new int[subjects_number][students_number];


            //create a two dimensional array to store the number of students and subjects scores.

            // for (int stu_number=0;stu_number<students_number-1;stu_number++)
            // {
            //     System.out.println("Enter the mark for student "+(stu_number+1));
            //     for (int sub_num=0;sub_num<subjects_number-1;sub_num++)
            //     {

            //         System.out.println("Enter the student "+(stu_number+1)+" mark for subject "+(sub_num+1));
            //         students_array[subjects_number][students_number]=scanner.nextInt();

            //     }
            // }

            for(int i=0 ; i<students_number-1;i++)
            {
                System.out.println("Enter the marks for student "+(i+1));
                for(int j=0 ; j<subjects_number;j++)
                {
                    System.out.println("Enter the  marks for subject  "+(j+1));
                    students_array[i][j]=scanner.nextInt();

                }
                System.out.println();
            }
            scanner.close();
         


            
        } 
        catch (Exception e) 
        {
            System.out.println("An error occured:  "+ e  );
            
        }
       
        
        
        
        


        
    }
    
}
