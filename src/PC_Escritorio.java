
public class PC_Escritorio extends PC{
   private int RAM, almacenamiento;
   private String tipoalma;
   private boolean tarjeta;

    public PC_Escritorio() {
        super();
    }

    public PC_Escritorio(int RAM, int almacenamiento, String tipoalma, boolean tarjeta, String ip, String mascara, String host) {
        super(ip, mascara, host);
        this.RAM = RAM;
        this.almacenamiento = almacenamiento;
        this.tipoalma = tipoalma;
        this.tarjeta = tarjeta;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoalma() {
        return tipoalma;
    }

    public void setTipoalma(String tipoalma) {
        this.tipoalma = tipoalma;
    }

    public boolean isTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "IP: "+super.getIp()+"\nMascara de red: "+super.getMascara()+"\nHost Name: "+super.getHost()+"\nMemoria RAM: " + RAM + "\nCapacidad de Almacenamiento: " + almacenamiento + "\nTipo de Almacenamiento: " + tipoalma + "\nTiene trajeta grafica: " + tarjeta;
    }
    
   
    
    
}
