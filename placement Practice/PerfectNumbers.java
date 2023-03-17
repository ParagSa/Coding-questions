import java.util.*;
public class PerfectNumbers {

    public static void main(String[] args) {
        int limit = 1000;

        System.out.println("Perfect numbers between 1 and " + limit + " are:");
        
        for (int i = 1; i <= limit; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        return sum == num;
    }
}
