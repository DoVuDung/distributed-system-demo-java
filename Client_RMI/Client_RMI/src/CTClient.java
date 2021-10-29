import java.awt.*;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class CTClient
{
    public static void main(String[] chuoi) throws Exception{
        Frame myWindow = new Frame("Ti giá chứng khoán tại sàn Hà Nội");
        TextArea msg = new TextArea("Waiting...");
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
      	Registry reg = LocateRegistry.getRegistry("localhost",9999);
        RateServer rs = (RateServer)reg.lookup("HaNoi");
        Hanoi vn = rs.rateHanoi();
        Time time = rs.CreateTime();
        while(true){
             msg.setText("Current: "+time.getCurrentTime()+"\nHa noi: "+vn.getHanoi());
            //msg.setText("Current "+time.getCurrentTime()+"\nHa noi: "+vn.getHanoi()+"\nLondon: "+el.getLondon()+"\nNewYork: "+us.getNewYork()+"\nPari: "+fr.getPari()+"\nTokyo: "+jp.getTokyo());
             Thread.sleep(1000);

        }
    }
}