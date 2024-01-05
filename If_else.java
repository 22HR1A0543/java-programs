import java.util.*;
class Ifelse
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int i,j;
i=sc.nextInt();
j=sc.nextInt();
if(j==0)
{
System.out.println("division by error");
}
else
{
System.out.println(i+" divide by "+j+"is"+(i/j));
i=i+j;
}
}
}