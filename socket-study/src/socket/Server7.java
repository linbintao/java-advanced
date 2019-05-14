package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server7 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true){
            Socket socket = serverSocket.accept();
            ServerThread7 server = new ServerThread7(socket);
            new Thread(server).start();

        }
    }
}
class ServerThread7 implements Runnable{
    private Socket socket;
    public ServerThread7(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端" + socket.getInetAddress() + "连接成功");
        String info = "这是一条服务器通知";
        OutputStream outputStream = null;
        try {
            outputStream = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintStream printStream = new PrintStream(outputStream);
        printStream.print(info);
        printStream.close();

    }
}