class p2Recurssion
{
static int a = 0;
	
	static void Number()
	{  ++a;
	    if(a<=10)
		{
			System.out.println(a);
			Number();
			
		}
	}
	public static void main(String args[])
	{
		p2Recurssion p2 = new p2Recurssion();
		p2.Number();
	}
		
}