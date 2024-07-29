package practiceStream;
import java.io.*;

public class challenge {

	public static void main(String[] args) throws Exception {
		
		try {
			
			FileInputStream fis1 = new FileInputStream("E:/Java/Eazybytes/IO/O_p/Copy1.txt");
			FileInputStream fis2 = new FileInputStream("E:/Java/Eazybytes/IO/O_p/Copy2.txt");
			FileOutputStream fos = new FileOutputStream("E:/Java/Eazybytes/IO/O_p/Destination.txt");
			SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
			
			int b;
			while((b=sis.read())!=-1)
			{
			fos.write(b);
			}
			sis.close();
			fis1.close();
			fis2.close();
			fos.close();
			
//		  FileInputStream fis = new FileInputStream("E:/Java/Eazybytes/IO/O_p/Copy1.txt");
//		  byte[]b = new byte[fis.available()]; 
//		  fis.read(b); 
//		  String str=new String(b);
//		  String str1=str.toLowerCase();
//		  FileOutputStream fos = new FileOutputStream("E:/Java/Eazybytes/IO/O_p/Copy2.txt");
//		  fos.write(str1.getBytes());

		  } catch(Exception e)
		{
		System.out.println(e);
		}

}
}
