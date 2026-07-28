class Example {

    // Parent class variables
    public int x, y;

    // 'this' refers to current class object
    void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Display Parent variables
    void display() {
        System.out.println("Parent x = " + x);
        System.out.println("Parent y = " + y);
    }
}

class Example2 extends Example {

    // Child class variables
    int x, y;

    // 'this' refers to Child class variables
    void set1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 'super' refers to Parent class variables
    void set2(int x, int y) {
        super.x = x;
        super.y = y;
    }

    void displayChild() {
        System.out.println("Child x = " + this.x);
        System.out.println("Child y = " + this.y);
    }

    void displayParent() {
        System.out.println("Parent x = " + super.x);
        System.out.println("Parent y = " + super.y);
    }
}

public class Tut06this_and_super {

    public static void main(String[] args) {

        Example2 e = new Example2();

        // Calls Parent method
        e.set(2, 3);

        // Sets Child variables
        e.set1(4, 5);

        // Updates Parent variables
        e.set2(41, 43);

        System.out.println("------------");

        e.displayChild();

        System.out.println("------------");

        e.displayParent();

        System.out.println("------------");

        // Parent display() method
        e.display();

        /*
        =========================================
             this & super REVISION NOTES
        =========================================

        this Keyword
        ------------
        1. Refers to current object.
        2. Access current class variables.
        3. Call current class methods.
        4. Call current class constructor
           using this().
        5. Used when local and instance
           variable names are same.

        Example:
        this.x = x;

        -----------------------------------------

        super Keyword
        -------------
        1. Refers to Parent class.
        2. Access Parent variables.
        3. Call Parent methods.
        4. Call Parent constructor
           using super().

        Example:
        super.x = x;

        -----------------------------------------

        Difference

        this.x   -> Child variable
        super.x  -> Parent variable

        this()   -> Current constructor
        super()  -> Parent constructor

        =========================================
        */
    }
}