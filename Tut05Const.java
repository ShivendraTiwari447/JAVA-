class Demo {

    // Instance variables (accessible throughout the class)
    int x, y;

    // Default Constructor
    // -> No parameters
    // -> Called automatically when object is created using new Demo()
    Demo() {
        System.out.println("Hello I am without parameter");
    }

    // Parameterized Constructor
    // -> Receives values from object creation
    // -> Initializes instance variables
    Demo(int a, int b) {
        x = a;   // Assign parameter 'a' to instance variable 'x'
        y = b;   // Assign parameter 'b' to instance variable 'y'

        System.out.println("I am constructor with parameter " + x + " " + y);
    }

    // Constructor Overloading
    // -> Same constructor name
    // -> Different parameter list (String)
    Demo(String c) {
        System.out.println("I am String constructor " + c);
    }
}

public class Tut05Const {

    public static void main(String[] args) {

        // Creating object using Default Constructor
        Demo d1 = new Demo();

        // Creating object using String Constructor
        Demo d2 = new Demo("shiv");

        // Creating object using Integer Constructor
        Demo d3 = new Demo(2, 3);

        /*
         * Important Revision Notes
         * ------------------------
         * 1. Constructor name must be same as class name.
         * 2. Constructor has NO return type (not even void).
         * 3. Constructor is called automatically when an object is created.
         * 4. Used to initialize object data.
         * 5. Constructors can be overloaded by changing parameter list.
         * 6. 'new Demo()'      -> Calls Default Constructor
         * 7. 'new Demo("shiv")'-> Calls String Constructor
         * 8. 'new Demo(2,3)'   -> Calls int,int Constructor
         */
    }
}