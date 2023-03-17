import java.util.*;
class CustThread implements Runnable{
	Thread t;
	CustThread(){
		t = new Thread(this);
	}
	CustThread(String name){
		
		t = new Thread(this,name);
	}
	public void run(){
		System.out.println(this.t.getName()+ " started to run");
		try{
			for(int i = 1;i<=5;i++){
			System.out.println(i);
			Thread.sleep(2000);
		 }
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
			
		}
		System.out.println(this.t.getName()+ "Ended");
	}
}
class RunnableDemo{
	public static void main(String [] args)throws  InterruptedException{
		System.out.println("Main thread started to run");
		CustThread ct1 = new CustThread("Thread1");
		ct1.t.start();
		CustThread ct2 = new CustThread("Thread2");
		ct2.t.start();
		
		
		ct1.t.join();
		ct2.t.join();
		System.out.println("Main thread ended");
		
		
	}
}