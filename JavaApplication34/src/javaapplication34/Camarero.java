/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Camarero extends Thread {

    private String id;
    private Estanteria est;

    public Camarero(String identificador, Estanteria estanteria) {
        this.id = identificador;
        this.est = estanteria;
    }

    public void run() {
        String comanda;
        int i = 0;
        while (true) {
            try {
                comanda = id + "-" + i;
                i++;
                est.dejarComanda(comanda);
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Camarero.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
