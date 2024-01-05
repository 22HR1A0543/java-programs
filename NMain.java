class NMain

{
	public static void main(){
		System.out.println("no arguments");
	}
	public static void main(int x){
		System.out.println("with arguments");
		
	}
	public static void main(String s){
		System.out.println("welcome"+"  "+s);
	}
	public static void main(String[]args)
	{
		System.out.println("this is main method");
		main();
		
		main(543);
		main("chaitu");
	}
}