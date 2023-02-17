
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

    @Override
    public String toString() {
        return "PC{" + "ip=" + ip + ", mascara=" + mascara + ", host=" + host + '}';
    }
}
