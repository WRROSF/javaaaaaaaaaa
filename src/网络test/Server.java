package 网络test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1299);
        Socket socket = serverSocket.accept();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\NIU\\R.jpg"));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = new byte[1024];
        int len;
        while((len =bufferedInputStream.read(bytes) )!=-1){
            bufferedOutputStream.write(bytes,0,len);

        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("上传成功");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        socket.close();
        serverSocket.close();


    }
}
