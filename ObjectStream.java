package practiceStream;
import java.io.*;

class Stud implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;
    
    public Stud()
    {
        
    }
//    public Stud(int r,String n,float a,String d)
//    {
//        this.rollno=r;
//        this.name=n;
//        this.avg=a;
//        this.dept=d;
//    }
//    
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
    
}

public class ObjectStream
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("E:/Java/Eazybytes/IO/O_p/Serial.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Stud s=new Stud()
        
        oos.writeObject(s);
        
        fos.close();
        oos.close();
        
    }
    
//    public static void main(String[] args) throws Exception
//    {
//        FileInputStream fis=new FileInputStream("C:\\MyJava\\Student3.txt");
//        ObjectInputStream ois=new ObjectInputStream(fis);
//        
//        Student s=(Student)ois.readObject();
//        
//        System.out.println(s);
//        
//        fis.close();
//        ois.close();
//        
//    }
}