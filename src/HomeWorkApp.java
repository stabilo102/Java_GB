public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5, b = 10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value < 1) {
            System.out.println("Red");
        } else if (value > 0 && value < 101) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 0, b = 1;
        if (a >= b) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
}