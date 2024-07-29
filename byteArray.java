package practiceStream;

import java.io.*;


public class byteArray {

	public static void main(String[] args) throws Exception
	{
       try {
    	   
    	   
    	   ByteArrayOutputStream bos= new ByteArrayOutputStream(10);
    	   bos.write('A');
    	   bos.write('B');
    	   bos.write('C');
    	   bos.write('D');
    	   
    	   bos.writeTo(new FileOutputStream("E:/Java/Eazybytes/IO/O_p/AllWrite.txt"));
    	   
    	   bos.close();
    	   
//    	   ByteArrayOutputStream bos= new ByteArrayOutputStream(10);
//    	   bos.write('A');
//    	   bos.write('B');
//    	   bos.write('C');
//    	   bos.write('D');
//    	   
//    	   byte[]b= bos.toByteArray();
//    	   for(byte x:b)
//    	   {
//    		   System.out.print((char)x);
//    	   }
//    	   bos.close();
    	   
    	   
    	   
    	   
    	   
    	   
//    	   byte[] b={'a','b','1','2','c','d','3','4','e','f','5','6'};
//    	   ByteArrayInputStream bis= new ByteArrayInputStream(b);
//    	   
//    	   String str = new String(bis.readAllBytes());
//    	   System.out.println(str);
//    	   bis.close();
//    	   int x;
//    	   while((x=bis.read())!=-1)
//    	   {
//    		   System.out.print((char)x);
//    	   }
//    	   bis.close();   
       }
       catch(Exception e) 
       {
    	   System.out.println(e);
    	   
       }

		

	}

}
