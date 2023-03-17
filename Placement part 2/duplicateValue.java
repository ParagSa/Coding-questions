import java.util.*;

class duplicateValue
{
	public static void main(String []args)
	{
		int []arr= {1,2,3,5,1,4,5,3,2,1,7,0};
		duplicate(arr);
		
	}
	public static void duplicate(int [] arr){
		HashMap<Integer,Integer> countmap= new HashMap<>();
		for(int i = 0; i< arr.length;i++){
			if(countmap.containsKey(arr[i])){
				int count = countmap.get(arr[i]);
				countmap.put(arr[i], count+1);
				
			}else{
				countmap.put(arr[i],1);
			}
		}
		for(int keys: countmap.keySet()){
			if((countmap.get(keys))>1){
				System.out.println(keys);
				
			}
		}
		
	}
}