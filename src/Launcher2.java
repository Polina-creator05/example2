/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Launcher2 {

    public static void main(final String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
        System.out.println(div(a, b));
        System.out.println(min(a, b));
        System.out.println("jdfkd");
        System.out.println("12345");


    }

    private static int add(final int a, final int b) {
        return a + b;
    }

    private static int sub(final int a, final int b) {
        return a - b;
    }

    private static int div(final int a, final int b) {
        return a % b;
    }

    private static int min(int a, int b) {
        return a > b ? a : b;
    }
}
