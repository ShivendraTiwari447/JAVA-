public class Tut14Pairs {
    static void pairs(int arr[])
    {
        for(int i=0;i<=arr.length;i++)
        {
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.printf("  (" + curr + " , " + arr[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      int a[]={2,4,6,8,10};
      pairs(a);  

    }
}