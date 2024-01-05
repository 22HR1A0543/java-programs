class Unary
{
public static void main(String[]args)
{
	/*int n1=20;
	System.out.println(n1);
	n1=-n1;
	System.out.println("adding - "+n1);
	n1=n1++;
	System.out.println("postincrement"+n1);
	n1=n1--;
	System.out.println("postdecrement"+n1);
	n1=++n1;
	System.out.println("preincrement"+n1);
	n1=--n1;
	System.out.println("predecrement"+n1);
	*/
	int i=10;
	int a=i++;
	System.out.println("a="+a);
	System.out.println(i);
	++i;
	System.out.println(i);
	System.out.println(++i);
	System.out.println(i++);
	System.out.println(i);
	int j=10;
	int b=++j;
	System.out.println("b="+b);
}
}