
import java.util.*;
class Main
{  
  int top;
  int size = 5;
  int a1[] = new int[size];
    
    Main(){
	  top = -1;
	}
	
     boolean isEmpty()
	 {
	    if(top <0)
		return true;
		else
		return false;
	 
	 }
	 
	 boolean isFUll()
	 {
	   if(top >= size-1)
	   {
	     return true;
	   }
	   else
	   {
	     return false;
	   }
	 }
	 
	 boolean push(int num)
	 {
	   if(isFUll())
	   {
	      System.out.println("Stack Overflow");
	       return false;
	   }
	   else
	   {
	      a1[++top] = num;
		  System.out.println( num+" is push into stack at position "+ top);	
          return false;    
	   
	   }
	 
	 }
	 
	 
	 int pop()
	 {
	    if(isEmpty())
		{
		   System.out.println("stack Underflow !");
		   return 0;
		}
	    else
		{
		    int x = a1[top--];
	        return x;
		}
	 }
 
 
 
 
 public static void main(String args[])
 {   
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter  the push limit :");
     int limit = sc.nextInt();
     
     Main s1 = new Main();
        System.out.println("push the element");
        for(int i = 0;i<limit;i++)
        {
            
            s1.push(sc.nextInt());
            
        }
        
        
		
	    System.out.println("pop :"+ s1.pop());

		s1.push(100);
 
 
 
 }
}