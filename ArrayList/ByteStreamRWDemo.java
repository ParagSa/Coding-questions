import java.io.*;
import java.util.*;
class ByteStreamRWDemo{
	public static void main(String args[])throws IOException{
		File fin = new File("/java programs/ArrayList/InputOutput.txt");
		File fout = new File("/java programs/ArrayList/target.txt");
		
		if(!fin.exists())
		{
			System.out.println("Not Exists");
			return;
		}
		
		FileInputStream fis = new FileInputStream(fin);
		// FileOutputStream fos = new FileOutputStream(fout);
		FileOutputStream fos = new FileOutputStream(fout, true);//append to the file
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch;
	
		while((ch = bis.read())!=-1){
			System.out.print((char)(ch));
			fos.write(ch);
			
		}
		bis.close();
		bos.flush();
		bos.close();
		fis.close();
		fos.close();
		System.out.println("  File copied successfully and Closed");
		
		
	}
}