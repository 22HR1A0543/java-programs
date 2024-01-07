import java.util.*;
class Demo
{
	public int[] input()//no argument with return array value function
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("please typr"+n+"integers");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
			return arr;

	}
	public int add(int[] a)//with arguments no return value function
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum +=a[i];
		}
			return sum;
	}
}

class Test1
{
	public static void main(String[]args)
	{
		Demo d=new Demo();
		int[] array=new int[5];
		array=d.input();
		int res=d.add(array);
		System.out.println(res);
	}
}
