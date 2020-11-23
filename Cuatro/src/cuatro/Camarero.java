/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

import static java.lang.Thread.sleep;

public class Camarero extends Thread {

    /**
     * @param args the command line arguments
     */
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
                comanda = id + "-" + i; //Camarero1-0, Camarero1-1, ...
                i++;
                est.dejarComanda(comanda);
                sleep(500);
            } catch (InterruptedException ie) {
            }

        }

    }
}
