class p7RecursionPalimdromeChecker
{
static int x;
static int check;
static int sum = 0;

	static void display(int n)
	{   
	     x=n;
		if(x>0)
		{
			sum = (sum*10) + (x%10);
			display(x/10);
		}
			
    }

	public static void main(String args[])
    {    
	    int n = 121;
		check=n;
		display(n);
        	
		if (sum==check)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}

    }

}