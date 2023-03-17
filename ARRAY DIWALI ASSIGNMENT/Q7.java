import java.util.*;
class Q7{
	static int count;
	public static void main(String [] args){
		int arr[] = {23,60,94,3,102};
		int arr2[] = {42,16,74};
		int k= 0;
		int l = 0;
		int arr3[] = new int[arr.length+arr2.length];
		for(int i = 0; i<arr3.length;i++){
			if(i%2==0 || i==0 || l==arr2.length){
				if(k<arr.length){
					arr3[i] = arr[k];
			        k++;
				}
			}else{
				if(l<arr2.length){
					arr3[i]= arr2[l];
					l++;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr3));
		
		
		
		
		
	}
	
}	