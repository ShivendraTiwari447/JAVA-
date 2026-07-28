abstract class Demo {

    // Instance variables
    int x, y;

    // Abstract class CAN have constructors
    // Constructor executes when child object is created
    Demo() {
        System.out.println("Parent Constructor");
    }

    // Static methods are allowed in Abstract Class
    // Static methods belong to class, not object
    static void f2() {
        System.out.println("Static Method declared in Abstract Class");
    }

    // Abstract Method
    // No body (implementation)
    // Child class MUST override it
    abstract void f3();
}

class Demo2 extends Demo {

    int z;

    // Child Constructor
    Demo2() {
        // Compiler automatically inserts super()
        // Parent constructor executes first
        System.out.println("Child Constructor");
    }

    /*
    // Not Method Overriding
    // Static methods cannot be overridden.
    // This is called Method Hiding.

    static void f2() {
        System.out.println("Static Method");
    }
    */

    // Mandatory implementation of abstract method
    @Override
    void f3() {
        System.out.println("Abstract Method Overridden in Child Class");
    }
}

public class Tut06Abs {

    public static void main(String[] args) {

        // Cannot create object of Abstract Class
        // Demo d = new Demo();   // Compile-Time Error

        // Child object
        Demo2 d2 = new Demo2();

        System.out.println("----------------");

        // Calling overridden method
        d2.f3();

        System.out.println("----------------");

        // Static method called using Class Name
        Demo.f2();

        System.out.println("----------------");

        // Upcasting
        // Parent reference -> Child object
        Demo d = new Demo2();

        // Runtime Polymorphism
        d.f3();

        /*
        ==========================================
                ABSTRACT CLASS REVISION
        ==========================================

        1. Abstract class cannot be instantiated.
           (Cannot create object)

        2. Abstract class can have:
           ✔ Constructors
           ✔ Variables
           ✔ Static methods
           ✔ Normal methods
           ✔ Abstract methods

        3. Abstract method has NO BODY.

        4. Child class MUST override
           every abstract method.

        5. If child doesn't override,
           child must also be abstract.

        6. Constructor of abstract class
           executes before child constructor.

        7. Static methods are NOT overridden.
           They are hidden (Method Hiding).

        8. Abstract class can contain
           0 or more abstract methods.

        9. Abstract class can be used
           for Upcasting.

        10. Runtime Polymorphism is achieved
            using abstract class reference.

        11. Abstract class provides
            Partial Abstraction.

        12. Abstract keyword can be used
            with class and methods,
            NOT with constructors.

        ==========================================
        */
    }
}