import java.util.Scanner;

public class CountSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int count=0;
		int c=0;
		String b="";
		System.out.println("Enter the word");
		String a=s.nextLine();
		for(int i=0;i<a.length();i++)
        {
        if(a.charAt(i)==' ')   
        {
            count++;
        }
        }
        System.out.println("There are"+" "+count+" "+"Spaces");
	}
	}


