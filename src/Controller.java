import java.io.*;
import java.net.*;
//127.0.1.1
public class Controller {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost().getHostAddress());
         try {
             ServerSocket ssClient = new ServerSocket(4322);
             ServerSocket ssDstore = new ServerSocket(4321);


             for(;;) {
                 try {
                     System.out.println("waiting for connection");
                     Socket client = ssClient.accept();
                     System.out.println("connected to Client");

                     BufferedReader inClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
                     PrintWriter outClient = new PrintWriter(client.getOutputStream());
                     String line = inClient.readLine();
                     int firstSpace = line.indexOf(" ");
                     String command = line.substring(0, firstSpace);
                     System.out.println(line);
                     System.out.println(command);
                     outClient.println("ACK");
                     System.out.println("Sent");
                     outClient.flush();
                     outClient.close();
                     client.close();



                     // if statements of different client commands



                 }catch (Exception e) {

                 }
             }
         } catch (Exception e) {

         }
    }
}
