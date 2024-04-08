package 网络编程;

import java.io.IOException;
import java.net.*;

public class UDP发送 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String ii = "出来曹丕";
        byte[] bytes = ii.getBytes();
        int port = 10086;
        InetAddress byName = Inet4Address.getByName("127.0.0.1");
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,byName,port);

        System.out.println(2);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();


    }
}
