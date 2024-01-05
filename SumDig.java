import java.util.*;
class SumDig
{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0)
		{
			int digit=num%10;
			int sum=sum+0;
			num=num/10;
		}
		System.out.println(sum);
	}

}