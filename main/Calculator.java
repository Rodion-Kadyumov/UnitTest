import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    public int plus1(int x,int y){
        int c = x + y;
        return c;
    }
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> devide = (x, y) -> x / y;
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : null;
    BinaryOperator<Integer> devide2 = (x, y) -> x/y;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
    //Consumer<Integer> println = x -> System.out.println(x == null ? "The value to print cannot be null!" : x);
}