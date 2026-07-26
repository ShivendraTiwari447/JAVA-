class Tut03wrap {
    public static void main(String[] x) {

        // ==============================
        // 1. String -> int using parseInt()
        // ==============================

        // parseInt() converts a String directly into a primitive int.
        int x1 = Integer.parseInt("12334");

        // Output: 12334
        System.out.println(x1);



        // ==============================
        // 2. String -> Integer Object -> int
        // ==============================

        // valueOf(String, radix)
        // Here "10001" is a BINARY (base 2) number.
        // Binary 10001 = Decimal 17
        Integer y1 = Integer.valueOf("10001", 2);

        // intValue() converts Integer object into primitive int.
        int y = y1.intValue();

        // Output: 17
        System.out.println(y);



        // ==============================
        // 3. String -> Double Object -> double
        // ==============================

        // valueOf() converts String into Double wrapper object.
        Double z1 = Double.valueOf("202");

        // doubleValue() converts Double object into primitive double.
        double z = z1.doubleValue();

        // Output: 202.0
        System.out.println(z);




        /*
        ================================================
        Wrapper Class Methods to Remember
        ================================================

        parseInt(String)
            String -------> primitive int

        valueOf(String)
            String -------> Wrapper Object

        intValue()
            Integer Object -------> primitive int

        doubleValue()
            Double Object -------> primitive double

        valueOf(String, radix)
            Converts numbers from different bases.

            Example:
            "1010",2  -> 10
            "17",8    -> 15
            "A",16    -> 10

        ================================================
        Easy Memory Trick

        parseXXX()  -> gives Primitive
        valueOf()   -> gives Wrapper Object
        xxxValue()  -> Wrapper Object -> Primitive

        Think:
        String
           |
        parseInt()      => int

        String
           |
        valueOf()       => Integer
           |
        intValue()      => int
        ================================================
        */
    }
}