public class Tut26_basic_math {

    static void count(int n)
    {
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);

    }


    static int reversee(int n){ //128
        int rev=0;
        while (n!=0) {  
            int digit=n%10; //digit = 128%10-- 8
            rev = digit + rev*10; //re
            n=n/10;

            
            
        }
        return rev;

    }

    static void palindrome(String n1)
    {
        
    }
    public static void main(String[] args) {
    //    int n=10032;
    //    count(n);

    // System.out.println(reversee(158));


    
    }
    
}
