package task1;

import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;

    private Calculator(){}

    public BinaryOperator<Integer> plus = (a,b) -> a+b;
    public BinaryOperator<Integer> minus = (a,b) -> a-b;
    public BinaryOperator<Integer> multiply = (a,b) -> a*b;
    public BinaryOperator<Integer> devide = (a,b) -> b==0? 0: a/b;

    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    public Predicate<Integer> isPositive = x -> x > 0;

    public Consumer<Integer> println = System.out::println;
}
