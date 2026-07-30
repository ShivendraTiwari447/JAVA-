public class Tut08Exce {
    
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        try{
            c=a/b;
            System.out.println("Result is : "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Exception is : "+e);
        }
        finally{
            System.out.println("Finally block is always executed");
        }
    }
}
