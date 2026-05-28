public class Printnum {
    public static void Num(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        Num(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        Num(n);
    }
}
