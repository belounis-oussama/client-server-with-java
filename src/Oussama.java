import javax.swing.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class Oussama{


    Socket Belounis;
    ServerSocket SockListener ;


    public Oussama(int port){
        try{
            SockListener = new ServerSocket(port);
            Belounis = SockListener.accept();
            System.out.println("connected successfully"+SockListener.getInetAddress());
            PrintStream writer = new PrintStream(Belounis.getOutputStream());
            BufferedReader lecture = new BufferedReader(new InputStreamReader(Belounis.getInputStream()));
            String text = lecture.readLine();
            System.out.println("Client: "+text);


            if(text.equals("Oussama")||text.equals("Belounis")||text.equals("Belounis Oussama"))
            {
                writer.println("Server: received ");
            }
            else
            {
                writer.println("Server: not received ");
            }
            Belounis.close();
        }catch(Exception e){
            JOptionPane d = new JOptionPane();
            d.showMessageDialog( new JFrame(), "Error", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args){

        new Oussama(4000);

    }
}