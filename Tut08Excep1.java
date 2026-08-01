public class Tut08Excep1 {

    static void test() throws Exception {
        throw new Exception("Custom Exception");
    }

    public static void main(String[] args) throws Exception {

        test();

        System.out.println("Hello");
    }
}