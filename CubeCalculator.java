import java.util.*;
class CubeCalculator
{
	static int cube(int x){
	return x*x*x;
	}
	public static void main(String[]atgs){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=CubeCalculator.cube(n);
		System.out.println(result);
	}
}