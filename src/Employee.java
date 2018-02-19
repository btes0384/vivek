import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
int id;
String name;
String department;
long phone;
final static String supervisor ="akhil sir";
final static String head ="shikhi mam";
InputStreamReader r = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(r);
 
Employee()throws IOException
{
	System.out.println("Enter your name"); 
	name=br.readLine(); 
	System.out.println("Enter your Department"); 
	department=br.readLine(); 
	System.out.println("Enter your id"); 
	id=Integer.parseInt(br.readLine());
	System.out.println("Enter your phone no."); 
	phone =Long.parseLong(br.readLine());	
}
void display()
{
	System.out.println("Welcome "+"id: "+id+"  "+"name: "+name+"  "+"phone. "+phone+"  "+"Dept:"+department+"  "+"Supervisor: "+supervisor+"  "+"head: "+head ); 
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Employee  e1= new Employee();
e1.display();
Employee  e2= new Employee();
e2.display();


	}

}
