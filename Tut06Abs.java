abstract class Demo{
    int x,y;
    Demo(){
        System.out.println("parents constructor");

    }

    static void f2(){
        System.out.println("static method  declared in abstract class ");

    }
    abstract void f3();
}

class Demo2 extends Demo{
    int z;
    Demo2(){
        System.out.println("child constructor ");
    }

    // void f2(){
    //     System.out.println("static method cannot be override here in abstraction");
    // }


    void f3(){
    System.out.println("abstract method override in child class ");
    }

}


public class Tut06Abs {
public static void main(String[] args) {
    Demo2 d2 = new Demo2();
    d2.f3();
    
}
}
