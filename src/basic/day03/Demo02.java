package basic.day03;

//导包
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入整数：");
        // 获取nextInt();的返回值 int类型
        int a = sc.nextInt();
        sc.close();
        System.out.println(a);
    }
}
