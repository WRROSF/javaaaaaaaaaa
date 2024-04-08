package 数字和字符串;



 class TestString {

    public static void main(String[] args) {
        String str1 = "the light";

        String start = "the";
        String end = "Ight";

        System.out.println(str1.startsWith(start));//以...开始
        System.out.println(str1.endsWith(end));//以...结束

    }

}
