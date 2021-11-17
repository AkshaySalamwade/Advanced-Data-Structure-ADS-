class p9RecuseSumInverseSeries
{
	static double sum = 0;
	static int i = 1;
	static double inv;
	static void InvertSeries(Double num)
	{
       	if(i<4)
	    {  
		   inv = num / i ; 
		  sum = sum + inv;
		   i++;
		  InvertSeries(-num);
             		  
        } 

    }

	public static void main(String args[])
	{   
	    double num = 1; 
		InvertSeries(num);
	
        System.out.println("Sum is = "+sum);


    }
}

/****************************************************
 Method 2:

class P8RecursionSeries{
    static double a=1;
    static double b=1;
    static double sum=0;
    
    static void dis(int x)
   {
        
        if(b<=x)
        { 
          a=1/b;
            if (b%2==0)
                {
                    sum = sum -a;    
                }
            else
                {
                     sum = sum+a;
                }
            b++;
            dis(x);
        }
    }

	public static void main(String[] args) {
	dis(3);
	System.out.println(sum);
	}
}















******************************************************/



