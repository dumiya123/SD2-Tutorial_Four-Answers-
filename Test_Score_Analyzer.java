/*
 *  Problem:
    Mr. White needs to analyze students’ chemistry test performance. He 
    needs a program to display a name and let him enter the test score. 
    Then it should compute and display the average. Finally, it should 
    give a report with names, scores, and deviation from the 
    average.
 */
public class Test_Score_Analyzer 
{
    public static void main(String[] args) 
    {

        String[] students_names=new String[5];
        students_names[0]="Alice";
        students_names[1]="Bob";
        students_names[2]="Adams";
        students_names[3]="John";
        students_names[4]="John";
        int[] students_score=new int[5];
        students_score[0]=60;
        students_score[1]=70;
        students_score[2]=80;
        students_score[3]=90;
        students_score[4]=95;
        int sum=0;
        for (int i=0; i<students_score.length; i++)
        {

            sum += students_score[i];


        }

        System.out.println(" The sum of scores is  "+ sum);
        for (int i=0; i<students_names.length;i++)
        {
            System.out.println( );
            System.out.println(students_score[i]);

        }


    
        
        
        




        
    }
    
}
