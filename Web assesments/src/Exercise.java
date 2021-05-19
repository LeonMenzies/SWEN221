//The answer is not required to have balanced parentheses inside string literals
public class Exercise {

	public static void main(String[] arg) {
		int foo = 10;
		assert ("Foo".equals("Bar".substring(0) + "Foo")) : "assertionFoo=Bar?";
	}
}
