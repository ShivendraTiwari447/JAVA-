class Car {

    // ==========================
    // Compile-Time Polymorphism
    // Method Overloading
    // ==========================

    void speed() {
        System.out.println("Default Speed : 100 km/h");
    }

    void speed(int s) {
        System.out.println("Speed : " + s + " km/h");
    }

    void speed(double s) {
        System.out.println("Speed : " + s + " km/h");
    }

    // Parent Method
    void engine() {
        System.out.println("Engine : 1000cc");
    }
}

class RacingCar extends Car {

    // ==========================
    // Runtime Polymorphism
    // Method Overriding
    // ==========================

    @Override
    void engine() {
        System.out.println("Engine : 3000cc");
    }

    @Override
    void speed() {
        System.out.println("Default Racing Speed : 240 km/h");
    }
}

public class Tut06Poly {

    public static void main(String[] args) {

        // ===============================
        // Compile-Time Polymorphism
        // Method decided by Compiler
        // ===============================

        Car c1 = new Car();

        c1.speed();          // speed()
        c1.speed(180);       // speed(int)
        c1.speed(220.5);     // speed(double)

        System.out.println("---------------------");

        // ===============================
        // Runtime Polymorphism
        // Parent Reference -> Child Object
        // Method decided at Runtime
        // ===============================

        Car c2 = new RacingCar();

        c2.engine();         // Calls Child Method
        c2.speed();          // Calls Child Method

        // c2.speed(180);
        // No overriding of speed(int),
        // so Parent version executes.

        System.out.println("---------------------");

        // Child Reference -> Child Object

        RacingCar r = new RacingCar();

        r.engine();
        r.speed();
        r.speed(300);        // Inherited overloaded method
        r.speed(350.5);      // Inherited overloaded method

        /*
        ==========================================
               POLYMORPHISM REVISION
        ==========================================

        COMPILE-TIME POLYMORPHISM
        -------------------------
        ✔ Method Overloading
        ✔ Same Method Name
        ✔ Different Parameters
        ✔ Compiler decides method
        ✔ No inheritance required
        ✔ Also called Static Binding

        Examples:
        speed()
        speed(int)
        speed(double)

        ------------------------------------------

        RUNTIME POLYMORPHISM
        -------------------------
        ✔ Method Overriding
        ✔ Inheritance Required
        ✔ Parent Reference -> Child Object
        ✔ JVM decides method at Runtime
        ✔ Also called Dynamic Binding

        Example:
        Car c = new RacingCar();
        c.engine();
        c.speed();

        ------------------------------------------

        Method Overloading Rules
        ✔ Different Number of Parameters
        ✔ Different Datatype
        ✔ Different Order

        Not Allowed:
        int add(int,int)
        double add(int,int)
        (Only return type changed)

        ------------------------------------------

        Method Overriding Rules
        ✔ Same Method Name
        ✔ Same Parameters
        ✔ Child provides new implementation
        ✔ @Override is recommended

        ==========================================
        */
    }
}