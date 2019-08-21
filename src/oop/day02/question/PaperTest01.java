package oop.day02.question;

import java.util.Scanner;

/**
 * PaperTest01
 */
public class PaperTest01 {

    public static void main(String[] args) {
        // 考卷
        Question01[] paper = new Question01[2];
        // 第一道题目
        paper[0] = new SingleQuestion01(1, "1+1=?", new String[] { "A.1", "B.2", "C.3", "D.4" }, 'B');
        // 第二道题目
        paper[1] = new MultiQuestion01(2, "PI是？", new String[] { "A 3.14", "B 3.141", "C 3.1415", "D 3.14159" },
                new char[] { 'A', 'B', 'C', 'D' });

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < paper.length; i++) {
            // 打印题目
            paper[i].printQuestion();
            System.out.println("请输入答案：");
            String s = sc.nextLine();
            char[] answers = s.toCharArray();// 用户答案
            System.out.println(paper[i].check(answers));
        }
        sc.close();
    }
}