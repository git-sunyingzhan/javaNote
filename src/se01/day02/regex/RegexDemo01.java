package se01.day02.regex;

public class RegexDemo01 {
	public static void main(String[] args) {
		String number = "15156562693";
		boolean bool =  checkTel(number);
		System.out.println(bool);
		String id = "41082319950102017x";
		bool = checkId(id);
		System.out.println(bool);
	}

	// TODO Auto-generated method stub
	/*
	 * 校验手机号码
	 * 1）11位
	 * 2）都是数字
	 * 3）第一位只能是1，第二位3、5、6、9
	 */
	private static boolean checkTel(String number) {
		String regex = "1[3569]\\d{9}";
		return number.matches(regex);
	}
	/*
	 * 验证身份证号码
	 * 1）15位或者18位
	 * 2）如果是18位，最为一位可能是x
	 * 3）其他位都是数字
	 */
	public static boolean checkId(String id) {
		String regex = "\\d{15}(\\d{2}[0-9xX])?";
		return id.matches(regex);
	}
	
}
