package oop.day02.question;

//题目
public class Question01 {
    int id;// 题号
    String text;// 题干
    String[] options;// 选项

    public Question01() {
    }

    public Question01(int id, String text, String[] options) {
        this.id = id;
        this.text = text;
        this.options = options;
    }

    // 题目输出到控制台
    public void printQuestion() {
        System.out.println(id + "." + text);
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }
    }

    /**
     * 检查用户答案
     * 
     * @param answers 用户录入答案
     * @return 答案是否正确
     */
    public boolean check(char[] answers) {
        return false;
    }

}