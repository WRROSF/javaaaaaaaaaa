package 网络编程;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
public class TcpClients {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1288);
        OutputStream outputStream = socket.getOutputStream();


        outputStream.write("见到你很高兴".getBytes());

        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);


        int b;
        while((b =inputStreamReader.read())!=-1){
            System.out.println((char)b);
        }

        socket.close();




    }
}
