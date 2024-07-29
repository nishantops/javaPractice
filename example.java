package practiceStream;

import java.io.*;

public class example{

	public static void main(String[] args) throws Exception {

		try {
    
//			FileReader fr = new FileReader("E:/Java/Eazybytes/IO/O_p/AllWrite.txt");
//			int x;
//			while((x=fr.read())!=-1) {
//			System.out.print((char)x);
//			}
			
			
			/*
			 * FileInputStream fis = new
			 * FileInputStream("E:/Java/Eazybytes/IO/O_p/AllWrite.txt"); byte[]b = new
			 * byte[fis.available()]; fis.read(b); String str=new String(b);
			 * System.out.println(str);
			 * 
			 */
			
			          FileWriter fw = new FileWriter("E:/Java/Eazybytes/IO/O_p/AllWriter.txt");			
					  String firstTime= "My Name is Nishant, I am trying to learn File IO Writer methods through this";
					  fw.write(firstTime);
					  fw.close();
					             
			 
						/*
						 * FileOutputStream fos = new
						 * FileOutputStream("E:/Java/Eazybytes/IO/O_p/AllWrite.txt"); //
						 * FileOutputStream fos1 = new
						 * FileOutputStream("E:/Java/Eazybytes/IO/O_p/WriteOffset.txt"); // String
						 * firstTime= "My Name is Nishant, I am trying to learn File IO through this";
						 * fos.write(firstTime.getBytes()); // fos.close(); //
						 * fos1.write(firstTime.getBytes(), 3, firstTime.length()-3); //
						 */
	        }
		catch (Exception e)
		   {
			System.out.println(e);
		   }

}
	
}
