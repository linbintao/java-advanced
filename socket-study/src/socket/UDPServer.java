package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 服务器端
 */

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data,data.length);
        System.out.println("....服务器端已启动，等客户端发送数据");
        socket.receive(packet);
        String info = new String(data,0,packet.getLength());
        System.out.println("我是服务器，客户端说：" + info);
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        byte[] data2 = "你好！".getBytes();
        DatagramPacket packet2 = new DatagramPacket(data2,data2.length,address,port);
        socket.send(packet2);
        socket.close();




    }
}
