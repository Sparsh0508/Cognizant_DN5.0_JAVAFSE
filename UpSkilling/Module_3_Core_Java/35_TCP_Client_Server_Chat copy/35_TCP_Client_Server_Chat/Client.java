import java.io.*;import java.net.*;
public class Client{
 public static void main(String[] args)throws Exception{
  Socket s=new Socket("localhost",5000);
  BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
  PrintWriter out=new PrintWriter(s.getOutputStream(),true);
  out.println("Hello Server");
  System.out.println("Server: "+in.readLine());
  s.close();
 }
}