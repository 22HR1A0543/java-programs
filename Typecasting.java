class TypeCasting
{
	public static void main(String[]args)
	{
	int i=10;
	//casting frm int to long
	long l=i;
	//casting frm int to double
	double d=i;
	System.out.println("integer  =  "+i);
	System.out.println("long  =  "+l);
	System.out.println("double  =  "+d);
	long l1=100;
	int xy=(int)l1;
		System.out.println("integerxy  =  "+xy);
		
		System.out.println("======= =  ==========");
		double ij=100.245;
		short jk=(short)i;
		int kl=(int)i;
		System.out.println("original  =  "+ij);
		System.out.println("after type casting to short  =  "+jk);
		System.out.println("after type caste to int  =  "+kl);
	}
}