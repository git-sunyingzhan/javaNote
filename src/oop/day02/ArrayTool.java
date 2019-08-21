package oop.day02;

//Alt+Shift+J文档注视快捷键
/**
 * 该类为数组工具类。里面提供了很多操作数组的方法
 * 
 * @author Administrator
 * @version V5.6
 */
public class ArrayTool {

    /**
     * 构造一个数组工具类
     */
    public ArrayTool() {
    }

    /**
     * 获取指定数组里面的最大值
     * 
     * @param arr int类型数组
     * @return 数组元素最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}