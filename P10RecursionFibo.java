class P10RecursionFibo{
static int a=0;
static int b=1;
static int c=0;
static int num=2;


static void show()
{ 
	
	if((num-2)>0){
		
	c = a+b;
	a = b;
        b = c;
    System.out.println(c);
		num--;
	show();
}
}
	public static void main(String []args){
	P5RecursionFibo obj = new P5RecursionFibo();
    
	if(num >= 1) 
	System.out.println(a);
    
    if(num >= 2)
	{		
	System.out.println(a);    
    System.out.println(b); 
	}

 	
	obj.show();
}

}