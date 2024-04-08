package 数组;

public class 找数组中最大的数 {
    public static void main(String[] args){
        int[] a = new int[5];
        for(int i = 0;i<5;i++){
            a[i] =(int)(Math.random()*100);
            System.out.println(a[i]);
        }




        double max_num = a[0];
        for(int j = 1;j<5;j++){
            if(a[j]>max_num){
                max_num = a[j];
            }
        }
        System.out.println("数组中的最大数是"+max_num);


    }
}
