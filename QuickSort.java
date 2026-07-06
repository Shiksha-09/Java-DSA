public class QuickSort{
    public static void quicksort(int arr[], int low , int high){
        if(low<high)
        {
            int piindx=partition(arr,low,high);
            quicksort(arr,low,piindx-1);
            quicksort(arr,piindx+1,high);
        }
    }
    public static int partition (int arr[],int low,int high)
    {
        int pivot= arr[high];
        int i= low-1;

        for (int j=low;j<high;++j){
            if(arr[j]<pivot){
                i++;
               int temp = arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]= arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String args[]){
        int arr[]={2,7,8,4,5};
        int high = arr.length-1;
        int low=0;
        quicksort(arr,low,high);
        for(int i=0;i<arr.length;++i){
            System.out.println(arr[i]);
        }
    }
}