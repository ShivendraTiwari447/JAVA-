package Pack2;

// Package Declaration
// This class belongs to the Pack2 package.

// Importing Tut04pack class from Pack1 package
import Pack1.Tut04pack;

public class Tut04pack2 {

    public static void main(String x[]) {

        // Creating an object of Tut04pack class
        Tut04pack obj = new Tut04pack();

        // Calling setData() method to store values
        obj.setData(10, 20);

        // Calling showData() method to display values
        obj.showData();
    }
}

/*
======================== NOTES ========================

What is a Package?
------------------
A package is a collection of related Java classes and interfaces.
It is used to organize code and avoid naming conflicts.

Advantages of Package
---------------------
1. Organizes classes into folders.
2. Avoids class name conflicts.
3. Improves code reusability.
4. Provides access protection.

Why import is used?
-------------------
import Pack1.Tut04pack;

This statement allows us to use the Tut04pack class
which is present inside the Pack1 package.

Object Creation
---------------
Tut04pack obj = new Tut04pack();

Creates an object of the Tut04pack class.

Method Calls
------------
obj.setData(10,20);
Stores the values 10 and 20.

obj.showData();
Displays the stored values.

========================================================
How I Compiled and Ran the Program
========================================================

Step 1 : Open Command Prompt

Go to the folder where both Java files are stored.

Example:

D:\JAVA

--------------------------------------------------------

Step 2 : Compile Tut04pack.java

Command:

javac -d . Tut04pack.java

Explanation:
-d  -> Destination Directory
.   -> Current Directory

This command automatically creates the Pack1 folder
and places Tut04pack.class inside it.

--------------------------------------------------------

Step 3 : Compile Tut04pack2.java

Command:

javac -d . Tut04pack2.java

This command automatically creates the Pack2 folder
and places Tut04pack2.class inside it.

--------------------------------------------------------

Step 4 : Run the Program

Command:

java Pack2.Tut04pack2

Why do we write Pack2.Tut04pack2 ?

Because Tut04pack2 belongs to the Pack2 package.

Syntax:

java package_name.class_name

--------------------------------------------------------

Output

x = 10, y = 20

========================================================
Important Points
========================================================

1. package keyword is used to create a package.

2. import keyword is used to access classes
   from another package.

3. private variables cannot be accessed
   directly outside the class.

4. public methods can be accessed
   through an object.

5. javac -d . creates the package folder
   automatically.

6. While running a packaged class,
   always use:

   java package_name.class_name

========================================================
*/