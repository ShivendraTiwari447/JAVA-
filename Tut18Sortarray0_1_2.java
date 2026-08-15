public class Tut18Sortarray0_1_2 {
    static void sort(int arr[])
    {
        int low =0,mid=0,high=arr.length-1;
        while (mid<=high) {
            if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }else if(arr[mid]==1)
            {
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        int n=0;
        while(n<arr.length){
            System.out.print(arr[n]);
            n++;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,2,0};
        sort(arr);
    }
    
}
