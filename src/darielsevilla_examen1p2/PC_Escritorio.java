/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package darielsevilla_examen1p2;

/**
 *
 * @author HP
 */
public class PC_Escritorio extends PC{
    private int ram;
    private int almacenamiento;
    private boolean tipo;
    private boolean graphicCard;

    public PC_Escritorio() {
        super();
    }

    public PC_Escritorio(int ram, int almacenamiento, boolean tipo, boolean graphicCard, String ip, String mascara, String hostname) {
        super(ip, mascara, hostname);
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tipo = tipo;
        this.graphicCard = graphicCard;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(boolean graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public String toString() {
        String type= "";
        String graphics = "";
        if(tipo){
            type = "HDD";
        }else{
            type = "SSD";
        }
        
        if(graphicCard){
            graphics = "Si tiene";
        }else{
            graphics = "No tiene";
        }
        return super.toString()+"ram: " + ram + "\n"
                + "almacenamiento: " + almacenamiento + "\n"
                + "tipo: " + type + "\n"
                + "tarjeta grafica: " + graphics + "\n";
    }

    
}
