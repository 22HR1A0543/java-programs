import java.util.Scanner;
class Vowel
{
	public static void main(String[]args)
	{
		Scanner scc=new Scanner(System.in);
		char str=scc.next().charAt(0);
		//int i=0;
		//String str="chaithanya";
		if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u'||
		str=='A'||str=='E'||str=='I'||str=='O'||str=='U')
		{
		System.out.println("vowel ");	
		}
		else{
			System.out.println("not found");
			}
		}
}