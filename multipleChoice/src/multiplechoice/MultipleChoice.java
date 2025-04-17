
package multiplechoice;

import java.util.Scanner;


public class MultipleChoice {

    
    public static void main(String[] args) {
        // Program that allows the user to choose the correct answer to a given question.
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        System.out.println("\ta. int 1x = 10; \n\tb. int x = 10; \n\tc. float x = 10.0f; \n\td. string x = \"10\";");
        
        System.out.println("Enter your choice: ");
        char choice = scn.next().charAt(0);
        
        System.out.println("-------------------------------------------------------------");
        
        switch(choice){
            case 'a': System.out.println("a. Variable identifier cannot start with a number.");
            break;
            case 'b': System.out.println("b. Correct. Well done!!!");
            break;
            case 'c': System.out.println("c. Incorrect type altogether.");
            break;
            case 'd': System.out.println("d. string is not an int. String must also start with a upper case S.");
            break;
            default: System.out.println("Wrong choice. Bye bye!");
        }
    }
    
}
