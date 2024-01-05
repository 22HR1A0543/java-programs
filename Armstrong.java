import java.util.*;
public class Armstrong
 {
	public static int lenDigit(int n)
	{
		int len=0;
	while(n>0)
	{
		len++;
		n=n/10;
	}
		return len;
	}
public static boolean checkArmstrong(final int  n)
{
 	int sum=0;
	int exp=lenDigit(n);
	int num=n;
	while(num>0)
	{
		sum +=(int)Math.pow((num%10),exp);
		num=num/10;
	}
	return n==sum;
}

public static void main(String[]args)
{
	for(int i=1000;i<=9999;i++)
	//Scanner sc=new Scanner(System.in);
	//int inputNum=sc.nextInt();
	//if(checkArmstrong(inputNum))
	if(checkArmstrong(i))

	{
		System.out.println(i);
	}
	/*else
	{
	System.out.println("no");}
	}*/
}
}	