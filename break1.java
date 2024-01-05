import java.util.Scanner;

public class break1 
{
	public static void main(String[] args)
	 {
	 	Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		byte i=0;
		while(true)
 		{
			i++;
			if(i%2
==0)
			continue;
			else
			{
				System.out.print(i+",");
			}
		i++;
		}
	}
}