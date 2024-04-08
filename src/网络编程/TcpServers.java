package 网络编程;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;

public class TcpServers {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1288);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        int b ;
        while( (b =inputStreamReader.read())!=-1){
            System.out.println((char)b);
        }
        OutputStream outputStream = socket.getOutputStream();
        String I = "到底有多高兴";
        outputStream.write(I.getBytes());



        serverSocket.close();



    }
}
