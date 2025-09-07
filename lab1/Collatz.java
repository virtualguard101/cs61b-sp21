/** Class that prints the Collatz sequence starting from a given number.
 *  @author virtualguard101@gmail.com
 */
public class Collatz {

    /** 
     * 
    */
    public static int nextNumber(int n) {
        int max = 0;
        while (n > 1){
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n*3 + 1;
            }
            if (max < n) { max = n; }
        }
        return max;
   }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

