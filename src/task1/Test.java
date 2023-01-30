package task1;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1,1);
        int c = calculator.devide.apply(a, b);  //Делить на нуль
        calculator.println.accept(c);
    }
}
