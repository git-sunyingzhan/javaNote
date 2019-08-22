package oop.day05;

class Body {

    // 成员内部类
    // 为了安全，成员内部类需要私有化
    private class Heart {
        public void operator() {
            System.out.println("供血1");
        }
    }

    public void check(Object obj) {
        if (obj instanceof Doctor) {
            Heart h = new Heart();
            h.operator();
        } else if (obj instanceof SDDM) {
            System.out.println("死开");
        }
    }
}

class Doctor {
}

class SDDM {
}

/**
 * InnerDemo02
 */
public class InnerDemo02 {
    public static void main(String[] args) {

        // Body.Heart heart = new Body().new Heart();

        Body body = new Body();
        body.check(new Doctor());
        body.check(new SDDM());
    }
}