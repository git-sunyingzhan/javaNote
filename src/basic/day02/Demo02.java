package basic.day02;

public class Demo02 {

    public static void main(String[] args) {
        // byte a = 128;
        int max = Integer.MAX_VALUE; // 获取int的最大值
        System.out.println(max);
        int b = max + 1; // 运算的时候不检查范围，造成了结果的溢出
        System.out.println(b);

        long lmax = Long.MAX_VALUE; // 获取long最大值
        // 1)64bit最多支持的年份
        // Java中年份是从1970-01-01 00:00:00 开始
        long year = 1970 + lmax / 1000 / 60 / 60 / 24 / 365;
        System.out.println(year);

        // 2)获取当前年份
        // 获取当前时间毫秒值
        long ct = System.currentTimeMillis();
        year = 1970 + ct / 1000 / 60 / 60 / 24 / 365;
        System.out.println(year);
    }

}
