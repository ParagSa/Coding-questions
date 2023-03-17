class OOPJQ13{
	public static void main(String [] args){
		for(int i = 65; i <= 70; i++){
			for(int j = 70; j> i ; j--){
				System.out.print(" ");
				
			}
			System.out.print((char)i); 
			for(int j = 1; j< (i-65)*2 ; j++){
				System.out.print(" ");
				
			}
			if(i==65){
				System.out.println();
			}else{
				System.out.println((char)i);
			}
				
			
		}
		for(int k = 69; k >=65; k--){
			for(int l = 70; l>k ; l--){
				System.out.print(" ");
				
			}
			System.out.print((char)k); 
			for(int l = 1; l< (k-65)*2 ; l++){
				System.out.print(" ");
				
			}
			if(k==65){
				System.out.println();
			}else{
				System.out.println((char)k);
			}
				
			
		}
	}
}
