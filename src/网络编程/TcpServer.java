package 网络编程;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1200);
        Socket socket = serverSocket.accept();
//        InputStream inputStream = socket.getInputStream();
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        int b ;
        while((b=bufferedReader.read())!=-1){
            System.out.print((char)b);
        }

        socket.close();
        serverSocket.close();




    }
}
