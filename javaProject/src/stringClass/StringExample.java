package stringClass;

public class StringExample {

	public static void main(String[] args) {
		// by using String Literal
		String s="hello";
		String s1="Hello";
		// by using new keyword
		String obj=new String("Sunny");
		String obj1=new String("Sunny");
		System.out.println(s==s1);
		System.out.println(obj==obj1);//used to compare objects
		System.out.println(s.equals(s1));//used to compare value
	}
}
