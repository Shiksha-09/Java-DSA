public class MoveZero {
    public static void Move(int arr[]){
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
                for (int k = j; k < arr.length; k++) {
            arr[k] = 0;
        } 
     
    }
    public static void main(String[] args) {
        int arr[]= {4,0,2,5,0,7};
        Move(arr);
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }
}
