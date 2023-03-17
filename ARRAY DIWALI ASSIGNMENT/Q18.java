import java.util.*;
	class Q18{
	public static void main(String [] args){
		
		
		int arr[] = {0,78,0,65,77,0,3,90,78,77};
		int sum = 0;
		//int count = 0;
		boolean flag;
		for(int i = 0; i<arr.length;i++){
			for(int j = i+1; j <arr.length;j++){
				if(arr[i]==arr[j]){
					//count++;
					flag = true;
					if(flag == true){
						System.out.println(arr[i]);
						flag = false;
						break;
						
					}
					/*if(count==1){
						count= 0;
						System.out.println(arr[i]);
						break;
						
					}*/
					
				}
			}
		}
		
		
		
		
	}
 
}