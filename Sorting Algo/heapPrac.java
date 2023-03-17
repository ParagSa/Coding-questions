import java.util.*;
class heapPrac{
 static void heapify(int a1[], int n, int i)
 {
	int largest = i;
	int l=2*i+1;//left child
	int r=2*i+2;//right child
	
	if(l<n && a1[l] > a1[largest])
		largest = l;
	if(r<n && a1[r] > a1[largest])
		largest = r;
	
	if( largest != i)
	{
		int temp = a1[i];
		a1[i]=a1[largest];
		a1[largest]=temp;
		heapify(a1, n, largest);
	}
	
 }
 static void heapsort(int a1[])
 {
	int n = a1.length;
	for(int i=n/2-1;i>=0;i--)
		heapify(a1,n,0);
	
	for(int i=n-1;i>=0;i--)
	{	
	int temp = a1[0];
	a1[0]=a1[i];
	a1[i]=temp;
	
	heapify(a1,i,0);//balancing the max heap
	}
	
 }
 static void display(int a1[])
	{
		int n =a1.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}
   public static void main(String args[]){
		//int a1[] = new int[10];
		int a1[]={2,13,24,45,9,30};
		int n =a1.length;
		display(a1);
		System.out.println();
		//bsort(a1);
		//ssort(a1);
		//isort(a1);
		//mergesort(a1,0,n-1);
		//quicksort(a1, 0, n-1);
		heapsort(a1);
		System.out.println("Heap sort");
		display(a1);
		
		
		
	} 

}