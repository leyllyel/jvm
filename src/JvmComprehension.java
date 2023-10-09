
public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // 1 Создание переменной i типа int и присвоение ей значения 1. Сохраняется в стэке.
        Object o = new Object();        // 2 Создание объекта класса Object и присвоение его ссылки переменной o. Сохраняется в хипе.
        Integer ii = 2;                 // 3 Создание объекта класса Integer со значением 2 и присвоение его ссылки переменной ii. Это происходит в хипе.
        printAll(o, i, ii);             // 4 Вызов метода printAll с аргументами o, i и ii. Создается новый фрейм в стеке памяти для выполнения метода.
        System.out.println("finished"); // 7  Выводится строка "finished" в консоль.
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 Создание переменной uselessVar типа Integer и присвоение ей значения 700. Это происходит в стэке.
        System.out.println(o.toString() + i + ii);  // 6 Вызов метода println с аргументом, который представляет собой конкатенацию строковых представлений объекта o, переменной i и объекта ii. Это происходит в стэке.
    }
}
