
import java.util.Scanner;

/*Jessica Craw
    This program will take a collection of numbers that is inputted by the user
and read what the highest number is and keep count of how many times it shows up
in the program.
 */

/**
 *
 * @author Fen'Vhenan
 */
public class ProgrammingAssignment4 {
    public static void main(String[] args){
        
        //declare variables
        int count = 0;
        int number = -1;
        int max = -1;
        
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //request numbers from user
        System.out.println("Enter numbers(make sure the last one is 0): ");
        
        //user input check that ends when 0 is entered
        do{
            
            number = input.nextInt();
            
            //check the numbers entered
            if(number > max){
                //set the number to max
                max = number;
            
                //set the counter to one
                count = 1;
            }else if(number == max){
            //increase count
            count++;
            }
        }while(number != 0);    
        
        //display the results
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
