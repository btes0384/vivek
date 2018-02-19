import java.util.Scanner;

public class MultiSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=s.nextLine();
		String s3="";
	     int i,j=0;  

        for( i=0;i<a.length();i++)
        {
          
        if(a.charAt(i)==' '||i==a.length()-1)                                                            
        {
          
            if(i==a.length()-1)
                s3=a.substring(j,i+1);
            else
        s3=a.substring(j,i);
   
    }
	
	}String am = s3;
	am=am.replaceAll("( )+", " ");
        System.out.println(am);
        

}
}