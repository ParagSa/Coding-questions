import java.util.*;
class CustThread extends Thread{
	CustThread(){
		
	}
	CustThread(String name){
		super(name);
		
	}
	public void run(){
		System.out.println(this.getName()+ " started to run");
		try{
			for(int i = 1;i<=5;i++){
			System.out.println(i);
			Thread.sleep(2000);
		 }
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
			
		}
		System.out.println(this.getName()+ "Ended");
	}
}
class MyThread{
	public static void main(String [] args)throws  InterruptedException{
		System.out.println("Main thread started to run");
		CustThread ct1 = new CustThread("Thread1");
		ct1.start();
		CustThread ct2 = new CustThread("Thread2");
		ct2.start();
		
		ct1.join();
		ct2.join();
		System.out.println("Main thread ended");
		
		
	}
}