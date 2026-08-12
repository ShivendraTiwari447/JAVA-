public class Tut17Arrray_sort {
    static boolean chec(int arr[])
    {
        if(arr.length==0 || arr.length==1)
        {
            return true;
        }

        for(int i=0;i<arr.length;i++){
         if(arr[i]>arr[i+1])  {
            return false;
         }
        }
        return true;

    }
    public static void main(String[] args) {
        int arr[]={1,2,33,4,4,5};
       boolean res= chec(arr);
       System.out.println(res);
    }
}
