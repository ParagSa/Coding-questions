import java.util.*;

class klargestEle
{
	public static void main(String []args)
	{
		int [] arr = {1,4,17,7,25,3,100};
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		find(arr,ans);
	}
	public static void find(int [] arr, int k)
	{
		Arrays.sort(arr);
		for(int i =arr.length-1 ; i>=arr.length-k; i--){
			System.out.println(arr[i]);
			
		}
		
		
	}
}