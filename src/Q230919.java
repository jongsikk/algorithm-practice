
public class Q230919 {

    public static long factorial(int number) {
        // TODO : factorial
        switch (number) {
            case 0:
            case 1:
                return 1;
            default:
                return number * factorial(number - 1);

        }
    }

    public static long fibonacci(int number) {
        // TODO : fibonacci
        switch (number) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            default:
                return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
