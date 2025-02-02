package java_exp_1;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInput userInput = new UserInput();
        int choice;
        do {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci Sequence");
            System.out.println("6. Mean of Array");
            System.out.println("7. Variance of Array");
            System.out.println("8. Exit");

            choice = userInput.getSingleInteger(); // user's choice
            switch (choice) {
                case 1:
                    System.out.println("Sum: " + calculator.add());
                    break;
                case 2:
                    System.out.println("Difference: " + calculator.subtract());
                    break;
                case 3:
                    System.out.println("Product: " + calculator.multiply());
                    break;
                case 4:
                    System.out.println("Quotient: " + calculator.divide());
                    break;
                case 5:
                    calculator.generateFibonacci(userInput.getSingleInteger());
                    break;
                case 6:
                    calculator.calculateMean(userInput.getIntegerArray());
                    break;
                case 7:
                    calculator.calculateVariance(userInput.getIntegerArray());
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8);
    }
}
