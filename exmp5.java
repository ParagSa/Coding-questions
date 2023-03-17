class First
{
	int num = 5;
}

class Second extends First
{
	int num = 10;	//in real life project we normally don't do that. we don't take data member with the 				//same name as it is in the parent class.
}


class exmp5
{
	public static void main(String args[])
	{
		Second f = new Second();		//Use Second f = new Second() then check out the output.
		System.out.println(f.num);
	}
}
