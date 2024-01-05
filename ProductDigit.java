import java.util.Scanner;
class ProductDigit{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
int product=1;
System.out.println("enter number");
n=sc.nextInt();
while(n>0){
 product=product*(n%10);
n=n/10;
}
System.out.println(product);
}
}