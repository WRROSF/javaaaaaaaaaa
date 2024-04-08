package 线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        try{
            Thread.sleep(3000);

        }catch (Exception e){


        }
        System.out.println(Thread.currentThread().getName()+"子线程");






        return 1;



    }
    public static void main(String[] aegs) throws ExecutionException, InterruptedException {
        ThreadCallable I=new ThreadCallable();
        FutureTask<Integer> H = new FutureTask<Integer>(I);
        new Thread(H).start();
        Integer K = H.get();
        System.out.println(K);


    }
}
