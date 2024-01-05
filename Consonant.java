import java.util.Scanner;
class Consonant
{
	public static void main(String[]args)
	{
		Scanner scc=new Scanner(System.in);
		char str=scc.next().charAt(0);
		if((str>='a'||str>='A')||(str<='z'||str<='Z'))
		{
			//System.out.println("yes it is a alphabet");
			
			 if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u'||str=='A'||str=='E'||str=='I'||str=='O'||str=='U')
				{
					System.out.println("alphabet is vowel");	
				}
		 
				else
				{
						System.out.println("alphabet is consonant");
				}
		}
		else{
				System.out.println("not a alpha");
		}
		
				
		}
	}
}