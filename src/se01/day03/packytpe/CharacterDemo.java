package se01.day03.packytpe;

/*
 * 获取给定字符串中大写字符、小写字符、数字字符、其他字符的个数
 */
public class CharacterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "AhfsDFr23h8rfeusnedsHFE387832^&*%";
		int dx = 0;
		int xx = 0;
		int sz = 0;
		int at = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				dx++;
			}else if(Character.isLowerCase(c)) {
				xx++;
			}else if(Character.isDigit(c)) {
				sz++;
			}else {
				at++;
			}
		}
		System.out.println(dx+","+xx+","+sz+","+at);
	}

}
