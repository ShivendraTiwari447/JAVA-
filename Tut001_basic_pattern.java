class Tut001_basic_pattern {
    static void sq_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    static void pattern_2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    static void pattern_3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern_4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern_5(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    static void pattern_6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern_6_1(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern_7(int n) {

        int spaces = n - 1;
        int stars = 1;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = spaces; j >= 0; j--) {
                System.out.print(" ");
            }

            spaces--;

            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("x");
            }

            stars += 2;

            System.out.println();
        }
    }
    static void pattern_8(int n) {

        int spaces = 0;
        int stars = 2*n-1;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            spaces++;

            // stars
            for (int j = stars; j >= 1; j--) {
                System.out.print("x");
            }

            stars -= 2;

            System.out.println();
        }
    }



    static void pattern_10(int n){
        //normal 
        int k=n;
        for(int i=0;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("x");

            }
            System.out.println();
        }
        //inverted
        for(int i=k;i>=0;i--)
        {
            for(int j=i;j>=0;j--){
                System.out.print("x");
            }
            System.out.println();
        }
    }


    static void pattern_11(int n )
    {
        int v=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                if(j%2==0)
                System.out.print("0");
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    static void pattern12(int n)
    {

    }


    static void pattern_13(int n )
    {
        int v=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(v+" ");
                v++;
            }
            System.out.println();
        }
    }
    static void pattern_14(int n )
    {
        char ch='A';
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    static void pattern_15(int n )
    {
        int k=n;
        char v='a';
         for(int i=k;i>=0;i--)
        {
            for(int j=i;j>=1;j--){
                System.out.print(v+" ");
                v++;
            }
            v='a';
            System.out.println();
        }
    }


    static void pattern_16(int n)
    {
        char v='a';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(v);
            }
            v++;
            System.out.println();
        }
    }


    static void pattern_17(int n) {

    int spaces = n - 1;

    for (int i = 1; i <= n; i++) {

        // spaces
        for (int j = spaces; j > 0; j--) {
            System.out.print(" ");
        }

        // a b c ... 
        for (char ch = 'a'; ch < 'a' + i; ch++) {
            System.out.print(ch);
        }

        // ... b a
        for (char ch = (char)('a' + i - 2); ch >= 'a'; ch--) {
            System.out.print(ch);
        }

        spaces--;

        System.out.println();
    }
}
    
    public static void main(String[] args) {
        System.out.println("Hello");

        // sq_pattern(5);

        // pattern_2(5);
        // pattern_3(5);
        // pattern_4(5);
        // pattern_5(5);
        // pattern_6(5);\
        // pattern_6_1(5);

        // pattern_7(5);
        // pattern_8(5);

        // pattern_22(8);

        // pattern_10(5);
        // pattern_11(5);
        



        // pattern_13(5);




        // pattern_14(5);

        // pattern_15(5);
        // pattern_16(5);


        // pattern_17(5);





    }
}
