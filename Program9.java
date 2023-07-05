package Loops1;
import java.util.*;
public class Program9 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int rev = 0;
		while(num!=0);
		{
			int last = num%10;
			rev+=((rev*10)+last);
			num/=10;
		}
		String res = (num==rev)?"Palindrome":"Not a palindrome";
		System.out.println(res);
		s.close();
	}
}
