  import java.util.*;

public class ArrayOperations {
  
   // 1. Display Array
    public static void display(int[] arr, int n) {

        // Write your logic here

      for (int i=0;i<n;i++){
         System.out.println(arr[i]);
      }

    }

    // 2. Insert Element at Given Index
   public static int insertAtIndex(int[] arr, int n,
                                int index, int value) {

    if (n >= arr.length || index < 0 || index > n) {
        System.out.println("Invalid index or array is full");
        return n;
    }

    for (int i = n; i > index; i--) {
        arr[i] = arr[i - 1];
    }

    arr[index] = value;
    return n + 1;
}
    // 3. Delete Element at Given Index
   public static int deleteAtIndex(int[] arr, int n, int index) {

    if (index < 0 || index >= n) {
        System.out.println("Invalid index");
        return n;
    }

    for (int i = index; i < n - 1; i++) {
        arr[i] = arr[i + 1];
    }

    return n - 1;
}
    

    // 4. Search Element (Linear Search)
    public static int search(int[] arr, int n, int target) {

       
        for (int i=0;i<n;i++){
      
         if(arr[i]==target){
             return i;
         }
        }

        return -1;
    }

    // 5. Update Element
    public static void update(int[] arr, int n,
                              int index, int value) {

       
        if(index<0 || index>=n){
         System.out.println("Invalid index value");
        }
       else{
         arr[index]=value;
       }

    }

    // 6. Find Maximum Element
    public static int findMax(int[] arr, int n) {

         int max= arr[0];
        for(int i=1;i<n; i++){
         if(arr[i]>max){
            max= arr[i];
         }
        }
        return max;
    }

    // 7. Find Minimum Element
    public static int findMin(int[] arr, int n) {

        // Write your logic here
        int min= arr[0];
        for(int i=1;i<n; i++){
         if(arr[i]<min){
            min= arr[i];
         }
        }
        return min;
    }

    // 8. Find Sum of Elements
    public static int findSum(int[] arr, int n) {

        // Write your logic here
         int sum=0;
         for(int i=0;i<n;i++){
             sum= sum+arr[i];
         }

        return sum;
    }

    // 9. Find Average
    public static double findAverage(int[] arr, int n) {

        // Write your logic here
         int sum=findSum(arr,n);

         double average= (double) sum/n;


        return average;
    }

    // 10. Reverse Array
    public static void reverse(int[] arr, int n) {

        // Write your logic here
        int start=0;
        int last=n-1;
       while (start<last){
          int temp = arr[start];
          arr[start] = arr[last];
          arr[last] = temp;
          start++;
          last--;
       }

    }

    // 11. Sort Array
    public static void sortArray(int[] arr, int n) {

    for (int i = 0; i < n - 1; i++) {

        for (int j = 0; j < n - 1 - i; j++) {

            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
    

    // 12. Count Even Elements

    public static int countEven(int[] arr, int n) {
        int count =0;
        // Write your logic here

       for(int i=0;i<n;i++){
         if(arr[i]%2==0){
           count++;
         }
       }
        return count;
    }

    // 13. Count Odd Elements

    public static int countOdd(int[] arr, int n) {

        // Write your logic here
        int count=0;
       for(int i=0;i<n;i++){
         if(arr[i]%2!=0){
            count++;
         }
       }
   

        return count;
    }

    // 14. Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. Display
        System.out.println("\nOriginal Array:");
        display(arr, n);

        // 2. Insertion
        System.out.println("\n--- Insertion ---");
        n = insertAtIndex(arr, n, 2, 25);
        display(arr, n);

        // 3. Deletion
        System.out.println("\n--- Deletion ---");
        n = deleteAtIndex(arr, n, 1);
        display(arr, n);

        // 4. Searching
        System.out.println("\n--- Searching ---");
        int index = search(arr, n, 30);
        System.out.println("Search Result: " + index);

        // 5. Updating
        System.out.println("\n--- Updating ---");
        update(arr, n, 0, 30);
        display(arr, n);

        // 6. Maximum
        System.out.println("\nMaximum: " + findMax(arr, n));

        // 7. Minimum
        System.out.println("Minimum: " + findMin(arr, n));

        // 8. Sum
        System.out.println("Sum: " + findSum(arr, n));

        // 9. Average
        System.out.println("Average: " + findAverage(arr, n));

        // 10. Reverse
        System.out.println("\n--- Reverse ---");
        reverse(arr, n);
        display(arr, n);

        // 11. Sorting
        System.out.println("\n--- Sorting ---");
        sortArray(arr, n);
        display(arr, n);

        // 12. Even Count
        System.out.println("\nEven Count: " + countEven(arr, n));

        // 13. Odd Count
        System.out.println("Odd Count: " + countOdd(arr, n));

        sc.close();
    }
}
   

