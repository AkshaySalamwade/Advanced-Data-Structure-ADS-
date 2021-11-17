import java.util.Scanner;
class p4evenodd
{
  int a=0;
  int num;
  
  
  void EvenOdd(int num)
  { 
     this.num = num;
	 if(a<num)
	 {	 a++;
		if(a % 2 == 0)
		{	
        System.out.println(a);	
	    }
		EvenOdd(num);
	 }	
   } 


public static void main(String args[])
{
   p4evenodd p4 = new p4evenodd();
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Nth number");
   int num = sc.nextInt();
   
   System.out.println("\n\nEven number upto "+num+ " number are :");
   p4.EvenOdd(num); 


}
}