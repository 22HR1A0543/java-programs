import java.util.*;
class Chaitu
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*for(int i=0;i<=n;i++){
			System.out.print(i+",");
		}*/
		/*for(int i=0;i<=n;i+=5)
		{
			System.out.print(i+",");		
	}*/
	/*for(int i=n;i>=0;i--){
			System.out.print(i+",");
		}*/
		for(int i=n;i>=0;i-=5)
		{
			System.out.print(i+",");		
	}
}
}