package oop.dya04.computer;

class Computer implements USB {

    public void open() {
        System.out.println("开机");
    }

    public void close() {
        System.out.println("关机");
    }

    // public void powerOpen() {
    // System.out.println("开机");
    // }

    // public void powerClose() {
    // System.out.println("关机");
    // }

    public void usbDevice(USB usb) {
        usb.open();
        // 判断usb设备
        if (usb instanceof KeyBoard) {
            KeyBoard kb = (KeyBoard) usb;
            kb.click();
        } else if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.click();
        }
        usb.close();
    }
}