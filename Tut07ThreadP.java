


public class Tut07ThreadP  extends Thread{
    public void run(){
        System.out.println(getName() + "Priority"+ getPriority());
    }
    public static void main(String[] args) {
     Tut07ThreadP t1 = new Tut07ThreadP();  
     Tut07ThreadP t2 = new Tut07ThreadP();  

     t1.setName("shiv");
     t2.setName("akku");

     t1.setPriority(MAX_PRIORITY);
     t2.setPriority(MIN_PRIORITY);

     t1.start();
     t2.start();

    }
}
