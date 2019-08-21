package basic.day02;

public class Demo05 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        System.out.println(a);

        int x = 100;
        // 强制转换
        // 注意：在进行强转的时候可能会发生数据损失，需要确保强转的值在强转类型范围之内
        byte y = (byte) x;
        System.out.println(y);

        // 常量值运算:先运算，计算结果。查看结果是否在变量的类型范围内
        // 如果在范围内，编译通过；否则，编译出错

    }
}
