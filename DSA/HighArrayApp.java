import java.util.*;

class HighArray{
	int arr[];
	int n;
	HighArray(){
		
	}
	public HighArray( int max){
		arr = new int[max];
		n= 0;
	}
	
	public void insert(int value){
		arr[n] = value;
		n++;
		
		
	}
	public boolean delete(int num){
		int k;
		for(k = 0;k<n;k++){
			if(arr[k]==num){
				break;
			}
		}
		if(k==n)
			return false;
		else{
			for(int l =k;l<n;l++){
				arr[l] = arr[l+1];
			}
			//n++;
			return true;
		}
		
		
	}
	public boolean find(int key){
		for(int j = 0;j<n;j++){
			if(arr[j]==key){
				return true;
			}else{
				return false;
			}
		}
		return true;
		
		
	}
	public void display(){
		for(int i =0; i<n;i++){
	
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	
	
}
class HighArrayApp{
	public static void main(String[] args){
		
		int size = 5;
		HighArray h1 = new HighArray(size+1);
		h1.insert(12);
		h1.insert(13);
		h1.insert(14);
		h1.insert(128);
		h1.insert(144);
		//h1.insert(144);
		//h1.display();
		
		//System.out.println();
		h1.delete(14);
		//h1.delete(12);
		h1.delete(144);
		//h1.delete(14);
		h1.display();
	}
}