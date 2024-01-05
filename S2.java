//this:to pass as an argument in a method
class S2
{
	void m(S2 obj){
		System.out.println("method invoked");
	}
	void p(){
		m(this);//m(ob)
	}
	public static void main(String[]args){
		S2 ob=new S2();
		ob.p();
	}
}