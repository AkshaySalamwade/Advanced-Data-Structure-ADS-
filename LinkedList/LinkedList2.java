class LinkedList2
{
  static class Node
	{
		int Data;
		Node Next;
		
		Node(int num)
		{
           Data = num;
		   System.out.println(Data);
		}
	}	


  public static void main(String args[])
  {    
      Node Head = new Node(1);
	  Head.Next = new Node(2);
	  Head.Next.Next = new Node(3);
	  Head.Next.Next.Next = new Node(4);
	  Head.Next.Next.Next.Next = new Node(5);	
  }
}