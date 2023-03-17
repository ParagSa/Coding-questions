class first{
	String name;
	first(){
		
	}
	first (String name){
		this.name = name;
	}
	public void finalize(){
		System.out.println("finalize called for :"+name);
	}
}
class demo{
	static void myFun(){
		first f1 = new first("firstobj");
	}
}
class gcollection{
	public static void main(String [] args){
		demo.myFun();
		Runtime.getRuntime().gc();
		
	}
}