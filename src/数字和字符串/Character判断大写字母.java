package 数字和字符串;

public class Character判断大写字母 {
    public static void main(String[] args){
        String iii = "Aaa123";
        char[] cs = iii.toCharArray();
        for(char i:cs ){
            if(Character.isUpperCase(i)){
                System.out.println(i);
            }
        }
    }


}


