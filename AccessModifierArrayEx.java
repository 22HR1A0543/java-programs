class AccessModifierArrayEx
{
	private int id;
	private String name;
	public void setId( int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
}
	class Arrayex
	{
		public static void main(String[]args)
		{
			AccessModifierArrayEx[] ex=new AccessModifierArrayEx[3];
			ex[0]=new AccessModifierArrayEx();
			ex[0].setId(27838);
			ex[0].setName("chaitu");
			System.out.println("id : "+ex[0].getId());
			System.out.println("name : "+ex[0].getName());
			//AccessModifierArrayEx ex1=new AccessModifierArrayEx();
			ex[1]=new AccessModifierArrayEx();
			ex[1].setId(27839);
			ex[1].setName("balaji");
			System.out.println("id : "+ex[1].getId());
			System.out.println("name : "+ex[1].getName());
			//AccessModifierArrayEx ex2=new AccessModifierEx();
			ex[2]=new AccessModifierArrayEx();
			ex[2].setId(27830);
			ex[2].setName("sai");
			System.out.println("id : "+ex[2].getId());
			System.out.println("name : "+ex[2].getName());
		}
	}

