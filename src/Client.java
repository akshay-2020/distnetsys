import java.io.*;
import java.net.*;
import java.nio.Buffer;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println(args[0]+" "+args[1] + " " + args[2]);
        if(args[1].equals("put")){
            System.out.println("command: " + args[1]);
            Socket socket = new Socket(args[0], 4322);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("put" + " " + args[2] + " ");
            System.out.println("sent");
            out.flush();
            //out.close();



            String reply = in.readLine();
            System.out.println("message received "+reply);

//            File inputFile = new File(args[2]);
//            FileInputStream in = new FileInputStream(inputFile);
//            try{
//                Socket socket = new Socket(args[0],4323);
//                OutputStream out = socket.getOutputStream();
//                out.write(("put"+" "+args[3]+" ").getBytes());
//                byte[] buf = new byte[1000]; int buflen;
//                while ((buflen=in.read(buf)) != -1){
//                    System.out.print("*");
//                    out.write(buf,0,buflen);
//                }
//                out.close();
//            }catch(Exception e){System.out.println("error"+e);}
//            System.out.println();
//            in.close();
        } else
        if(args[1].equals("get")){
            System.out.println("command: " + args[1]);
//            File outputFile = new File(args[2]);
//            FileOutputStream outf = new FileOutputStream(outputFile);
//            try{
//                Socket socket = new Socket(args[0],4323);
//                OutputStream out = socket.getOutputStream();
//                InputStream in = socket.getInputStream();
//                out.write(("get"+" "+args[3]+" ").getBytes());
//                byte[] buf = new byte[1000]; int buflen;
//                while ((buflen=in.read(buf)) != -1){
//                    System.out.print("*");
//                    outf.write(buf,0,buflen);
//                }
//                out.close();
//                in.close();
//            }catch(Exception e){System.out.println("error"+e);}
//            System.out.println();
//            outf.close();
        } else
            System.out.println("unrecognised command");
    }
}