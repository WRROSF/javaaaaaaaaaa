package 线程;

public class RunnableThread implements Runnable{
    public void run(){

        System.out.println(Thread.currentThread().getName()+"这是子线程");

    }

    public static  void  main(String[] args){
        //启动线程
        new Thread(new RunnableThread()).start();
        //匿名内部类创建线程
        new Thread(new RunnableThread(){
            public void run(){
                System.out.println("我是一个子线程");

            }

        }).start();
        //用lambda表达式创建线程
           new Thread(() ->{
               System.out.println("我是一个子线程");
           }).start();
    }
}
