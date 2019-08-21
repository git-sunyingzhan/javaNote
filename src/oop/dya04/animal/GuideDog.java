package oop.dya04.animal;

/**
 * GuideDog 导盲犬
 */
public class GuideDog extends Dog implements Skill {
    public GuideDog() {
    }

    public GuideDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void guide() {
        System.out.println("导盲犬");
    }

}