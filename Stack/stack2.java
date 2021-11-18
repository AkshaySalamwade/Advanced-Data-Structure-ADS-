
// User Defined Stack implementation:

import java.util.*;

class stack2
{
  static int MAX = 5;
  static int top;
  int a1[] = new int[MAX];

  stack2()
	{
	   top = -1;
	}
  
  boolean isEmpty()
  {
    return(top < 0);
  }
  
  boolean isFull()
  {
    return(top >= (MAX-1));
  }  
  
  
  boolean push(int x)
  {
	if(top >= (MAX - 1))
	{
		System.out.println("Overflow !!!");
		return false; 
	}
    else
	{
	   a1[++top] = x;
	   System.out.println("push : "+ x);
	    return true;
	}
  }
      
  int pop()
  {
    if(top < 0)
	{ 
	  System.out.println("Underflow");
	  return 0;
	}
    else
	{
	  int x = a1[top--];
	  return x;
	}
  }
  
  
  void display()
  {
	 for(top = 0;top<MAX;top++)
	 {
		System.out.print(a1[top]+" ----> ");
		
	 }		
  }
  
  void peek()
  {
	System.out.print(a1[top-1]);
	  
  }
  
  

  public static void main(String args[])
  { 
	stack2 s1 = new stack2();
    Scanner sc = new Scanner(System.in);
	int n;
	for(int i= 0;i < MAX ; i++)
	  { 
	    n = sc.nextInt(); 
		s1.push(n);
	  }	
				
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.isFull());

        s1.display();
		s1.peek();

  }
}