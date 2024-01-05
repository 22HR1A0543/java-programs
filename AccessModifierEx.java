class AccessModifierEx
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
	class AME
	{
		public static void main(String[]args)
		{
			AccessModifierEx ex=new AccessModifierEx();
			ex.setId(27838);
			ex.setName("chaitu");
			System.out.println("id : "+ex.getId());
			System.out.println("name : "+ex.getName());
			AccessModifierEx ex1=new AccessModifierEx();
			ex1.setId(27839);
			ex1.setName("balaji");
			System.out.println("id : "+ex1.getId());
			System.out.println("name : "+ex1.getName());
			AccessModifierEx ex2=new AccessModifierEx();
			ex2.setId(27830);
			ex2.setName("sai");
			System.out.println("id : "+ex2.getId());
			System.out.println("name : "+ex2.getName());
		}
	}

