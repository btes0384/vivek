import java.util.Scanner;

public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String b="";
		System.out.println("Enter the String");
		String a=s.nextLine();
		System.out.println("Enter the word to be searched");
		String c=s.nextLine();
		 if(a.contains(c))
		    {
			 System.out.println("found");
		    }
		 else
			 System.out.println("not found");
	}

}
