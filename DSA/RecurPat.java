import java.util.*;

class RecurPat{
	static float count;
	static float s;
	
	static float recur(float n){
		//float s;
		count++;
		if(n<=0 ){
			return s;
		}else {
			if(count %2==0) {
				s -=(float)1/n;
			   return recur(n-1);
		    }else{
			    s +=(float)1/n;
				return recur(n-1);
		    }
			
		}
	}
	
	public static void main(String[] args){
		System.out.println(Math.abs(recur(3)));
	}
}