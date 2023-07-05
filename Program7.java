package Loops1;
import java.util.*;
public class Program7 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Program7 pr = new Program7();
		int num = s.nextInt();
		int c = pr.count(num);
		System.out.println(c);
		int sum=0;
		do
		{
			sum=pr.sumDigits(num);
			c=pr.count(sum);
		}while(c==1);
		System.out.println(sum);
		s.close();
	}
	public int sumDigits(int n)
	{
		
		int sum= 0;
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public int count(int n)
	{
		int c = 0;
		while(n!=0)
		{
			c++;
			n/=10;
		}
		return c;
	}
}
