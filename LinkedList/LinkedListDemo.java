import java.util.*;
class LinkedListDemo{

	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void insertAtBeginning(Node new_Node){
		new_Node.next = head;
		head = new_Node;
	}
	
	void append(Node new_Node){
		Node n = head;
		while(n.next != null)
			n = n.next;
		n.next = new_Node;
	}
	
	void insertAtMiddle(int prev_data, Node new_Node){
		Node n = head;
		while(n.data != prev_data)
			n = n.next;
		Node temp = n.next;
		n.next = new_Node;
		new_Node.next = temp;
	}
	
	void delete(int data){
		Node n = head;
		Node temp = head;
		if(head.data == data){
			head = head.next;
			return;
		}
		while(n.data != data){
			temp = n;
			n = n.next;
		}
		temp.next = n.next;
	}
	
	void deleteAtPosition(int pos){
		if(head == null)
			return;
		Node n = head;
		Node temp = head;
		if(pos == 1){
			head = head.next;
		}
		else{
			for(int i=1 ; n!=null && i<pos ; i++){
				temp = n;
				n = n.next;
				//System.out.println(n.data+" "+temp.data);
			}
			if(n == null){
				temp.next = null;
				return;
			}
			temp.next = n.next;
		}
	}
	
	void reverse(){
		Node n1 = head;
		Node n = head;
		Node temp1 = head;
		Node temp = head;
		while(n != null){
			if(n.next != null){
				temp = n1;
				temp1 = n1.next;
				n1 = n1.next;
				temp = n1.next;
				n = n.next;
			}
		}
	}
	
	void display(){
		Node n = head;
		int count = 0;
		System.out.print("Linked List Status : ");
		while(n!=null){
			System.out.print(n.data+" ");
			count++;
			n = n.next;
		}
		System.out.println("   COUNT = "+count);
	}
	
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		LinkedListDemo obj =  new LinkedListDemo();

		System.out.print("Enter the value of head data : ");
		obj.head = new Node(sc.nextInt());

		System.out.print("Enter the number of elements you want to add : ");
		Node[] elements = new Node[sc.nextInt()];
		Node n = obj.head;
		for(int i=0 ; i<elements.length ; i++){
			elements[i] = new Node(sc.nextInt());
			n.next = elements[i];
			n = n.next;
		}
		obj.display();
		
		int choice = 0;
		while(true){
			System.out.println("Enter Your Choice:\n 1.Insert a Node at Beginning\n 2.Insert a Node in the Middle\n 3.Insert a node at the end\n 4.Delete a Node\n 5.Delete at Position\n 6.Reverse the LinkedList");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("Enter the data in new Node : ");
					obj.insertAtBeginning(new Node(sc.nextInt()));
					obj.display();
					break;
				case 2:
					System.out.println("Enter the value after which you want to add the new value and new value");
					obj.insertAtMiddle( sc.nextInt(), new Node(sc.nextInt()) );
					obj.display();
					break;
				case 3:
					System.out.println("Enter value to be appended : ");
					obj.append(new Node(sc.nextInt()));
					obj.display();
					break;
				case 4:
					System.out.println("Enter the value to be deleted : ");
					obj.delete(sc.nextInt());
					obj.display();
					break;
				case 5: 
					System.out.println("Enter the position to be deleted");
					obj.deleteAtPosition(sc.nextInt());
					obj.display();
					break;
				case 6:
					obj.reverse();
					System.out.println("Linked List Reversed.");
					obj.display();
					break;
			}
		
		}
		//Length of linked list
	}
}