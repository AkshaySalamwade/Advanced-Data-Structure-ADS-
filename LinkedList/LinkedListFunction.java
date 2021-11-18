import java.util.*;
class LinkedListFunction
{
   static Node head;
  static class Node
  {
     int data;
	 Node next;
	 
	 Node(int data)
	 {
		this.data = data;
		next = null;
	 }

  }

  void insertAtBeginning(int new_data)
  {  Node new_Node = new Node(new_data);
     new_Node.next = head;
     head = new_Node;	 

  }
  
  void insertAtEnd(int new_data)
  {
	  Node new_Node = new  Node(new_data);
	  
       if(head == null )
       {
		 head = new Node(new_data);
         return;
	   }
	   else
	   {
		  Node current = head;
          while(current.next != null)
		  {
			current = current.next;
		  }
		   current.next = new_Node;		
		  
	   }		     
  }
  
  
  
  void AddInBetween(int insertAfter,int data)
  {
	  Node current = head;
	  while(current != null)
	  {
         if(current.data == insertAfter)
         {
			 Node n = new Node(data);
			 n.next = current.next;
			 current.next  = n;
			 break;
		 }
		current = current.next;		
 }		  
	  
  }
  
  void display()
  {  int count = 0;
	 Node tnode = head;
     while (tnode != null) 
	 { count++; 
      System.out.print(tnode.data + "--> ");
      tnode = tnode.next;
	  
     }
	 System.out.println("count is : "+count);
  }
  
  
   Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
  
  
  
 public static void main(String[] args)
 {
	
	LinkedListFunction l1 = new LinkedListFunction();
    
	System.out.println("Indsertion at beginning");
	l1.insertAtBeginning(10);
    l1.insertAtBeginning(20);

    l1.display();  
	
	System.out.println("Indsertion at end");
	l1.insertAtEnd(30);
	l1.insertAtEnd(40);
	l1.display();
	
	System.out.println("Insertion in between");
	l1.AddInBetween(30,34);
	l1.display();
  
        head = l1.reverse(head);
        System.out.println("Reversed linked list ");
        //l1.printList(head);
		l1.display();

    
 }
} 