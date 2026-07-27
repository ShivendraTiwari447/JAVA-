class Nokia {

    // Instance variables of Parent class
    int x, y;

    // Parent Method
    void f1() {
        System.out.println("I am function of Parent");
    }

    // Parent Default Constructor
    Nokia() {
        System.out.println("I am Parent Default Constructor");
    }

    // Parent Parameterized Constructor
    Nokia(int a, int b) {
        x = a;
        y = b;
        System.out.println("Values initialized by Parent Constructor : " + x + " " + y);
    }
}

class Nokia2 extends Nokia {

    // Child Constructor
    Nokia2() {

        // super() calls Parent Constructor
        // Must be the FIRST statement
        super(2, 3);

        System.out.println("I am Child Constructor");
    }

    // Uncomment to understand Method Overriding
    /*
    @Override
    void f1() {
        System.out.println("I am Child Function");
    }
    */
}

public class Tut05Inherit {

    public static void main(String[] args) {

        // ===============================
        // 1. Child Object Creation
        // Parent Constructor executes first,
        // then Child Constructor
        // ===============================
        Nokia2 n = new Nokia2();

        System.out.println("----------------");

        // ===============================
        // 2. Upcasting
        // Parent Reference -> Child Object
        // Allowed
        // Runtime Polymorphism uses this concept
        // ===============================
        Nokia n1 = new Nokia2();

        System.out.println("----------------");

        // ===============================
        // 3. Parent Object
        // Only Parent Constructor executes
        // ===============================
        Nokia n2 = new Nokia();

        System.out.println("----------------");

        // ===============================
        // 4. Parent Method Call
        // ===============================
        n2.f1();

        System.out.println("----------------");

        // ===============================
        // 5. Upcasting Method Call
        // If Child overrides f1(),
        // Child's version executes
        // Otherwise Parent's version executes
        // ===============================
        n1.f1();

        // ===============================
        // 6. Downcasting
        // NOT Allowed directly
        // Compile Time Error
        // ===============================

        // Nokia2 n3 = new Nokia();

        /*
        ==========================================
                QUICK REVISION NOTES
        ==========================================

        1. extends -> Used for Inheritance.

        2. Child inherits Parent's
           - Variables
           - Methods
           Constructors are NOT inherited.

        3. super() -> Calls Parent Constructor.

        4. super() must always be FIRST statement.

        5. If super() is not written,
           compiler automatically inserts super().

        6. Constructor Execution Order:
              Parent
                 ↓
              Child

        7. Constructor Chaining:
           Child Constructor -> Parent Constructor

        8. Upcasting:
           Parent ref = new Child();
           ✔ Allowed

        9. Downcasting:
           Child ref = new Parent();
           ❌ Not Allowed

        10. IS-A Relationship:
            Nokia2 IS-A Nokia

        11. Method Overriding:
            Same Method
            Same Parameters
            Different Implementation

        12. Runtime Polymorphism:
            Achieved using
            Upcasting + Method Overriding

        13. Object Creation:
            new Child()
            -> Parent Constructor
            -> Child Constructor

        ==========================================
        */
    }
}