import java.util.Scanner;

public class SearchStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String b="";
		int x=0;
		System.out.println("Enter the String");
		String a=s.nextLine();
		System.out.println("Enter the word to be searched");
		String c=s.nextLine();
		String d[]=a.split(" ");
		for(int i=0;i<=d.length-1;i++)
		{
		if(d[i].equals(c))
		{
			x++;
			break;
		}
		}
		if(x==1)
		{
			System.out.println("found");
		}
		else
			System.out.println("not found");
		}
	}


