package se02.day05.em;

public class Test {

	public static void main(String[] args) {
//		test01();
		test02();
	}

	private static void test02() {
		SeasonEnum se = SeasonEnum.SUMMER;
		System.out.println(se);
		
		SeasonEnum[] ses = se.values();
		
		for (SeasonEnum seasonEnum : ses) {
			System.out.println(seasonEnum);
		}
		
		//将字符串转成枚举对象
		String s = "SPRING";
		SeasonEnum spring = Enum.valueOf(SeasonEnum.class, s);
		System.out.println(spring);
	}

	private static void test01() {
		Season s = Season.SPRING;
		System.out.println(s);
	}

}
