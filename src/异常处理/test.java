package 异常处理;

public class test {
    public static void main(String[] args){

        int x = method();
        System.out.println(x);

    }
    public static int method() {
        try {
            // 代码逻辑
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }


}
