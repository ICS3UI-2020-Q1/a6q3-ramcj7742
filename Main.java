import java.util.Scanner;
/**
 * selects largest number from array
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //creates variable for largest number
    int largeNum = 0;

    //prompts user to enter integers
    System.out.println("Please enter in 10 integers to put into the array");

    //creates array
    int array[] = new int[10];

    //loop that puts numbers into array
    for(int i = 0; i < array.length; i++){
      array[i] = input.nextInt();
      if(array[i] > largeNum){
        largeNum = array[i];
      }
    }
    //tells user the larges number
    System.out.println("The largest number is " + largeNum);
    
  }
}
