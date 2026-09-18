import java.util.*;

public class Tut27_generate_binary_string {

    static void generate(int n, String curr, List<String> l) {
        if(curr.length()==n)
           {
                l.add(curr);
                return;
           }

        generate(n, curr +"0", l);

        if (curr.isEmpty() || curr.charAt(curr.length() - 1) != '1') {
            generate(n, curr + "1", l);
        }

    }

    

    public static void main(String[] args) {
        int n = 4;

        // List to store results
        List<String> result = new ArrayList<>();

        // Start recursion with empty string
        generate(n, "", result);

        // Print results
        for (String s : result) {
            System.out.print(s + " ");
        }
        
        System.out.println();
    }
}
