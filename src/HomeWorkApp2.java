public class HomeWorkApp2 {

    public static void main(String[] args) {
        sum(5, 10);
        PrintPosNeg(0);
        IsNeg(0);
        PrintString("word", 6);
    }

    public static boolean sum(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }
    public static void PrintPosNeg(int a) {
        if (a >= 0) {
            System.out.println(a + " is positive");
        } else {
            System.out.println(a + " is negative");
        }
    }
    public static boolean IsNeg(int a) {
        return a <= 0;
    }
    public static void PrintString (String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a + ' ' + i);
        }
    }
}
