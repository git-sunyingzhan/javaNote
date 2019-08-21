package basic.day04;

public class switchDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        switch (a + b) {
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        default:
            System.out.println("default");
            break;
        }
    }
}
