package oop.day02.question;

//多选题
public class MultiQuestion01 extends Question01 {
    char[] answers;// 参考答案

    // 构造
    public MultiQuestion01() {
    }

    public MultiQuestion01(int id, String text, String[] options, char[] answers) {
        super(id, text, options);// super或this需要放在最前面
        this.answers = answers;
    }

    // 重写check
    public boolean check(char[] answers) {
        // 用户没有录入答案或者用户答案个数和参考答案个数不一致
        if (answers == null || answers.length != this.answers.length) {
            return false;
        }
        int count = 0;// 答案匹配个数
        // 拿参考答案中到某个答案和用户所有到答案进行比较
        for (int i = 0; i < this.answers.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (this.answers[i] == answers[j]) {
                    count++;
                    break;
                }
            }
        }

        return count == this.answers.length;
    }
}