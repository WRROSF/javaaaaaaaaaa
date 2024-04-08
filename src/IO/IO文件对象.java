package IO;
import java.io.File;
import java.util.Date;
public class IO文件对象 {
    public static  void  main(String[] ARGS){
        File test = new File("D:/bin");
        System.out.println(test.getAbsoluteFile());
        System.out.println(test.isDirectory());
        System.out.println(test.isFile());
        System.out.println(test.length());
        long time = test.lastModified();
        Date d =new Date(time);
        System.out.println(d);
        test.setLastModified(0);
        System.out.println(d);
         String[] gg=  test.list();
         for(String x:gg){
             System.out.println(x);

         }



    }
}
