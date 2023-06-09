class MyNonGen
{
	private Object data;
	
	void setData(Object data)
	{
		this.data = data;
	}
	
	Object getData()
	{
		return data;
	}
}


class NonGenDemo1
{
	public static void main(String args[])
	{
		MyNonGen mg1 = new MyNonGen();
		mg1.setData(5);			//Object data = new Integer(5);	
		int a = (Integer)(mg1.getData());//Integer = Object; child = parent
		System.out.println(a);
		
		MyNonGen mg2 = new MyNonGen();
		mg2.setData("Welcome");		//Object data = "Welcome"
		String s = (String)(mg2.getData());	//String = Object; child = parent
		System.out.println(s);
		
		mg1 = mg2;			//No type safety
	}
}
