package 网络编程;
import java.io.IOException;
import java.io.OutputStream;
import java.net.*;
public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",1200);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("狠狠地吴涛".getBytes());
        outputStream.close();
        socket.close();


    }
}