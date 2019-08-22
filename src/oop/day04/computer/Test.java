package oop.day04.computer;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Computer c = new Computer();
        c.open();

        Mouse m = new Mouse();
        c.usbDevice(m);

        c.usbDevice(new KeyBoard());

        c.close();

    }
}