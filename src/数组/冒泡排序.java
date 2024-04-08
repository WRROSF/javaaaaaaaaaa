package 数组;
import java.util.Arrays;
public class 冒泡排序 {
    public static void main(String[] args){
        int[] a = new int[5];
        for(int i = 0;i<5;i++){
            a[i] = (int)(Math.random()*100);
        }


        System.out.println("反转前为"+Arrays.toString(a));

        System.out.println("反转后为");
        for(int j =0;j<a.length;j++){
            for(int k = 0;k<a.length-1-j;k++){
                if(a[k+1]>a[k]){
                 int temp = a[k];
                 a[k] = a[k+1];
                 a[k+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
