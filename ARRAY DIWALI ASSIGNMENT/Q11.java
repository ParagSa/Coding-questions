import java.util.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
class Q11{
	public static void main(String [] args)throws IOException{
		/*byte[] bytes = "Parag".getBytes();
		System.out.println(Arrays.toString(bytes));
		String str = new String(bytes);
		System.out.println(str);*/
		 byte[] bytes = "Parag".getBytes(
            StandardCharsets.UTF_8);
  
        // Creating a string from the byte array with
        // "UTF-8" encoding
        String string
            = new String(bytes, StandardCharsets.UTF_8);
  
        // Print and display the string
        System.out.println(string);
		
	}
	
}	