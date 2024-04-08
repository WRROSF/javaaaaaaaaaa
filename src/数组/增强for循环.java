package 数组;

public class 增强for循环 {
    public static void main(String[] args){
        int[] a = new int[5];
        for(int i =0;i<5;i++){
            a[i] = (int)(Math.random()*100);
            System.out.println(a[i]);
        }
        int MAX_VALUE = a[0];
        for(int each:a){
            if(each>MAX_VALUE){
                MAX_VALUE =each;

            }



        }
        System.out.println("最大值是"+MAX_VALUE);


    }
}
