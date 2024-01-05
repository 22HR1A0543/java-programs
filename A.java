import java.util.*;
class Az{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int remainder=0;
		int result=0;
		while(number>0)
		{
			number=number%10;
			remainder=remainder*10+number;
			result=number/10
		}
		System.out.println(remainder);
	}

}