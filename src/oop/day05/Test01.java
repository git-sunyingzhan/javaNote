package oop.day05;

class Oc {
    public int num = 10;

    class Ic {
        public int num = 20;

        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(new Oc().num);
            System.out.println(Oc.this.num);
        }
    }
}

/**
 * Test01
 */
public class Test01 {

    public static void main(String[] args) {
        new Oc().new Ic().show(); // 30 20 10 10
    }
}