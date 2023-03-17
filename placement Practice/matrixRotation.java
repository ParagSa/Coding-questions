import java.util.*;
public class matrixRotation
{
	public static void main(String [] args)
	{
	int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int [] frow = new int[4];
		int k = -1;
		for(int i =0;i<arr.length; i++){
			for(int j = 0; j<arr[0].length; j++){
				k++;
				frow[k] = arr[i][j];
				//System.out.println(arr[i][j]);
				
				
			}
		}
		for(int i =0;i<frow.length; i++){
			System.out.println(frow[i]);
		}
		
		
	}
	
}