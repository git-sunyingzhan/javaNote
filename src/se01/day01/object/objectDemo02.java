package se01.day01.object;

class Teacher implements Cloneable {
    String name;
    int age;

    public Teacher() {

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher [age=" + age + ", name=" + name + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/**
 * objectDemo02
 */
public class objectDemo02 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher("老王", 52);
        // 克隆
        Object tc = teacher.clone();
        System.out.println(tc);
    }
}