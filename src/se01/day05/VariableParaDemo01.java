package se01.day05;

/*
 * 可变参数
 */
public class VariableParaDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(1,2));
		System.out.println(getSum(1,2,3));
		System.out.println(getSum(1,2,3,4));
	}
	
	//求N个int数据之和，n=?
	//args:是所有int类型参数存放的数组名称
	private static int getSum(int... args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int arg:args) {
			sum += arg;
		}
		return sum;
	}

}
