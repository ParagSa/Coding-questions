import java.util.*;
class Q {
	int prodno;
	boolean produced;
	synchronized  void put(int no){
		try{
			if(produced==true)
			wait(100);
		   prodno = no;
		   System.out.println("Produced "+prodno);
		   produced=true;
		   notify();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
	}
	synchronized int get() {
		try{
			if(!produced)
			wait(100);
		System.out.println("Consumed "+prodno);
		produced = false;
		//return prodno;
		notify();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		return prodno;
		
		
	}
}
class Producer implements Runnable{
	Thread t;
	Q q ;
	Producer(String name, Q q){
		t = new Thread(this, name);
		this.q = q;
		
		
	}
	public void run(){
		this.produce();
		
	}
	public void produce(){
		for(int i = 0;i<=10;i++){
			q.put(i);
		}
	}
}
class Consumer implements Runnable{
	Thread t;
	Q q ;
	Consumer(String name, Q q){
		t = new Thread(this, name);
		this.q = q;
		
		
	}
	public void run(){
		this.consume();
		
	}
	public void consume(){
		for(int i = 0;i<=10;i++){
			q.get();
		}
	}
}
class ProdConSyncro{
	public static void main(String args[])throws InterruptedException{
		Q q = new Q();
		Producer p = new Producer("producer", q);
	    Consumer c = new Consumer("producer", q);
		p.t.start();
		c.t.start();
		p.t.join();
		c.t.join();
		
		
		
	}
}