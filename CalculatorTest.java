public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperandOne(1);
        calculator.setOperation("+");
        calculator.setOperandTwo(2);
        calculator.performOperation();

        double result = calculator.getResult();
        System.out.println("El resultado es: " + result);
    }
} 