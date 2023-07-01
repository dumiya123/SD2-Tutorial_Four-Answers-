import java.util.Scanner;

public class swap_values 
{
    public static void main(String[] args)
    {
        Scanner  scanner=new Scanner(System.in);
        try 
        {
            System.out.println();
            System.out.println("Enter the number of values:  ");
            int values=scanner.nextInt();
            //declare an array to store the values
            double[] doubleArray=new double[values];
            for(int i=0;i<doubleArray.length;i++)
            {

                System.out.print("Number "+(i+1)+"  :");
                doubleArray[i]=scanner.nextDouble();

            } 

            System.out.println("Emter the first position (i) :  ");
            int i=scanner.nextInt();

            System.out.println("Enter the second position (j) :  ");
            int j=scanner.nextInt();

            //this code line will do the swap operation.

            if (i>=0 && i<doubleArray.length-1 && j>=0 && j<doubleArray.length-1) 
            {
                double temp=doubleArray[i];
                doubleArray[i]=doubleArray[j];
                doubleArray[j]=temp;


            System.out.println("Values after swap operation.");

            for (double d : doubleArray) 
            {
                System.out.println(d);
                System.out.println();
                
            }

                
            }
            else
            {
                System.out.println("Invalid position.Position values should be between 0 and " + (doubleArray.length - 1) + ".");

            }

           
      
        } 
        catch (Exception e) 
        {
            System.out.println();
            System.out.println("An error occurred: "+ e  +" You cannot enter a alphabetcal value.you can only enter an intger value.");
           
        }

        scanner.close();

       
      
        


        
    }
    
}
