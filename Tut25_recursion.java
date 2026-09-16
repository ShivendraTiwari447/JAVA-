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
    static void print(int n,int i){
       if(n==i){
       return;
       }
       System.out.println("shiv"+i);

       print(n, i+1);
    }

    static void print_no(int n,int i){
        if(n==i){
            return;
        }
        System.out.println(i);
        print_no(n, i+1);
    }



    static void print_no_r(int n){
        if(n==0) return;
        System.out.println(n);
        print_no_r(n-1);
    }



    public static void main(String[] args) {

        int arr[]={1,23,4,53,5,3,5};
        
        // 
        // System.out.println(is_sorted(arr, 0));


        // print(5, 0);


        // print_no(11, 1);


        // print_no_r(10);
        
    }
    
}
