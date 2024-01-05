import java.util.*;
class ArrayIndexEx
{
	public static void main(String[]args){
		//int arr[]={1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<=10;i++){
		arr[i]=sc.nextInt();
		System.out.println(i);
		
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("++++++++++++++++++++ using for each+++++++++");
		for(int x:arr)
		{
			System.out.println(x);
		}
		System.out.println("element at index 4 is :  "+arr[4]);
		System.out.println("++++++++++++++++++++ using for loop +++++++++");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
			
		}
	}
}