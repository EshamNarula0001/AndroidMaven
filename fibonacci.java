import java.io.*;

class fibonacci
{
	public static void main(String []args)throws Exception
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int input=Integer.parseInt(br.readLine());
		
		
		int t1=0,t2=1;
		
		
		for (int i=0;i<=input;i++)
			
			{
				
			System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1=t2;
            t2 = sum;
			
			
			
			} 
	}
}
