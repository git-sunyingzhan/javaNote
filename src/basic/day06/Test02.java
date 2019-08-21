package basic.day06;

import java.util.Arrays;
import java.util.Random;

/*
 * 双色球随机取号
 * 红球：1～33个，随机抽取6个不重复的球，按升序排列
 * 篮球场：1～16个，随机抽取1个蓝球
 * 6颗红球+1颗蓝球
 * 03 08 13 17 23 31 11
 */
public class Test02 {
    public static void main(String[] args) {
        String[] redPool = getPool(33);
        String[] bluePool = getPool(16);

        String[] redBalls = new String[6]; // 奖池
        // 为球池里面所有的球做一个标记（默认false，表示没有被抽取过）
        boolean[] used = new boolean[33];
        Random r = new Random();
        int index = 0;// 球池下标
        int i = 0;// 奖池下标

        while (true) {
            // 随机抽取一颗球（球池下标）
            index = r.nextInt(redPool.length);
            // 判断球是否被抽取过
            if (used[index]) {
                continue;
            }
            // 奖当前球放入奖池中
            redBalls[i++] = redPool[index];
            // 修改标记
            used[index] = true;
            // 循环结束条件
            if (i == 6) {
                break;
            }
        }
        Arrays.sort(redBalls);
        // 扩容奖池，放入红球
        redBalls = Arrays.copyOf(redBalls, redBalls.length + 1);
        redBalls[redBalls.length - 1] = bluePool[r.nextInt(bluePool.length)];
        System.out.println(Arrays.toString(redBalls));

    }

    // 获取球池
    public static String[] getPool(int length) {
        String[] pool = new String[length];
        for (int i = 0; i < length; i++) {
            if (i < 9) {
                pool[i] = "0" + (i + 1);
            } else {
                pool[i] = (i + 1) + "";
            }
        }
        return pool;
    }

}
