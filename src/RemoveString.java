import java.util.Scanner;


public class RemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter your string=");
String a=s.nextLine();
int i;
String b="";
System.out.println("Remove vowels from the string");
for(i=0;i<a.length();i++)
{
	if(a.charAt(i)!='a'&&a.charAt(i)!='e'&&a.charAt(i)!='i'&&a.charAt(i)!='o'&&a.charAt(i)!='u') 
	{
		 b=b+a.charAt(i);
	}
}System.out.println(b);

	}

}
