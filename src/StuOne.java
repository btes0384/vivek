import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StuOne {
	int id;
	String name;
	String department;
	long phone;
	static int idn =1780;
	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	 
	StuOne()throws IOException
	{
		System.out.println("Enter your name"); 
		name=br.readLine(); 
		System.out.println("Enter your Department"); 
		department=br.readLine(); 
		System.out.println("Enter your phone no."); 
		phone =Long.parseLong(br.readLine());	
		id=idn++;
	}
	void display()
	{
		System.out.println("Welcome "+"id: "+id+"  "+"name: "+name+"  "+"phone. "+phone+"  "+"Dept:"+department+"  "); 
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
StuOne s1=new StuOne();
s1.display();
StuOne s2=new StuOne();
s2.display();
StuOne s3=new StuOne();
s3.display();
	}

}