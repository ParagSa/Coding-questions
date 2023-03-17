class Question4{
	public static void main(String [] args){
		String str = "19085607";
		char [] ch = str.toCharArray();
		int count = 0;
		
		for(int j = 0; j <ch.length; j++){
			for(int i = 48 ; i<=57; i++){
				if(ch[j]==i){
					count++;
				}
		    }
		}
		if(count==ch.length){
			System.out.println("All digits");
		}
	}
}