package basic.day06;

public class CountinueDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // continue;
                break;
                // return;
            }
            System.out.println(i);
        }
        System.out.println("over");
    }

}
