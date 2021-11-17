class p8RecussionTable
{
   static int num;
   
  
    static void Table(int n,int i)
    {
		 num = n;
	    if(i<11)
		{		
		System.out.println(num+" * "+i+"  = "+(num*i));			
        Table(n,i+1);
		}

	}


	public static void main(String...args)
	{
      int n = 8;
	 int i = 1;
	 Table(n,i);


    }

}


/****************************************************************************************

class P7RecursionTable
{	
	static int a=1;
	static int tab;
	static int b;
		static void Table(int x)
	{
		if(a<=10)
		{	b=x;
			
			tab=a*5;
			System.out.println(tab);
			++a;
			Table(x);
		}
		
	}
		
	public static void main(String []args){
	
	Table(5);
	}
	}
	
















*****************************************************************************************/
