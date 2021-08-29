
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andy
 */
public class Decryption {

    public static void main(String[] args) {

        try {

            // Đọc file chứa private key
            FileInputStream fis = new FileInputStream("C:/privateKey.rsa");

            byte[] b = new byte[fis.available()];

            fis.read(b);

            fis.close();

            // Tạo private key
            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(b);

            KeyFactory factory = KeyFactory.getInstance("RSA");

            PrivateKey priKey = factory.generatePrivate(spec);

            // Giải mã dữ liệu
            Cipher c = Cipher.getInstance("RSA");

            c.init(Cipher.DECRYPT_MODE, priKey);

            byte decryptOut[] = c.doFinal(Base64.getDecoder().decode(
                    "RR8WsVCiTUkm67vY8dSfv+eJ1h2JLEulXQZf4t7rxP8HynxMKrYcAmGvIYsrUb77ys4K8uUj48ayT3bSsM3wfnoJLtgww2idNB7r8UeIyIGe/UKoO0co5aJoptt8NwuKNCS0uf7fEEZnAfB1rszXqKQj0IxOdCtYLorO7DltwDM="));

            System.out.println("Dữ liệu sau khi giải mã: " + new String(decryptOut));

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }
}
