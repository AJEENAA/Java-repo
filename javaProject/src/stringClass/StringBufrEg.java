package stringClass;

public class StringBufrEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer n=new StringBuffer("Java");
System.out.println(n);

//Method 1 append()
n.append(" Program");
System.out.println(n);

//Method 2 insert()
n.insert(5,"Easy ");
System.out.println(n);

//Method 3 replace()
n.replace(5, 9, "simple");
System.out.println(n);

//Method 4 delete()
n.delete(12, 19);
System.out.println(n);

//Method 5 capacity()

System.out.println(n.capacity());
StringBuffer n1=new StringBuffer("");
System.out.println(n1.capacity());

//Method 6 substring()

System.out.println(n.substring(1, 4));

//Method 7 reverse()
System.out.println(n.reverse());
	}

}
