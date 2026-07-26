package Pack1;

// Package Declaration
// This class belongs to the Pack1 package.

public class Tut04pack {

    // Private data members
    // These variables cannot be accessed directly from outside the class.
    private int x;
    private int y;

    // Method to assign values to x and y
    public void setData(int a, int b) {
        x = a;
        y = b;
    }

    // Method to display the values of x and y
    public void showData() {
        System.out.println("x = " + x + ", y = " + y);
    }
}