package se02.day05.em;

/*
 * 季节类，手动实现枚举类
 */
public class Season {
	//属性是固定的，
	private final String SEASON_NAME;
	private final String SEASON_NESC;
	
	//构造必须是私有的，外界不能通过构造对该类进行实例化
	private Season(String season_name,String season_desc) {
		this.SEASON_NAME = season_name;
		this.SEASON_NESC = season_desc;
	}

	public String getSEASON_NAME() {
		return SEASON_NAME;
	}

	public String getSEASON_NESC() {
		return SEASON_NESC;
	}
	
	//4个季节对象（不可变的）
	public static final Season SPRING = new Season("春天", "如沐春风");
	public static final Season SUMMER = new Season("夏天", "知了。。。知了。。。。");
	public static final Season AUTUMN = new Season("秋天", "该穿秋裤了。");
	public static final Season WINTER = new Season("冬天", "注意点，别留哈喇子了!");

	@Override
	public String toString() {
		return "Season [SEASON_NAME=" + SEASON_NAME + ", SEASON_NESC=" + SEASON_NESC + "]";
	}
}
