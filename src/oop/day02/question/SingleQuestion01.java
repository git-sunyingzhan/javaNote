package oop.day02.question;

//单选题
public class SingleQuestion01 extends Question01 {
    char answer;// 参考答案

    // 构造
    public SingleQuestion01() {
    }

    public SingleQuestion01(int id, String text, String[] options, char answer) {
        super(id, text, options);// super或this需要放在最前面
        this.answer = answer;
    }

    // 重写check
    public boolean check(char[] answers) {
        // 没有答案,或者答案个数不是一个
        if (answers == null || answers.length != 1) {
            return false;
        }
        return answers[0] == answer;
    }
}