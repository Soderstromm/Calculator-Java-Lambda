public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        try {
            // Выполнение математических операций
            int a = calc.plus.apply(1, 2); // a = 3
            int b = calc.minus.apply(1, 1); // b = 0
            int c;

            // Проверка деления на ноль
            if (b != 0) {
                c = calc.devide.apply(a, b); // c = a / b
                calc.println.accept(c); // Вывод результата в консоль
            } else {
                calc.println.accept(null); // Вывод null, если деление невозможно
                System.out.println("Ошибка: Деление на ноль");
            }
        } catch (ArithmeticException e) {
            // Обработка исключения деления на ноль
            System.out.println("Error: " + e.getMessage());
        }

    }
}
