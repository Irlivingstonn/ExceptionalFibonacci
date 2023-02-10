// Name: Isabella Livingston
// Date: 10 February 2023
// Description: Takes user input, runs it through input validation loop, calculates the fibonacci number

// Main Object
public class Main {
    // Main Class
    public static void main(String[] args) {

        // --------- DECLARING ---------
        int answer = 0;
        Driver fibonacci_class = new Driver();

        // --------- INPUT ---------
        if (fibonacci_class.getting_fib_num("Enter the desired Fibonacci number n: ")){

            // --------- PROCESSING ---------
            try{
                answer = fibonacci(fibonacci_class.fib_num);

            }
            catch (InvalidArgumentException e){
                System.out.println("   Error: " + fibonacci_class.fib_num + " is not a positive number");
            }
        }

        // --------- OUTPUT ---------
        System.out.println(answer);
    }

    // Fibonacci Method: Finds the Fibonacci Method through recursion
    public static int fibonacci (int n) throws InvalidArgumentException {

        if (n == 0 || n == 1){
            return n;
        }

        else{
            return fibonacci((n - 1)) + fibonacci(n - 2);
        }
    }
}