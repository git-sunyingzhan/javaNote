package basic.day03;

public class OperatorDemo06 {
    public static void main(String[] args) {
        System.out.println(true ? 65535 : 'a'); // 65535对应字符 '\uffff'
        System.out.println(false ? 65535 : 'a'); // 'a'

        System.out.println(true ? 65536 : 'a'); // 65536
        System.out.println(false ? 65536 : 'a'); // 97

        char c = 'a';
        int x = 100;
        System.out.println(true ? x : c); // 100
        System.out.println(false ? x : c); // 97

        System.out.println(true ? 100 : c); // 'd'
        System.out.println(false ? 100 : c); // 'a'
    }
}
