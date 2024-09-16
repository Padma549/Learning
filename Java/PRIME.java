package Class;
import java.util.Scanner;
public class PRIME {

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter a prime number");
		int n = Scan.nextInt();
		if(n<=1)
		{
			System.out.println("not a prime");
		}
		else
		{
			boolean flag=true;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("prime number");
			}
			else 
			{
				System.out.println("not a prime num");
			}
		}
		
		
		
	}

}
