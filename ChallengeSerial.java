package practiceStream;
import java.io.*;
import java.util.Scanner;

class Customer implements Serializable{
	 static String custId;
	 String name;
	 String phoneNo;
	 
	 Customer() {}
	  
	 static int count=0;
	 
	 public	Customer(String name,String phoneNo)
	 { 
	 	 custId="C"+count;
	 	 count ++;
		 name=name;
		 phoneNo=phoneNo;
	 }

		@Override
		public String toString() {
			return "Customer [custId=" + custId + ",name=" + name + ", phoneNo=" + phoneNo + "]";
		}
}
public class ChallengeSerial {

//	public static void main(String[] args) throws Exception
//{
//	FileOutputStream fos = new FileOutputStream("E:/Java/Eazybytes/IO/O_p/Chal2.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		Customer s[] = {new Customer("Nishant","7003046938"),new Customer("Shruti","8789719630"),new Customer("Archita","9625857365")};
//		oos.write(s.length);
//		for(Customer c1:s) {
//		oos.writeObject(c1);
//		}
//		oos.close();
//		fos.close();	
//	}
	
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		 FileInputStream fis = new FileInputStream("E:/Java/Eazybytes/IO/O_p/Chal2.txt"); 
         ObjectInputStream ois = new ObjectInputStream(fis) ;
       
         int length = ois.read();

       Customer list[] = new Customer[length];
           for(int i=0;i<length;i++)
         {
             list[i] = (Customer)ois.readObject();
         }

      System.out.println(" Enter Customer Name: ");
       String n = sc.nextLine();
       for(int i=0;i<list.length;i++){
             if(n.equalsIgnoreCase(list[i].name)){
                System.out.println(list[i]);
            }
         }
        ois.close();
        fis.close();
    }
	   
	}



