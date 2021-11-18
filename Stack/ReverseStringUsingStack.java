class stack
{
   int top;
   int max;
   char[] array;
   
     stack(int size)
	 { 
	   top = -1;
	   max = size;
	   array = new char[max];
	   
	 }
     
	 
	boolean isEmpty()
    {
	   return (top == -1);
       
	}

    boolean isFull()
    {
	    return (top==max-1);
    }  
	 
    void push(char i){
		if(isFull())
			System.out.println("Stack is already full");
		else
			array[++top] = i;
	}
	
	public char pop(){
		if(isEmpty())
			return ' ';
		else
			return array[top--];
	}  
}

class ReverseStringUsingStack
{
  public static void main(String srgs[])
  {
    String str = "Akshay Salamwade";
	char[] ch = str.toCharArray();
	
	int size = ch.length;
	
	stack s1 = new stack(size);   
	
	for(char c:ch)
	{
	  s1.push(c);
	}
	
	for(int i = 0;i<size; i++)
	{
			ch[i] = s1.pop();
			
	}
		str = String.valueOf(ch);
		System.out.println("\n"+str);

  }

}

/********************************************************************************************************

// method --- 2

import java.util.*;
class Stack{
	private int maxSize;
	private char [] StackArray;
	private int top;
	
	public Stack(int s){
		maxSize = s;
		StackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char i){
		if(isFull())
			System.out.println("Stack is full");
		else
			StackArray[++top] = i;
	}
	
	public char pop(){
		if(isEmpty())
			return ' ';
		else
			return StackArray[top--];
	}
	
	public char peek(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		return ' ';
		}
			
		else{
			System.out.print(StackArray[top]);
		return StackArray[top];
		}
			
	}
	
	public boolean isFull(){
		return (top==maxSize-1);
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public void printStack(){
		if(isEmpty()){
			System.out.println("stack is empty");
		}
		else{
			for(int i=0; i<=top ;i++){
				System.out.print(StackArray[i]+" ");
			}
		}
		
	}
}

class StackTest{
	public static void main(String args[]){
		String s = "Cdac mumbai is best";
		char c[] = s.toCharArray();
		int maxSize = c.length; 
		Stack s1 = new Stack(maxSize);
		for(char c1: c){
			s1.push(c1);
		}
		for(int i = 0;i<c.length; i++){
			c[i] = s1.peek();
			s1.pop();
		}
		s = String.valueOf(c);
		System.out.println();
		System.out.println(s);
		System.out.println();
				
	}
}

============================================================================================================

//// method --- 3.

class Stack {
    private int top;
    private int capacity;
    private char[] array;
	
public Stack(int capacity) {
        this.capacity = capacity;
        this.array = new char[capacity];
        this.top = -1;
    }

    public boolean isFull() {
        return this.top == this.capacity - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void push(char value) {
        if(!this.isFull()) {
            this.array[++this.top] = value;
        }
    }

    public char pop(){
        return this.isEmpty()?'\u0000':this.array[this.top--];
    }

    public static String reverse(String str) {
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        Stack stack = new Stack(size);

        int i;
        for(i = 0; i < size; ++i) {
            stack.push(charArr[i]);
        }

        for(i = 0; i < size; ++i) {
            charArr[i] = stack.pop();
        }

        return String.valueOf(charArr);
    }


}
public class Main {
  public static void main(String[] args) {
      String str = "CDAC MUMBAI IS BEST";
      System.out.println(Stack.reverse(str));
  }
}



















***********************************************************************************************************/