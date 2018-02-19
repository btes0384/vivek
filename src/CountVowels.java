import java.util.Scanner;

public class CountVowels {

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
        if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')   
        {
            count++;
        }
        else
        	c++;
        }
        System.out.println("Vowels are"+" "+count);
        System.out.println("consonents are"+" "+c);
   
	}

}
