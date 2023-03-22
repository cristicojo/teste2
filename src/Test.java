public class Test {

	private static String ham;
	private String dog;

	public Test(String dog) {
		this.dog = dog;
	}


	public static boolean isEqual() {

		Test test = new Test("ham");

		return Test.ham.equals(test.dog);
	}

	public static void main(String[] args) {

		Test.ham = "ham";

		System.out.println(Test.isEqual());

	}
}
