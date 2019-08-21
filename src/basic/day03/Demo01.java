package basic.day03;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(0b100); // 4
        System.out.println(0x100); // 256
        System.out.println(010); // 8

        // 十进制转二进制
        System.out.println(Integer.toBinaryString(100)); // 1100100

        // 十进制转八进制
        System.out.println(Integer.toOctalString(100)); // 144

        // 十进制转十六进制
        System.out.println(Integer.toHexString(100)); // 64

        System.out.println(Integer.toBinaryString(-100));

    }

}
