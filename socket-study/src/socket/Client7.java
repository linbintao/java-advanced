package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client7 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1",10086);
        System.out.println("成功连接服务器");
        BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String str = buf.readLine();
        System.out.println("服务器输出内容:" + str);
        buf.close();
        client.close();
    }
}
