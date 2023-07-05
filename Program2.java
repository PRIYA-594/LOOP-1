package Loops1;
import java.util.*;
public class Program2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		int n = num;
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
		s.close();
	}
}
