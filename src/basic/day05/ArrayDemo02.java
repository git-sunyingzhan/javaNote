package basic.day05;

public class ArrayDemo02 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] arr2 = arr;
        arr2[0] = 4;
        arr2[1] = 5;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // ArrayIndexOutOfBoundsException(数组下标越界异常)
        // System.out.println(arr[3]);

        // null:空值，表示不存在，什么都没有
        arr = null;
        System.out.println(arr); // null
        System.out.println(arr[0]); // NullPointerExecption(空指针异常)

    }
}