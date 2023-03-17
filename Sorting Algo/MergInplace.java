import java.util.*;
class MergeInplace{
	public static void main(String [] args){
		int arr1[] = {1,4,2,3,6,5};
		mergesort(arr1,0,arr1.length);
		System.out.println(Arrays.toString(arr1));
		
	}
	static void mergesort(int[] arr,int s, int e){
		if(e-s==1){
			return;
		}
		int mid = (s+e)/2;
		mergesort(arr,s,mid);
		mergesort(arr,mid,e);
		mergeInplace(arr, s,mid,e);
	}
	static void mergeInplace(int [] arr,int start,int middle,int end){
		int i =start;
		int j = middle;
		int k = 0;
		int mix[] = new int[end -start];
		while(i<middle && j<end){
			if(arr[i]<arr[j]){
				mix[k]=arr[i];
				i++;
			}else{
				mix[k]=arr[j];
				j++;
			}
			k++;
		}
		while(j<end){
			mix[k]=arr[j];
			j++;
			k++;
			
		}
		while(i<middle){
			mix[k]=arr[i];
		    i++;
			k++;
		}
		for(int l = 0; l<mix.length;l++){
			arr[start+l] = mix[l];
		}
	}
}