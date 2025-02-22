import java.util.function.Supplier;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Calculator {
    // Добавили несколько переменных типа BinaryOperator для математических операций над двумя числами
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    // Добавили несколько переменных типа UnaryOperator для произведения математических операций над одним числом
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    // Добавили переменную типа Predicate для определения положительное ли число
    Predicate<Integer> isPositive = x -> x > 0;

    // Добавили переменную типа Consumer для вывода числа в консоль
    Consumer<Integer> println = System.out::println;

}
