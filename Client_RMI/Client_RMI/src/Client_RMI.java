
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.rmi.Naming;

public class Client_RMI {
    public static void main(String[] chuoi) throws Exception{
        Frame myWindow = new Frame("Ti gia chung khoan tai Ha Noi");
        TextArea msg = new TextArea("Waiting for Hanoi ... ");
        msg.setBounds(new Rectangle(30, 60, 300, 250));
        myWindow.setLayout(null);
        myWindow.add(msg,null);
        myWindow.addWindowListener(new WindowAdapter() {
                  @Override
                  public void windowClosing(WindowEvent evt){
                      System.exit(0);
                    }
        });
        myWindow.setSize(new Dimension(350, 400));
        myWindow.show();      
      	RateServer rs = (RateServer)Naming.lookup("HaNoi");
        Hanoi vn = rs.rateHanoi();//Lay ra chi so Index tai Hanoi
   	Time time = rs.CreateTime();//Lay ra nagy, gio tai Hanoi
        while(true){
             msg.setText("Current of time: "+time.getCurrentTime()+"\nHa noi: "+vn.getHanoi());
             Thread.sleep(1000);
        }
    }
}
