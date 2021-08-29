
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *  Algorithm RSA
 * @author Andy
 */
public class CreateDoubleKey {

    public static void main(String[] args) throws IOException {
        try {
            SecureRandom sr = new SecureRandom();
            // Thuật toán phát sinh khóa - RSA 
            // Độ dài khóa 1024(bits), độ dài khóa này quyết định đến độ an toàn của khóa, càng lớn thì càng an toàn
            // Demo chỉ sử dụng 1024 bit. Nhưng theo khuyến cáo thì độ dài khóa nên tối thiểu là 2048
            // using getInstance() method
            KeyPairGenerator kpr = KeyPairGenerator.getInstance("DSA");
            kpr.initialize(2048, sr);

            //khởi tạo cặp khóa
            KeyPair kp = kpr.genKeyPair();

            // PublicKey
            PublicKey publicKey = kp.getPublic();

            // PrivateKey
            PrivateKey privateKey = kp.getPrivate();

            File publicKeyFile = createKeyFile(new File("publicKey.rsa"));

            File privateKeyFile = createKeyFile(new File("privateKey.rsa"));

            // Lưu Public Key
            FileOutputStream fos = new FileOutputStream(publicKeyFile);

            fos.write(publicKey.getEncoded());

            fos.close();

            // Lưu Private Key
            fos = new FileOutputStream(privateKeyFile);

            fos.write(privateKey.getEncoded());

            fos.close();

            // Saving the Keys in Binary Format
//            String outFile = "..." ;
//            out = new FileOutputStream(outFile + ".key");
//            out.write(privateKeyFile.getEncoded());
//            out.close();
//
//            out = new FileOutputStream(outFile + ".pub");
//            out.write(privateKeyFile.getEncoded());
//            out.close();
            System.err.println("Private key format: " + privateKeyFile);
            // prints "Private key format: PKCS#8" on my machine
//            System.out.println(privateKeyFile);
            System.err.println("Public key format: " + publicKeyFile);
            // prints "Public key format: X.509" on my machine

            System.err.println("Generate key successfully");
        } catch (NoSuchAlgorithmException e) {
        }
    }
    private static File createKeyFile(File file) throws IOException {
 
		if (!file.exists()) {
 
			file.createNewFile();
 
		} else {
 
			file.delete();
 
			file.createNewFile();
 
		}
 
		return file;
 
	}
}
