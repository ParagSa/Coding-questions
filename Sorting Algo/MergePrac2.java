import java.util.*;
class MergePrac2{
	public static void main(String [] args){
		int arr[] = {13, 1,4,-10,45,-37,-4,3,39};
		System.out.println(Arrays.toString(arr));
		arr = sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static int[] sort(int arr[] ){
		if(arr.length == 1){
			return arr;
		}
		int mid = (arr.length)/2;
		int [] left = sort(Arrays.copyOfRange(arr,0,mid));
		int [] right = sort(Arrays.copyOfRange(arr,mid, arr.length));
		return add(left,right);
	}
	static int[] add(int [] l, int [] r){
		int i = 0;
		int j
		= 0;
		int k = 0;
		int mix []= new int[l.length+r.length];
		while(i<l.length && j<r.length){
			if(l[i]<r[j]){
				mix[k]= l[i];
				i++;
			}else{
				mix[k]=r[j];
				j++;
			}
			k++;
	    }	
		while(l.length>i){
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
