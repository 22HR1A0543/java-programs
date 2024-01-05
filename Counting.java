import java.util.Scanner;
class Counting
{
	static boolean checkDigit(char c)
	{
		boolean b;
		if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
			b=true;
		}
		else{
			b=false;
		}
		return b;
		
	}
	public static void main(String[]args){
		//Scanner sc=new Scanner(System.in);
		String str;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.println("enter a string");
		str=sc.nextLine();
		System.out.println("");
		for(int i=0;i<str.length();i++)
		{
			if(checkDigit(str.charAt(i)))
			{
				count++;
			}
		}
		System.out.println("there are "+ count +" digits in a string");
	}
}