import java.util.Scanner;
class p2Recurssion
{
	int a = 0;
	int num;
	void Number(int x)
	{   
	    this.num = x;
		++a;
	    if(a<=num)
		{
			System.out.println(a);
			Number(x);
			
		}
	}
	public static void main(String args[])
	{
		p2Recurssion p2 = new p2Recurssion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth Number");
		int x = sc.nextInt();
		p2.Number(x);
	}
		
}