import javax.swing.*;
import java.net.*;
import java.io.*;
import java.util.*;


public class Belounis{


    public Belounis(String ip, int port){

        try{
            Socket Oussama = new Socket(ip, port);
            PrintStream writer = new PrintStream(Oussama.getOutputStream());
            BufferedReader lecture = new BufferedReader(new InputStreamReader(Oussama.getInputStream()));


            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter your text below :");
            String text = keyboard.nextLine();


            writer.println(text);
            System.out.println(lecture.readLine());


        }catch(Exception e){

            JOptionPane d = new JOptionPane();
            d.showMessageDialog( new JFrame(), "Error", "Alert", JOptionPane.ERROR_MESSAGE);

        }
    }

    public static void main(String[] args){

        new Belounis("localhost", 4000);

    }
}
