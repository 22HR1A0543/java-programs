class AutoBoxing
{
	public static void main(String[]args)
	{
		byte b=10;
		Byte b1= Byte.valueOf(b);
		System.out.println("value of byteis="+b1);
		short s=20;
		Short s1=Short.valueOf(s);
		System.out.println("value of short is="+s1);
		int i=30;
		Integer i1=Integer.valueOf(i);
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='c';
		boolean b2=false;
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		System.out.println("=========boxing=======");
		//System.out.println("************printing object values**********");
		System.out.println("Byte object="+byteobj);
		System.out.println("Short object="+shortobj);
		System.out.println("Integer object="+intobj);
		System.out.println("Long object="+longobj);
		System.out.println("Float object="+floatobj);
		System.out.println("Double object="+doubleobj);
		System.out.println("Charterobject="+charobj);
		System.out.println("Boolean object="+boolobj);
		//System.out.println("========================================");
		//unboxing
		System.out.println("===unboxing===");
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int  intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		//System.out.println("**********printing object values**********");
		System.out.println("Byte value="+bytevalue);
		System.out.println("Short value="+shortvalue);
		System.out.println("Integer value="+intvalue);
		System.out.println("Long value="+longvalue);
		System.out.println("Float value="+floatvalue);
		System.out.println("Double value="+doublevalue);
		System.out.println("Charter value="+charvalue);
		System.out.println("Boolean value="+boolvalue);
		System.out.println("========================================");
	}
	
}

