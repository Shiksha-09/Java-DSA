public class Sum {

    public static void sub(int n, int sum) {

        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        sub(n - 1 ,sum);

    }

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        sub(n, sum);

    }
}
