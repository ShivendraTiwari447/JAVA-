public class Tut17sec_lar {
    static int sec_small(int arr[])
    {
        int sec_small=Integer.MAX_VALUE;
        int small =Integer.MAX_VALUE;


        for(int i=0;i<arr.length;i++)
        {
            if(arr.length<2){
                return -1;
            }
            if(arr[i]<small)

                {
                    sec_small=small;
                    small=arr[i];

                } else
                    if(arr[i] < sec_small && arr[i] != small){
                         sec_small = arr[i];
                    }
        }
        return sec_small;
    }
    public static void main(String[] args) {
        int arr[]={1,21,34,44,5,2};

        int res=sec_small(arr);
        System.out.println(res);

    }
    
}
