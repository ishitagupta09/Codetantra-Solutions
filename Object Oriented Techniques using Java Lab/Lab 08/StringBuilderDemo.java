package q24216;
public class StringBuilderDemo {
	public static void main(String args[]) {
		String s = new String("AB");
		System.out.print("In Strings before concatenation Hash Code is: ");
		System.out.println(s.hashCode());
		s += "C";
		StringBuilder sb = new StringBuilder("AB");
	}
}
