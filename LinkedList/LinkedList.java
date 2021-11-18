class LinkedList
{
  Node head; //create a node
    
	static class Node
	{
		int data;
		Node next;
           
		   Node(int d)
		   {
				data = d;
				next = null;
		   }


    }	
 
  public static void main(String args[])
  {
	LinkedList l1 = new LinkedList();

	// Assign data values
	   
	   l1.head = new Node(1);
	   Node second = new Node(2);	
	   Node Third = new Node(3);	
  
    // connect nodes 
	  l1.head.next = second;
	  second.next = Third;
	  
	// printing node values  
	
	  while(l1.head != null)
	  {
	     
	  System.out.println(l1.head.data + " ");
	  l1.head = l1.head.next;
	  }
	  
  
  }










}