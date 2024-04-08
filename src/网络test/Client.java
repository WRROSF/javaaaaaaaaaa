package 网络test;
import java.io.*;
import java.net.*;
import java.nio.Buffer;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1299);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\66\\IdeaProjects\\untitled4\\.idea\\jpg\\R.jpg"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes1 = new byte[1023];




        byte[] bytes = new byte[1024];
        int len ;
        while((len =bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,len);

        }
        socket.shutdownOutput();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line =bufferedReader.readLine();



        socket.close();



    }
}
