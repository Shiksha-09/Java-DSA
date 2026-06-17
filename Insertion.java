public class Insertion{
   public static void main(String[] args) {
     int arr[]={5,4,2,3,1};
    int temp,j;
    for(int i=1;i<arr.length;++i){
          temp=arr[i];
          j=i;
          while(j>0 && arr[j-1]>temp){
            arr[j]=arr[j-1];
            j--;
          }
          arr[j]=temp;
    }
    for (int i=0;i<arr.length;++i){
        System.out.println(arr[i]);
    }
   }

}