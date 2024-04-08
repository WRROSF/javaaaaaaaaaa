package 数组;

import java.util.Arrays;
import java.util.Random;

public class 反转数组 {
    public static void main(String[] args) {
        // 创建一个长度为5的数组
        int[] array = new int[5];
        // 填充随机数
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100); // 假设随机数范围是0到99
        }
        System.out.println("原始数组: " + Arrays.toString(array));

        // 反转数组
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("反转后的数组: " + Arrays.toString(array));
    }
}

