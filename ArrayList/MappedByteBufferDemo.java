import java.util.*;
import java.io.*;

import java.nio.*;
import java.nio.channels.*;
class MappedByteBufferDemo{
	public static void main(String [] args) throws IOException{
		FileInputStream fis = new FileInputStream("target.txt");
		FileChannel fcin = fis.getChannel();
		MappedByteBuffer mbb = fcin.map(FileChannel.MapMode.READ_ONLY,0,fcin.size());
		//fcin.read(mbb);
		mbb.rewind();
		for(int i = 0;i<(int)fcin.size();i++){
			System.out.print((char)mbb.get(i));
		}
		fcin.close();
		fis.close();
		mbb.rewind();
		 
	}
}