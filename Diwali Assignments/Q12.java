class Q12{
	public static void main(String[] args){
		int alpha = 64;
		for(int i = 1; i<=6;i++){
			for(int k =5; k>=i; k--){
				System.out.print(" ");
			}
			for(int j = 1; j<=i;j++){
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
	}
}	