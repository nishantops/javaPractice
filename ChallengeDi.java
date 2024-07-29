package practiceStream;
import java.io.*;


public class ChallengeDi {
	
	public static void main(String[] args)throws Exception 
	{
		FileOutputStream fos = new FileOutputStream("E:/Java/Eazybytes/IO/O_p/Chal1.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		float list[]= {1.2f,2.2f,3.2f,4,2f};
		
		dos.writeInt(list.length); // Since no end of file marker present in Java.
		for(float a:list)
		{
		dos.writeFloat(a);
		}
		
		fos.close();
		dos.close();
		
		FileInputStream fis = new FileInputStream("E:/Java/Eazybytes/IO/O_p/Chal1.txt");
		DataInputStream dis = new DataInputStream(fis);
		float data;
		int length=dis.readInt();
		for (int i=0;i<length;i++)
		{
			data = dis.readFloat();
			System.out.println(data);
		}
		
		fis.close();
		dis.close();
	}
	
}
