public class Que {
    int arr[];
    int front;
    int back;

    Que(int n) {
        arr = new int[n];
        front = 0;
        back = -1;
    }

    public static void main(String[] args) {
        Que obj = new Que(3);
        obj.arr[++obj.back] = 10;
        obj.arr[++obj.back] = 20;
        obj.arr[++obj.back] = 30;
        for (int i = obj.front; i <= obj.back; i++) {
            System.out.println(obj.arr[i]);
        }
    }
}