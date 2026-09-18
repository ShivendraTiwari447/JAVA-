public class Tut26_basic_math {

    static void count(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);

    }

    static int reversee(int n) { // 128
        int rev = 0;
        while (n != 0) {
            int digit = n % 10; // digit = 128%10-- 8
            rev = digit + rev * 10; // re
            n = n / 10;

        }
        return rev;

    }

    static boolean palindrome(String n1) {

        int s = 0;
        int e = n1.length() - 1;

        while (s < e) {

            if (n1.charAt(s) != n1.charAt(e)) {
                return false;
            }

            s++;
            e--;
        }

        return true;
    }

    static int gcd(int a,int b){
        while(a>0 && b>0 )
        {
            if(a>b)
            {
                a=a%b;
            }
            else{
                b=b%a;
            }

            if(a==0)
                return b;
        }
        return a;
    }


   static boolean armstrong(int n) {
    int ans = 0;
    int digit;
    int num = n;

    while (num != 0) {
        digit = num % 10;
        ans = ans + (digit * digit * digit);
        num = num / 10;
    }

    return ans == n;
}
    public static void main(String[] args) {
        // int n=10032;
        // count(n);

        // System.out.println(reversee(158));
        // String s1 = "racecar";
        // System.out.println(palindrome(s1));


        System.out.println(armstrong(153));

    }

}
