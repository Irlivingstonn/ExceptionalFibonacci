// Importing Assets
import java.util.InputMismatchException;
import java.util.Scanner;

// Driver Object
public class Driver {

    // Declaring Field
    int fib_num;

    // Initializing Field
    public Driver(){
        this.fib_num = 0;
    }

    // Getting Fibonacci Number: Checks to see if the input is an integer and if it's less than 1 or greater than 10
    //                           Once the user enters the correct input, the value is returned
    public boolean getting_fib_num(String message){

        // Declaring Variables
        int fib_num;
        boolean valid;

        do {
            valid = true;
            try{
                System.out.print(message);
                Scanner scanner = new Scanner(System.in);
                fib_num = scanner.nextInt();

                // If the input is less than 1 or greater than 10, then the error is caught
                if (fib_num < 1 || fib_num > 10){
                    throw new InvalidArgumentException();
                }

                // Once the input is valid then the value is stored in the field
                this.fib_num = fib_num;
            }

            // Catches Input Errors
            catch (InputMismatchException e){
                valid = false;
                System.out.println("   Error: You Must Enter a Number");
            } catch (InvalidArgumentException e) {
                valid = false;
                System.out.println("   Error: " + this.fib_num + " is not a positive number");
            }
        } while (!valid);  // Continues Until the Input is Valid

        // Once the input is valid then the program can process the input
        return true;
    }

}
