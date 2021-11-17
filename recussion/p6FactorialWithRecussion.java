
public class Main
{
	static int factorial(int number)
	{
	    if(number == 0)
	    {
	        return 1;
	    }
	    else
	    {
	        
	        return number * factorial(number - 1);
	    }
	    
	    
	}
	
		
	public static void main(String[] args) {
		
	 int number = 4;
	 int fact = factorial(number);
	 
	 System.out.println("Factorial of given number :"+fact);	
	 	
		
		
		
	}
}



/***************************************************************************************************

class p6FactorialWithRecussion
{
static int num = 5;
static int fact = 1;
static void Factorial()
   {
      while(num>0)
	  {
	    fact = fact * num;
		num--;
		
		Factorial();
	  }
   }


public static void main(String args[])
  {
   p6FactorialWithRecussion p6 = new p6FactorialWithRecussion();
   p6.Factorial();
   
   System.out.println(fact);
  }
}

===============================================================================================

class P4RecursionFctoral{

static int a=0;
	static int sum=1;
	static int show(int x)
	{a++;
	if(a<=x)
	{  
		sum = sum*a;
		show(x);
		
	}
	return sum;
}
public static void main(String []args){

System.out.println(show(5));
}
}
================================================================================================
class Main
{
  static int n =1;
  static int sum = 1;
  static void Sum()
  {  ++n;
    if(n<=5)
	{  
	  sum = sum * n;
	  Sum(); 
	}	 
  }
  
public static void main(String args[])
{
  Main p5 = new Main();
  p5.Sum();
  System.out.println("Factorial is  : "+sum);


}
}

================================================================================================















******************************************************************************************************/