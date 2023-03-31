//use of channel and buffer to write a FILE
package filesystem;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.nio.*;
public class test28 {

	public static void main(String[] args) throws Exception{
		String data="mobile-iphone 14 price-80k,Nokia 2600 price-2600";
		RandomAccessFile file=new RandomAccessFile("C:\\gowtham\\amazon.store","rw");
		ByteBuffer buffer=ByteBuffer.allocate(data.length());
		//System.out.println("contents of buffer: "+buffer.getChar(2));
		for(int i=0;i<data.length();i++) {
			buffer.put((byte) (data.charAt(i)));
		    
		}
		//for(int i=0;i<data.length();i++) {
        //System.out.println("contents of buffer: "+(char)buffer.get(i));
		//}
		FileChannel filechannel=file.getChannel();
		buffer.rewind();
		filechannel.write(buffer);
		System.out.println("Data written to file");
		filechannel.close();
		file.close();
		read();
	}
	public static void read() throws Exception{
		RandomAccessFile file=new RandomAccessFile("C:\\gowtham\\amazon.store","rw");
		FileChannel channel=file.getChannel();
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		int numOfbytesRead=channel.read(buffer);
		for(int i=0;i<numOfbytesRead;i++) {
			char c=(char)buffer.get(i);
			System.out.print(c);
		}
		channel.close();
		file.close();
		
	}

}
