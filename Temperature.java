import java.util.Scanner;

public class Temperature 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

        //Define the number of cities and days.

        int num_cities=10;
        int num_days=31;

        int[][] temperature=new int[num_cities][num_days];

        for (int city = 0; city<num_cities; city++) 
        {
            System.out.println("Enter temperature for city: " + (city+1) +" : " );
            for (int day = 0; day < num_days; day++) 
            {
                System.out.print("Day " + (day + 1) + ": ");
                temperature[city][day]=scanner.nextInt();
            }
            System.out.println();
        
        }

        // Find the highest and lowest temperatures

        int highest_temperature =temperature[0][0];
        int lowest_temperature =temperature[0][0];
        int highest_city=0;
        int lowest_city =0;
        int highest_day=0;
        int lowest_day=0;

        for (int city= 0; city<num_cities; city++) 
        {
            for (int day = 0; day < num_days; day++) 
            {
                if (temperature[city][day]>highest_temperature)
                {

                    highest_temperature=temperature[city][day];
                    highest_city=city;
                    lowest_day=day;
                }

                if (temperature[city][day]<lowest_temperature) 
                {
                    lowest_temperature=temperature[city][day];
                    lowest_city=city;
                    lowest_day=day;     
                }


            // Display the highest and lowest temperatures


            System.out.println("Highest Temperature: " + highest_temperature);
                
                
                 
                
            }
        }






        




        



        


        





        
    }
    
}
