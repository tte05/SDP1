public class Calculator {
    public static void main(String[] args) {
        // Get the calculator singleton instance.
        CalculatorSingleton calculatorSingleton = CalculatorSingleton.getInstance();

        // Set the calculator strategy to the subtraction strategy.
        calculatorSingleton.setCalculatorStrategy(new SubtractionStrategy());

        // Calculate the difference of two numbers.
        double difference = calculatorSingleton.calculate(12, 5);

        // Print the result to the console.
        System.out.println("Difference is " + difference);


    }
}
