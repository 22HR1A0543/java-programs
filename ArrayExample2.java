//sum of average of array elements
class ArrayExample2
{
	public static void main(String[]args)
	{
	int arr[]={2,-9,0,5,12,-25,22,9,8,12};
	int sum=0;
	double average;
	for(int i:arr)
	{
		sum=sum+i;
	}
	int arraylength=arr.length;
	average=(double)sum/arraylength;
	System.out.println("sum="+sum);
	System.out.println("average="+average);
}
}