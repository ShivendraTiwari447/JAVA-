public class Tut18leftrotate {
    static void left_rotate_by_one(int arr[])
    {
        System.out.println("original arr :");
        for(int i=0;i<arr.length;i++)
        {
            
            System.out.print( +arr[i]+" ");
        }

        int temp=arr[0];

        for(int i=1;i<arr.length;i++){
           arr[i-1]=arr[i];
        }

        arr[arr.length-1]=temp;

        System.out.println();
        System.out.println("left rotated arr :");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print( arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,34,5};
        left_rotate_by_one(arr);
    }
}
