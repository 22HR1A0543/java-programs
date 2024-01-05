import java.util.*;
class Numbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("=====add====");
		System.out.println("enter num1");
		int  num1=sc.nextInt();
		System.out.println("enter num2");
		int  num2=sc.nextInt();
		System.out.println("sum of 2 numbers:"+num1+"+"+num2+"="+(num1+num2));
		System.out.println("====sub=====");
		System.out.println("enter nums1");
		int  nums1=sc.nextInt();
		System.out.println("enter nums2");
		int  nums2=sc.nextInt();
		System.out.println("sub of 2 numbers:"+nums1+"-"+nums2+"="+(nums1-nums2));
		System.out.println("====mul=====");
		System.out.println("enter numm1");
		int  numm1=sc.nextInt();
		System.out.println("enter numm2");
		int  numm2=sc.nextInt();
		System.out.println("mul of 2 numbers:"+numm1+"*"+numm2+"="+(numm1*numm2));
		System.out.println("====div=====");
		System.out.println("enter numd1");
		int  numd1=sc.nextInt();
		System.out.println("enter numd2");
		int  numd2=sc.nextInt();
		if(numd2==0){
			System.out.println("cant divide by zero");
		}
		else{
		System.out.println("div of 2 numbers:"+numd1+"/"+numd2+"="+(numd1/numd2));
		}
		System.out.println("====modulus=====");
		System.out.println("enter nummd1");
		int  nummd1=sc.nextInt();
		System.out.println("enter nummd2");
		int  nummd2=sc.nextInt();
		System.out.println("mod of 2 numbers:"+nummd1+"%"+nummd2+"="+(nummd1%nummd2));
	}
}