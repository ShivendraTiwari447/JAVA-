public class Tut12Arrayss {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" " + arr[i]);
        }
    }

    static int[] reverse(int arr[])
    {
        int f=0,l=arr.length-1;
        while(f<l)
        {
            int temp=arr[l];
            arr[l]=arr[f];
            arr[f]=temp;
            f++;
            l--;
        }
        return arr;
    }


    static int  max_no(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static int  min_no(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        // int a[]= new int[5];

      int []a={1,42,412,24,412,0};

        print(a);

System.out.println("------------------------------------------");
    //   int b[] =reverse(a);
    //   print(b);

    int max=max_no(a);
    System.out.println(max);
    int min=min_no(a);
    System.out.println(min);

    }
}
