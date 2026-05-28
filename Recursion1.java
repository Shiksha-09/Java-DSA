class Recursion1 {
    public static void Sub(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Sub(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        Sub(n);

    }
}