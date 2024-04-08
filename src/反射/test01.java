package 反射;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class test01 {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        student t = new student("小明", 9);
        student s = new student("小李", 20);


        saveObject(t);

    }

    public  static  void  saveObject(Object obj) throws IllegalAccessException, IOException {
        Class aClass = obj.getClass();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\66\\IdeaProjects\\untitled4\\.idea\\jpg\\666.txt"));
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            String name =field.getName();

            Object o = field.get(obj);
            bufferedWriter.write(name+"="+o);
            bufferedWriter.newLine();




        }
        bufferedWriter.close();

    }
}
