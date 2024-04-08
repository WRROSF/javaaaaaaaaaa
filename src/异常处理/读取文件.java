package 异常处理;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

 class TestException {

    public static void main(String[] args) {

        File f= new File("D:/。");

        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch(FileNotFoundException e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }

    }
}