class P1 extends Thread{
    public void run()
    {
        int i=0;
        for(i=0;i<=10;i=i+2){
            System.out.println("p1 :" + i);
        }
    }
}
class P2 extends Thread{
    public void run()
    {
        int i=0;
        for(i=0;i<=10;i=i+2){
            System.out.println("p2 :" + i);
        }
    }
}
public class Tut07MultiT {

    public static void main(String[] args) {
        P1 p1 =new P1();
        P2 p2 =new P2();

        p1.start();
        p2.start();

    }




    
}
