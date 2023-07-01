import java.util.Random;

public class Dice_Game 
{
    public static void main(String[] args) 
    {
       int number_of_simulations=1000;
       int count_of_X=0;
       int count_of_Y=0;    
       int count_of_both_x_y=0;

       Random genarator=new Random();

       for (int i = 0; i < number_of_simulations; i++) 
       {
         int roll_one=genarator.nextInt(6)+1;
         int roll_two=genarator.nextInt(6)+1;

        if (roll_one==4)
        {
            count_of_X++;
        }
        if (roll_two==4)
        {
            count_of_Y++;
        }
        if(roll_one==4 && roll_two ==4)
        {
            count_of_both_x_y++;

        }


        
       }

       double probability_of_X = (double)count_of_X/number_of_simulations;
       double probability_of_Y = (double)count_of_Y/number_of_simulations;
       double probability_of_both_x_y = (double)count_of_both_x_y/number_of_simulations;


       System.out.println("Probability of X: " + probability_of_X);
       System.out.println("Probability of Y: " +probability_of_Y);
       System.out.println("Probability of both X and Y: " + probability_of_both_x_y);

       

        
        
        





        
    

        
    }
    
}
