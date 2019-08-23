package se01.day01.string_test;

/**
 * StringDemo01
 */
public class StringDemo01 {

    public static void main(String[] args) {
        String s = "abc";
        s = "def";// 改变的是s的地址，之前字符串“abc”没有发生变化
        System.out.println(s);

        // 构造方法
        String str = new String();
        System.out.println(str);

        // 字节数组创建
        byte[] bys = { 97, 98, 99, 100, 101 };
        String str2 = new String(bys);
        System.out.println(str2);

        // 字节数组前三个创建字符串
        String str3 = new String(bys, 2, 3);
        System.out.println(str3);

        // 字符数组创建字符串
        char[] chs = { 'A', 'B', 'C', 'D', 'E' };
        String str4 = new String(chs);
        System.out.println(str4);

        // 字符数组后三个元素创建字符串
        String str5 = new String(chs, 2, 3);
        System.out.println(str5);

        // 字符串常量值转字符串
        String str6 = new String("abc");
        System.out.println(str6);

    }
}