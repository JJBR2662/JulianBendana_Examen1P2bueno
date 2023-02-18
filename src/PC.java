
import java.util.ArrayList;

public class PC {

    protected String ip, mascara, host;

    public PC() {
    }

    public PC(String ip, String mascara, String host) {
        this.ip = ip;
        this.mascara = mascara;
        this.host = host;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void Ping(ArrayList<PC> compus, int cual, int cual2) {
        String ip1 = compus.get(cual).getIp();
        String mascara1 = compus.get(cual).getMascara();
        String ip2 = compus.get(cual2).getIp();
        String mascara2 = compus.get(cual2).getMascara();
//        String[] ipes1 = ip1.split(".");
//        String[] ipes2 = ip2.split(".");
        boolean fallido = true;
        System.out.println("ola");
//        if ((ipes1[0].equals(ipes2[0])) && (ipes1[1].equals(ipes2[1])) && (ipes1[2].equals(ipes2[2]))) {
//            System.out.println("hola");
//            fallido = false;
//        } else {
//            fallido = true;
//        }
        if (fallido) {
            System.out.println(compus.get(cual).getHost() + "ping_" + ip2);
            System.out.println("Pinging to " + ip2 + " with 32 bits of data:");
            System.out.println("Reply from " + ip2 + ": Destination host unrecheable");
            System.out.println("Reply from " + ip2 + ": Destination host unrecheable");
            System.out.println("Reply from " + ip2 + ": Destination host unrecheable");
            System.out.println("Reply from " + ip2 + ": Destination host unrecheable");
            System.out.println();
            System.out.println("Ping statistics for " + ip2 + ":");
            System.out.println("    Packets: Sent = 4, Received = 0, Lost = 4 (100% loss) ");
            System.out.println(compus.get(cual).getHost() + "#");
        } else {
            System.out.println(compus.get(cual).getHost() + "ping_" + ip2);
            System.out.println("Pinging to " + ip2 + " with 32 bits of data:");
            System.out.println("Reply from "+ip2+": bytes=32 time=37ms TTL=46");
            System.out.println("Reply from "+ip2+": bytes=32 time=37ms TTL=46");
            System.out.println("Reply from "+ip2+": bytes=32 time=37ms TTL=46");
            System.out.println("Reply from "+ip2+": bytes=32 time=37ms TTL=46");
            System.out.println();
            System.out.println("Ping statistics for " + ip2 + ":");
            System.out.println("    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss) ");
            System.out.println(compus.get(cual).getHost() + "#");
        }
    }

    @Override
    public String toString() {
        return "IP: " + ip + "\nMascara: " + mascara + "\nHost: " + host;
    }
}
