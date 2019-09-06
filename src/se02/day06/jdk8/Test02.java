package se02.day06.jdk8;

import java.util.function.Consumer;

public class Test02 {

	public static void main(String[] args) {
		String[] arr = {"迪丽热巴，女","古力娜扎，女","成吉思汗，男"};
		printSS(one->System.out.print("姓名："),
				tow->System.out.print(tow.split("，")[0]),
				three->System.out.print("，性别："),
				four->System.out.println(four.split("，")[1]),arr);
	}
	public static void printSS(Consumer<String> one,Consumer<String> two,
							   Consumer<String> three,Consumer<String> four,
							   String[] str) {
		for (String string : str) {
			one.andThen(two).andThen(three).andThen(four).accept(string);
		}

	}
}
