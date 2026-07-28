interface I1 {

    // By default:
    // public static final
    int x = 6;

    // By default:
    // public abstract
    void f1();

    // Static method
    // Belongs to Interface
    // Not inherited
    static void f2() {
        System.out.println(x);
        System.out.println("Static method of I1");
    }
}

interface I2 extends I1 {

    // Constant
    int x = 9;
    int y = 2;

    /*
     * Interface cannot override abstract methods.
     * It only inherits them.
     *
     * If body is required,
     * method must be default or static.
     */

    // This does NOT override I1.f2()
    // Interface static methods are hidden,
    // not overridden.
    static void f2() {
        System.out.println(x);
        System.out.println("Static method of I2");
    }
}

class C1 implements I2 {

    // This is NOT overriding Interface static method.
    // This is a new static method in class.
    static void f2() {
        System.out.println(I2.x);
        System.out.println("Static method of Class");
    }

    // Mandatory implementation
    @Override
    public void f1() {
        System.out.println("Abstract method implemented.");
    }

    void f3() {
        System.out.println("Class Method");
    }
}

public class Tut06InterF {

    public static void main(String[] args) {

        C1 c = new C1();

        System.out.println("----------------");

        // I2.x hides I1.x
        System.out.println(c.x);

        System.out.println("----------------");

        System.out.println(c.y);

        System.out.println("----------------");

        c.f1();

        System.out.println("----------------");

        // Calls class static method
        C1.f2();

        System.out.println("----------------");

        // Interface static methods
        I1.f2();

        System.out.println("----------------");

        I2.f2();

        System.out.println("----------------");

        c.f3();

        /*
        ==========================================
                INTERFACE REVISION NOTES
        ==========================================

        1. Interface supports
           Multiple Inheritance.

        2. Variables are always
           public static final.

        3. Methods are by default
           public abstract.

        4. Interface cannot be instantiated.

        5. Class uses IMPLEMENTS.

        6. Interface extends Interface.

        7. Class implements Interface.

        8. Class MUST implement all
           abstract methods.

        9. Static methods are allowed
           from Java 8.

        10. Static methods are NOT inherited.

        11. Static methods are NOT overridden.

        12. Default methods CAN have body.

        13. One class can implement
            multiple interfaces.

        14. Interface achieves
            100% abstraction
            (traditional Java concept).

        15. Interface variables cannot
            be modified because they are final.

        Example:
        x = 10;   // Compile-time Error

        ==========================================
        */
    }
}