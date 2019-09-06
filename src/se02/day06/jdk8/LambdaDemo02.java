package se02.day06.jdk8;

@FunctionalInterface
interface Cook{
	void makeFood();
}

public class LambdaDemo02 {

	public static void main(String[] args) {
		invokeCook(()->System.out.println("面包"));
	}

	private static void invokeCook(Cook cook) {
		cook.makeFood();
	}

}
