import java.io.*;
import java.util.*;

class FileClassDemo{
	public static void main(String args[]){
		File f = new File("/java programs/ArrayList");
		if(f.exists()){
			System.out.println("exist");
		}
		if(f.isDirectory()){
			String filenames[] = f.list();
			System.out.println(Arrays.toString(filenames));
			
			System.out.println("It is a Directory");
			File []fileObj = f.listFiles();
			
			for(File f1 : fileObj){
				if(f1.isDirectory()){
					System.out.println(f1.getName()+"  It is a directory");
				}
				else
				{
					System.out.println(f1.getName()+"  It is a file");
				}
				
			}
		}
		else{
			System.out.println("It is a file");
		}
	}
	
}