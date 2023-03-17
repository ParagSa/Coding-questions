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
		first f1 = new first("obj1"); // local referance variable obj1 for gc
	}
}
class gc2{
	public static void main(String [] args){
		demo.myFun();
		first f2 = new first("obj2");
		f2 = null;       // nullfying referance variable
		first f3 = new first("obj3");
		first f4 = new first("obj4");
		f3 = f4                  //referance reassignment f3 ka object gc ma
		//chala jayega
		new first("obj5") //anonymous object creation. gc ma chala jayega
		Runtime.getRuntime().gc();
		// agar dono object ek dusra ka referene rakhega to island isolation hoga.
	}
}