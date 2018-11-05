import java.io.*;

class factorial
{
public static void main(String args[])throws Exception
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a;
	
	System.out.println("Enter the number whether to check it is prime or not");
	a=Integer.parseInt(br.readLine());
	
	Boolean flag=false;
    int i,number;
	number=a/2;
	
	for( i=2;i<=number;i++)
		
	
	{
		
     if(a%i==0)
	 {
      flag=true;
	}	  }
	 if(flag)
	 {
		 System.out.println("its  not prime:");
		 
	 }
	 else
	 {System.out.println("it's prime");
	 }
	 
	
	 
	 
	}
	
	
	
}

	