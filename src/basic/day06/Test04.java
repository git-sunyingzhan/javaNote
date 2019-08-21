package basic.day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 猜字母小游戏
 * 从A～G中随机抽取5个不重复的大写字母作为系统答案
 * 用户在控制台录入A～G范围内的5个大写字母作为用户答案
 * 系统给出提示“匹配的字符数，匹配的位置数”
 * 如果全部猜对，给出提示，游戏结束
 * answer = "DAFBE"
 * input = "ABCDE"
 * "匹配字符数4，匹配的未知数1"
 */
public class Test04 {
    public static void main(String[] args) {
        char[] answerPool = answerPool(7);
        char[] randomAnswer = randomAnswer(5, answerPool);
        System.out.println(Arrays.toString(randomAnswer));
        char[] input = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            input = userInput(sc, 5);
            int[] result = check(randomAnswer, input);
            // 给出提示信息
            if (show(result)) {
                return;
            }
        }

    }

    private static boolean show(int[] result) {
        // TODO Auto-generated method stub
        System.out.println("匹配字符数：" + result[0] + ",匹配位置数：" + result[1]);
        if (result[0] == 5 && result[1] == 5) {
            System.out.println("你真棒！");
            return true;
        }
        return false;
    }

    // 检查系统答案和用户答案，给出匹配的字符数和匹配的位置数
    private static int[] check(char[] randomAnswer, char[] input) {
        // TODO Auto-generated method stub
        int[] reslut = new int[2];
        for (int i = 0; i < randomAnswer.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (randomAnswer[i] == input[j]) {
                    reslut[0]++;
                    break;
                }
            }
            if (randomAnswer[i] == input[i]) {
                reslut[1]++;
            }
        }
        return reslut;
    }

    // 用户录入答案
    public static char[] userInput(Scanner sc, int num) {
        System.out.println("请输入你的答案：");
        String s = sc.nextLine();
        return s.toCharArray();
    }

    // 系统答案池
    public static char[] answerPool(int length) {
        char[] answerPool = new char[length];
        for (int i = 0; i < length; i++) {
            answerPool[i] = (char) (i + 65);
        }
        return answerPool;
    }

    // 生成随机系统答案
    public static char[] randomAnswer(int num, char[] answerPool) {
        Random r = new Random();
        char[] randomAnswer = new char[num];
        int i = 0;// 随机系统答案下标
        int index = 0;// 系统答案池下标
        while (i < num) {
            index = r.nextInt(answerPool.length); // 随机获取系统答案池下标
            randomAnswer[i++] = answerPool[index];
            answerPool[index] = answerPool[answerPool.length - 1];
            answerPool = Arrays.copyOf(answerPool, answerPool.length - 1);

        }

        return randomAnswer;
    }
}
