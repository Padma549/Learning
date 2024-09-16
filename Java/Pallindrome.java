/**
 * 
 */
package Class;
import java.util.Scanner;
public class Pallindrome 
{
	public static void main(String[] args) 
	{
			Scanner Scan = new Scanner(System.in);
			int n = Scan.nextInt();
			int m=0;
			int num=n;
			while(n>0)
			{
				int d=n%10;
				m=(m*10)+d;
				n=n/10;
			}
			if(num==m)
			{
				System.out.println("pallindrome");
			}
			else
			{
				System.out.println("not pallindrome");
			}

	}

}
