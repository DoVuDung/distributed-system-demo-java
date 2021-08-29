
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
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
public class Encryption {

    public static void main(String[] args) {

        try {

            // Đọc file chứa public key
            FileInputStream fis = new FileInputStream("publicKey.rsa");

            byte[] b = new byte[fis.available()];

            fis.read(b);
            
            fis.close();

            // Tạo public key
            X509EncodedKeySpec spec = new X509EncodedKeySpec(b);

            KeyFactory factory = KeyFactory.getInstance("RSA");

            PublicKey pubKey = factory.generatePublic(spec);

            // Mã hoá dữ liệu
            Cipher c = Cipher.getInstance("RSA");

            c.init(Cipher.ENCRYPT_MODE, pubKey);

            String msg = "helloworld";
//            System.out.println(msg);
            byte encryptOut[] = c.doFinal(msg.getBytes());

            String strEncrypt = Base64.getEncoder().encodeToString(encryptOut);

            System.out.println("Chuỗi sau khi mã hoá: " + strEncrypt);

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }
}
