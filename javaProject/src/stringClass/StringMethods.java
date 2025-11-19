package stringClass;

public class StringMethods {

	public static void main(String[] args) {
		String a="fruits";
		//1.length()-total number of characters
		System.out.println(a.length());
		//2.charAt
		System.out.println(a.charAt(3));
		//3.valueOf
		int c=10;
		String b=String.valueOf(c);//convert to string for other data types
		System.out.println(b);
		
		String a1="Fruits";
		//4.equals()
		System.out.println(a.equals(a1));
		//5.equalsIgnoreCase
		System.out.println(a.equalsIgnoreCase(a1));//to ignore the case
		
		//6.isEmpty
		System.out.println(a.isEmpty());
		//7.toUpperCase()-not storing the values
		System.out.println(a.toUpperCase());
		
		//8.toLowerCase()-not storing the values
		System.out.println(a.toLowerCase());
		
		//9.concat()-not storing the values
		System.out.println(a.concat(a1));
		//10.contains()
		System.out.println(a.contains("ui"));

	}

}
