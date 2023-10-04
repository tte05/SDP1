public class CalculatorSingleton {

    private static CalculatorSingleton instance;
    private CalculatorStrategy calculatorStrategy;

    private CalculatorSingleton() {
        // Set the default calculator strategy to the addition strategy.
        calculatorStrategy = new AdditionStrategy();
    }

    public static CalculatorSingleton getInstance() {
        if (instance == null) {
            instance = new CalculatorSingleton();
        }
        return instance;
    }

    public void setCalculatorStrategy(CalculatorStrategy calculatorStrategy) {
        this.calculatorStrategy = calculatorStrategy;
    }

    public double calculate(double operand1, double operand2) {
        return calculatorStrategy.calculate(operand1, operand2);
    }
}
