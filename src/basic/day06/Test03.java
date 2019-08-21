package basic.day06;

import java.util.Arrays;
import java.util.Random;

//双色球随机选号（优化版）
public class Test03 {
    public static void main(String[] args) {
        String[] redPool = getPool(33);
        String[] bluePool = getPool(16);
        String[] balls = getBalls(redPool, bluePool);// 奖池
        System.out.println(Arrays.toString(balls));
    }

    public static String[] getBalls(String[] redPool, String[] bluePool) {
        // TODO Auto-generated method stub
        String[] balls = new String[redPool.length];
        Random r = new Random();
        int index = 0;// 红球池下标
        int i = 0;// 奖池下标

        while (i < 6) {
            // 随机获取1颗红球下标
            index = r.nextInt(redPool.length);
            // 将抽取到的红球放入奖池中
            balls[i++] = redPool[index];
            // 删除抽取到的红球
            redPool[index] = redPool[redPool.length - 1];
            redPool = Arrays.copyOf(redPool, redPool.length - 1);

        }

        Arrays.sort(balls);
        balls = Arrays.copyOf(balls, balls.length + 1);
        balls[balls.length - 1] = bluePool[r.nextInt(bluePool.length)];

        return balls;
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
