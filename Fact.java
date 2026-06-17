public class Fact {
    public static void Facto(int n, int fact) {
        if (n == 0 || n == 1) {
            System.out.println(fact);
            return;
        }

        fact = fact * n;
        Facto(n - 1, fact);
    }

    public static void main(String[] args) {
        int n = 10;
        int fact = 1;

        Facto(n, fact);
    }
}