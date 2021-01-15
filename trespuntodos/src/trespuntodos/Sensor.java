/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trespuntodos;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class Sensor {
    private paso paso;
    private double valor;
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock read = lock.readLock();
    private Lock write = lock.writeLock();
    
    public Sensor(){
    }

    public void escribir( double valor) {
        write.lock();
        try {
            this.valor = valor;
        } finally {
            write.unlock();
        }
    }
    public double leer() {
        read.lock();
        try {
             return valor;
        } finally {
            read.unlock();
        }
    }
}
