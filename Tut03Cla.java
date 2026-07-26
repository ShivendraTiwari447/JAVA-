/*
=========================================
COMMAND LINE ARGUMENTS IN JAVA
=========================================

1. Command Line Arguments:
   - Values passed to the program while running it.
   - Stored in the String array 'args' (or any variable name).

   Syntax:
   public static void main(String[] args)

2. Accessing Arguments:
   args[0] -> First argument
   args[1] -> Second argument
   args[2] -> Third argument

3. Number of Arguments:
   args.length -> Returns total arguments passed.

4. Since all arguments are Strings,
   convert them before performing arithmetic.

   Integer.parseInt(args[i]) -> String to int

=========================================
EXAMPLES
=========================================

1. Print First Argument
   System.out.println(args[0]);

2. Print Second Argument
   System.out.println(args[1]);

3. Convert String to Integer
   int n = Integer.parseInt(args[0]);

4. Divide Number
   System.out.println(n / 2);

5. Print All Arguments
   for(int i = 0; i < args.length; i++)
   {
       System.out.println(args[i]);
   }

6. Sum of All Numbers
   int sum = 0;
   for(int i = 0; i < args.length; i++)
   {
       sum += Integer.parseInt(args[i]);
   }

7. Average of Numbers
   int sum = 0;
   for(int i = 0; i < args.length; i++)
   {
       sum += Integer.parseInt(args[i]);
   }

   System.out.println(sum / args.length);

=========================================
RUNNING THE PROGRAM
=========================================

Compile:
javac Tut03Cla.java

Run:
java Tut03Cla 10 20 30 40

Output:
25

Explanation:
Sum = 10 + 20 + 30 + 40 = 100
Average = 100 / 4 = 25

=========================================
IMPORTANT POINTS
=========================================

✓ Command line arguments are always String.
✓ Use Integer.parseInt() for integers.
✓ args.length gives total arguments.
✓ Array indexing starts from 0.
✓ If no arguments are passed, args.length = 0.
✓ Accessing args[0] without arguments causes
  ArrayIndexOutOfBoundsException.
✓ Passing a non-numeric value to Integer.parseInt()
  causes NumberFormatException.
*/