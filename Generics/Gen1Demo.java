import java.util.*;
class TwoNum<T extends Number>{
	T a;
	T b;
	TwoNum(T a,T b){
		this.a = a;
		this.b = b;
		
	}
	double sum(){
		double res = a.doubledataue() + b.doubledataue();
		return res;
	}
	
}
class Gen1Demo{
	public static void main(String []args){
		TwoNum <Double>t = new TwoNum<Double>(5.12,10.09);
		double res = t.sum();
		System.out.println(res);
	}
}