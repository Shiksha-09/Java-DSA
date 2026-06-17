public class Num {
    public static String num(int n) {
        if (n > 5) {
            return " ";
        }

        return n + " " + num(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
       System.out.println(num(n));
    }
}