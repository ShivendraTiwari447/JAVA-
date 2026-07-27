class Demo{
    int x,y;
    Demo()

    {
        System.out.println("hello I m without parameter");
    }

    Demo(int a,int b){
        x=a;
        y=b;
        System.out.println("I am constructor with paramter" + x + y);
    }
    Demo(String c){
        System.out.println("i am string constructor " + c);
    }
}


public class Tut05Const {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo("shiv");
        Demo d3 = new Demo(2,3);
    }
}
