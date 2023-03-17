import java.util.*;
import java.io.*;

import java.nio.*;
import java.nio.channels.*;
class ByteBufferDemo{
	public static void main(String [] args) throws IOException{
		FileInputStream fis = new FileInputStream("target.txt");
		FileChannel fcin = fis.getChannel();
		ByteBuffer bb = ByteBuffer.allocate((int)fcin.size());
		fcin.read(bb);
		bb.rewind();
		for(int i = 0;i<(int)fcin.size();i++){
			(char)bb.get(i));
		}
		fcin.close();
		fis.close();
		bb.rewind();
		 
	}
}