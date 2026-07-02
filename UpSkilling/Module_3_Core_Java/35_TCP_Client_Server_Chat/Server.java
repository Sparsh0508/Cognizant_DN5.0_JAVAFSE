import java.io.*;import java.net.*;
public class Server{
 public static void main(String[] args)throws Exception{
  ServerSocket ss=new ServerSocket(5000);
  System.out.println("Waiting...");
  Socket s=ss.accept();
  BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
  PrintWriter out=new PrintWriter(s.getOutputStream(),true);
  String msg=in.readLine();
  System.out.println("Client: "+msg);
  out.println("Hello Client");
  s.close(); ss.close();
 }
}