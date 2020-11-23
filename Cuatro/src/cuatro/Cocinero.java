/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

public class Cocinero extends Thread {

    private String id;
    private Estanteria est;

    public Cocinero(String id, Estanteria est) {
        this.id = id;
        this.est = est;
    }

    public void run() {
        String comanda;
        while (true) {
            try {
                comanda = est.cogerComanda();
                System.out.println("El cocinero " + id + " prepara la comanda " + comanda);
                //HacerAlgo
                sleep(400);
            } catch (InterruptedException ie) {
            }

        }
    }
}
