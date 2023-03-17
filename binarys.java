import java.util.*;
class binarys{
	public static void main(String []args){
		int arr2[] = {-12,-10,-8,12,20,58,67,83,100};
		int tar = 83;
		int ans = binarySearch(arr2,tar);
		System.out.println(ans);
		
	}
	static int binarySearch(int arr[], int target){
		int s = 0;
		int e = arr.length-1;
		while(s <=e){
			int mid = s + (e-s)/2;
			if(target<arr[mid]){
				e = mid -1;
			}else if(target>arr[mid]){
				s = mid +1;
				
			}else{
				return mid;
			}
		}
		return -1;
	}
}
