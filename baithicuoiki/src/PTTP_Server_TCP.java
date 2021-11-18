
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Math.sqrt;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class PTTP_Server_TCP {

    public static void main(String[] args) throws IOException {
        //B1: tao Socket cua server
        try (ServerSocket server = new ServerSocket(9999)) {
            System.out.println("Server da khoi dong...");

            //B2: Thuc hien lang nghe va ket noi
            try (Socket client = server.accept()) {
                System.out.println("Server da ket noi thanh cong voi client");

                //B3: Khai bao doi tuong
                try (Scanner br = new Scanner(client.getInputStream());
                        PrintWriter pw = new PrintWriter(client.getOutputStream())) {

                    String intArr = "";
                    String A[];
                    String kq;
                    float heSoA, heSoB, heSoC;
                    do {
                        intArr = br.nextLine();
                        if (intArr.equals("stop")) {
                            pw.write("Stop");
                            pw.flush();
                            break;
                        }
                        A = intArr.split(" ");
                        heSoA = Integer.parseInt(A[0]);
                        heSoB = Integer.parseInt(A[1]);
                        heSoC = Integer.parseInt(A[2]);
                        System.out.println("Số được truyền từ client{ " + heSoA + "," + heSoB + "," + heSoC + "}");
                        kq = giaiPT(heSoA, heSoB, heSoC);
                        //B4.1 server xu ly 
                        //B4.2 server tra lai ket qua da xu ly cho client
                        pw.write(kq + "\n");
                        pw.flush();

                    } while (!intArr.equals("stop"));

                    float x1, x2;

                    //B5: ket thuc -  dong cac ket noi
                    br.close();
                    pw.close();
                    server.close();

                }

            } catch (IOException e) {
                System.out.println("");
            }

        } catch (UnknownHostException e) {
            System.err.println("Server khong ton tai");
        }
    }
    //ket thuc ham main

    public static String giaiPT(float a, float b, float c) {
        String kq = null;
        double t, t1 = 0, t2 = 0, delta;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    kq = "Phương trình vô số nghiệm";
                } else {
                    kq = "Phương trình vô nghiệm";
                }
            } else {
                t = -c / b;
                if (t < 0) {
                    kq = "Phương trình vô nghiệm";
                } else {
                    kq = "Phương trình có 2 nghiệm:\n x1= " + sqrt(t)
                            + " x2= -" + sqrt(t);
                }
            }
        } else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                kq = "Phương trình vô nghiệm";
            } else if (delta == 0) {
                t = (-b) / (2 * a);
                if (t < 0) {
                    kq = "Phương trình vô nghiệm";
                } else {
                    kq = "Phương trình có 2 nghiệm: x1= "
                            + sqrt(t) + " x2= -" + sqrt(t);
                }
            } else if (delta > 0) {
                t1 = sqrt((-b + sqrt(delta)) / (2 * a));
                t2 = sqrt((-b - sqrt(delta)) / (2 * a));
                if (t1 < 0 && t2 < 0) {
                    kq = "Phương trình vô nghiệm";
                } else if (t1 >= 0 && t2 < 0) {
                    kq = "Phương trình có 2 nghiệm: \n"
                            + "x1= " + sqrt(t1)
                            + "\nx2= -" + sqrt(t1);
                }
            } else if (t2 >= 0 && t1 < 0) {
                kq = "Phương trình có 2 nghiệm: \n"
                        + "x1= " + sqrt(t2)
                        + "\nx2= -" + sqrt(t2);
            } else if (t1 > 0 && t2 > 0) {
                kq = "Phương trình có 4 nghiệm: \n"
                        + "x1= " + sqrt(t1)
                        + "\nx2= -" + sqrt(t1)
                        + "x3= " + sqrt(t2)
                        + "\nx4= -" + sqrt(t2);
            }
        }
        return kq;
    }
}
