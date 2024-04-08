package 数字和字符串;

public class compareToIgnoreCase {
    public static void main(String[] args) {
        String[] arr =new String[5];
        for (int i = 0; i < 5; i++) {

            arr[i] = RandomArray(5);
        }
        System.out.println("排序前");
        printArrays(arr);
        System.out.println("排序后");
        bubblesort(arr);
        printArrays(arr);



    }

    public static String RandomArray(int length){
        String str = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder x = new StringBuilder();
        while(x.length()<length){
            int index = (int)(Math.random()*str.length());
            x.append(str.charAt(index));



        }
        return x.toString();
    }

    public static void bubblesort(String[] arr){
        String temp;
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j].compareToIgnoreCase(arr[j+1])>0){
                    temp  =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;


                }
            }
        }
    }
    public static void printArrays(String[] arr){
        for(String i:arr){
            System.out.println(i);

        }

    }


}
