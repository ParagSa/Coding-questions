import java.util.*;
class MergeSortPrac{
	public static void main(String[] args){
		int arr [] = {12,6,-19,45,-17,30,4,67,1,0};
		arr = merge(arr);
		System.out.print(Arrays.toString(arr));
		
	}
	static int [] merge(int[] arr){
		if(arr.length==1){
			return arr;
		}
		int mid = (arr.length)/2;
		int []left = merge(Arrays.copyOfRange(arr,0,mid));
		int []right = merge(Arrays.copyOfRange(arr,mid,arr.length));
		return add(left,right);
	}
	static int[] add(int l[],int r[]){
		int[] mix = new int [l.length+r.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<l.length && j<r.length){
			if(l[i]<r[j]){
				mix[k] = l[i];
				i++;
			}else{
				mix[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<l.length){
			mix[k]= l[i];
			i++;
			k++;
		}
		while(j<r.length){
			mix[k]= r[j];
			j++;
			k++;
		}
		return mix;
		
		
	}
}	