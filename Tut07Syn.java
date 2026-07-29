// Table class
class Table {

    // synchronized method
    // Only one thread can execute this method at a time
    synchronized void printable(int n) {

        int i = 1;

        // Print multiplication table from 1 to 10
        while (i <= 10) {

            System.out.println(n + " X " + i + " = " + n * i);

            i++;
        }
    }
}

public class Tut07Syn {

    public static void main(String[] args) {

        // Create a single shared object
        Table obj = new Table();

        // Thread 1 prints table of 10
        Thread t2 = new Thread(() -> obj.printable(10));

        // Thread 2 prints table of 5
        Thread t1 = new Thread(() -> obj.printable(5));

        // Start both threads
        t2.start();
        t1.start();

        /*
         * Note:
         * 1. Both threads share the same Table object.
         * 2. Because printable() is synchronized,
         *    only one thread can execute it at a time.
         * 3. The output of the tables will NOT mix.
         * 4. However, synchronized does NOT guarantee
         *    that the table of 10 will print first.
         *    The JVM Thread Scheduler decides
         *    which thread gets the lock first.
         */
    }
}

