public class Tut10pyramid {

    static void print(int n){
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            //stars

            for(int k=1;k<=i;k++){
                System.out.print("X");
            }
            System.out.println();
        }

    }

    static void pyramid_with_number(int m)

    {
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=m-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }


    static void floyd(int n)
    {
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print( counter+" " );
                counter++;
         
            }
            System.out.println();
        }
    }


    static void triangle_binary(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(" 1 ");

                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(4);
        System.out.println("---------------------------------------");
        pyramid_with_number(4);
        System.out.println("---------------------------------------");
        floyd(4);
        System.out.println("---------------------------------------");
        triangle_binary(4);
    }
}
