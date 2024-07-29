package practiceStream;
import java.io.*;


class Student{
	int rollno;
	String name;
	String dept;
}

public class PrintStreamPractice {
	
	public static void main(String[] args)throws Exception {
	
		FileInputStream fis = new FileInputStream("E:/Java/Eazybytes/IO/O_p/PrintStr.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		Student s1 = new Student();
		s1.rollno = Integer.parseInt(br.readLine());
		s1.name=br.readLine();
		s1.dept=br.readLine();
		
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s1.dept);
	

		
		
//	FileOutputStream fos = new FileOutputStream("E:/Java/Eazybytes/IO/O_p/PrintStr.txt");
//	PrintStream ps = new PrintStream(fos);
//	
//	Student s1 = new Student();
//	s1.rollno=32;
//	s1.name = "Nishant";
//	s1.dept = "CSE";
//	
//	ps.println(s1.rollno);
//	ps.println(s1.name);
//	ps.println(s1.dept);
//	
//	ps.close();
//	fos.close();
	
}

}
