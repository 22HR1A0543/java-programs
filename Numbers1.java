import java.util.*;
class Numbers1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("=====add====");
		System.out.println("enter num1");
		int  num1=sc.nextInt();
		System.out.println("enter num2");
		int  num2=sc.nextInt();
		System.out.println("sum of 2 numbers:"+num1+"+"+num2+"="+(num1+num2));
		System.out.println("sub of 2 numbers:"+num1+"-"+num2+"="+(num1-num2));
		System.out.println("mul of 2 numbers:"+num1+"*"+num2+"="+(num1*num2));
		System.out.println("div of 2 numbers:"+num1+"/"+num2+"="+(num1/num2));
		System.out.println("mod of 2 numbers:"+num1+"%"+num2+"="+(num1%num2));
		}
		}