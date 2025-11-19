package thiskeyword;

public class ThisConstructor {

	public static void main(String[] args) {
		ThisConstructor obj=new ThisConstructor();
		//ThisConstructor obj1=new ThisConstructor("Ajeena");
		//ThisConstructor obj2=new ThisConstructor(50,75);
	}
	
	public ThisConstructor()
	{
		this("Ajeena");
		int a=30;
		System.out.println(a);
	}
	public ThisConstructor(String name)
	{
		this(40,60);
			System.out.println(name);
	}
	public ThisConstructor(int a,int b)
	{
		int c=a+b;
			System.out.println(c);
	}
}
