class LinkedList1
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
      public static void main(String args[])
		{
		   LinkedList1 l1 = new LinkedList1();
		   
		   l1.Head = new Node(1);
		  
		  
		  // Assignig the values to Nodes
		   Node Second = new Node(2); 
		   Node Third = new Node(3);
		   Node Fourth = new Node(4);	
		  
		  // Connecting the Nodes
		   l1.Head.Next = Second;
		   Second.Next = Third;
		   Third.Next = Fourth;
          
          // print the values		  
		   while(l1.Head != null)
		   {
		    System.out.println(l1.Head.data);
            l1.Head = l1.Head.Next; 			
		   
		   }
		
		
		
		}
  }















