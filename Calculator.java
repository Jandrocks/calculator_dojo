public class Calculator {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    public Calculator() {
        this.result = 0;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void performOperation() {
        if (operation.equals("+")) {
            result = operandOne + operandTwo;
        } else if (operation.equals("-")) {
            result = operandOne - operandTwo;
        } else {
            System.out.println("Operación no válida.");
        }
    }

    public double getResult() {
        return result;
    }
}