/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bayer
 */
public class PC_Laptop extends PC{
    private String marca, defpantalla;
    private boolean RGB;

    public PC_Laptop() {
        super();
    }

    public PC_Laptop( String marca, String defpantalla, boolean RGB, String ip, String mascara, String host) {
        super(ip, mascara, host);
        this.marca = marca;
        this.defpantalla = defpantalla;
        this.RGB = RGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefpantalla() {
        return defpantalla;
    }

    public void setDefpantalla(String defpantalla) {
        this.defpantalla = defpantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return "IP: "+super.getIp()+"\nMascara de red: "+super.getMascara()+"\nHost Name: "+super.getHost() + "\nMarca: " + marca + "\nDefinicion de Pantalla: " + defpantalla + "\nTrae RGB en el teclado:" + RGB+"\n\n";
    }

    
    
    
}
