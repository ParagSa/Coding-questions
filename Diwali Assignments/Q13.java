class Q13{
	public static void main(String[] args){
		//static int aplha = 65;
		for(int i= 1; i<=6;i++){
			int aplha = 64;
			for(int k= i ; k<6;k++){
				System.out.print(" ");
			}
			for(int j = 1; j<=(2*i -1);j++){
				if(j ==1|| j == (2*i-1)){
					System.out.print((char)(aplha+i));
					
				}else{
					 System.out.print(" ");
				}
				
				
			}
		
				
			System.out.println("");
			
		}
		for(int l = 5; l>=1;l--){
			int alpha1 = 64;
			for(int m = l; m<6;m++){
				System.out.print(" ");  
			}
			for(int n = 1; n<=(2*l-1);n++){
				if(n ==1 ||  n==(2*l-1)){
					System.out.print((char)(alpha1+l));  
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
			
			
		}
	}
}