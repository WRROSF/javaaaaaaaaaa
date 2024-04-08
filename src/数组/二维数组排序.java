package 数组;

import java.util.Arrays;
import java.util.Random;

public class 二维数组排序 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[5][8];

        // 使用随机数填充二维数组
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100); // 假设随机数范围是0到99
            }
        }

        // 打印未排序的二维数组
        System.out.println("未排序的二维数组:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

        // 对二维数组的每一行进行排序
        for (int[] row : array) {
            Arrays.sort(row);
        }

        // 打印排序后的二维数组
        System.out.println("\n排序后的二维数组:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}

