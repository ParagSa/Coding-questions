import java.util.*;
public class revEveryWord
{
    public static void main(String []args)
    {
		String str = "hello my name is parag";
		String ans = rev(str);
		System.out.println(ans);
	}
	public static String rev(String str) {
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : arr) {
            String reversed = new StringBuilder(word).reverse().toString();
            sb.append(reversed).append(" ");
        }
        return sb.toString().trim();
    }
}

