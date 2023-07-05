package Loops1;
import java.util.*;
public class Program5 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
		s.close();
	}
}
