package java_exp_1;

class Calculator {
    int[] numbers; // Array to store two integers

    // Constructor to initialize numbers with user input
    public Calculator() {
        UserInput inputHandler = new UserInput();
        this.numbers = inputHandler.getTwoIntegers(); // Capture input once
    }

    // Method to perform addition
    int add() {
        return numbers[0] + numbers[1];
    }

    // Method to perform subtraction
    int subtract() {
        return numbers[0] - numbers[1];
    }

    // Method to perform multiplication
    int multiply() {
        return numbers[0] * numbers[1];
    }

    // Method to perform division with zero-check
    double divide() {
        if (numbers[1] == 0) {
            System.out.println("Error: Division by zero is not allowed. Returning 0.");
            return 0;
        }
        return (double) numbers[0] / numbers[1];
    }

    // Method to generate Fibonacci sequence up to 'n' terms
    void generateFibonacci(int n) {
        int first = 0, second = 1, sum;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            sum = first + second;
            first = second;
            second = sum;
        }
        System.out.println();
    }

    // Method to calculate the mean of an integer array
    void calculateMean(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("Mean: " + (sum / array.length));
    }

    // Method to calculate the variance of an integer array
    void calculateVariance(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        double mean = sum / array.length;
        double sumSquaredDifferences = 0;
        for (int value : array) {
            sumSquaredDifferences += Math.pow(value - mean, 2);
        }
        System.out.println("Variance: " + (sumSquaredDifferences / array.length));
    }
}
