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
    public static void main(String[] args) {
       int n=10032;
       count(n);
    }
    
}
