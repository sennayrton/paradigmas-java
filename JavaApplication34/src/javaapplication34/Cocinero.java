/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cocinero extends Thread {

    private String id;
    private Estanteria est;

    public Cocinero(String identificador, Estanteria estanteria) {
        this.id = identificador;
        this.est = estanteria;
    }

    public void run() {
        String comanda;
        while (true) {
            try {
                comanda = est.cogerComanda();
                System.out.println("El cocinero " + id + " prepara la comanda " + comanda);
                sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cocinero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
