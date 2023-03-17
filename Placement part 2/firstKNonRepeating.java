import java.util.*;
public class firstKNonRepeating
{
    public static void main(String []args)
    {
        String str = "abcdefgace";
        find(str, 3);
        
    }
    public static void find(String str , int k){
       char [] arr = str.toCharArray();
       TreeMap<Character,Integer> set = new TreeMap<>();
       for(int i =0; i<arr.length;i++)
       {
          if(set.containsKey(arr[i])){
         int count = set.get(arr[i]);
         count+=1;
         set.put(arr[i], count);
         }
         else
         {
         set.put(arr[i],1);
         }
         
        }
		int count = 0;
        for(Map.Entry<Character,Integer> entry: set.entrySet()){
			int value =(int)entry.getValue();
			char key =(char)entry.getKey();
			
			//System.out.println(value);
			
         if(value==1 && count<3){
			 count++;
           System.out.print(key+" ");
		 }
        }
      
    }
}