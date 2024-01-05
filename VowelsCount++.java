import java.util.Scanner;

class VowelsCount++
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		String s=sc.next();
		int count=0;
	
	for(int i=0;i<=s.length()-1;i++)
	{
	if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt		(i)=='u'))
		{
			count=count+1;
		}
	else if((s.charAt(i)!='a')||(s.charAt(i)!='e')||(s.charAt(i)!='i')||(s.charAt(i)!='o')||(s.charAt(i)!='u'))
	{
	System.out.println(s.length()-count);
	}
	}
System.out.println(count);
}

}