public class Tut27_rec_powerSet {
    static void powerSet(String str, String curr, int index) {
        



        if(index==str.length())
        {
            System.out.println(curr);
            return;
        }

        powerSet(str, curr+str.charAt(index), index+1);
        powerSet(str, curr, index+1);
    }
    public static void main(String[] args) {
        powerSet("aa", "", 0);
    }
    
}
