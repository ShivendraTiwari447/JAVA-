public class TUt13Majority {

    static int majority(int arr[])
    {
        int major=arr[0],count=1;

        for(int i=1;i<arr.length;i++)
        {
            if(count==0)
            {
                count++;
                major=arr[i];
            }

            else if(major==arr[i]){
                count++;
            }
            else
            {
                count--;
            }
        }
        return major;
    }
    public static void main(String[] args) {
        int a[]={2,4,34,2,42,2,2};
        int m=majority(a);
        System.out.println(m);
    }
    
}
