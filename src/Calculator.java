public class Calculator {
    public static void main(String[] args) {
        CalculatorConundrum calculator = new CalculatorConundrum();
        String operation = calculator.calculate(10, 12, "+");
        System.out.println(operation);
        operation = calculator.calculate(2, 5, "*");
        System.out.println(operation);
        operation = calculator.calculate(2, 5, "/");
        System.out.println(operation);
        operation = calculator.calculate(1,2,"");
        System.out.println(operation);
        operation = calculator.calculate(1,2,"null");
        System.out.println(operation);
        operation = calculator.calculate(1,2,"-");
        System.out.println(operation);
        operation = calculator.calculate(1, 0, "/");
        System.out.println(operation);
    }
}
