class P5RecursiomSumOfSeries{
int a=0;
int num=0;
void show ()
{
	
	++a;
	if (a<=10)
	{
		num = num + a;

		show();
	}
	


}
void show2(){
System.out.println(num);
}

public static void main(String []args){
P5RecursiomSumOfSeries obj = new P5RecursiomSumOfSeries();
obj.show();
obj.show2();

}
}