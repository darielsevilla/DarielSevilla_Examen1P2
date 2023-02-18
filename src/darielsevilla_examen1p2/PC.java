/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package darielsevilla_examen1p2;

import java.util.ArrayList;

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

    public String ping(String ip, ArrayList<PC> pc) {
        String resp = "Pinging to " + ip + "with 32 bits of data:\n";

        //chequear si esta
        boolean isThere = false;
        for (PC pc1 : pc) {
            if (pc1.getIp().equals(ip)) {
                isThere = true;
            }
        }
        //si existe
        if (isThere) {
            //chequear q los primeros 3 sean iguales
            int aintEqual = 0;
            String[] conjuntos1 = this.ip.split("\\.");
            String[] conjuntos2 = ip.split("\\.");

            for (int i = 0; i < 3; i++) {
                if (Integer.parseInt(conjuntos1[i]) == Integer.parseInt(conjuntos2[i])) {
                    aintEqual++;
                }
            }

            if (aintEqual == 0) {
                int lastMask = Integer.parseInt(mascara.split(".")[3]);
                String binMask = DecimalBinario("", lastMask);
                String binIp1 = DecimalBinario("", Integer.parseInt(conjuntos1[3]));
                String binIp2 = DecimalBinario("", Integer.parseInt(conjuntos2[3]));
                //contar hasta q numero son iguales
                int cont = 0;
                for (int i = 0; i < binMask.length(); i++) {
                    if (binMask.charAt(i) == '1') {
                        cont++;
                    } else {
                        break;
                    }
                }
                //comparar

                for (int i = 0; i < cont; i++) {
                    if (binIp1.charAt(i) != binIp2.charAt(i)) {
                        aintEqual++;
                        break;
                    }
                }
            }

            if (aintEqual != 0) {
                //cuando es inalcanzable
                for (int i = 0; i < 4; i++) {
                    resp += "Reply from " + ip + ": Destination host unreacheable\n";
                }

                resp += "Ping statistics for " + ip + ":\n";
                resp += "   Packets: Sent = 4, Received = 0, lost = 4 (100% loss)\n";
            } else {
                //cuando es igual
                for (int i = 0; i < 4; i++) {
                    resp += "Reply from " + ip + ": bytes=32 time=37ms TTL=46\n";
                }

                resp += "Ping statistics for " + ip + ":\n";
                resp += "   Packets: Sent = 4, Received = 0, lost = 4 (100% loss)\n";
            }
        } else {
            //No esta es la pc
            for (int i = 0; i < 4; i++) {
                resp += "Request Timed out\n";
            }

            resp += "Ping statistics for " + ip + ":\n";
            resp += "   Packets: Sent = 4, Received = 0, lost = 4 (100% loss)\n";
        }

        return resp;
    }

    public String DecimalBinario(String resp, int num) {
        //primero, saca el residuo del numero entre 2. 
        int valor = num % 2;
        //cambia el valor de num por el entero de num/2.
        num = num / 2;
        //agrega ese numero, que sera 0 o 1, al inicio de la cadena
        resp = Integer.toString(valor) + resp;
        //si el numero es 0, retorna la respuesta
        if (num == 0) {
            return resp;
        } else {
            /*si el numero no es 0, significa que aun hay mas valores q dividir, asi que vuelve a correr la funcion, que se detendra hasta
            que num sea 0*/
            return DecimalBinario(resp, num);
        }

    }
}
