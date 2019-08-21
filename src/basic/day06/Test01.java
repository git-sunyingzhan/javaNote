package basic.day06;

/*
 * 在数组中查找指定元素第一次出现的索引值
 * 如果该数组中没有该元素，返回-1
 * 
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 64, 3, 23, 1, 23, 3 };
        System.out.println(getIndex(arr, 3));
    }

    public static int getIndex(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
