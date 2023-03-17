import java.util.*;
public class StringPermut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
       
        List<String> permutations = permute(str);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<String> permute(String str) {
        List<String> permutations = new ArrayList<>();
        if (str.length() == 1) {
            permutations.add(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                List<String> subPermutations = permute(remaining);
                for (String subPermutation : subPermutations) {
                    permutations.add(currentChar + subPermutation);
                }
            }
        }
        return permutations;
    }
}