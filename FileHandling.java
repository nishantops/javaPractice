package practiceStream;
import java.io.*;

public class FileHandling {

	public static void main(String[] args)throws Exception {

     File file = new File ("E:\\Java\\Eazybytes\\IO\\O_p\\Data.txt");
     file.setReadOnly();
     FileOutputStream file1=new FileOutputStream("E:\\Java\\Eazybytes\\IO\\O_p\\Data.txt");
//     File[] list = file.listFiles();
//     for(File x:list)
//     {
//    	 System.out.print(x.getName()+"   ");
//    	 System.out.println(x.getPath());
//     }
//     String[] list=file.list();
//     for(String x:list)
//     {
//    	 System.out.println(x);
//     }
     	

	}

}
