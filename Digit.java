import java.util.Scanner;
class Digit
{ 
	public static void main(String [] args)
	{
		Scanner scc=new Scanner(System.in);
		int a=scc.nextInt();
		/*if(a==0||a==1||a==2||a==3||a==4||
		a==5||a==6||a==7||a==8||a==9)
		{
		System.out.println("yes");	
		}
		else{
			System.out.println("no");
			}*/
			if(a>=0&&a<=9)
			{
				System.out.println("yes");	
			}
			else{
			System.out.println("no");
			
			}
		}
}