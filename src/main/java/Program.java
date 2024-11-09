import models.Calculator;

public class Program {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.multiply(5, 6));
        System.out.println(calc.add(15, 68));
        System.out.println(calc.divide(15, 6));
        System.out.println(calc.subtract(54, 69));
        System.out.println(calc.divide(55, 0));
    }
}
