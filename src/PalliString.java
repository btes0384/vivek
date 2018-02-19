import java.util.Scanner;

public class PalliString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String b="";
System.out.println("Enter the word");
String a=s.nextLine();
for(int i=a.length()-1;i>=0;i--)
{
    b=b+a.charAt(i);
}
System.out.println(b);
if(a.equals(b))
{
    System.out.println("Pallindrome");
   
}
else
    System.out.println("Not Pallindrome");

	}

}
