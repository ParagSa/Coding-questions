class HWDSA3{
	public static void main(String [] args){
		int arr[] = new int[]{2,5,3,2,6,3,3};
		for(int i = 0; i<arr.length-1; i++){
			for(int j = i+1; j < arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
					
				}
			}
			
		}
		
		//int n = 0;
		/*while(n==7){
			for(int i = 1;i<arr.length;i++){
			if(arr[n]==arr[i]){
				System.out.println(arr[n]);
			} 
		  }
		  n++;
		}*/
		
	}
}