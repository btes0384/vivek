import java.util.Scanner;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String b="";
		int x=0;
		System.out.println("Enter the String");
		String a=s.nextLine();
		String d[]=a.split(" ");
		for(int i=0;i<d.length;i++)
		{
			if(d[i]!= null)
			{
				for(int j=i+1;j<d.length;j++)
				{
					if(d[i].equals(d[j]))
					{
						d[j]=null;
					}
				}
			}
		}
		
	}

}
