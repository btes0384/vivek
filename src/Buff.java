import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
public class Buff {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in); 
        BufferedReader br=new BufferedReader(r); 
         
        System.out.println("Enter your name"); 
        String name=br.readLine(); 
        System.out.println("Welcome "+name); 
        System.out.println("Enter any number"); 
        int n=Integer.parseInt(br.readLine());
        
	}

}
