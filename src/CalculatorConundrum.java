public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        double result = switch(operation){
            case "+" -> operand1 + operand2;
            case "*" -> operand1 * operand2;
            case "/" -> divide(operand1, operand2);
            case "-" -> throw new IllegalArgumentException("Operation '-' does not exist");
            case "null" -> throw new IllegalArgumentException("Operation cannot be null");
            case "" -> throw new IllegalArgumentException("Operation cannot be empty");
            default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        };
        return operand1 + " " + operation + " " + operand2 + " " +  "=" + " " + result;
    }
    private double divide(int operand1, int operand2) {
        try {
            return (double) operand1 / operand2;
        } catch (ArithmeticException ex) {
            throw new IllegalOperationException("Division by zero is not allowed", ex);
        }
    }
}
