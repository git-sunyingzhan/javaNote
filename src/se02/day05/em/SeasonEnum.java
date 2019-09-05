package se02.day05.em;

public enum SeasonEnum {
	//枚举类对象只能在最上面定义
	//4个枚举对象
	//4个季节对象（不可变的）
	SPRING("春天", "如沐春风"),
	SUMMER("夏天", "知了。。。知了。。。。"),
	AUTUMN("秋天", "该穿秋裤了。"),
	Season("冬天", "注意点，别留哈喇子了!");
	
	
	private final String SEASON_NAME;
	private final String SEASON_NESC;

	// 构造必须是私有的，外界不能通过构造对该类进行实例化
	private SeasonEnum(String season_name, String season_desc) {
		this.SEASON_NAME = season_name;
		this.SEASON_NESC = season_desc;
	}

	public String getSEASON_NAME() {
		return SEASON_NAME;
	}

	public String getSEASON_NESC() {
		return SEASON_NESC;
	}
	public String toString() {
		return "Season [SEASON_NAME=" + SEASON_NAME + ", SEASON_NESC=" + SEASON_NESC + "]";
	}
}
