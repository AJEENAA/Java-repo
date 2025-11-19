package thiskeyword;

public class ThisVariable {

	public static void main(String[] args) {
		ThisVariable obj=new ThisVariable(35);
	}
	int age;
	public  ThisVariable(int a)
	{
		this.age=a;
		System.out.println(this.age);
	}

}
