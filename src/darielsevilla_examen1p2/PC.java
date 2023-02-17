/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package darielsevilla_examen1p2;

/**
 *
 * @author HP
 */
public class PC {
    protected String ip;
    protected String mascara;
    protected String hostname;

    public PC() {
    }

    public PC(String ip, String mascara, String hostname) {
        this.ip = ip;
        this.mascara = mascara;
        this.hostname = hostname;
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

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "Host: " + hostname + "\n"
                + "IP: " + ip + "\n"
                + "Mask: " + mascara + "\n";
        
    }
    
    
}
