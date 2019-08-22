package oop.day04.computer;

/**
 * KeyBoard
 */
public class KeyBoard implements USB {

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void click() {
        System.out.println("点击键盘");
    }

}