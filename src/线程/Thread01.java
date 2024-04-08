package 线程;

public class Thread01 extends  Thread{
    public  synchronized  void  run(){

        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args){
        new Thread01().start();

        new Thread01().start();
        new Thread01().start();
        System.out.println(Thread.currentThread().getName());

    }
}
