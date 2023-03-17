import java.util.*;
class MergeSort{
	public static void main(String [] args){
		int arr1[] = {1,4,2,3,6,5};
		arr1 = merge(arr1);
		System.out.println(Arrays.toString(arr1));
		
	}
	static int[] merge(int [] arr){
		if(arr.length==1){
			return arr;
		}
		
		int mid = arr.length/2;
		int[] left = merge(Arrays.copyOfRange(arr,0,mid));
		int[] right =merge(Arrays.copyOfRange(arr,mid,arr.length));
		return add(left,right);
	}
	static int[] add(int[] l,int[] r){
		int mix[] = new int[l.length+r.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<l.length && j<r.length){
			if(l[i]<r[j]){
				mix[k]= l[i];
				i++;
			}else{
				mix[k]= r[j];
				j++;
			}
			k++;
		}
		while(i<l.length){
			mix[k] = l[i];
			i++;
			k++;
			
		}
		while(j<r.length){
			mix[k] = r[j];
			j++;
			k++;
			
		}
		
		return mix;
		
	}
}