public class Tut25_recursion {
    static boolean is_sorted(int arr[],int i)
    {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return is_sorted(arr, i+1);
    }
    public static void main(String[] args) {

        int arr[]={1,23,4,53,5,3,5};
        System.out.println(is_sorted(arr, 0));
        
    }
    
}
