package se01.day02.date;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		i = i++;
//		System.out.println(i);
		int j = i++;
		int k = i++ + ++i * i++;
		System.out.println("i="+i);//6
		System.out.println("j="+j);//2
		System.out.println("k="+k);//
	}

}
