package socket;

import java.io.*;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket clint = new Socket("172.20.10.5",12450);
        System.out.println("成功连接上服务器");
        File file =  new File("D:/photo/1.jpg");
        byte[] b =new byte[(int) file.length()];
        InputStream is =new FileInputStream(file);
        is.read(b);
        BufferedOutputStream bos =new BufferedOutputStream(clint.getOutputStream());
        bos.write(b);
        is.close();
        bos.close();
    }
}
