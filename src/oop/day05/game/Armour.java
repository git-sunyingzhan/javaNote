package oop.day05.game;

/**
 * 防具
 */
public class Armour {

    private String name;
    private int protect;// 防御值

    public Armour() {
        super();
    }

    public Armour(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }

}