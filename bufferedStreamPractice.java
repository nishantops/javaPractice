package practiceStream;

import java.io.*;

public class bufferedStreamPractice {

	public static void main(String[] args)throws Exception {
		
//		FileOutputStream fos = new FileOutputStream("E:/Java/Eazybytes/IO/O_p/BufferedFile.txt");
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		String str = "This is a first time using Buffered File O/p type";
//		bos.write(str.getBytes());
//		bos.close();
		
		
		
		FileInputStream fis = new FileInputStream("E:/Java/Eazybytes/IO/O_p/Destination.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		System.out.println("file:"+ fis.markSupported());
		System.out.println("Buffer:" + bis.markSupported());
		System.out.println((char)(bis.read()));
		System.out.println((char)(bis.read()));
		bis.mark(10);
		System.out.println((char)(bis.read()));
		System.out.println((char)(bis.read()));
		bis.reset();
		System.out.println((char)(bis.read()));
		System.out.println((char)(bis.read()));
//		int b;
//		while((b=bis.read())!=-1)
//		{
//			System.out.print((char)b);
//		}
	}
}
