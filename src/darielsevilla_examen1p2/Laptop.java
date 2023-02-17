/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package darielsevilla_examen1p2;

/**
 *
 * @author HP
 */
public class Laptop extends PC{
    private String marca;
    private String definicion;
    private boolean rgb;

    public Laptop() {
        super();
    }

    public Laptop(String marca, String definicion, boolean rgb, String ip, String mascara, String hostname) {
        super(ip, mascara, hostname);
        this.marca = marca;
        this.definicion = definicion;
        this.rgb = rgb;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        String temp = "";
        if(rgb){
            temp = "Si tiene";
        }else{
            temp = "No tiene";
        }
        return "marca: " + marca + "\ndefinicion: " + definicion + "\nrgb: " + rgb + "\n";
    }
    
    
}
