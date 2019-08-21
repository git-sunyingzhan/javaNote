package basic.day05;

public class ArrayDemo01 {

    public static void main(String[] args) {
        // 动态初始化
        int[] arr = new int[3];
        System.out.println(arr); // [I@6d9c638 地址值信息
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // 自定义赋值
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 静态初始化
        char[] chs = new char[] { 'a', 'b' };
        char[] chs2 = { 'a', 'b' };
        System.out.println(chs[0]);
        System.out.println(chs2[1]);
    }
}