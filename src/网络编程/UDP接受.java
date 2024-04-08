package 网络编程;
import javax.sound.sampled.Port;
import java.io.IOException;
import java.net.*;
public class UDP接受 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        System.out.println(1);
        datagramSocket.receive(datagramPacket);
        System.out.println(3);
        byte[] data = datagramPacket.getData();
        int len = datagramPacket.getLength();
        int port = datagramPacket.getPort();
        InetAddress address = datagramPacket.getAddress();
        System.out.println("接受到数据"+new String(data,0,len));
        System.out.println(port);
        System.out.println(address);
        datagramSocket.close();

    }
}
