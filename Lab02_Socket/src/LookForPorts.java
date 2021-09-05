
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andy
 */
public class LookForPorts {

    public static void main(String[] args) throws IOException {
        //khi ma ip di vao may, thì sẽ đi qua IO stream(Chuỗi, Byte)
        /**
         * args[]: args[0],args[1],.... args[0]: chứa địa chỉ của máy kết nối
         * với người dùng (ip) args[1]: chứa port args[2]: chứa dữ liệu của máy
         * kết nối với máy người dùng Lưu ý: Nếu dùng socket chuẩn Fecto thì chỉ
         * có args[0], args[1]: dùng cho hacking
         *
         */
        Socket Client;
        String host = "";
        if (args.length > 0) {
            host = args[0];
        }
        for (int i = 0; i <= 100; i++) {
            try {
                System.out.println("Port = " + i);
                Client = new Socket(host, i);//socket client ton tai
                System.out.println("Co serer dang hoat dong tren port so " + i + " cua: " + host);
            } catch (UnknownHostException err) {
                System.err.println("khong ton tai server");
                break;
            } catch (IOException err) {
                System.err.println("ton tai server duoc mo tren may nguoi dung");
            }
        }

    }
}
