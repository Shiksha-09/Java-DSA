public class PallindromeArr {
    public static boolean isPalindrome(int[] arr) {

        int n = arr.length;
        int[] pallin = new int[n];

        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            pallin[j] = arr[i];
            j++;
        }

        for (int k = 0; k < n; k++) {
            if (arr[k] != pallin[k]) {
                return false;
            }
        }

        return true;
    }

public static void main(String[] args) {
    int arr[] = {5, 0, 5};

    System.out.println(isPalindrome(arr));
}
}
