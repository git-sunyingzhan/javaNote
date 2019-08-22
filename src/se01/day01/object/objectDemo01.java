package se01.day01.object;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + name + ",age:" + age;
    }

    @Override
    // 方法尽量复杂点：减少出现对象的特征值不同，但是对象的哈希码值相同
    public int hashCode() {
        final int prime = 12;
        int result = 1;
        result = result * prime + age;
        result = prime * result + (name == null ? 0 : name.hashCode());
        return result;
    }
}

/**
 * objectDemo01
 */
public class objectDemo01 {

    public static void main(String[] args) {
        Student stu = new Student("小明", 11);

        String str = stu.toString();
        System.out.println(str);

        System.out.println(stu);// toString()可以省略

        Student stu2 = new Student("小明", 11);
        Student stu3 = new Student("小王", 12);
        // hashCode
        System.out.println(stu.hashCode());
        System.out.println(stu2.hashCode());
        System.out.println(stu3.hashCode());
    }
}