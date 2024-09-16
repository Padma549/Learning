/**
 * 
 */
package Class;
import java.util.Scanner;
public class FIBANOCISIS {

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = Scan.nextInt();
		int a=0;
		int b=1;
		System.out.println(a+" "+b);
		for(int i=3;i<=n;i++)
		{
			int c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
		

	}

}
