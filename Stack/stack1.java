class stack1
{
  int MAX = 5;
  int top;
  int a1[] = new int[MAX];

  stack1()
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
	stack1 s1 = new stack1();

		s1.push(10);
		s1.push(12);
		s1.push(14);
		s1.push(15);
		s1.push(18);
		
	    System.out.println("pop :"+ s1.pop());

		s1.push(100);
		s1.push(110);		
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.isFull());

        s1.display();
		s1.peek();

  }
}