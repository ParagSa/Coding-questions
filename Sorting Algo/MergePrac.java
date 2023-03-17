import java.util.*;
class MergePrac{
	public static void main(String [] args){
		int arr1[] = {1,4,2,3,6,5};
		arr1 = mergesort(arr1);
		System.out.println(Arrays.toString(arr1));
		
	}
	static int [] mergesort(int[] arr){
		if(arr.length==1){
			return arr;
		}
		int mid = arr.length/2;
		int [] left = mergesort(Arrays.copyOfRange(arr,0,mid));
		int [] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
		return merge(left, right);
	}
	static int [] merge(int [] first, int [] second){
		int i =0;
		int j = 0;
		int k = 0;
		int mix[] = new int[first.length+second.length];
		while(i<first.length && j<second.length){
			if(first[i]<second[j]){
				mix[k]=first[i];
				i++;
			}else{
				mix[k]=second[j];
				j++;
			}
			k++;
		}
		while(j<second.length){
			mix[k]=second[j];
			j++;
			k++;
			
		}
		while(i<first.length){
			mix[k]=first[i];
		    i++;
			k++;
		}
		return mix;
	}
}