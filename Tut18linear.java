public class Tut18linear {

    static boolean linear(int arr[],int tar)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==tar)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,3,43,4543,43,44,4,543};
        boolean res=linear(arr, 44);
        System.out.println(res);
    }
    
}
