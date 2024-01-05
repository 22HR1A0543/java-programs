import java.util.*;
public class BreakEx1
{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	byte i=0;
	while(true)
	{
		System.out.println(i+",");
		if(i==n)
		break;
		i++;
		}
}

}