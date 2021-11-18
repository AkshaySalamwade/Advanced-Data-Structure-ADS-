class LLDisplay
{
  Node Head;   // Creating the Head Node
 
  static class Node
  {
     int data;
	 Node Next;
		
		Node(int d)
		{
			data = d;
			Next = null;
		}
  }	
 
	
	public void Display()
	{
	  Node current = Head;
	  while(current != null)
	  {
	    System.out.print(current.data + "--->");
	     current= current.Next;
	  }
	  System.out.print("null");
	}
	
	public void Length()
	{
		
	int count = 0;
    Node cur = Head;
    
      while(cur != null)
	  {
		  count++;
		  cur = cur.Next;
	  }
		
	  System.out.println(count);
	
	}

public static void main(String args[])
{  
   LLDisplay l1 = new LLDisplay();
   
       l1.Head = new Node(10);
		  
		  
		  // Assignig the values to Nodes
		   Node Second = new Node(20); 
		   Node Third = new Node(30);
		   Node Fourth = new Node(40);	
		  
		  // Connecting the Nodes
		   l1.Head.Next = Second;
		   Second.Next = Third;
		   Third.Next = Fourth;
		   
     l1.Display(); 
	 
	 System.out.println("\n ----Size of  Linked List is : ----------");
	 
     l1.Length(); 

}
}