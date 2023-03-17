class Q9{
	public static void main(String[] args){
		for(int i = 1;i<=5;i++){
			
			for(int j = 1; j< i;j++){
				System.out.print(" ");
			}
			for(int k = i; k<=5;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int l = 5-1;l>=1;l--){
			
			for(int n = l;n>=1 ; n--){
				
				System.out.print(" ");
			}
			for(int m = l; m<=5;m++){
				
				System.out.print(m+" ");
			}
			System.out.println();
			
		}
		
	}
}