package thiskeyword;

public class ThisMethod {

	public static void main(String[] args) {
		ThisMethod obj=new ThisMethod();
		obj.name("Aji");

	}
	
	public void Sum(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void name(String n)
	{
		System.out.println(n);
		this.Sum(20,40);
	}
}
