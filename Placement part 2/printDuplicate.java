import java.util.*;
public class printDuplicate
{
    public static void main(String []args)
    {
		String str = "qweassdsdffwefnjj";
		find(str);
	}
	public static void find(String str)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0; i <str.length();i++)
		{
			if(map.containsKey(str.charAt(i))){
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i),count+1);
				
			}else{
				map.put(str.charAt(i),1);
				
			}
			
		}
		String ans= "";
		int l =0;
		for(char key : map.keySet() ){
			if(map.get(key)>1){
				System.out.println(key);
		
				
			}
			l++;
			
		}
		
	}
	
}